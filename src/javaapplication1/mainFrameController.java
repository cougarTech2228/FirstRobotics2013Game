/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author espaker16
 */
public final class mainFrameController {
    
    public specViewController mySpecViewController;
    
    public mainFrame myMainFrame;
    
     
    
    public mainFrameController(){
        myMainFrame = new mainFrame(this);
        myMainFrame.setVisible(true);
        myMainFrame.specPanel.setVisible(false);
        myMainFrame.startPanel.setVisible(false);
        myMainFrame.planPanel.setVisible(false);
        
        mySpecViewController = new specViewController();
        
        startView();
    }
    
    public void actionHandler (int identityCode){
        switch(identityCode){
            case 0:{
                
            }
            case 1:{
                System.exit(0);//quit button
            }
            case 2:{
                planView();//playbutton
            }         
        }
    }
     
    public void specView (){ // the spec viw is the one with all the settings but not the blue grid one that doesnt have a grid yet
       myMainFrame.specPanel.setVisible(true);
       myMainFrame.startPanel.setVisible(false);
       myMainFrame.planPanel.setVisible(false);
       
    }
    
     public void startView (){
       myMainFrame.specPanel.setVisible(false);
       myMainFrame.startPanel.setVisible(true);
       myMainFrame.planPanel.setVisible(false);
    }
     
     public void planView (){
       myMainFrame.specPanel.setVisible(false);
       myMainFrame.startPanel.setVisible(false);
       myMainFrame.planPanel.setVisible(true);
    }
}
