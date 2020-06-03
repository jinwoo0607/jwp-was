package http;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ProtocolTest {

    @Test
    void isValid() {
        assertThatThrownBy(() -> {
            new Protocol("HTTP");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void create() {
        Protocol protocol = new Protocol("HTTP/1.1");
        assertThat(protocol).isEqualTo(new Protocol("HTTP", "1.1"));
    }
}
