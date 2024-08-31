package testeito;



public class Loglevels {
    
    public static String message(String logLine) {
        String[] firstSplit = logLine.split(": ", 2);
        
        if (firstSplit.length > 1) {
            return firstSplit[1].trim();
        }
        else {
            return logLine.trim();
        }
    }

    public static String logLevel(String logLine) {
        
        return logLine.split("]: ")[0]
                .substring(1)
                .toLowerCase();
        
    }

    public static String reformat(String logLine) {
        String secondPart = logLevel(logLine);
        String firstPart = message(logLine);
        String finalResult = String.format("%s (%s)", firstPart, secondPart);
        return finalResult;
    }

    public static void main(String[] args) {
    // Ejemplos de uso
    String result1 = logLevel("[ERROR]: Disk failure detected");
    String result2 = message("[WARNING]:   \tTimezone not set  \r\n");
    String result3 = reformat("[INFO]: Logs saved");

    // Imprimir los resultados
    System.out.println("Resultado 1: " + result1);
    System.out.println("Resultado 2: " + result2);
    System.out.println("Resultado 3: " + result3);
    }
}

