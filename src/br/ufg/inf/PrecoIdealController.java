package br.ufg.inf;

public class PrecoIdealController {

    /**
     * Calcula a elasticidade do preço na procura.
     * @author gustavosotnas
     * 
     * @param pa Preço anterior (preço praticado) (Pa)
     * @param pf Preço final (preço proposto) (Pf)
     * @param qa Quantidade atual (normalmente vende....) (Qa)
     * @param qf Quantidade proposta / ideal / efetiva / final (Qp)
     * 
     * @return o épsilon da elasticidade.
     */
    public static double calculaElasticidade(double pa, double pf, double qa, double qf) {

        double elasticidade = (((qa-qf)/qf)/(pa-pf)/pf);
        return Math.abs(elasticidade*100);
    }

    /**
     * 
     * Calcula a relação entre o preço final e a quantidade final.
     * 
     * @param elasticidade elasticidade do preço na procura
     * @param pa Preço anterior (preço praticado) (Pa)
     * @param qa Quantidade atual (normalmente vende....) (Qa)
     * @return a relação entre o preço final e a quantidade final.
     */
    public static double calculaRazaoIdeal(double elasticidade, double pa, double qa){

        double razao = (qa * (elasticidade + 1)) / pa;
        return(razao);
    }

    public static double calculaVariacaoPreco(double pa, double pf){

        double variacao = ((pf-pa)/pa);
        return (variacao*100);
    }
}