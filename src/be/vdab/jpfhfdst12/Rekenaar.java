package be.vdab.jpfhfdst12;

public class Rekenaar {

    private String expressie;

    public Rekenaar(String expressie) {
        setExpressie(expressie);
    }

    public String getExpressie() {
        return expressie;
    }

    public void setExpressie(String expressie) {
        if (expressie != null && !expressie.isEmpty()) {
            this.expressie = expressie;
        }
    }

    public int berekenResultaat() {
        var expressieArr = expressie.split(" ");
        var resultaat = 0;
        if (!expressieArr[0].equals("")) {
            resultaat = Integer.parseInt(expressieArr[0]);
        }
        for (var i = 1; i < expressieArr.length; i++) {
            switch (expressieArr[i]) {
                case "+" -> resultaat += Integer.parseInt(expressieArr[i + 1]);
                case "-" -> resultaat -= Integer.parseInt(expressieArr[i + 1]);
                case "*" -> resultaat *= Integer.parseInt(expressieArr[i + 1]);
                case "/" -> {
                    if (Integer.parseInt(expressieArr[i + 1]) != 0) {
                        resultaat /= Integer.parseInt(expressieArr[i + 1]);
                    }
                }
            }
        }
        return resultaat;
    }

    @Override
    public String toString() {
        return expressie + " = " + berekenResultaat();
    }
}
