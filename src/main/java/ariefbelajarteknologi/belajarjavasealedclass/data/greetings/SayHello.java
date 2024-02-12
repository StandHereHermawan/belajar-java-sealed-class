package ariefbelajarteknologi.belajarjavasealedclass.data.greetings;

public sealed interface SayHello permits Human, Dog, Cat{

    String hello();
}
