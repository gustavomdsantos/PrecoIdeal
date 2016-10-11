package br.ufg.inf;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrecoIdealControllerTest {

    /**
     * Caso de exemplo: ingressos de cinema
     * 
     * http://www2.anhembi.br/html/ead01/economia/lu04/lo2/index.htm
     */
    @Test
    public void testCalculaElasticidadeCinema() {
        double pa = 8;
        double pf = 10;
        double qa = 4;
        double qf = 3;
        double result = PrecoIdealController.calculaElasticidade(pa, pf, qa, qf);
        double expResult = 1.6;
        assertEquals(expResult, result, 0.1);
    }
    
}
