import java.util.Optional;
import javafx.application.Application;
import java.util.ArrayList;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;




public class Userrole extends Application {


    @Override
    public void start(Stage Primarystage) {
        ArrayList<String> choice = new ArrayList<>();
        choice.add("Administrator");
        choice.add("Faculty");
        choice.add("Staff");
        choice.add("Student");
        choice.add("Guest");

        String defaultOption = choice.get(2);
        ChoiceDialog choiceDialog = new ChoiceDialog(defaultOption, choice);
        choiceDialog.setTitle("Your Role");
        choiceDialog.setHeaderText("Select Your Role");
        Optional <String> result = choiceDialog.showAndWait();

        String selected = result.get();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Choose your user role");
        alert.setHeaderText("Nice to make your acquaintance!");





        switch (selected) {

            case "Administrator":

                System.out.println("Welcome Administrator!");

                break;

            case "Faculty":
                System.out.println("Welcome Faculty!");
                break;

            case "Staff":
                System.out.println("Welcome Staff!");
                break;

            case "Student":
                System.out.println("Welcome Student!");
                break;

            case "Guest":
                System.out.println("Welcome Guest!");
                break;

        }
    }
}
