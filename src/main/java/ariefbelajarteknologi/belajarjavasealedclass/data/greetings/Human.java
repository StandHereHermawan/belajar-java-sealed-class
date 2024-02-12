package ariefbelajarteknologi.belajarjavasealedclass.data.greetings;

public record Human() implements SayHello {

    @Override
    public String hello() {
        return "Hello There!";
    }
}
