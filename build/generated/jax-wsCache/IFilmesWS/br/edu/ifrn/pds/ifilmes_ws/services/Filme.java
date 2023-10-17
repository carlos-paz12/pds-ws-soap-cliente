
package br.edu.ifrn.pds.ifilmes_ws.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de filme complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="filme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anoLancamento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="avaliacao" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="duracao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sinopse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filme", propOrder = {
    "anoLancamento",
    "avaliacao",
    "duracao",
    "id",
    "sinopse",
    "titulo"
})
public class Filme {

    protected int anoLancamento;
    protected double avaliacao;
    protected int duracao;
    protected int id;
    protected String sinopse;
    protected String titulo;

    /**
     * Obtém o valor da propriedade anoLancamento.
     * 
     */
    public int getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * Define o valor da propriedade anoLancamento.
     * 
     */
    public void setAnoLancamento(int value) {
        this.anoLancamento = value;
    }

    /**
     * Obtém o valor da propriedade avaliacao.
     * 
     */
    public double getAvaliacao() {
        return avaliacao;
    }

    /**
     * Define o valor da propriedade avaliacao.
     * 
     */
    public void setAvaliacao(double value) {
        this.avaliacao = value;
    }

    /**
     * Obtém o valor da propriedade duracao.
     * 
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * Define o valor da propriedade duracao.
     * 
     */
    public void setDuracao(int value) {
        this.duracao = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade sinopse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * Define o valor da propriedade sinopse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinopse(String value) {
        this.sinopse = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
