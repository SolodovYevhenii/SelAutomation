package com.packt.webdriver.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllPostsPage {
    WebDriver driver;
    @FindBy(how = How.ID, using = "the-list")
    WebElement postsContainer;
    @FindBy(how=How.ID, using = "post-search-input")
    WebElement searchPosts;
    @FindBy(how=How.ID, using = "cat")
    WebElement viewByCategories;
    @FindBy(how=How.LINK_TEXT, using = "Add New")
    WebElement addNewPost;
    public AllPostsPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://evgsldv.wordpress.com/wp-admin/edit.php");
    }
    public void createANewPost(String title, String description) {
        addNewPost.click();
        AddNewPostPage newPost = PageFactory.initElements(driver, AddNewPostPage.class);
        newPost.addNewPost(title, description);
    }
    public void editAPost(String presentTitle, String newTitle, String description) {
        goToParticularPostPage(presentTitle);
        EditPostPage editPost = PageFactory.initElements(driver, EditPostPage.class);
        editPost.editPost(newTitle, description);
    }
    public void deleteAPost(String title) {
        goToParticularPostPage(title);
        DeletePostPage deletePost = PageFactory.initElements(driver, DeletePostPage.class);
        deletePost.delete();
    }
    public void filterPostsByCategory(String category) {
    }
    public void searchInPosts(String searchText) {
    }
    public int getAllPostsCount() {
        List<WebElement> postsList = postsContainer.findElements(By.tagName("tr"));
        return postsList.size();
    }
    private void goToParticularPostPage(String presentTitle) {
        List<WebElement> allPosts = postsContainer.findElements(By.className("row-title"));
        for (WebElement ele : allPosts) {
            if (ele.getText().equals(presentTitle)) {
                Actions builder = new Actions(driver);
                builder.moveToElement(ele).click(driver.findElement(By.cssSelector(".edit>a")));
                Action compositeAction = builder.build();
                compositeAction.perform();
                break;
            }
        }
    }
}