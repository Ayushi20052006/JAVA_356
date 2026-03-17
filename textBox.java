public class textBox {
    public static void main(String[] args) {
        var variable = "Hello, World!";
        System.out.println(variable.getClass().getName());   //output: java.lang.String

        var num = 42;
        System.out.println(((Object)num).getClass().getName());   //output: java.lang.Integer
        
        String html="""
            <h1>Hello</h1>
            <p>This is a simple text box.</p>
            <div>
                <span>Nested text box</span>
            </div>
            """;
            System.out.println(html);   
        }
}
