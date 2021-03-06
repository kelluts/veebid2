
package ee.ttu.idu0075._2015.ws._package;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PackagePortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PackagePortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws._package.MemberType
     */
    @WebMethod
    @WebResult(name = "getMemberResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
    public MemberType getMember(
        @WebParam(name = "getMemberRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
        GetMemberRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws._package.MemberType
     */
    @WebMethod
    @WebResult(name = "addMemberResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
    public MemberType addMember(
        @WebParam(name = "addMemberRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
        AddMemberRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws._package.GetMemberListResponse
     */
    @WebMethod
    @WebResult(name = "getMemberListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
    public GetMemberListResponse getMemberList(
        @WebParam(name = "getMemberListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
        GetMemberListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws._package.PackageType
     */
    @WebMethod
    @WebResult(name = "getPackageResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
    public PackageType getPackage(
        @WebParam(name = "getPackageRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
        GetPackageRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws._package.PackageType
     */
    @WebMethod
    @WebResult(name = "addPackageResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
    public PackageType addPackage(
        @WebParam(name = "addPackageRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
        AddPackageRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws._package.GetPackageListResponse
     */
    @WebMethod
    @WebResult(name = "getPackageListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
    public GetPackageListResponse getPackageList(
        @WebParam(name = "getPackageListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
        GetPackageListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws._package.PackageMemberListType
     */
    @WebMethod
    @WebResult(name = "getPackageMemberListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
    public PackageMemberListType getPackageMemberList(
        @WebParam(name = "getPackageMemberListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
        GetPackageMemberListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws._package.PackageMemberType
     */
    @WebMethod
    @WebResult(name = "addPackageMemberResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
    public PackageMemberType addPackageMember(
        @WebParam(name = "addPackageMemberRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", partName = "parameter")
        AddPackageMemberRequest parameter);

}
