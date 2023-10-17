
package br.edu.ifrn.pds.ifilmes_ws.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifrn.pds.ifilmes_ws.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Create_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "createResponse");
    private final static QName _Delete_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "deleteResponse");
    private final static QName _Retrieve_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "retrieve");
    private final static QName _RetrieveLatest_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "retrieveLatest");
    private final static QName _RetrieveLatestResponse_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "retrieveLatestResponse");
    private final static QName _RetrieveResponse_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "retrieveResponse");
    private final static QName _Update_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://services.ifilmes_ws.pds.ifrn.edu.br/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifrn.pds.ifilmes_ws.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link RetrieveLatest }
     * 
     */
    public RetrieveLatest createRetrieveLatest() {
        return new RetrieveLatest();
    }

    /**
     * Create an instance of {@link RetrieveLatestResponse }
     * 
     */
    public RetrieveLatestResponse createRetrieveLatestResponse() {
        return new RetrieveLatestResponse();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Filme }
     * 
     */
    public Filme createFilme() {
        return new Filme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retrieve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Retrieve }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "retrieve")
    public JAXBElement<Retrieve> createRetrieve(Retrieve value) {
        return new JAXBElement<Retrieve>(_Retrieve_QNAME, Retrieve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveLatest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveLatest }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "retrieveLatest")
    public JAXBElement<RetrieveLatest> createRetrieveLatest(RetrieveLatest value) {
        return new JAXBElement<RetrieveLatest>(_RetrieveLatest_QNAME, RetrieveLatest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveLatestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveLatestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "retrieveLatestResponse")
    public JAXBElement<RetrieveLatestResponse> createRetrieveLatestResponse(RetrieveLatestResponse value) {
        return new JAXBElement<RetrieveLatestResponse>(_RetrieveLatestResponse_QNAME, RetrieveLatestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "retrieveResponse")
    public JAXBElement<RetrieveResponse> createRetrieveResponse(RetrieveResponse value) {
        return new JAXBElement<RetrieveResponse>(_RetrieveResponse_QNAME, RetrieveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ifilmes_ws.pds.ifrn.edu.br/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
