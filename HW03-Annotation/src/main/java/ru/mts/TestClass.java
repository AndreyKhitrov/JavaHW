package ru.mts;

public class TestClass {
    private Class<AndyClass> clazz = AndyClass.class;
    private String value =clazz.getSimpleName();
    private AndyClass myClass= new AndyClass(value);
    private String valueNull = "";
    @Before
    public void printBefore() {
        System.out.println( "Method printBefore{ @Before" +
                ", value='" + value + '\'' +
                '}');
    }

    @Test
    public void printTest() {
        System.out.println( "Method printTest{ @Test" +
                ", value='" + value + '\'' +
                '}');
    }

    @Test
    public void printTestNull() {
        myClass.setValue(valueNull);
        System.out.println( "Method printTestNull{ @Test" +
                ", value='" + value + '\'' +
                '}');
    }

    @After
    public void printAfter() {
        System.out.println( " Method printAfter{ @After" + ", value='" + value + '\'' + '}');
    }
}
