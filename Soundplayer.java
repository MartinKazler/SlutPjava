package Test;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
// An AWT GUI program inherits the top-level container java.awt.Frame
public class Soundplayer extends Frame implements ActionListener, WindowListener{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Clip clip; // Clip is a program in awt that makes clips/sounds work
    private boolean isPlaying = true;  //the boolean is used to store only two possible values, either true or false
    public Soundplayer () {  // event handlers
      setLayout(new GridLayout(3, 2, 3, 3));
         // Frame sets layout to 3x2 GridLayout, horizontal and vertical gaps of 3 pixels
      // The components are added from left-to-right, top-to-bottom
      btn1 = new Button("Cat"); // gives each button a name
      add(btn1); 
      btn2 = new Button("Dog"); // gives each button a name
      add(btn2);
      btn3 = new Button("Cow"); // gives each button a name
      add(btn3);
      btn4 = new Button("Mouse"); 
      add(btn4);
      btn5 = new Button("Rooster"); 
      add(btn5);  // adds the button to the window/frame
      btn6 = new Button("Horse"); 
      add(btn6);  // adds the button to the window/frame
      btn7 = new Button("Pause"); 
      add(btn7);  // adds the button to the window/frame
      btn8 = new Button("Stop"); 
      add(btn8);
      btn9 = new Button("Manual"); 
      add(btn9);
      addWindowListener(this); // adds a WindowListener to the window so your inputs are actually reacted to when u click on buttons.
      btn1.addActionListener(this); // adds a Listener to each button
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      btn4.addActionListener(this);
      btn5.addActionListener(this); // adds a Listener to each button
      btn6.addActionListener(this);
      btn7.addActionListener(this);
      btn8.addActionListener(this);
      btn9.addActionListener(this); // adds a Listener to each button
      setTitle("SoundBoard"); // sets title
      setSize(1000, 400);           // initial size
      setVisible(true);        //  Frame shows
      try{                                        // try/catch picks up any exceptions/ errors that might happen.
        clip = AudioSystem.getClip();
      }
    catch (Exception exc){
    }}
   // The entry main() method
   public static void main(String[] args) {
      new Soundplayer();  // Let the constructor do the job
   }
   public void actionPerformed (ActionEvent e){ // Function to make the program to close down once u click on. its here and not in the switch because of security reasons
        if (e.getSource().equals(btn8)){        // like if the switch doesn't work or the X doesn't work
            System.exit(0);
            }
        switch (e.getActionCommand()){ //Switch case to make a specific thing happen when u click on a specific button.
        case "Cat": // Starts this case once you click on the cat button
        clip.close();
        try{
        clip = AudioSystem.getClip();   // get the clip from the "library" or whatever
        clip.open(AudioSystem.getAudioInputStream(new File("Cat.wav"))); //opens the file 
        clip.start(); // Starts the file
        isPlaying= true;
        }
        catch (Exception exc) {
        }
        break;
        case "Dog": // Starts this case once you click on the dog button
        clip.close(); // closes other cases once its clicked on
        try{
            clip = AudioSystem.getClip(); // get the clip from the "library" or whatever
            clip.open(AudioSystem.getAudioInputStream(new File("Dog.wav"))); //opens the file 
            clip.start(); // Starts the file
            isPlaying= true;
            }
            catch (Exception exc) {
            }
        break;
        case "Cow": // Starts this case once you click on the cow button
        clip.close(); // closes other cases once its clicked on
        try{
            clip = AudioSystem.getClip(); // get the clip from the "library" or whatever
            clip.open(AudioSystem.getAudioInputStream(new File("Cow.wav"))); //opens the file 
            clip.start();  // Starts the file
            isPlaying= true;
            }
            catch (Exception exc) {
            }
        break;
        case "Rooster": // Starts this case once you click on the Rooster button
        clip.close();  // closes other cases once its clicked on
        try{
            clip = AudioSystem.getClip(); // get the clip from the "library" or whatever
            clip.open(AudioSystem.getAudioInputStream(new File("Rooster.wav"))); //opens the file 
            clip.start(); // Starts the file
            isPlaying= true;
            }
            catch (Exception exc) {
            }
        break;
        case "Horse": // Starts this case once you click on the Horse button
        clip.close(); // closes other cases once its clicked on
        try{
            clip = AudioSystem.getClip(); // get the clip from the "library" or whatever
            clip.open(AudioSystem.getAudioInputStream(new File("Horse.wav"))); //opens the file 
            clip.start(); // Starts the file
            isPlaying= true;
            }
            catch (Exception exc) {
            }
        break;
        case "Mouse": // Starts this case once you click on the Mouse button
        clip.close();  // closes other cases once its clicked on
        try{
            clip = AudioSystem.getClip(); // get the clip from the "library" or whatever
            clip.open(AudioSystem.getAudioInputStream(new File("Mouse.wav"))); //opens the file 
            clip.start(); // Starts the file
            isPlaying= true;
            }
            catch (Exception exc) {
            }
        break;
       
        case "Pause":
        if (isPlaying) clip.stop(); //Pause the clip and if u click on it again/else then its plays again
        else clip.start();
        isPlaying = !isPlaying;
        break;
        
        case "Manual": // shows a dialog when u click on the manual button
			JOptionPane.showMessageDialog(btn9, "This program isn't that Hard. \n You basically click on the sound you want to hear and there is a option to pause the sound and then reclick on the pause button to start the sound again.\n The stop button closes the program. it´s really easy right!");
            break;
        
        
        
        default: break;
    }
   }
   
   
   // different functions for the window that pops up on the screen u need to have this otherwise wont the widow actually close when u click on the X at the side.
   
   @Override
   public void windowOpened(WindowEvent e) { 
       
   }
   @Override
   public void windowClosing(WindowEvent e) {
       dispose();
   }
   @Override
   public void windowClosed(WindowEvent e) {
      
   }
   @Override
   public void windowIconified(WindowEvent e) {
      
   }
   @Override
   public void windowDeiconified(WindowEvent e) {
       
   }
   @Override
   public void windowActivated(WindowEvent e) {
      
   }
   @Override
   public void windowDeactivated(WindowEvent e) {
     
   }
}
  