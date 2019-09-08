package com.akd.akd;

import java.sql.Date;

import com.opencsv.bean.CsvBindByName;


public class AkdData {

	@CsvBindByName
	private int id;

	@CsvBindByName
	private String ime;

	@CsvBindByName
	private String prezime;

	@CsvBindByName
	private Date datumRodenja;


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the ime
	 */
	public String getIme() {
		return ime;
	}


	/**
	 * @param ime the ime to set
	 */
	public void setIme(String ime) {
		this.ime = ime;
	}


	/**
	 * @return the prezime
	 */
	public String getPrezime() {
		return prezime;
	}


	/**
	 * @param prezime the prezime to set
	 */
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	/**
	 * @return the datumRodenja
	 */
	public Date getDatumRodenja() {
		return datumRodenja;
	}


	/**
	 * @param datumRodenja the datumRodenja to set
	 */
	public void setDatumRodenja(Date datumRodenja) {
		this.datumRodenja = datumRodenja;
	}


	public String toString(){
		
		StringBuilder builder = new StringBuilder();
		builder.append("AkdData{id=").append(id)
		.append(", ime=").append(ime)
		.append(", prezime=").append(prezime)
		.append(", datumRodenja=").append(datumRodenja)
		.append("}");
		
		return builder.toString(); 
		
	}
}
