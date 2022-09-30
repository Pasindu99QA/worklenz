package webAutomation;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@SuppressWarnings("unused")
public class worklenz {

	public static void main(String[] args) throws InterruptedException {	
		// TODO Auto-generated method stub
		
		 

		        System.setProperty("webdriver.chrome.driver", "E:\\Automation Soft\\chrome driver\\chromedriver.exe");
		        
		        Map<String, Object> prefs = new HashMap<String, Object>();
		        prefs.put("profile.default_content_setting_values.notifications", 2);
		        ChromeOptions options = new ChromeOptions();
		        options.setExperimentalOption("prefs", prefs);

		       
		        
		        WebDriver driver = new ChromeDriver(options);

		        driver.get("https://uat.worklenz.com/worklenz/dashboard");

		        driver.manage().window().maximize();
		        
		        
		        
		        //Login Page , enter email , password & click on login button
		        
		        
		       Thread.sleep(3000);
		        WebElement email = driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/div/div/div/div/div/div/div/div[4]/div/worklenz-login/form/nz-form-item[1]/nz-form-control/div/div/nz-input-group/input"));
		        email.sendKeys("pasinduishan***@gmail.com");
		        
		        Thread.sleep(2000);
		        WebElement password = driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/div/div/div/div/div/div/div/div[4]/div/worklenz-login/form/nz-form-item[2]/nz-form-control/div/div/nz-input-group/input"));
		        password.sendKeys("******.");
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/div/div/div/div/div/div/div/div[4]/div/worklenz-login/form/button")).click();
		        

		        
//My Dash Board----
		  
		        
		        //create task
		        
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/nz-page-header/div/nz-page-header-extra/nz-space/div[2]/span/button/span")).click();
		        
		       //name
		        Thread.sleep(3000);
		        WebElement name = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/nz-form-item[1]/nz-form-control/div[1]/div/input"));
		        name.click();
		        Thread.sleep(1000);
		        name.sendKeys("testing name");
		        
		        
		        //description
		        Thread.sleep(3000);
		        WebElement description = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/nz-form-item[2]/nz-form-control/div/div/div[2]/div[1]/p"));
                description.click();
		        description.sendKeys("testing description....");
		        
		        //set date
		        
		        Thread.sleep(3000);
		        WebElement startdate = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/div[1]/div[1]/nz-form-item/nz-form-control/div/div/nz-date-picker/div/input"));
		        startdate.click();
		        Thread.sleep(2000);
		        startdate.sendKeys("2022-09-30");
		        
		        Thread.sleep(3000);
		        WebElement enddate =  driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/div[1]/div[2]/nz-form-item/nz-form-control/div/div/nz-date-picker/div/input"));
		        enddate.click();
		        Thread.sleep(2000);
		        enddate.sendKeys("2022-10-13");
		        
		        //task priority
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/div[2]/div[1]/nz-form-item/nz-form-control/div/div/nz-select/nz-select-top-control/nz-select-item")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-6\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[2]/div")).click();
		        
		        
		        //select status
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/div[2]/div[2]/nz-form-item/nz-form-control/div/div/nz-select/nz-select-top-control/nz-select-item")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-7\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[2]/div")).click();
		        
	
		        //select project
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/nz-form-item[3]/nz-form-control/div/div/nz-select/nz-select-top-control/nz-select-search/input")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-8\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item/div")).click();
		        
		        
		        //assigness
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/nz-form-item[4]/nz-form-control/div/div/nz-select/nz-select-top-control")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-9\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[4]/div")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-9\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[6]/div")).click();
		        
		        
		        //create or cancel
		        
		        //create
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[3]/button[2]/span")).click();
		        
		        //cancel
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-modal-container/div/div/div[3]/button[1]/span")).click();
		        
		        
 //whats need to be done
		        
		        Thread.sleep(4000);
		        WebElement done =  driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[1]/worklenz-personal-todo-list/nz-card/div[2]/form/nz-form-item[1]/nz-form-control/div/div/input"));
		        done.sendKeys("testing");
		        
		     /*   Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[1]/worklenz-personal-todo-list/nz-card/div[2]/form/nz-form-item[2]/nz-form-control/div/div/button")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-16\"]/div/ul/li[4]")).click();   */
		        
		        //add button
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[1]/worklenz-personal-todo-list/nz-card/div[2]/form/nz-form-item[3]/nz-form-control/div/div/button")).click();  
		        
		        

		        //showing my task all check box
				
				  Thread.sleep(3000); 
				  driver.findElement(By.xpath(
				  "/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[1]/worklenz-personal-todo-list/nz-card/div[1]/div/div[2]/nz-space/div[1]/label/span[1]/input"
				  )).click();
				 
		        
		   /*     //select or  unselect work on it task & not complete task
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-2\"]/tr[2]/td[1]/label/span[1]/input")).click();
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-2\"]/tr[4]/td[1]/label/span[1]/input")).click();   */
		        
		        //edit this task
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-1\"]/tr[3]/td[3]/div/nz-space/div[1]/button")).click();
		        
		        Thread.sleep(3000);
		        @SuppressWarnings("unused")
				WebElement renametask = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div[2]/div/div/div[2]/form/nz-form-item[1]/nz-form-control/div/div/input"));
		
		        Thread.sleep(2000);
		        renametask.clear();
		        
		        Thread.sleep(1000);
		        renametask.sendKeys("done scroll up");
		        
		        //Description
		        Thread.sleep(2000);
		        WebElement des2 = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div[2]/div/div/div[2]/form/nz-form-item[2]/nz-form-control/div/div/input"));
		        des2.clear();
		        Thread.sleep(1000);
		        des2.sendKeys("testing");            
		        
		        //save change
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div[2]/div/div/div[2]/form/button/span")).click();
		        
		        //delete my task
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-1\"]/tr[7]/td[3]/div/nz-space/div[2]/button")).click();
		        
		        //search for task
		        
		        Thread.sleep(3000);
		        WebElement searchtask = driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[1]/worklenz-personal-todo-list/nz-card/div[1]/div/div[2]/nz-space/div[2]/form/nz-input-group/input"));
		        searchtask.click();
		        Thread.sleep(1000);
		        searchtask.sendKeys("test cases");
		        
		        //due soon
		        
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[2]/worklenz-projects-tasks/nz-card/div[1]/div/div[2]/nz-space/div[2]/nz-segmented/div/label[2]/div")).click();
		        
		        //assign to me
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[2]/worklenz-projects-tasks/nz-card/div[1]/div/div[2]/nz-space/div[2]/nz-segmented/div/label[3]/div")).click();
		        
		        //search by name
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[2]/worklenz-projects-tasks/nz-card/div[1]/div/div[2]/nz-space/div[2]/nz-segmented/div/label[1]/div")).click();
		        
		        Thread.sleep(3000);
		        WebElement search2 = driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/div[1]/div[2]/worklenz-projects-tasks/nz-card/div[1]/div/div[2]/nz-space/div[3]/form/nz-input-group/input"));
		        search2.click();
		        Thread.sleep(1000);
		        search2.sendKeys("Quality Assurance");
		        
		        		        
//Project----
		        
		        //search for project
		        
		        Thread.sleep(3000);
		        WebElement search3 = driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-dashboard/div/nz-page-header/div/nz-page-header-extra/nz-space/div[1]/form/nz-input-group/nz-select/nz-select-top-control/nz-select-search/input"));
		        search3.click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-14\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item/div")).click();
		        
		        
		        //task list edit
		        
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-project-tasks-v2/nz-collapse/nz-collapse-panel[1]/div[2]/div/nz-table/nz-spin/div/div/nz-table-inner-default/div/table/tbody/tr[4]/td[2]")).click();
		        
		        //cancel or update
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-17\"]/nz-modal-container/div/div/div[3]/button[1]/span")).click();
		        
		        
		        //see all task list
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-project-tasks-v2/nz-collapse/nz-collapse-panel[1]/div[1]/div")).click();
		        
		        
		        //click on resource allocation**
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/nz-page-header/nz-page-header-footer/nz-tabset/nz-tabs-nav/div[1]/div/div[2]/div/a")).click();
		        
		        //daily
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-gantt-chart/div/div/div/div/nz-segmented/div/label[1]/div")).click();
		        
                //weekly
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-gantt-chart/div/div/div/div/nz-segmented/div/label[2]/div")).click();
		        
		        
                //mounthly
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-gantt-chart/div/div/div/div/nz-segmented/div/label[3]/div")).click();
		        
		        
                //today
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-gantt-chart/div/div/div/div/button/span")).click();
	
                //again click on daily
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-gantt-chart/div/div/div/div/nz-segmented/div/label[1]/div")).click();
		        
		      
		        
		        // click task ux/ux
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-gantt-chart/div/div/div/div/div/div/div/div/div/div[156]/ul/li[1]/div")).click();
		        
		        
		        //edit ui/ux**
		        
		        //edit task name
		        Thread.sleep(3000);
		        WebElement uiux = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-18\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/nz-form-item[1]/nz-form-control/div/div/input"));
		        uiux.click();
		        uiux.clear();
		        Thread.sleep(1000);
		        uiux.sendKeys("UI/UX Design");
		        
		        //edit task description
		        
		        Thread.sleep(3000);
		        
		        Thread.sleep(3000);
		        WebElement uiuxdes = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-18\"]/nz-modal-container/div/div/div[2]/nz-spin/div/form/nz-form-item[2]/nz-form-control/div/div/div[2]/div[1]"));
		        uiuxdes.click(); 
		        uiuxdes.clear();
		        Thread.sleep(1000);
		        uiuxdes.sendKeys("UI/UX testing Des");
		        
		   		      		        
		        //create or cancel
		        		      		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-18\"]/nz-modal-container/div/div/div[3]/button[1]/span")).click();
		        
		        
               
		        //members
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/nz-page-header/nz-page-header-footer/nz-tabset/nz-tabs-nav/div[1]/div/div[3]/div/a")).click();
		        
		/*        //edit member
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-team-members/div/nz-card/div/nz-skeleton/nz-table/nz-spin/div/div/nz-table-inner-default/div/table/tbody/tr[1]/td[5]/div/nz-space/div[1]/button/span/svg")).click();
		       
		        
		        //edit memeber name
		        
		        Thread.sleep(3000);
		        WebElement mname = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-24\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/nz-form-item[1]/nz-form-control/div/div/input"));
		        mname.click();
		        Thread.sleep(1000);
		        mname.clear();
		        Thread.sleep(1000);
		        mname.sendKeys("Antonio Ferrai");
		        
		        //job title
		        
		        Thread.sleep(3000);
		        WebElement job = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-24\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/nz-form-item[1]/nz-form-control/div/div/input"));
		        job.click();
		        Thread.sleep(1000);
		        job.clear();
		        Thread.sleep(1000);
		        job.sendKeys("UI/UX Engineer");
		        
		        //email
		        
		        Thread.sleep(3000);
		        WebElement email1 = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-24\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/nz-form-item[2]/nz-form-control/div/div/input"));
		        email1.click();
		        Thread.sleep(1000);
		        email1.clear();
		        Thread.sleep(1000);
		        email1.sendKeys("testautomation@gmail.com");
		        
		        //give admin
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-24\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/nz-form-item[3]/nz-form-control/div/div/nz-switch/button")).click();
		        
		        
		        //click on update
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-24\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/button")).click();  */
		        
		        
		        //manage member
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-project-members/nz-skeleton/nz-card/div[1]/div/div[2]/nz-space/div[2]/button/span")).click();
		        
		        
		        
		     /*   //search
		        Thread.sleep(3000);
		        WebElement search = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-48\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/worklenz-team-members-autocomplete/form/nz-form-item/nz-form-control/div/div/nz-select/nz-select-top-control/nz-select-search/input")); 
		        search.click(); */
		       
		        //remove member the project
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-19\"]/div/div[2]/div/div/div[2]/nz-spin/div/nz-list/nz-spin/div/div/nz-list-item[4]/button")).click();
		        
		        //ok or cancel
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-20\"]/div[2]/div/div[2]/div/div/div[2]/button[1]")).click();

		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-19\"]/div/div[2]/div/div/div[1]/div/button")).click();
		        		    		        		        
		        //refresh memeber page
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-project-members/nz-skeleton/nz-card/div[1]/div/div[2]/nz-space/div[1]/button")).click();
		        
		        //see pagers
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/div/worklenz-project-members/nz-skeleton/nz-card/div[2]/nz-table/nz-spin/div/nz-pagination/ul/li[5]/nz-select/nz-select-top-control/nz-select-item")).click();
		        
		        Thread.sleep(2000);
		        WebElement fiftypage = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-24\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[5]"));
		        fiftypage.click();
		        		        
		        
		        //overview**
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/nz-page-header/nz-page-header-footer/nz-tabset/nz-tabs-nav/div[1]/div/div[4]/div/a")).click();
		        
		        //click on setting
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-projects-gantt/div/nz-page-header/div/nz-page-header-extra/nz-space/div[2]/button")).click();
		        
		        
		        //update project
		        Thread.sleep(3000);
		        WebElement pname = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-15\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/nz-form-item[1]/nz-form-control/div/div/input"));
		        pname.click();
		        Thread.sleep(1000);
		        pname.clear();
		        Thread.sleep(1000);
		        pname.sendKeys("Demo Project");
		        
		        //select colour
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-15\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/nz-form-item[2]/nz-form-control/div/div/nz-select/nz-select-top-control/nz-select-item")).click();
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-26\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[2]")).click();
		        
		        
		        //notes
		        Thread.sleep(3000);
		        WebElement notes = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-15\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/nz-form-item[3]/nz-form-control/div/div/textarea"));
		        notes.click();
		        Thread.sleep(1000);
		        notes.clear();
		        Thread.sleep(1000);
		        notes.sendKeys("testing note automation");
		        
		    /*    //client
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-15\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/worklenz-clients-autocomplete/form/nz-form-item/nz-form-control/div/div/input")).click();
		        
		        //click on demo client
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-30\"]/div/div/div/span/nz-auto-option[1]/div")).click();   */
		        
		        //delete project
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-15\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/button[1]")).click();
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-31\"]/div[2]/div/div[2]/div/div/div[2]/button[1]/span")).click();
		        
		        //update
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-15\"]/div/div[2]/div/div/div[2]/nz-spin/div/form/button[1]")).click();
		        
		        
 //people----
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-header/div[2]/ul[1]/li[3]/strong")).click();
		        
		        //click on member name
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-team-members/div/nz-card/div/nz-skeleton/nz-table/nz-spin/div/div/nz-table-inner-default/div/table/tbody/tr[1]")).click();
		        
		        //refresh
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-team-overview/div/nz-page-header/div/nz-page-header-extra/nz-space/div/button")).click();
		        
		        //back
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-team-overview/div/nz-page-header/div/div/div/div/span/svg")).click();
		        
		        //select page
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/worklenz-root/worklenz-layout/nz-spin/div/nz-layout/nz-layout/nz-content/div/worklenz-team-members/div/nz-card/div/nz-skeleton/nz-table/nz-spin/div/nz-pagination/ul/li[6]/nz-select/nz-select-top-control/nz-select-item")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-55\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[6]/div")).click();
		        
		        
		      
		                   
		        
		        
		        
		        
		        
		        
	}
	
	
	}

		



