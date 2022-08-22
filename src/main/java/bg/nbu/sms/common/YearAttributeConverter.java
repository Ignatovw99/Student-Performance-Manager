package bg.nbu.sms.common;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Year;
import java.util.Objects;

@Converter(autoApply = true)
public class YearAttributeConverter implements AttributeConverter<Year, Short> {

    @Override
    public Short convertToDatabaseColumn(Year attribute) {
        return Objects.nonNull(attribute)
                ? (short) attribute.getValue()
                : null;
    }

    @Override
    public Year convertToEntityAttribute(Short dbData) {
        return Objects.nonNull(dbData)
                ? Year.of(dbData)
                : null;
    }

}
