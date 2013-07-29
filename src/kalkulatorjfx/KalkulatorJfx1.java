package kalkulatorjfx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


import javafx.stage.Stage;

/**
 *
 * @author LordofDestruction
 */
public class KalkulatorJfx1 extends Application {

    long firstLong;
    long secondLong;
    long totalLong;
    long plmin;
    long memory;
    int dodawanie;
    int odejmowanie;
    int mnożenie;
    int dzielenie;

    /* Stworzone przyciski oraz pole tekstowe */
    @Override
    public void start(Stage primaryStage) {
        final Button btn1 = new Button();
        final Button btn2 = new Button();
        final Button btn3 = new Button();
        final Button btn4 = new Button();
        final Button btn5 = new Button();
        final Button btn6 = new Button();
        final Button btn7 = new Button();
        final Button btn8 = new Button();
        final Button btn9 = new Button();
        final Button btn0 = new Button();
        final Button btnad = new Button();
        final Button btnsub = new Button();
        final Button btnmul = new Button();
        final Button btndiv = new Button();
        final Button btneq = new Button();
        final Button btncl = new Button();
        final Button btnmempl = new Button();
        final Button btnmemmin = new Button();
        final Button btnmemst = new Button();
        final Button btnplmin = new Button();
        final Tooltip tt= new Tooltip();
        tt.setText("dupa");
        btn0.setTooltip(tt);
        Label label1 = new Label();
        final TextField txtFld = new TextField();
        txtFld.setMinWidth(195);
        txtFld.setMinHeight(50);
        txtFld.setEditable(false);



        HBox hb = new HBox();
        hb.getChildren().addAll(txtFld);
        hb.setSpacing(50);


        /* Cień na przycisku "1" jednak nie wiem czemu nie mogę dodać cieni na
         * pozostałych przyciskach.
         */


        final DropShadow shadow = new DropShadow();
        btn1.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn1.setEffect(shadow);
            }
        });
        btn1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn1.setEffect(null);
            }
        });
         btn2.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn2.setEffect(shadow);
            }
        });
        btn2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn2.setEffect(null);
            }
        });
         btn3.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn3.setEffect(shadow);
            }
        });
        btn3.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn3.setEffect(null);
            }
        });
         btn4.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn4.setEffect(shadow);
            }
        });
        btn4.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn4.setEffect(null);
            }
        });
         btn5.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn5.setEffect(shadow);
            }
        });
        btn5.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn5.setEffect(null);
            }
        });
         btn6.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn6.setEffect(shadow);
            }
        });
        btn6.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn6.setEffect(null);
            }
        });
         btn7.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn7.setEffect(shadow);
            }
        });
        btn7.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn7.setEffect(null);
            }
        });
         btn8.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn8.setEffect(shadow);
            }
        });
        btn8.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn8.setEffect(null);
            }
        });
         btn9.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn9.setEffect(shadow);
            }
        });
        btn9.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn9.setEffect(null);
            }
        });
         btn0.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn0.setEffect(shadow);
            }
        });
        btn0.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn0.setEffect(null);
            }
        });
         btncl.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btncl.setEffect(shadow);
            }
        });
        btncl.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btncl.setEffect(null);
            }
        });
         btnad.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnad.setEffect(shadow);
            }
        });
        btnad.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnad.setEffect(null);
            }
        });
         btnsub.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnsub.setEffect(shadow);
            }
        });
        btnsub.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnsub.setEffect(null);
            }
        });
         btnmul.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnmul.setEffect(shadow);
            }
        });
        btnmul.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnmul.setEffect(null);
            }
        });
         btndiv.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btndiv.setEffect(shadow);
            }
        });
        btndiv.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btndiv.setEffect(null);
            }
        });
         btneq.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btneq.setEffect(shadow);
            }
        });
        btneq.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btneq.setEffect(null);
            }
        });
        btnmempl.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnmempl.setEffect(shadow);
            }
        });
        btnmempl.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnmempl.setEffect(null);
            }
        });
        btnmemmin.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnmemmin.setEffect(shadow);
            }
        });
        btnmemmin.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnmemmin.setEffect(null);
            }
        });
        btnmemst.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnmemst.setEffect(shadow);
            }
        });
        btnmemst.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnmemst.setEffect(null);
            }
        });
        btnplmin.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnplmin.setEffect(shadow);
            }
        });
        btnplmin.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btnplmin.setEffect(null);
            }
        });
        

        /*Wyrównanie wielkości ikon 
         */

        btn1.setMaxWidth(45);
        btn1.setMaxHeight(45);
        btn2.setMaxWidth(45);
        btn2.setMaxHeight(45);
        btn3.setMaxWidth(45);
        btn3.setMaxHeight(45);
        btn4.setMaxWidth(45);
        btn4.setMaxHeight(45);
        btn5.setMaxWidth(45);
        btn5.setMaxHeight(45);
        btn6.setMaxWidth(45);
        btn6.setMaxHeight(45);
        btn7.setMaxWidth(45);
        btn7.setMaxHeight(45);
        btn8.setMaxWidth(45);
        btn8.setMaxHeight(45);
        btn9.setMaxWidth(45);
        btn9.setMaxHeight(45);
        btn0.setMaxWidth(45);
        btn0.setMaxHeight(45);
        btnad.setMaxWidth(45);
        btnad.setMaxHeight(45);
        btnsub.setMaxWidth(45);
        btnsub.setMaxHeight(45);
        btnmul.setMaxWidth(45);
        btnmul.setMaxHeight(45);
        btndiv.setMaxWidth(45);
        btndiv.setMaxHeight(45);
        btneq.setMaxWidth(45);
        btneq.setMaxHeight(45);
        btncl.setMaxWidth(45);
        btncl.setMaxHeight(45);
        btnmempl.setMaxWidth(45);
        btnmempl.setMaxHeight(45);
        btnmemmin.setMaxWidth(45);
        btnmemmin.setMaxHeight(45);
        btnmemst.setMaxWidth(45);
        btnmemst.setMaxHeight(45);
        btnplmin.setMaxWidth(45);
        btnplmin.setMaxHeight(45);
        
        /*
         * Tekst na przyciskach
         */

        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");
        btnad.setText("+");
        btnsub.setText(" -");
        btnmul.setText(" x");
        btndiv.setText(" /");
        btneq.setText("=");
        btncl.setText("C");
        btn0.setText("0");
        btnmempl.setText("M+");
        btnmemmin.setText("M-");
        btnmemst.setText("M");
        btnplmin.setText("+/-");

        /*
         * Printowanie wartości dwóch przycisków oknie output
         */

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn1.getText());
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn2.getText());
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn3.getText());
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn4.getText());
            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn5.getText());
            }
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn6.getText());
            }
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn7.getText());
            }
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn8.getText());
            }
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn9.getText());
            }
        });
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText(txtFld.getText() + btn0.getText());
            }
        });
        btnad.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                firstLong = (Long.parseLong(String.valueOf(txtFld.getText())));
                txtFld.setText("");
                dodawanie = 1;
            }
        });
        btnsub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                firstLong = (Long.parseLong(String.valueOf(txtFld.getText())));
                txtFld.setText("");
                odejmowanie = 1;
            }
        });
        btnmul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                firstLong = (Long.parseLong(String.valueOf(txtFld.getText())));
                txtFld.setText("");
                mnożenie = 1;
            }
        });
        btndiv.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                firstLong = (Long.parseLong(String.valueOf(txtFld.getText())));
                txtFld.setText("");
                dzielenie = 1;
            }
        });

        btneq.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                secondLong = (Long.parseLong(String.valueOf(txtFld.getText())));
                if (dodawanie > 0) {
                    totalLong = firstLong + secondLong;
                    txtFld.setText((String.valueOf(totalLong)));
                    firstLong = 0;
                    secondLong = 0;
                    dodawanie = 0;
                }
                if (odejmowanie > 0) {
                    totalLong = firstLong - secondLong;
                    txtFld.setText((String.valueOf(totalLong)));
                    firstLong = 0;
                    secondLong = 0;
                    odejmowanie = 0;
                }
                if (mnożenie > 0) {
                    totalLong = firstLong * secondLong;
                    txtFld.setText((String.valueOf(totalLong)));
                    firstLong = 0;
                    secondLong = 0;
                    dzielenie = 0;
                }
                if (dzielenie > 0) {
                    totalLong = firstLong / secondLong;
                    txtFld.setText((String.valueOf(totalLong)));
                    firstLong = 0;
                    secondLong = 0;
                    dzielenie = 0;
                }
            }
        });
        btncl.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtFld.setText("");
                
            }
        });
        btnmemst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                memory = (Long.parseLong(String.valueOf(txtFld.getText())));
                txtFld.setText("");
                
                
            }
        });
        btnmempl.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                txtFld.setText(String.valueOf(memory));
                
                
            }
        });
        btnplmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              plmin = (Long.parseLong(String.valueOf(txtFld.getText())));
              plmin = plmin*(-1);
              txtFld.setText(String.valueOf(plmin));
                
                
            }
        });
        
        /* Kolumny i wiersze
         * 
         */

        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(10));
        root.getColumnConstraints().add(new ColumnConstraints(50));
        root.getColumnConstraints().add(new ColumnConstraints(50));
        root.getColumnConstraints().add(new ColumnConstraints(50));
        root.getColumnConstraints().add(new ColumnConstraints(50));
        root.getRowConstraints().add(new RowConstraints(50));
        root.getRowConstraints().add(new RowConstraints(50));
        root.getRowConstraints().add(new RowConstraints(50));
        root.getRowConstraints().add(new RowConstraints(50));
        root.getRowConstraints().add(new RowConstraints(50));
        root.getRowConstraints().add(new RowConstraints(50));

        /*
         * Umiejscowienie przycisków na "siatce"
         */

        GridPane.setRowIndex(txtFld, 0);
        GridPane.setColumnIndex(txtFld, 1);
        GridPane.setRowIndex(btn1, 1);
        GridPane.setColumnIndex(btn1, 1);
        GridPane.setRowIndex(btn2, 1);
        GridPane.setColumnIndex(btn2, 2);
        GridPane.setRowIndex(btn3, 1);
        GridPane.setColumnIndex(btn3, 3);
        GridPane.setRowIndex(btn4, 2);
        GridPane.setColumnIndex(btn4, 1);
        GridPane.setRowIndex(btn5, 2);
        GridPane.setColumnIndex(btn5, 2);
        GridPane.setRowIndex(btn6, 2);
        GridPane.setColumnIndex(btn6, 3);
        GridPane.setRowIndex(btn7, 3);
        GridPane.setColumnIndex(btn7, 1);
        GridPane.setRowIndex(btn8, 3);
        GridPane.setColumnIndex(btn8, 2);
        GridPane.setRowIndex(btn9, 3);
        GridPane.setColumnIndex(btn9, 3);
        GridPane.setRowIndex(btnad, 1);
        GridPane.setColumnIndex(btnad, 4);
        GridPane.setRowIndex(btnsub, 2);
        GridPane.setColumnIndex(btnsub, 4);
        GridPane.setRowIndex(btnmul, 3);
        GridPane.setColumnIndex(btnmul, 4);
        GridPane.setRowIndex(btndiv, 4);
        GridPane.setColumnIndex(btndiv, 4);
        GridPane.setRowIndex(btneq, 4);
        GridPane.setColumnIndex(btneq, 1);
        GridPane.setRowIndex(btncl, 4);
        GridPane.setColumnIndex(btncl, 2);
        GridPane.setRowIndex(btn0, 4);
        GridPane.setColumnIndex(btn0, 3);
        GridPane.setRowIndex(btnmempl, 5);
        GridPane.setColumnIndex(btnmempl, 1);
        GridPane.setRowIndex(btnmemmin, 5);
        GridPane.setColumnIndex(btnmemmin, 2);
        GridPane.setRowIndex(btnmemst, 5);
        GridPane.setColumnIndex(btnmemst, 3);
        GridPane.setRowIndex(btnplmin, 5);
        GridPane.setColumnIndex(btnplmin, 4);
        /*
         *  
         */

        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(btn6);
        root.getChildren().add(btn7);
        root.getChildren().add(btn8);
        root.getChildren().add(btn9);
        root.getChildren().add(btn0);
        root.getChildren().add(btnad);
        root.getChildren().add(btnsub);
        root.getChildren().add(btnmul);
        root.getChildren().add(btndiv);
        root.getChildren().add(btneq);
        root.getChildren().add(btncl);
        root.getChildren().add(txtFld);
        root.getChildren().add(btnmempl);
        root.getChildren().add(btnmemmin);
        root.getChildren().add(btnmemst);
        root.getChildren().add(btnplmin);


        /*
         * Scena czyli mój cały kalkulator
         */


        Scene scene = new Scene(root, 220, 310, Color.MAROON);

        primaryStage.setTitle("Kalkulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private String t(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
