
package com.example.android.moviesappone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_url",
    "secure_base_url",
    "backdrop_sizes",
    "logo_sizes",
    "poster_sizes",
    "profile_sizes",
    "still_sizes"
})
public class Images {

    @JsonProperty("base_url")
    private String baseUrl;
    @JsonProperty("secure_base_url")
    private String secureBaseUrl;
    @JsonProperty("backdrop_sizes")
    private List<String> backdropSizes = null;
    @JsonProperty("logo_sizes")
    private List<String> logoSizes = null;
    @JsonProperty("poster_sizes")
    private List<String> posterSizes = null;
    @JsonProperty("profile_sizes")
    private List<String> profileSizes = null;
    @JsonProperty("still_sizes")
    private List<String> stillSizes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("base_url")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("base_url")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @JsonProperty("secure_base_url")
    public String getSecureBaseUrl() {
        return secureBaseUrl;
    }

    @JsonProperty("secure_base_url")
    public void setSecureBaseUrl(String secureBaseUrl) {
        this.secureBaseUrl = secureBaseUrl;
    }

    @JsonProperty("backdrop_sizes")
    public List<String> getBackdropSizes() {
        return backdropSizes;
    }

    @JsonProperty("backdrop_sizes")
    public void setBackdropSizes(List<String> backdropSizes) {
        this.backdropSizes = backdropSizes;
    }

    @JsonProperty("logo_sizes")
    public List<String> getLogoSizes() {
        return logoSizes;
    }

    @JsonProperty("logo_sizes")
    public void setLogoSizes(List<String> logoSizes) {
        this.logoSizes = logoSizes;
    }

    @JsonProperty("poster_sizes")
    public List<String> getPosterSizes() {
        return posterSizes;
    }

    @JsonProperty("poster_sizes")
    public void setPosterSizes(List<String> posterSizes) {
        this.posterSizes = posterSizes;
    }

    @JsonProperty("profile_sizes")
    public List<String> getProfileSizes() {
        return profileSizes;
    }

    @JsonProperty("profile_sizes")
    public void setProfileSizes(List<String> profileSizes) {
        this.profileSizes = profileSizes;
    }

    @JsonProperty("still_sizes")
    public List<String> getStillSizes() {
        return stillSizes;
    }

    @JsonProperty("still_sizes")
    public void setStillSizes(List<String> stillSizes) {
        this.stillSizes = stillSizes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
