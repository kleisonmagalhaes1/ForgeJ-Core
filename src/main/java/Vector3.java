public class Vector3 {
  public float x, y, z;

  // Construtor para inicialização fácil
  public Vector3(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  // Metodo add() RETORNA UM NOVO VETOR (imutabilidade é importante em engines)
  public Vector3 add(Vector3 other) {
    return new Vector3(
      this.x + other.x,
      this.y + other.y,
      this.z + other.z
    );
  }
}