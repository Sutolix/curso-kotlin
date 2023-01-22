import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCheckXandO() {
        // Dessa forma caso um teste falhe os seguintes não são executados
//        Assertions.assertTrue(checkXandO("xxoo"))
//        Assertions.assertTrue(checkXandO("xXoo"))
//        Assertions.assertTrue(checkXandO("xxOo"))
//        Assertions.assertTrue(checkXandO("xxoox"))

        // Dessa forma todos os testes são executados
        Assertions.assertAll(
            {Assertions.assertTrue(checkXandO("xxoo"))},
            {Assertions.assertTrue(checkXandO("xXoo"))},
            {Assertions.assertTrue(checkXandO("xxOo"))},
            {Assertions.assertTrue(checkXandO("xxoo"))},
        )
    }

    @Test
    @DisplayName("Metodo ainda nao implementado")
    @Disabled //desabilita o teste
    fun testToIgnore() {
        // faz o teste falhar
        fail("Falha")
    }

    @Test
    fun assumption() {
        // apenas se a verificação do assumption passar o resto dos testes dentro do método serão executados
        Assumptions.assumeTrue(checkXandO("xxoox"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { dfg() }
    }

}
