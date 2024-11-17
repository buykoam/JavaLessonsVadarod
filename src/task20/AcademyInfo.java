package task20;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Аннотация будет доступна в рантайме

public @interface AcademyInfo {
        int year(); // Поле для года
    }

