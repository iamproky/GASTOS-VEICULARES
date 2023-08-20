/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public class TiposDeGastosEnum {

    public enum Manutencao {

        AMORTECEDOR("AMORTECEDOR"),
        PNEUS("PNEUS"),
        MOTOR("MOTOR"),
        FILTRO_DE_AR("FILTRO DE AR"),
        FILTRO_DE_COMBUSTIVEL("FILTRO DE COMBUSTIVEL"),
        BATERIA("BATERIA"),
        VELAS_DE_IGNICAO("VELA DE IGNIÇÃO"),
        OLEO("OLEO"),
        FREIOS("FREIOS");

        private final String manu;

        private Manutencao(String Manutencao) {
            this.manu = Manutencao;
        }

        @Override
        public String toString() {
            return manu;
        }
        
    }

    public enum Combustivel {
        GASOLINA_COMUM("GASOLINA COMUM "),
        GASOLINA_ADTIVADA("GASOLINA ADTIVADA"),
        GASOLINA_PREMIUM("GASOLINA PREMIUM"),
        DIESEL("DIESEL"),
        DIESEL_COMUM_S500("DIESEL COMUM S500"),
        DIESEL_S10("DIESEL S10"),
        DIESEL_ADTIVADO("DIESEL ADTIVADA"),
        DIESEL_PREMIUM("DIESEL PREMIUM"),
        ETANOL_COMUM("ETANOL COMUM"),
        ETANOL_ADTIVADO("ETANOL ADTIVADA"),
        GAS_NATURAL_GNV("GAS NATURAL GNV");

        private final String comb;

        private Combustivel(String Combustivel) {
            this.comb = Combustivel;
        }

        @Override
        public String toString() {
            return comb;
        }
        
    }

    public enum IPVA {
        LICENCIAMENTO("LICENCIAMENTO");
        private final String ipva;

        private IPVA(String IPVA) {
            this.ipva = IPVA;
        }

        @Override
        public String toString() {
            return ipva;
        }
        
    }

    public enum Seguro {
        GUINCHO("GUINCHO"),
        MENSALIDADE("MENSALIDADE");

        private final String seg;

        private Seguro(String Seguro) {
            this.seg = Seguro;
        }

        @Override
        public String toString() {
            return seg;
        }
        
    }

    public enum Pedagio {
        PEDAGIO("PEDAGIO");
        private final String pedagio;

        private Pedagio(String Pedagio) {
            this.pedagio = Pedagio;
        }

        @Override
        public String toString() {
            return pedagio;
        }
       
    }

}
