package cuentas;

/**
 * Clase que reprenta cuenta
 * @author ckend
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    /**
     * retorna un nombre
     * @return nombre
     */
    public String getNombre() {
		return nombre;
	}
    
    /**
     * guarda el nombre retornado
     * @param nombre retornado
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * retorna una cuenta
	 * @return la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Guarda la cuenta retornada
	 * @param cuenta retornada
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * retorna el saldo de la cuenta
	 * @return saldo 
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * guarda el saldo retornado
	 * @param saldo retornado
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * retorna el tipo de interes
	 * @return tipo de interes
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * guarda el tipo de interes retornado
	 * @param tipoInterés retornado
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    /**
     * ingresa una cantidad que sea positiva
     * @param cantidad a ingresar
     * @throws Exception no puede ser negativa 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * retorna la cantidad a retirar solo si es positiva la cantidad y hay saldo disponible
     * @param cantidad a retirar
     * @throws Exception  la cantidad no puede ser negativa y mayor al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
