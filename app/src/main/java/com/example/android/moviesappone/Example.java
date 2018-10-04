
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
    "images",
    "change_keys"
})
public class Example {

    @JsonProperty("images")
    private Images images;
    @JsonProperty("change_keys")
    private List<String> changeKeys = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("change_keys")
    public List<String> getChangeKeys() {
        return changeKeys;
    }

    @JsonProperty("change_keys")
    public void setChangeKeys(List<String> changeKeys) {
        this.changeKeys = changeKeys;
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
