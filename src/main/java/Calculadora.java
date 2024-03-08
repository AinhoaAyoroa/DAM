/**
 * Classe que implementa una calculadora simple amb les operacions de suma, resta, multiplicació, divisió
 * i comparació de major que.
 */
public class Calculadora {
    private float lastResult;
    private String lastOp;

    /**
     * Obté l'últim resultat calculat.
     * @return L'últim resultat calculat.
     */
    public float getLastResult() {
        return this.lastResult;
    }

    /**
     * Obté l'última operació realitzada.
     * @return La darrera operació realitzada.
     */
    public String getLastOp() {
        return this.lastOp;
    }

    /**
     * Realitza una suma entre dos nombres.
     * @param op1 El primer operand.
     * @param op2 El segon operand.
     * @return El resultat de la suma.
     */
    public float suma(float op1, float op2) {
        float result = op1 + op2;
        this.lastResult = result;
        this.lastOp = "Suma";
        return result;
    }

    /**
     * Realitza una resta entre dos nombres.
     * @param op1 El primer operand.
     * @param op2 El segon operand.
     * @return El resultat de la resta.
     */
    public float resta(float op1, float op2) {
        float result = op1 - op2;
        this.lastResult = result;
        this.lastOp = "Resta";
        return result;
    }

    /**
     * Realitza una multiplicació entre dos nombres.
     * @param op1 El primer operand.
     * @param op2 El segon operand.
     * @return El resultat de la multiplicació.
     */
    public float multiplica(float op1, float op2) {
        float result = op1 * op2;
        this.lastResult = result;
        this.lastOp = "Multiplica";
        return result;
    }

    /**
     * Realitza una divisió entre dos nombres.
     * @param op1 El primer operand (divident).
     * @param op2 El segon operand (divisor).
     * @return El resultat de la divisió.
     */
    public float divideix(float op1, float op2) {
        float result = op1 / op2;
        this.lastResult = result;
        this.lastOp = "Divideix";
        return result;
    }

    /**
     * Comprova si el primer nombre és major que el segon.
     * @param op1 El primer nombre.
     * @param op2 El segon nombre.
     * @return Cert si el primer nombre és major que el segon, fals altrament.
     */
    public boolean majorQue(float op1, float op2) {
        return op1 > op2;
    }

    /**
     * Restableix els valors de l'últim resultat i l'última operació.
     */
    public void restablecer() {
        this.lastResult = 0;
        this.lastOp = "Ninguna";
    }
}

