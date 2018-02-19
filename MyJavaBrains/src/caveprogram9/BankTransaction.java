package caveprogram9;

public class BankTransaction {

	private Integer trx_id;
	private Float amonut;
	
	public BankTransaction(Integer trx_id,Float amount) {
		this.trx_id = trx_id;
		this.amonut = amount;
	}
	
	public Float getAmonut() {
		return amonut;
	}
	public void setAmonut(Float amonut) {
		this.amonut = amonut;
	}
	public Integer getTrx_id() {
		return trx_id;
	}
	public void setTrx_id(Integer trx_id) {
		this.trx_id = trx_id;
	}
	
	
}
