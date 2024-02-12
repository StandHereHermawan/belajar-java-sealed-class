package ariefbelajarteknologi.belajarjavasealedclass.data.greetings;

public record Cat() implements SayHello{

    @Override
    public String hello() {
        return "MIAW :3";
    }
}
