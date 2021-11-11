
package eu.nnn4.web_model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "secondName",
    "email",
    "phone",
    "shipping_address",
    "billing_address"
})
@Generated("jsonschema2pojo")
public class User {

    @JsonProperty("firstName")
    private String firstName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secondName")
    private String secondName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    @JsonProperty("billing_address")
    private ShippingAddress billingAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secondName")
    public String getSecondName() {
        return secondName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secondName")
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("shipping_address")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("shipping_address")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("billing_address")
    public ShippingAddress getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billing_address")
    public void setBillingAddress(ShippingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("secondName");
        sb.append('=');
        sb.append(((this.secondName == null)?"<null>":this.secondName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("shippingAddress");
        sb.append('=');
        sb.append(((this.shippingAddress == null)?"<null>":this.shippingAddress));
        sb.append(',');
        sb.append("billingAddress");
        sb.append('=');
        sb.append(((this.billingAddress == null)?"<null>":this.billingAddress));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.shippingAddress == null)? 0 :this.shippingAddress.hashCode()));
        result = ((result* 31)+((this.billingAddress == null)? 0 :this.billingAddress.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.secondName == null)? 0 :this.secondName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return ((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.shippingAddress == rhs.shippingAddress)||((this.shippingAddress!= null)&&this.shippingAddress.equals(rhs.shippingAddress))))&&((this.billingAddress == rhs.billingAddress)||((this.billingAddress!= null)&&this.billingAddress.equals(rhs.billingAddress))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.secondName == rhs.secondName)||((this.secondName!= null)&&this.secondName.equals(rhs.secondName))));
    }

}
