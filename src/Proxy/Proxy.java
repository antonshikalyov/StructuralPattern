package Proxy;

public class Proxy implements File{

    String file;
    Video video;
    public Proxy(String file) {
        this.file = file;
    }

    @Override
    public void display() {
       if(video == null){
           video = new Video(file);
       }else
       video.display();
    }
}
