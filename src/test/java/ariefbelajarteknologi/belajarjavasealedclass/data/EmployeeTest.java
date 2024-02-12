package ariefbelajarteknologi.belajarjavasealedclass.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void employee() {
        Employee employee = new Employee();
        assertNotNull(employee);
    }

    @Test
    void manager() {
        Manager manager = new Manager();
        assertNotNull(manager);
    }
}