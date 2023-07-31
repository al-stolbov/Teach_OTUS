package PriceInWords.Consumer;

import java.io.IOException;

public interface Console {
    int enter() throws IOException;
    void exit(int status);
}
