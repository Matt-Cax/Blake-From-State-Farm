import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class UIDriver extends Application{

	@Override
	public void start(Stage primaryStage){
		BorderPane layout = new BorderPane();
		layout.setBackground(new Background(new BackgroundImage(new 
				Image("Red-Background-Wallpaper-Texture.jpg"), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		
		Label titleBox = new Label("A Day in the Life of\nBlake from State Farm");
		titleBox.setTextAlignment(TextAlignment.CENTER);
		titleBox.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 80");
		
		Button start = new Button("Start");
		start.setMinWidth(500);
		start.setMinHeight(300);
		start.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 80");  
		
		VBox titleMenu = new VBox(200);
		titleMenu.setAlignment(Pos.TOP_CENTER);
		titleMenu.getChildren().add(titleBox);
		titleMenu.getChildren().add(start);
		
		layout.setCenter(titleMenu);
		
		start.setOnAction(e->{
			transition1(primaryStage);	
		});
		
		Scene scene = new Scene(layout, 1600, 800);
		primaryStage.setTitle("Blake From State Farm Simulator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void transition1(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("*phone rings*");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			dialogue1(primaryStage);
		});
		
	}
	
	public void dialogue1(Stage primaryStage){
		VBox d1layout = new VBox(25);
		d1layout.setAlignment(Pos.CENTER);
		Scene d1scene = new Scene(d1layout, 1600, 800);
		
		d1layout.setBackground(new Background(new BackgroundImage(new 
				Image("cubical-background.jpg"), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, 
				new BackgroundSize(100, 100, true, true, true, true))));
		
		Pane pane = new Pane();
		
		Rectangle labelHolder = new Rectangle(1600,350);
		labelHolder.setFill(Color.WHITE);
		labelHolder.setStroke(Color.DARKBLUE);
		labelHolder.setOpacity(.5);
		Label dialogue = new Label();
		dialogue.setText("Blake: Hello this is Blake from State Farm. How may I help you?\n" +
				"Customer: Yea this is John Avogadro calling about getting a quote on my insurance.\n" +
				"Blake: Alright. well why don't you tell me a bit about your driving record.\n" +
				"Customer: Well I've had 2 speeding tickets and a car accidentin the last 5 years.\n\n" +
				"Select one of the responses:");
		dialogue.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		dialogue.setLayoutX(200);
		dialogue.setTextAlignment(TextAlignment.CENTER);
		dialogue.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(labelHolder, dialogue);
		
		Button choice1 = new Button();
		choice1.setText("Damn, you need to relax with your driving.");
		choice1.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice1.setOpacity(.8);
		choice1.setTextAlignment(TextAlignment.CENTER);
		choice1.setMinSize(1200, 120);
		choice1.setAlignment(Pos.CENTER);
		choice1.setOnAction(e -> {
			dialogue1_1(primaryStage);
		});
		
		Button choice2 = new Button();
		choice2.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice2.setText("I see, so would you like to know the price of your claim?");
		choice2.setOpacity(.8);
		choice2.setTextAlignment(TextAlignment.CENTER);
		choice2.setMinSize(1200, 120);
		choice2.setAlignment(Pos.CENTER);
		choice2.setOnAction(e -> {
			dialogue1_2(primaryStage);
		});
		
		Button choice3 = new Button();
		choice3.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice3.setText("Wow, those cops were out to get you those days, huh.");
		choice3.setOpacity(.8);
		choice3.setTextAlignment(TextAlignment.CENTER);
		choice3.setMinSize(1200, 120);
		choice3.setAlignment(Pos.CENTER);
		choice3.setOnAction(e -> {
			dialogue1_3(primaryStage);
		});
		
		d1layout.getChildren().addAll(pane, choice1, choice2, choice3);
		primaryStage.setScene(d1scene);
	}
	
	public void dialogue1_1(Stage primaryStage){
		VBox d1_1layout = new VBox(25);
		d1_1layout.setAlignment(Pos.CENTER);
		Scene d1_1scene = new Scene(d1_1layout, 1600, 800);
		
		d1_1layout.setBackground(new Background(new BackgroundImage(new 
				Image("cubical-background.jpg"), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, 
				new BackgroundSize(100, 100, true, true, true, true))));
		
		Pane pane = new Pane();
		
		Rectangle labelHolder = new Rectangle(1600,350);
		labelHolder.setFill(Color.WHITE);
		labelHolder.setStroke(Color.DARKBLUE);
		labelHolder.setOpacity(.5);
		Label dialogue = new Label();
		dialogue.setText("Customer: Well thats a bit rude done you think?\n\n" +
				"Select one of the responses:");
		dialogue.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		dialogue.setLayoutX(200);
		dialogue.setTextAlignment(TextAlignment.CENTER);
		dialogue.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(labelHolder, dialogue);
		
		Button choice1 = new Button();
		choice1.setText("No, I can say what I want.");
		choice1.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice1.setOpacity(.8);
		choice1.setTextAlignment(TextAlignment.CENTER);
		choice1.setMinSize(1200, 120);
		choice1.setAlignment(Pos.CENTER);
		choice1.setOnAction(e -> {
			dialogue1_1_1(primaryStage);
		});
		
		Button choice2 = new Button();
		choice2.setText("Yes, I apologize sir.");
		choice2.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice2.setOpacity(.8);
		choice2.setTextAlignment(TextAlignment.CENTER);
		choice2.setMinSize(1200, 120);
		choice2.setAlignment(Pos.CENTER);
		choice2.setOnAction(e -> {
			dialogue1_1_2(primaryStage);
		});
		
		Button choice3 = new Button();
		choice3.setText("Hang up.");
		choice3.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice3.setOpacity(.8);
		choice3.setTextAlignment(TextAlignment.CENTER);
		choice3.setMinSize(1200, 120);
		choice3.setAlignment(Pos.CENTER);
		choice3.setOnAction(e -> {
			dialogue1_1_3(primaryStage);
		});
		
		d1_1layout.getChildren().addAll(pane, choice1, choice2, choice3);
		primaryStage.setScene(d1_1scene);
	}
	
	public void dialogue1_1_1(Stage primaryStage){
		VBox d1_1_1layout = new VBox(200);
		d1_1_1layout.setAlignment(Pos.CENTER);
		Scene d1_1_1scene = new Scene(d1_1_1layout, 1600, 800);
		
		d1_1_1layout.setBackground(new Background(new BackgroundImage(new 
				Image("cubical-background.jpg"), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, 
				new BackgroundSize(100, 100, true, true, true, true))));
		
		Pane pane = new Pane();
		
		Rectangle labelHolder = new Rectangle(1600,350);
		labelHolder.setFill(Color.WHITE);
		labelHolder.setStroke(Color.DARKBLUE);
		labelHolder.setOpacity(.5);
		Label dialogue = new Label();
		dialogue.setText("Customer: Well then we will just take ourselves elsewhere.\n\n" +
				"Select one of the responses:");
		dialogue.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		dialogue.setLayoutX(200);
		dialogue.setTextAlignment(TextAlignment.CENTER);
		dialogue.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(labelHolder, dialogue);
		
		Button choice1 = new Button();
		choice1.setText("Fine then, we didn't want you anyways!.");
		choice1.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice1.setOpacity(.8);
		choice1.setTextAlignment(TextAlignment.CENTER);
		choice1.setMinSize(1200, 2000);
		choice1.setAlignment(Pos.CENTER);
		choice1.setOnAction(e -> {
			dialogue1_1_1(primaryStage);
		});
		
		d1_1_1layout.getChildren().addAll(pane, choice1);
		primaryStage.setScene(d1_1_1scene);
	}
	
	public void fired(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("You were fired from work");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			System.exit(0);
		});
	}
	
	public void dialogue1_1_2(Stage primaryStage){
		VBox d1_1_2layout = new VBox(200);
		d1_1_2layout.setAlignment(Pos.CENTER);
		Scene d1_1_2scene = new Scene(d1_1_2layout, 1600, 800);
		
		d1_1_2layout.setBackground(new Background(new BackgroundImage(new 
				Image("cubical-background.jpg"), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, 
				new BackgroundSize(100, 100, true, true, true, true))));
		
		Pane pane = new Pane();
		
		Rectangle labelHolder = new Rectangle(1600,350);
		labelHolder.setFill(Color.WHITE);
		labelHolder.setStroke(Color.DARKBLUE);
		labelHolder.setOpacity(.5);
		Label dialogue = new Label();
		dialogue.setText("Blake: Alright well lets go ahead amd get on with it.\n" + 
				"(Your boss gives you a look of judgement and you will probably recieve a pay dock\n\n" +
				"Select one of the responses:");
		dialogue.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		dialogue.setLayoutX(200);
		dialogue.setTextAlignment(TextAlignment.CENTER);
		dialogue.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(labelHolder, dialogue);
		
		Button choice1 = new Button();
		choice1.setText("I see, so would you like to know the price of the claim?");
		choice1.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice1.setOpacity(.8);
		choice1.setTextAlignment(TextAlignment.CENTER);
		choice1.setMinSize(1200, 200);
		choice1.setAlignment(Pos.CENTER);
		choice1.setOnAction(e -> {
			dialogue1_2(primaryStage);
		});
		
		d1_1_2layout.getChildren().addAll(pane, choice1);
		primaryStage.setScene(d1_1_2scene);
	}
	
	public void dialogue1_1_3(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("You get a stern look from your boss and recieve a pay dock.");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			System.exit(0);
		});
	}
	
	public void dialogue1_2(Stage primaryStage){
		VBox d1_2layout = new VBox(25);
		d1_2layout.setAlignment(Pos.CENTER);
		Scene d1_2scene = new Scene(d1_2layout, 1600, 800);
		
		d1_2layout.setBackground(new Background(new BackgroundImage(new 
				Image("cubical-background.jpg"), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, 
				new BackgroundSize(100, 100, true, true, true, true))));
		
		Pane pane = new Pane();
		
		Rectangle labelHolder = new Rectangle(1600,350);
		labelHolder.setFill(Color.WHITE);
		labelHolder.setStroke(Color.DARKBLUE);
		labelHolder.setOpacity(.5);
		Label dialogue = new Label();
		dialogue.setText("Blake: It is going to be around $1600 every 6 months.\n" + 
				"Customer: Well what the hell, you guys are cheating us, It shouldn't be that much money\n\n" +
				"Select one of the responses:");
		dialogue.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		dialogue.setLayoutX(200);
		dialogue.setTextAlignment(TextAlignment.CENTER);
		dialogue.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(labelHolder, dialogue);
		
		Button choice1 = new Button();
		choice1.setText("I'm sorry we made you feel that way sir, but we can't do more for you.");
		choice1.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice1.setOpacity(.8);
		choice1.setTextAlignment(TextAlignment.CENTER);
		choice1.setMinSize(1200, 120);
		choice1.setAlignment(Pos.CENTER);
		choice1.setOnAction(e -> {
			dialogue1_2_1(primaryStage);
		});
		
		Button choice2 = new Button();
		choice2.setText("Well that's what you get for driving like $h*t!");
		choice2.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice2.setOpacity(.8);
		choice2.setTextAlignment(TextAlignment.CENTER);
		choice2.setMinSize(1200, 120);
		choice2.setAlignment(Pos.CENTER);
		choice2.setOnAction(e -> {
			dialogue1_2_2(primaryStage);
		});
		
		Button choice3 = new Button();
		choice3.setText("Hey, I understand sir, it's no cheaper for even me unfortunately, \n" +
				"but you need insurance and we here at State Farm have the best insurance.");
		choice3.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice3.setOpacity(.8);
		choice3.setTextAlignment(TextAlignment.CENTER);
		choice3.setMinSize(1200, 120);
		choice3.setAlignment(Pos.CENTER);
		choice3.setOnAction(e -> {
			dialogue1_2_3(primaryStage);
		});
		
		d1_2layout.getChildren().addAll(pane, choice1, choice2, choice3);
		primaryStage.setScene(d1_2scene);
	}
	
	public void dialogue1_2_1(Stage primaryStage){
		VBox d1_2_1layout = new VBox(25);
		d1_2_1layout.setAlignment(Pos.CENTER);
		Scene d1_2_1scene = new Scene(d1_2_1layout, 1600, 800);
		
		d1_2_1layout.setBackground(new Background(new BackgroundImage(new 
				Image("cubical-background.jpg"), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, 
				new BackgroundSize(100, 100, true, true, true, true))));
		
		Pane pane = new Pane();
		
		Rectangle labelHolder = new Rectangle(1600,350);
		labelHolder.setFill(Color.WHITE);
		labelHolder.setStroke(Color.DARKBLUE);
		labelHolder.setOpacity(.5);
		Label dialogue = new Label();
		dialogue.setText("Customer: Yea well I'm going to have to talk to your manager about this.\n\n" +
				"Select one of the responses:");
		dialogue.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		dialogue.setLayoutX(200);
		dialogue.setTextAlignment(TextAlignment.CENTER);
		dialogue.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(labelHolder, dialogue);
		
		Button choice1 = new Button();
		choice1.setText("What? You think that'll change anything?");
		choice1.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice1.setOpacity(.8);
		choice1.setTextAlignment(TextAlignment.CENTER);
		choice1.setMinSize(1200, 120);
		choice1.setAlignment(Pos.CENTER);
		choice1.setOnAction(e -> {
			reported(primaryStage);
		});
		
		Button choice2 = new Button();
		choice2.setText("Yes sir whatever you request");
		choice2.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice2.setOpacity(.8);
		choice2.setTextAlignment(TextAlignment.CENTER);
		choice2.setMinSize(1200, 120);
		choice2.setAlignment(Pos.CENTER);
		choice2.setOnAction(e -> {
			toManager(primaryStage);
		});
		
		Button choice3 = new Button();
		choice3.setText("Hey I'm on your side we both want the best for you.");
		choice3.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		choice3.setOpacity(.8);
		choice3.setTextAlignment(TextAlignment.CENTER);
		choice3.setMinSize(1200, 120);
		choice3.setAlignment(Pos.CENTER);
		choice3.setOnAction(e -> {
			toDialogue1_3(primaryStage);
		});
		
		d1_2_1layout.getChildren().addAll(pane, choice1, choice2, choice3);
		primaryStage.setScene(d1_2_1scene);
	}
	
	public void reported(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("Customer: well in that case I will be reporting you as well\n" +
		"You recieve a notice from your boss and move on to the next day.");
		textLabel.setMinSize(1600, 800);
		textLabel.setTextAlignment(TextAlignment.CENTER);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			System.exit(0);
		});
	}
	
	public void toManager(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("You get sent to your manager and he gives you a talk on customer service");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			System.exit(0);
		});
	}
	
	public void toDialogue1_3(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("Customer: Thank you very much for helping me out.");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			dialogue1_3(primaryStage);
		});
	}
	
	public void dialogue1_2_2(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("Excuse me  you can't say that to me you all don't know me at all\n" +
				"you ******** *********, ***** ********");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			System.exit(0);
		});
	}
	
	public void dialogue1_2_3(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("Thank you for understanding and helping us out like this.\n"
				+ "No problem, it is my personal job to make sure you leave here as happy as possible.\n\n"
				+ "They left with a deal and were happy State Farm Insurance customers.");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			dialogue1_3(primaryStage);
		});
	}

	public void dialogue1_3(Stage primaryStage){
		VBox d1_3layout = new VBox(25);
		d1_3layout.setAlignment(Pos.CENTER);
		Scene d1_3scene = new Scene(d1_3layout, 1600, 800);
		
		d1_3layout.setBackground(new Background(new BackgroundImage(new 
				Image("cubical-background.jpg"), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		
		Pane pane = new Pane();
		
		Rectangle labelHolder = new Rectangle(1600,800);
		labelHolder.setFill(Color.WHITE);
		labelHolder.setStroke(Color.DARKBLUE);
		labelHolder.setOpacity(.5);
		Label dialogue = new Label();
		dialogue.setText("Customer: Yea haha they were out to get me alright, nothing we can do now\n\n" +
				"Blake: So we are looking at a little bit more money due to the tickets, it'll be around\n" +
				"$1600 for 6 months or only $267 a month! Hopefully that helps you as much as possible" +
				"... So are you married?\n\nBack in the customer's house...\n"+ 
				"Customer: Yea, I'm married, why does that matter..... You'd do that for me?\n"+
				"Really, I'd like that a lot.\n" + "Wife: Who are you talking to?\n"+
				"Customer: Umm, it's Blake... from State Farm... That sounds like a really good deal\n" +
				"Wife: Really? Talking to Blake from State Farm at 3 in the morning? Who is this?\n"+
				"Blake: It's Blake... from State Farm....\n"+"Wife: What're you wearing 'Blake from State Farm'\n");
		dialogue.setStyle("-fx-font-family: 'Camic Sans MS'; -fx-font-size: 32");
		dialogue.setLayoutX(200);
		dialogue.setTextAlignment(TextAlignment.CENTER);
		dialogue.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(labelHolder, dialogue);
		
		dialogue.setOnMouseClicked(e -> {
			khakis(primaryStage);
		});
		
		d1_3layout.getChildren().add(pane);
		primaryStage.setScene(d1_3scene);
	}
	
	public void khakis(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("Uhhhhhhh, Khaki's?");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			end(primaryStage);
		});
	}
	
	public void end(Stage primaryStage){
		Pane pane = new Pane();
		Rectangle black = new Rectangle(1600,800);
		black.setFill(Color.BLACK);
		pane.getChildren().add(black);
		Label textLabel = new Label("Wife: She sounds hideous.\n Customer: Well he's a guy so....");
		textLabel.setMinSize(1600, 800);
		textLabel.setAlignment(Pos.CENTER);
		textLabel.setTextFill(Color.WHITE);
		textLabel.setStyle("-fx-font-size: 64; -fx-font-family: 'Comic Sans MS'");
		pane.getChildren().add(textLabel);
		Scene transition1 = new Scene(pane, 1600, 800);
		primaryStage.setScene(transition1);
		
		pane.setOnMouseClicked(e -> {
			System.exit(0);
		});
	}
	
}
