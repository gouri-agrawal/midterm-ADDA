package example;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Properties;
public class ValidatorTest {
private Validator matcher;
@Before
public void setUp() {
Properties storedCredentials = new Properties();
storedCredentials.setProperty("ram", "3025");
matcher = new Validator(storedCredentials);
}
@Test
public void testMatchingCredentials() {
assertTrue(matcher.matchCredentials("ram", "3025"));
}
@Test
public void testNonMatchingCredentials() {
assertFalse(matcher.matchCredentials("xyz", "123"));
}
@Test
public void testUsernameNotFound() {
assertFalse(matcher.matchCredentials("nonexistentuser",
"456"));
}
}