import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.text.Text;


public class Rocket extends Application {
   
    @Override
    public void start(Stage g) {
Polygon t1= new Polygon ();
t1.getPoints().addAll(new Double[]{
   400.0, 20.0, 
    460.0, 100.0,
   340.0, 100.0
   
});
t1.setStroke(Color.BLACK);
t1.setStrokeWidth(1);
t1.setFill(Color.ROYALBLUE);
Rectangle r1= new Rectangle ( 340,102,120,110);
r1.setStroke(Color.BLACK);
r1.setStrokeWidth(1);
r1.setFill(Color.RED);
Rectangle r2= new Rectangle ( 340,214,120,115);
r2.setStroke(Color.BLACK);
r2.setStrokeWidth(1);
r2.setFill(Color.RED);
Polygon t2= new Polygon ();
t2.getPoints().addAll(new Double[]{
 336.0, 329.0, 
 336.0, 260.0, 
 275.0, 329.0,
});
t2.setStroke(Color.BLACK);
t2.setFill(Color.ROYALBLUE);
t2.setStrokeWidth(1);
Polygon t3= new Polygon ();
t3.getPoints().addAll(new Double[]{
464.0, 329.0, 
464.0, 260.0, 
525.0, 329.0,
});
t3.setStroke(Color.BLACK);
t3.setFill(Color.ROYALBLUE);
t3.setStrokeWidth(1);

Polygon t4= new Polygon ();
t4.getPoints().addAll(new Double[]{
347.0, 333.0, 
335.0, 390.0, 
359.0, 390.0,
});
t4.setStroke(null);
t4.setFill(Color.YELLOW);


Polygon t5= new Polygon ();
t5.getPoints().addAll(new Double[]{
348.0, 344.0, 
339.0, 386.0, 
355.0, 386.0,
});
t5.setStroke(null);
t5.setFill(Color.ORANGE);

Polygon t6= new Polygon ();
t6.getPoints().addAll(new Double[]{
397.0, 333.0, 
385.0, 390.0, 
409.0, 390.0,
});
t6.setStroke(null);
t6.setFill(Color.YELLOW);


Polygon t7= new Polygon ();
t7.getPoints().addAll(new Double[]{
398.0, 344.0, 
389.0, 386.0, 
405.0, 386.0,
});
t7.setStroke(null);
t7.setFill(Color.ORANGE);

Polygon t8= new Polygon ();
t8.getPoints().addAll(new Double[]{
447.0, 333.0, 
435.0, 390.0, 
459.0, 390.0,
});
t8.setStroke(null);
t8.setFill(Color.YELLOW);


Polygon t9= new Polygon ();
t9.getPoints().addAll(new Double[]{
448.0, 344.0, 
439.0, 386.0, 
455.0, 386.0,
});
t9.setStroke(null);
t9.setFill(Color.ORANGE);

Circle c1=new Circle();
c1.setCenterX(400);
c1.setCenterY(157);
c1.setRadius(50);
c1.setFill(Color.SLATEGRAY);
c1.setStroke(Color.BLACK);
c1.setStrokeWidth(1);

Arc a1= new Arc(410.0 , 158.0 , 50.0 , 50.0  , 140.0 , 80.0 );

a1.setStroke(Color.WHITE);
a1.setStrokeWidth(3);
a1.setFill(null);

Arc a2= new Arc(400.0 , 750.0 , 280.0 , 280.0  , 30.0 , 120.0 );

a2.setStroke(Color.BLACK);
a2.setStrokeWidth(3);
a2.setFill(Color.CORNFLOWERBLUE);

Arc a3= new Arc(400.0 , 860.0 , 280.0 , 280.0  , 60.0 , 60.0 );

a3.setStroke(Color.BLACK);
a3.setStrokeWidth(3);
a3.setFill(Color.CORNFLOWERBLUE); 

Polygon e1= new Polygon ();
e1.getPoints().addAll(new Double[]{
320.0, 550.0, 
300.0, 540.0, 
275.0, 555.0,
290.0, 570.0, 
290.0, 585.0, 
300.0, 600.0,
315.0, 585.0,
308.0, 576.0, 
325.0, 560.0, 
});
e1.setStroke(null);
e1.setFill(Color.SEAGREEN);

Polygon e2= new Polygon ();
e2.getPoints().addAll(new Double[]{
500.0, 600.0, 
520.0, 568.0, 
550.0, 585.0,
565.0, 574.0, 
580.0, 600.0, 


});
e2.setStroke(null);
e2.setFill(Color.SEAGREEN);

Polygon e3= new Polygon ();
e3.getPoints().addAll(new Double[]{

445.0, 476.0, 
447.0, 486.0, 
453.0, 487.0,
457.0, 483.0, 
463.0, 485.0, 
464.0, 489.0, 
472.0, 492.0,
478.0, 483.0, 

});
e3.setStroke(null);
e3.setFill(Color.SEAGREEN);

Rectangle r3= new Rectangle (365,330,70,150);
          r3.setStroke(null);
r3.setFill(Color.WHITE);
Circle c2=new Circle();
c2.setCenterX(400);
c2.setCenterY(500);
c2.setRadius(50);
c2.setFill(Color.WHITE);
c2.setStroke(null);

Circle c3=new Circle();
c3.setCenterX(350);
c3.setCenterY(450);
c3.setRadius(50);
c3.setFill(Color.WHITE);
c3.setStroke(null);

Circle c4=new Circle();
c4.setCenterX(450);
c4.setCenterY(430);
c4.setRadius(50);
c4.setFill(Color.WHITE);
c4.setStroke(null);

Group gr2=new Group(r3,c2,c3,c4);
gr2.setVisible(false);
Group gr3 =new Group (a3);
gr3.setVisible(false);
Group gr4 = new Group (e1,e2,e3);
Group gr5 = new Group (a2);
Group gr=new Group(t1,r1,r2,t2,t3,t4,t5,t6,t7,t8,t9,c1,a1,gr5,gr2,gr3,gr4);





Button b1=new Button ("go roket!");
Button b2=new Button ("bye bye ,earth!");

           
        Scene s = new Scene(gr, 800, 600);
        s.setFill(Color.MIDNIGHTBLUE);
        gr.getChildren().addAll(b1,b2);
        b2.setVisible(false);
        b1.setOnAction(new EventHandler<ActionEvent>(){
  @Override
        public void handle(ActionEvent event) {
           
       gr2.setVisible(true);
   b1.setVisible(false);
   b2.setVisible(true);
}});
        
         b2.setOnAction(new EventHandler<ActionEvent>(){
  @Override
        public void handle(ActionEvent event) {
     gr2.setVisible(false);
      gr5.setVisible(false);
      gr4.setVisible(false);
      gr3.setVisible(true);
      
}});
        
        g.setTitle("go ,rocket !");
        g.setScene(s);
        g.show();
        

    }

  
    public static void main(String[] args) {
        launch(args);
    }
  
}




