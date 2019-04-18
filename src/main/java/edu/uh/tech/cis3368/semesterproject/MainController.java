package edu.uh.tech.cis3368.semesterproject;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;


@Component
public class MainController {

    @FXML
    private Button btnManageEmployees;

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    public void openCustomerWindow(ActionEvent actionEvent) {

   //Code to be added in the future


    }


    public void openEmployeeWindow(ActionEvent actionEvent) throws IOException {

        javafx.stage.Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Employee.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        EmployeeController employeeController = fxmlLoader.getController();
        // employeeController.setReturnScene(btnManageEmployees.getScene());
        parent.setScene(scene);

    }

    public void openJobWindow(ActionEvent actionEvent) throws IOException {
        javafx.stage.Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Job.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        JobController jobController = fxmlLoader.getController();
        // employeeController.setReturnScene(btnManageEmployees.getScene());
        parent.setScene(scene);



    }
}
