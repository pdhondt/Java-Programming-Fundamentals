package be.vdab.jpfhfdst12;

public class Palindroom {

    private StringBuffer woord;
    private final StringBuffer woordOmgekeerd;

    public Palindroom (StringBuffer woord) {
        setWoord(woord);
        woordOmgekeerd = new StringBuffer(woord);
        woordOmgekeerd.reverse();
    }

    public StringBuffer getWoord() {
        return woord;
    }

    public void setWoord(StringBuffer woord) {
        if (woord != null && !woord.isEmpty()) {
            this.woord = woord;
        }
    }

    public StringBuffer getWoordOmgekeerd() {
        return woordOmgekeerd;
    }

    public boolean isPalindroom(boolean hoofdlettergevoelig) {
        boolean palindroomOfNiet = false;
        if (!hoofdlettergevoelig) {
            for (var i = 0; i < woord.length(); i++) {
                palindroomOfNiet = woord.charAt(i) == woordOmgekeerd.charAt(i);
            }
        } else {
            var woordKlein = woord.toString().toLowerCase();
            var woordOmgekeerdKlein = woordOmgekeerd.toString().toLowerCase();
            palindroomOfNiet = woordKlein.equals(woordOmgekeerdKlein);
        }
        return palindroomOfNiet;
    }
}
