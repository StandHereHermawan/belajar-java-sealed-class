package ariefbelajarteknologi.belajarjavasealedclass.data.twodimension;

public sealed interface Shape permits Circle, Rectangle, Triangle{

    Long area();
}
