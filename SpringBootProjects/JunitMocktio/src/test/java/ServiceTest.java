import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
    @Mock
    Database databaseMock;






    @Test
    public void testQuery() {
        assertNotNull(databaseMock);
        Mockito.when(databaseMock.isAvailable()).thenReturn(true);
        Service service = new Service(databaseMock);
        boolean verify = service.query("* from dbtable");
        assertTrue(verify);
    }

    @Test
    void ensureMockitoReturnsTheConfiguredValue() {
        when(databaseMock.getUniqueId()).thenReturn(555);
        Service service = new Service(databaseMock);
        assertEquals(service.toString(), "Using database with id: 555");
    }
}
