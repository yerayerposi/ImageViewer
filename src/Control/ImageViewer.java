package Control;

import Model.Image;
import Persistence.FileImageLoader;
import java.io.File;

public class ImageViewer {

    public static void main(String[] args) {
        File folder = new File("Imagenes");
        FileImageLoader listImages = new FileImageLoader(folder);
        Image image = listImages.load();
        MainFrame mainframe = new MainFrame();
        mainframe.getImageDisplay().show(image);
    }
    
}
