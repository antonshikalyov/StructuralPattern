package Proxy;

public class Video implements File{
    private String myVideo;

    public Video(String myVideo) {
        this.myVideo = myVideo;
        load();
    }

    void load(){
        System.out.println("Downolad video: " + myVideo);
    }

    @Override
    public void display() {
        System.out.println("Show video: " + myVideo);
    }
}
