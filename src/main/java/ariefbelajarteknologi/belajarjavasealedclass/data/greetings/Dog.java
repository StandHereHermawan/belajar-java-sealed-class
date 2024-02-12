package ariefbelajarteknologi.belajarjavasealedclass.data.greetings;

public record Dog() implements SayHello{

    @Override
    public String hello() {
        return "Pinjam dulu seratus :D";
    }
}
