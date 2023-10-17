
package br.edu.ifrn.pds.ifilmes_ws.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de update complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="update"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFIlme" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="novaAvaliacao" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update", propOrder = {
    "idFIlme",
    "novaAvaliacao"
})
public class Update {

    protected int idFIlme;
    protected double novaAvaliacao;

    /**
     * Obtém o valor da propriedade idFIlme.
     * 
     */
    public int getIdFIlme() {
        return idFIlme;
    }

    /**
     * Define o valor da propriedade idFIlme.
     * 
     */
    public void setIdFIlme(int value) {
        this.idFIlme = value;
    }

    /**
     * Obtém o valor da propriedade novaAvaliacao.
     * 
     */
    public double getNovaAvaliacao() {
        return novaAvaliacao;
    }

    /**
     * Define o valor da propriedade novaAvaliacao.
     * 
     */
    public void setNovaAvaliacao(double value) {
        this.novaAvaliacao = value;
    }

}
