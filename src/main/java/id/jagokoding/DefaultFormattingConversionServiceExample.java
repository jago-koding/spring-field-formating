package id.jagokoding;

import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

import java.time.Instant;
import java.time.LocalDate;

public class DefaultFormattingConversionServiceExample {
    public static void main (String[] args) {

        ConversionService service =
                            new DefaultFormattingConversionService();

        //String to Instant
        Instant instant = service.convert("2020-11-15T01:12:05.695Z", Instant.class);
        System.out.println(instant);

        //Instant to String
        String convert = service.convert(instant, String.class);
        System.out.println(convert);

        LocalDate localDate = service.convert("11/13/20", LocalDate.class);
        System.out.println(localDate);
    }
}