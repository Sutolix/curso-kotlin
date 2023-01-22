import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Teste da funcao portaria")
    fun portariaTeste() {
        Assertions.assertAll(
            {Assertions.assertEquals("Negado.", portaria(0, "", ""))},
            {Assertions.assertEquals("Negado.", portaria(20, "", ""))},
            {Assertions.assertEquals("Negado.", portaria(20, "vip", ""))},
            {Assertions.assertEquals("Negado.", portaria(20, "comum", "xldgjiod"))},
            {Assertions.assertEquals("Negado.", portaria(20, "luxo", "xtfgh"))},
            {Assertions.assertEquals("Negado.", portaria(20, "premium", "xtgdjfgkl"))},

            {Assertions.assertEquals("Welcome.", portaria(20, "comum", "XtSKDLFSD"))},
            {Assertions.assertEquals("Welcome.", portaria(20, "luxo", "xLDFGIDFG"))},
            {Assertions.assertEquals("Welcome.", portaria(20, "premium", "xlDOGDOFG"))},

        )
    }
}
