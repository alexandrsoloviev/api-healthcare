
package api;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

    private List<String> Categories;
    private String Content;
    private String Date;
    private String Lang;
    private String Layout;
    private List<Object> Tags;
    private String Title;
    private String Url;


}
