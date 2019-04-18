package edu.uh.tech.cis3368.semesterproject;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeController {
    public TextField firstName;

    private static final String NEW_EMPLOYEE = "New Employee";
    private static final String UPDATE_EMPLOYEE = "Update Employee";
    private static final String DUP_EMAIL_MESSAGE = "The email provided has already been used.";
    private static final String DUP_EMAIL_HEADER = "Duplicate Email Found";
    private static final String VALUES_MISSING_MESSAGE = "Please provide values for all fields";
    private static final String VALUES_MISSING_HEADER = "Required Fields Missing";
    private static final String DELETE_MESSAGE = "Are you sure you want to delete this employee?";

    public ListView<Employee> employeeList;
    public TextField phone;
    public TextField email;
    public TextField lastName;

    //public TextField firstName;
    public Button btnAddEmployee;
    public Button btnDeleteEmployee;
    private Scene returnScene;
    private List<TextField> fieldList;

    @Autowired
    private EmployeeRepository employeeRepository;


    public void handleMouseClicked(MouseEvent mouseEvent) {
    }

    public void handleAddUpdateButton(ActionEvent actionEvent) {
        System.out.println(firstName.getText());
    }

    public void deleteEmployee(ActionEvent actionEvent) {
    }

    public void handleClearSelection(ActionEvent actionEvent) {
    }

    public void handleDone(ActionEvent actionEvent) {
    }
}
