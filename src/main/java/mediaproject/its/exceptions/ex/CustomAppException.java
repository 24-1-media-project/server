package mediaproject.its.exceptions.ex;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Map;

@AllArgsConstructor
@Getter
public class CustomAppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Map<String, String> errorMap;

    public CustomAppException(String message) {
        super(message);
    }

    public CustomAppException(String message, Map<String, String> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }

    public Map<String, String> getErrorMap(){
        return errorMap;
    }

}
