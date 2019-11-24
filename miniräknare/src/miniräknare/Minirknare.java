package miniräknare;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;

public class Minirknare extends Application {

	String inputText = "";
	String tal = "";
	double tal1 = 0;
	double tal2 = 0;
	boolean aktiv = false;

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Button Button1 = new Button("1");
		Button1.setPrefSize(50, 50);
		Button Button2 = new Button("2");
		Button2.setPrefSize(50, 50);
		Button Button3 = new Button("3");
		Button3.setPrefSize(50, 50);
		Button Button4 = new Button("4");
		Button4.setPrefSize(50, 50);
		Button Button5 = new Button("5");
		Button5.setPrefSize(50, 50);
		Button Button6 = new Button("6");
		Button6.setPrefSize(50, 50);
		Button Button7 = new Button("7");
		Button7.setPrefSize(50, 50);
		Button Button8 = new Button("8");
		Button8.setPrefSize(50, 50);
		Button Button9 = new Button("9");
		Button9.setPrefSize(50, 50);
		Button Button0 = new Button("0");
		Button0.setPrefSize(50, 50);
		Button ButtonPlus = new Button("+");
		ButtonPlus.setPrefSize(50, 50);
		Button ButtonMinus = new Button("-");
		ButtonMinus.setPrefSize(50, 50);
		Button ButtonMult = new Button("x");
		ButtonMult.setPrefSize(50, 50);
		Button ButtonDela = new Button("/");
		ButtonDela.setPrefSize(50, 50);
		Button ButtonEXE = new Button("=");
		ButtonEXE.setPrefSize(50, 50);
		Button ButtonCLEAR = new Button("C");
		ButtonCLEAR.setPrefSize(50, 50);

		VBox box1 = new VBox();
		box1.getChildren().addAll(Button1, Button4, Button7, Button0);
		VBox box2 = new VBox();
		box2.getChildren().addAll(Button2, Button5, Button8, ButtonCLEAR);
		VBox box3 = new VBox();
		box3.getChildren().addAll(Button3, Button6, Button9, ButtonEXE);
		VBox box4 = new VBox();
		box4.getChildren().addAll(ButtonPlus, ButtonMinus, ButtonMult, ButtonDela);

		HBox box5 = new HBox();
		box5.getChildren().addAll(box1, box2, box3, box4);

		TextField input = new TextField();
		input.setPrefSize(200, 50);
		input.setEditable(false);

		BorderPane layout = new BorderPane();
		layout.setTop(input);
		layout.setCenter(box5);

		Scene scene = new Scene(layout, 189, 250);

		stage.setTitle("Miniräknare");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();

		Button1.setOnAction(event -> {
			inputText += "1";
			tal += "1";
			input.setText(inputText);
		});
		Button2.setOnAction(event -> {
			inputText += "2";
			tal += "2";
			input.setText(inputText);
		});
		Button3.setOnAction(event -> {
			inputText += "3";
			tal += "3";
			input.setText(inputText);
		});
		Button4.setOnAction(event -> {
			inputText += "4";
			tal += "4";
			input.setText(inputText);
		});
		Button5.setOnAction(event -> {
			inputText += "5";
			tal += "5";
			input.setText(inputText);
		});
		Button6.setOnAction(event -> {
			inputText += "6";
			tal += "6";
			input.setText(inputText);
		});
		Button7.setOnAction(event -> {
			inputText += "7";
			tal += "7";
			input.setText(inputText);
		});
		Button8.setOnAction(event -> {
			inputText += "8";
			tal += "8";
			input.setText(inputText);
		});
		Button9.setOnAction(event -> {
			inputText += "9";
			tal += "9";
			input.setText(inputText);
		});
		Button0.setOnAction(event -> {
			inputText += "0";
			tal += "0";
			input.setText(inputText);
		});
		ButtonCLEAR.setOnAction(event -> {
			inputText = "";
			tal = "";
			tal1 = 0;
			aktiv = false;
			input.setText(inputText);
		});
		ButtonPlus.setOnAction(event -> {
			if(aktiv == false) {
				inputText += "+";
				tal1 = Double.parseDouble(tal);
				tal = "";
				input.setText(inputText);
				aktiv = true;
			}
		});
		ButtonMinus.setOnAction(event -> {
			if(aktiv == false) {
				inputText += "-";
				tal1 = Double.parseDouble(tal);
				tal = "";
				input.setText(inputText);
				aktiv = true;
			}
		});
		ButtonMult.setOnAction(event -> {
			if(aktiv == false) {
				inputText += "x";
				tal1 = Double.parseDouble(tal);
				tal = "";
				input.setText(inputText);
				aktiv = true;
			}
		});
		ButtonDela.setOnAction(event -> {
			if(aktiv == false) {
				inputText += "/";
				tal1 = Double.parseDouble(tal);
				tal = "";
				input.setText(inputText);
				aktiv = true;
			}
		});
		ButtonEXE.setOnAction(event -> {
			double summa = 0;
			boolean execute = false;
			char c = 0;
			for (int i = 0; i < inputText.length(); i++) {
				if (inputText.charAt(i) == '+' || inputText.charAt(i) == '-' || inputText.charAt(i) == 'x'
						|| inputText.charAt(i) == '/') {
					execute = true;
					c = inputText.charAt(i);
				}
			}
			if (execute == true) {
				tal2 = Double.parseDouble(tal);
				if (c == '+') {
					summa = tal1 + tal2;
				} else if (c == '-') {
					summa = tal1 - tal2;
				} else if (c == 'x') {
					summa = tal1 * tal2;
				} else if (c == '/') {
					summa = tal1 / tal2;
				}
				tal1 = summa;
				tal2 = 0;
				tal = Double.toString(tal1);
				inputText = Double.toString(tal1);
				input.setText(inputText);
				aktiv = false;
			}
		});

	}

}
