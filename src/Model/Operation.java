package Model;

import View.Affichage;
import Controller.MakeControl;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Operation {
    //    public strin
    public static void sendError(String str){
        new MakeControl().errorMessage(str);
    }
    public double calculExecution(String str){
        return calcul(structuration(str));
    }
    public static String about(String a) {
        ArrayList<String> tab = new ArrayList();
        String val = "";
        String lav = "";

        String[] t;
        int x;
        try {
            a = a.replace(" ", "");
            t = a.split(" ");
            ArrayList<String> ta = new ArrayList();

            for(x = 0; x < t.length; ++x) {
                ta.add(t[x]);
            }

            for(x = 0; x < ta.size() - 1; ++x) {
                Double.parseDouble((String)ta.get(x));
            }
        } catch (Exception var11) {
            sendError(var11.getMessage() + " ???not hear??? ");
        }

        a = a.replace(" ", "");
        a = a.replace("+", " + ");
        a = a.replace("-", " - ");
        a = a.replace("*", " * ");
        a = a.replace("/", " / ");
        a = a.replace("(", " ( ");
        a = a.replace(")", " ) ");
        t = a.split(" ");

        for(int i = 0; i < t.length; ++i) {
            tab.add(t[i]);
        }

        tab.add(")");

        do {
            new ArrayList();
            x = 0;
            int y = tab.size();

            int i;
            for(i = tab.size() - 1; i > 0; --i) {
                if (((String)tab.get(i)).contains("(")) {
                    x = i;
                    tab.remove(i);
                    break;
                }
            }

            for(i = x; i < tab.size(); ++i) {
                if (((String)tab.get(i)).contains(")")) {
                    y = i;
                    tab.remove(i);
                    break;
                }
            }

            lav = "";

            for(i = y - 1; i >= x; --i) {
                try {
                    if (Double.parseDouble((String)tab.get(x)) < 0.0D) {
                        lav = lav + "(" + (String)tab.get(x) + ")";
                    } else {
                        lav = lav + (String)tab.get(x);
                    }
                } catch (Exception var10) {
//                    sendError(" a ignore en klk sorte:\n<<" + var10.getMessage() + ">>\n");
                    lav = lav + (String)tab.get(x);
                }

                tab.remove(x);
            }

            System.out.println(lav + ":\n");
            double m = calcul(lav);
            tab.add(x, String.valueOf(m));
        } while(tab.contains("(") || tab.contains(")"));

        String v;
        for(Iterator var13 = tab.iterator(); var13.hasNext(); val = val + v) {
            v = (String)var13.next();
        }

        return val;
    }

    public static String structuration(String a){
        ArrayList<String> tab =new ArrayList<String>();
        String val = "";
        String lav="";
        try {
            a=a.replace(" ","");
            String [] l =a.split(" ");
            ArrayList<String> ta =new ArrayList<String>();
            for(int i=0;i<l.length;i++) {
                ta.add(l[i]);
            }
            for(int i=0;i<ta.size()-1;i++){
                Double.parseDouble(ta.get(i));
            }
        } catch (Exception e) {
            sendError(e.getMessage() + " ???not hear??? ");
        }

//        try{
//            arrangement des valeur pour utilisation
        a=a.replace(" ","");
        a=a.replace("+", " + ");
        a=a.replace("-", " - ");
        a=a.replace("*", " * ");
        a=a.replace("/", " / ");
        a=a.replace("(", " ( ");
        a=a.replace(")", " ) ");
//            a=a.replace(".", " . ");

        String [] t =a.split(" ");
//            tab.add("(0+");
        for(int i=0;i<t.length;i++) {
            tab.add(t[i]);
        }
        tab.add(")");
        do {
            ArrayList<String> cal =new ArrayList<String>();
            int x=0,y=tab.size();
            for(int i=tab.size()-1;i>0;i--) {
                if (tab.get(i).contains("(")){
                    x = i;
                    tab.remove(i);
                    break;
                }
            }
            for (int i = x; i < tab.size(); i++) {
                if (tab.get(i).contains(")")){
                    y = i;
                    tab.remove(i);
                    break;
                }
            }
            lav="";
            for(int i=y-1;i>=x ;i--){
                try {//pour parenteze i.e mettre entre parentez un double negatif de facon a emprisonner le signe "-" pour trop turbulence causé dans le programe
                    if (Double.parseDouble(tab.get(x)) < 0) {
                        lav += "(" + tab.get(x)+")";
                    } else {
                        lav += tab.get(x);
                    }

                }
                catch (Exception E){
                   // sendError(" a ignore en klk sorte:\n<<"+E.getMessage()+">>\n");
                    lav += tab.get(x);

                }
                tab.remove(x);
            }
            System.out.println(lav+":\n");
            double m = calcul(lav);
            tab.add(x, String.valueOf(m));
        }while(tab.contains("(")||tab.contains(")"));
        for (String v:tab) {
            val+=v;
        }

        return val;
    }

    public static double calcul(String a){
        double result=0;
        String tamp="";
        ArrayList<String> tabTamp=new ArrayList<String>();

        for(int i=0;i<a.length();i++){		//ajout dans le tableau string
            if(i==0&&(a.charAt(0)=='-'||a.charAt(0)=='+')){// les sign au debut
                tamp+=Character.toString(a.charAt(0));
                continue;
            }else if(a.charAt(i)=='('){//en gros ici on recupere le double negatif qui a ete emprisonne dans le try catch ci dessus
                String parentez="";
                i++;//pour sauter le ("
                while (a.charAt(i)!=')'){
                    parentez+=a.charAt(i);
                    i++;
                }
                tabTamp.add(parentez);
                if(a.charAt(i)==')'){
                    continue;//pour sauter ")" vue qu'on s'en fout des parentez
                }
            }else if(a.charAt(i)=='+'||a.charAt(i)=='-'||a.charAt(i)=='*'||a.charAt(i)=='/'){
                tabTamp.add(String.valueOf(a.charAt(i)));
                continue;
            }
            tamp+=Character.toString(a.charAt(i));
            if(i==a.length()-1||a.charAt(i+1)=='+'||a.charAt(i+1)=='-'||a.charAt(i+1)=='*'||a.charAt(i+1)=='/'){
                tabTamp.add(tamp);
                tamp="";
            }
        }
        // les calculs
        if(tabTamp.size()==1){
            result=Double.parseDouble(tabTamp.get(0));
        }

        do{
            for(int i=0;i<tabTamp.size();i++){	//Multiplication et division
                if(tabTamp.get(i).contains("*")) {
                    result =(Double.parseDouble(tabTamp.get(i-1)))*(Double.parseDouble(tabTamp.get(i+1)));
                    String expres = String.valueOf(result);
                    tabTamp.set(i-1, expres);
                    tabTamp.remove(i);
                    tabTamp.remove(i);
                }else if(tabTamp.get(i).contains("/")) {
                    result =(Double.parseDouble(tabTamp.get(i-1)))/(Double.parseDouble(tabTamp.get(i+1)));
                    String expres = String.valueOf(result);
                    tabTamp.set(i-1, expres);
                    tabTamp.remove(i);
                    tabTamp.remove(i);
                }
            }
        }while(tabTamp.contains("*")||tabTamp.contains("/"));


        do {	//addition et soustraction
            for(int i=0;i<tabTamp.size();i++) {
                if(i==0&&(tabTamp.get(i).contains("-")||tabTamp.get(i).contains("+"))){
                    continue;
                }
                if(tabTamp.get(i).contains("+")) {
                    result =(Double.parseDouble(tabTamp.get(i-1)))+(Double.parseDouble(tabTamp.get(i+1)));
                    String expres = String.valueOf(result);
                    tabTamp.set(i-1, expres);
                    tabTamp.remove(i);
                    tabTamp.remove(i);
                }else if(tabTamp.get(i).contains("-")) {
                    result =(Double.parseDouble(tabTamp.get(i-1)))-(Double.parseDouble(tabTamp.get(i+1)));
                    String expres = String.valueOf(result);
                    tabTamp.set(i-1, expres);
                    tabTamp.remove(i);
                    tabTamp.remove(i);
                }
            }
        }while(tabTamp.contains("+")||tabTamp.contains("-"));

        return  result;
    }
}
