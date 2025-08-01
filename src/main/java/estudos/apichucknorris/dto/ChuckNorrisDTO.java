package estudos.apichucknorris.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // ignora os campos do Json que nao estao na classe
public class ChuckNorrisDTO {
    
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ChuckNorrisDTO{" + "value=" + value + '}';
    }
    
}
