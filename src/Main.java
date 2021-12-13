import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {

  public static void main(String[] args) throws IOException {

    URL website = new URL("http://download11.bsplayer.com/download/file/mirror1/bsplayer277.setup.exe");
    ReadableByteChannel rbc = Channels.newChannel(website.openStream());
    FileOutputStream fos = new FileOutputStream("bsplayer277.setup.exe");
    fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

  }

}
