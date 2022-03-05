import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Iterator;

@ExtendWith(MockitoExtension.class)
public class MockitoWhenExampleTest {

    @Mock
    Iterator<String> iterator;

    Comparable<String> comparable;

    @Test
    void testMoreThanOneReturnValue() {
        Mockito.when(iterator.next())
                .thenReturn("Mockito")
                .thenReturn("Rocks")
                .thenReturn("Rocking");

        String result = iterator.next() + " " + iterator.next() + " " + iterator.next();

        Assertions.assertEquals("Mockito Rocks Rocking", result);
    }

    @Test
    void testReturnValueDependentOnMethodParameter(@Mock Comparable<String> comparable) {

        Mockito.when(comparable.compareTo("Mockito")).thenReturn(1);
        Mockito.when(comparable.compareTo("Intellij")).thenReturn(2);
        Mockito.when(comparable.compareTo("Eclipse")).thenReturn(3);

        Assertions.assertEquals(1, comparable.compareTo("Mockito"));
        Assertions.assertEquals(2, comparable.compareTo("Intellij"));
        Assertions.assertEquals(3, comparable.compareTo("Eclipse"));
    }

}
