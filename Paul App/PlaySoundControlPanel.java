public class PlaySoundControlPanel extends JPanel{
 
  public void playingSound(){
  String f = "c:/intro-prog-java/mediasources/gettysburg10.wav";
  Sound s = new Sound(f);
  s.play();  
   
  }
  
  public void playingMirrorSound(){
  String e = "c:/intro-prog-java/mediasources/gettysburg10.wav";
  Sound g = new Sound(f);
  int lengthMirr = mirrored.getLength();
  int mirrorPoint = lengthMirr;
  int valueMirr = 0;
  for(int i = 0; i < mirrorPoint; i++){
   valueMirr = this.getSampleValueAt(i);
   this.setSampleValueAt(lengthMirr - 1 - i, valueMirr);
  }
  }
  
  public void increaseVolume()
  {
    
    String t = "c:/intro-prog-java/mediasources/gettysburg10.wav";
    Sound h = new Sound(f);
    SoundSample[] sampleArray = this.getSamples();
    int value = 0;
    
    //Used ForEach Loop
    for(SoundSample sample: sampleArray){
      value = sample.getValue();
      sample.setValue(value*2);
    }
  }
  
  
}