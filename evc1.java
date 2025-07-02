import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;

import static java.lang.Character.isDigit;

public class evc1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //soo galida
        String Soo_Galida_EvcPlus= input.next();
        final int PIN=1010;
        //check gareeynta soo galida inay la egtahay furaha EVCPlus
        if (Soo_Galida_EvcPlus.equals("*770#")){
            System.out.println("fadlan geli PIN-kaaga (Enter PIN)");
            int pin=input.nextInt();
            if (pin==PIN)
                pin_check();
            else
                System.out.println("[-EVC Plus-] Nambarka sirta ah waa khalad");



        }
        else if (Soo_Galida_EvcPlus.equals("*999#")) {
            long[] number=new long[4];
            number[0]=252;
            number[1]=612;
            number[2]=511;
            number[3]=396;
            System.out.print("MSISIDN: ");
            for (int j=0;j<number.length;j++){
                System.out.print(number[j]);
            }


        }


        //else uma baahna defualt oo uga baxaa
    }



    //pin check hadoo la egyahay pin
    public static void pin_check(){
        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.println("EVCPlus");
        System.out.println("1.itus haraaga");
        System.out.println("2.kaarka hadalka");
        System.out.println("3.bixi biil");
        System.out.println("4.U wareeji EVCPlus");
        System.out.println("5.warbixin kooban");
        System.out.println("6.salaam bank");
        System.out.println("7.maaraynta");
        System.out.println("8.Bill Payment");
        System.out.println();
        int Dooro= input.nextInt();
        switch (Dooro){
            case 1:
                itus_haraaga();
                break;
            case 2:
                kaarka_hadalka();
                break;
            case 3:
                bixi_biil();
                break;
            case 4:
                Scanner input_arguments = new Scanner(System.in);
                U_wareeji_EVCPlus(input_arguments);
                break;
            case 5:
                warbixin_kooban();
                break;
            case 6:
                salaam_bank();
                break;
            case 7:
                maaraynta();
                break;
            case 8:
                Bill_Payment();
                break;
            default:
                System.out.println("fadlan dooro number sax ah");
                break;
        }
    }

    public static void itus_haraaga(){
        double HARAAGA=300;
        System.out.println("haraagagu waa $"+HARAAGA);
    }


    public static void kaarka_hadalka(){
        Scanner input=new Scanner(System.in);
        System.out.println("1.ku shubo Airtime");
        System.out.println("2.ugu shub Airtime");
        System.out.println("3.MIFI packafges");
        System.out.println("4.ku shubo internet");
        System.out.println("5.ugu shub qof kale (MMT)");
        System.out.println();
        int Dooro= input.nextInt();
        switch (Dooro){
            case 1:
                ku_shubo_Airtime();
                break;
            case 2:
                ugu_shubo_Airtime();
                break;
            case 3:
                MIFI_packafges();
                break;
            case 4:
                ku_shubo_internet();
                break;
            case 5:
                ugu_shub_qof_kale_MMT();
                break;
            default:
                System.out.println("lambar qaldan ayaad dooratay");
                break;
        }
    }



    public static void dhirirka_numberka_check_garaynayna(Scanner scanner_input_parameters) {
        while (true) {
            Scanner gali=new Scanner(System.in);
            double HARAAGA=300;
            System.out.println("fadlan gali Lambarka ");
            String lambarka = scanner_input_parameters.nextLine();
            String[] inputArray = lambarka.split("");
            boolean validInput=false;
            if (inputArray.length == 9 && (inputArray[0].equals("6") && inputArray[1].equals("1")|| inputArray[0].equals("7") && inputArray[1].equals("7"))) {
                while (!validInput) {
                    System.out.println("fadlan gali lacagta");
                    if (gali.hasNextDouble()) {
                        double lacagta = gali.nextDouble();
                        System.out.println("ma hubtaa inaad $" + lacagta + " ugu shubtid " + lambarka);
                        System.out.println("1.HAA");
                        System.out.println("2.MAYA");
                        int hubin = gali.nextInt();
                        double subtraction = HARAAGA - lacagta;
                        if (hubin == 1 && lacagta <= 0){
                            System.out.println("amount must be greater than zero");
                        }
                        else if (hubin == 1 && lacagta <= HARAAGA) {
                            System.out.println("[-EVC Plus-]  waxaad $"
                                    + lacagta + " ugu shubtay 252" + lambarka +
                                    " haraagagu waa $" + subtraction + " 20sano oo adeeg bulsho ah");
                        } else if (hubin == 1 && lacagta > HARAAGA) {
                            System.out.println("haraaga xisaabtadu kuguma filna,mobile No:{SENDER_MOBILE_NO}");
                        } else
                            System.out.println("mahadsanid!");


                        break;
                    }

                    else {
                        System.out.println("you can only enter number!.");
                        System.out.println("fadlan gali lacagta");
                        gali.next();
                    }

                }
                break;
            } else if (inputArray.length < 5 || inputArray.length > 15) {
                System.out.println("invalid input format(length) fadlan geli Mobilka");
            } else {
                System.out.println("nambarka madiiwaansana si aad isku diiwaan galiso garaac *770#" +
                        "ama laxariir 141/101 ama whatsapp +252615000000");
                break;
            }
        }
    }






    public static void ku_shubo_Airtime() {
        Scanner input = new Scanner(System.in);
        double HARAAGA = 300;
        int lambarka = 612511396;
        System.out.println("fadlan gali lacagta");
        boolean validInput=false;
        while (!validInput) {
            if (input.hasNextDouble()) {
                double lacagta = input.nextInt();
                System.out.println("ma hubtaa inaad $" + lacagta + " ugu shubtid undefined?");
                System.out.println("1.HAA");
                System.out.println("2.MAYA");
                int hubin = input.nextInt();
                double subtraction = HARAAGA - lacagta;

                if (hubin == 1 && lacagta <= 0)
                    System.out.println("amount must be greater than zero");
                else if (hubin == 1 && lacagta <= HARAAGA) {
                    System.out.println("[-EVC Plus-]  waxaad $"
                            + lacagta + " ugu shubtay 252" + lambarka +
                            " haraagagu waa $" + subtraction + " 20sano oo adeeg bulsho ah");
                } else if (hubin == 1 && lacagta > HARAAGA) {
                    System.out.println("haraaga xisaabtadu kuguma filna,mobile No:{SENDER_MOBILE_NO}");
                } else
                    System.out.println("mahadsanid!");
            } else {
                System.out.println("you can only enter number!.");
                System.out.println("fadlan gali lacagta");
                input.next();
            }
        }
    }

    public static void ugu_shubo_Airtime(){

        Scanner scanner_input_arguments = new Scanner(System.in);
        dhirirka_numberka_check_garaynayna(scanner_input_arguments);



    }

    public static void MIFI_packafges(){
        Scanner input=new Scanner(System.in);
        System.out.println("EVC Plus");
        System.out.println("1.ku shubo data-da MIFI");
        int gali= input.nextInt();
        if (gali==1){
            System.out.println("---internet Bundle recharge---");
            System.out.println("1.isbuucle(weekly)");
            System.out.println("2.bille(MiFi)");
            System.out.println("3.maalinle(daily)");
            int Dooro= input.nextInt();
            switch (Dooro){
                case 1:
                    System.out.println("fadlan dooro bundle ka");
                    System.out.println("1.$5=10GB");
                    System.out.println("2.$10=25GB");
                    break;
                case 2:
                    System.out.println("fadlan dooro bundle ka");
                    System.out.println("1.$20=40GB");
                    System.out.println("2.$40=85GB");
                    System.out.println("3.$60=150GB");
                    System.out.println("4.$30=monthly unlimit");
                    break;
                case 3:
                    System.out.println("fadlan dooro bundle ka");
                    System.out.println("1.$1=2GB");
                    System.out.println("2.$2=5GB");
                    break;
                default:
                    System.out.println("fadlan dooro number sax ah");
                    break;

            }
        }

        else
            System.out.println("fadlan dooro number sax ah");

    }

    public static void ku_shubo_internet(){
        System.out.println("fadlan dooro numberka aad ku shubayso:");
        System.out.println("1.isbuucle(weekly)");
        System.out.println("2.TIME BASED PACKAGES");
        System.out.println("3.DATA");
        System.out.println("4.maalinle(daily)");
        System.out.println("2.bille(MiFi)");

    }

    public static void ugu_shub_qof_kale_MMT() {
        Scanner scanner_input_arguments = new Scanner(System.in);
        dhirirka_numberka_check_garaynayna(scanner_input_arguments);

    }


    public static void bixi_biil(){

    }


    public static void U_wareeji_EVCPlus(Scanner scanner_input){
        while (true) {
            LocalDate date = LocalDate.now();
            Date time = new Date();
            SimpleDateFormat TimeFormat = new SimpleDateFormat("HH:mm:ss");
            Scanner input = new Scanner(System.in);
//            String[] lambarkayga = {612511396};
            double HARAAGA = 300;
            System.out.println("fadlan gali Lambarka");
            boolean validInput = false;
            String lambarka = input.nextLine();
            String[] inputArray = lambarka.split("");
            if (inputArray.length == 9 && ((inputArray[0].equals("6") && inputArray[1].equals("1") || inputArray[1].equals("2")) || inputArray[0].equals("7") && inputArray[1].equals("7"))) {
                System.out.println("fadlan gali lacagta");
                while (!validInput) {
                    if (input.hasNextDouble()) {
                        double lacagta = input.nextDouble();
                        System.out.println("ma hubtaa inaad $" + lacagta + " ugu shubtid 252" + lambarka);
                        System.out.println("1.HAA");
                        System.out.println("2.MAYA");
                        int hubin = input.nextInt();
                        double subtraction = HARAAGA - lacagta;
//                        if (hubin == 1 && lambarka == lambarkayga)
//                            System.out.println("diraha iyo loodiraha isku mid manoqonkaraan");
                        if (hubin == 1 && lacagta <= 0){
                            System.out.println("amount must be greater than zero");
                            break;
                        }
                        else if (hubin == 1 && lacagta <= HARAAGA) {
                            System.out.println("[-EVC Plus-]  waxaad $"
                                    + lacagta + " ayaad u wareejisay " + lambarka + " tar:" + date + " " + TimeFormat.format(time) +
                                    " haraagagu waa $" + subtraction + " 20sano oo adeeg bulsho ah");
                            break;
                        } else if (hubin == 1 && lacagta > HARAAGA) {
                            System.out.println("haraaga xisaabtadu kuguma filna,mobile No:{SENDER_MOBILE_NO}");
                            break;
                        } else{
                            System.out.println("mahadsanid!");
                            break;
                        }
                    }
                    else {
                        System.out.println("you can only enter number!.");
                        System.out.println("fadlan gali lacagta");
                        input.next();
                    }

                }
                break;


            } else if (inputArray.length < 5 || inputArray.length > 15) {
                System.out.println("invalid input format(length) fadlan geli Mobilka");
            } else {
                System.out.println("nambarka madiiwaansana si aad isku diiwaan galiso garaac *770#" +
                        "ama laxariir 141/101 ama whatsapp +252615000000");
                break;
            }


        }
    }


    public static void warbixin_kooban(){
        LocalDate tariikh=LocalDate.now();
        Scanner input=new Scanner(System.in);
        double warejinta_lacagta =10.0;
        System.out.println("");
        System.out.println("warbixin kooban");
        System.out.println("1.Last Action");
        System.out.println("2.wareejinti u dambsay");
        System.out.println("3.iibsashadui u dambeysay");
        System.out.println("4.last 3 actions");
        System.out.println("5.Email Me My Activity");
        int Dooro= input.nextInt();
        switch (Dooro){
            case 1:
                System.out.println("[-EVC Plus-] $"+warejinta_lacagta+" ayaad uwareejisay {252612511396}, "+tariikh);
                break;
            case 2:
                System.out.println("statementiga :");
                System.out.println("1. U dirtay");
                System.out.println("2.kaheshay");
                int gali= input.nextInt();
                if (gali==1){
                    System.out.println("fadlan gali numberka");
                    double num= input.nextDouble();
                    System.out.println("your mini statement has been sent as sms to your rigestred mobile no: "+num);
                }
                else if (gali==2) {
                    System.out.println("fadlan gali numberka");
                    double num= input.nextDouble();
                    System.out.println("your mini statement has been sent as sms to your rigestred mobile no: "+num);
                }
                else
                    System.out.println("fadlan dooro number sax ah");
                break;
            case 3:
                System.out.println("fadlan gali aqoonsiga ganacsiga");
                int aqoonsiga= input.nextInt();
                System.out.println("operation succeeded no transaction to display");
                break;
            case 4:
                System.out.println("your mini statement has been sent as sms to your rigestred mobile no");
                break;
            case 5:
                System.out.println("fadlan gali emailkaaga");
                String email= input.next();
                System.out.println("fadlan gali taariikhda hore(MAALIN/BISHA/SANAD, e.g:01/04/2017)");
                int tr_hore= input.nextInt();
                System.out.println("fadlan gali taariikhda danbe(MAALIN/BISHA/SANAD, e.g:30/04/2017)");
                int tr_danbe= input.nextInt();
                System.out.println("your request is being processed and the activity will be emailled to "+email);
                break;
            default:
                System.out.println("fadlan dooro number sax ah");
                break;
        }

    }


    public static void salaam_bank(){
        Scanner input=new Scanner(System.in);
        System.out.println("salaam bank");
        System.out.println("1.itus haraaga");
        System.out.println("2.lacag dhigasho");
        System.out.println("3.lacag qaadasho");
        System.out.println("4.ka wareeji EVCPlus");
        System.out.println("5.ka wareeji acount-kaaga");
        System.out.println("6.hubi wareejin acounti");
        System.out.println("7.maareynta bankiga");
        System.out.println("8.kala bax");
        int pin_bank=12212223;
        int lambarka_bankiga=27985865;
        double haraaga_bankiga=1000;
        int Dooro= input.nextInt();
        double HARAAGA=300;


        switch (Dooro){
            case 1:
                System.out.println("fadlan gali lambarka sirta ee bankiga");
                int pin_gali= input.nextInt();
                if (pin_bank==pin_gali)
                    System.out.println("koontada bankiga "+lambarka_bankiga+" haraagagu waa "+
                            haraaga_bankiga+" USD IBAN: SO 90 5601 178 806536798709");
                else
                    System.out.println("lambar sirta waa qalad");
                break;

            case 2:
                System.out.println("fadlan gali lacagta");
                double lacagta= input.nextDouble();
                double kala_jarka=HARAAGA-lacagta;
                System.out.println("fadlan gali macluumad");
                String maclumad= input.next();
                System.out.println("fadlan gali lambar sirta ee bankiga");
                int lambar_sirta= input.nextInt();
                if (pin_bank==lambar_sirta){
                    System.out.println("mahubtaa inaad $"+lacagta+" dhigatid acount-kaaga bankiga");
                    System.out.println("1.haa");
                    System.out.println("2.maya");
                    int gali= input.nextInt();
                    if (gali==1 && lacagta<=0)
                        System.out.println("amount must be greater than zero");
                    else if (gali==1 && lacagta>HARAAGA)
                        System.out.println("haraaga xisaabtadu kuguma filna,mobile No:{SENDER_MOBILE_NO}");
                    else if (gali==1 && lacagta<=HARAAGA)
                        System.out.println("[-EVCPlus-] waxaad $"+lacagta+" ku shubtay bank " +
                                "acounti-kaaga 279XXX65 haraagagu waa $"+kala_jarka);
                    else
                        System.out.println("lambar qaldan ayaad dooratay");

                }
                else
                    System.out.println("lambar sirta bankiga waa qalad");
                break;

            case 3:
                System.out.println("fadlan gali lacagta");
                lacagta= input.nextDouble();
                double isku_darka=HARAAGA-lacagta;
                System.out.println("fadlan gali macluumad");
                maclumad= input.next();
                System.out.println("fadlan gali lambar sirta ee bankiga");
                lambar_sirta= input.nextInt();
                if (lambar_sirta==pin_bank){
                    System.out.println("mahubtaa inaad $"+lacagta+" ka qaadatid acount-kaaga bankiga");
                    System.out.println("1.haa");
                    System.out.println("2.maya");
                    int gali= input.nextInt();
                    if (gali==1 && lacagta<=0)
                        System.out.println("amount must be greater than zero");
                    else if (gali==1 && lacagta<10)
                        System.out.println("lacagta ugu yar ee lala bixi karo halkii mar waa 10");
                    else if (gali==1 && lacagta>haraaga_bankiga)
                        System.out.println("Haraaga koontada 298654876382 kuma filna.");
                    else if (gali==1 && lacagta<=haraaga_bankiga)
                        System.out.println("[-EVCPlus-] waxaad kala baxday $"+lacagta+
                                " xisaabta bankgiga No:279XXX65 haraagagu waa $"+isku_darka);
                    else
                        System.out.println("lambar qaldan ayaad dooratay");



                }
                else
                    System.out.println("fadlan iska hubi number sireedka aad isticmaashay ee bangiga");
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("mareeynta bangiga");
                System.out.println("1.bedel pinka bangiga");
                System.out.println("2.bedel passwordka E-bank");
                int dooro= input.nextInt();
                if (dooro==1){
                    System.out.println("fadlan gali lambar sireedkaaga ee bangiga");
                    lambar_sirta= input.nextInt();
                    System.out.println("fadlan gali pin_ka cusub ee bangiga");
                    int gali= input.nextInt();
                    System.out.println("hubi pin_ka cusub ee bangiga");
                    int hubi= input.nextInt();
                    int Length_gali =String.valueOf(hubi).length();
                    int Length_hubi =String.valueOf(hubi).length();
                    if((gali==lambar_sirta)||(hubi==lambar_sirta))
                        System.out.println("fadlan iska hubi number sireedka cusub inuusan lamid" +
                                "ahayn lambarsireedki hore");
                    else if (Length_gali <6 || Length_hubi<6)
                        System.out.println("fadlan iska hubi number sireedka cusub wa inuu 6god ka koob naada");
                    else if(lambar_sirta!=pin_bank)
                        System.out.println("fadlan iska hubi number sireedka aad isticmaashay ee bangiga");
                    else if (gali!=hubi) {
                        while(gali!=hubi) {
                            System.out.println("input miss match hubi pinka cusub");
                            hubi= input.nextInt();
                        }
                        System.out.println("[-EVCPlus-] waad ku guulaysatay inaad badasho PIN-kaaga bankiga");
                    }
                    else
                        System.out.println("[-EVCPlus-] waad ku guulaysatay inaad badasho PIN-kaaga bankiga");


                }

            case 8:
        }
    }


    public static void maaraynta(){
        Scanner input=new Scanner(System.in);
        System.out.println("maareynta");
        System.out.println("1.Bedel lambarka sirta");
        System.out.println("2.Bedel Luqadda");
        System.out.println("3.Wargelin Mobile Lumay");
        System.out.println("4.Lacag Xirasho");
        System.out.println("5.U celi lacag qaldantay");
        System.out.println("6.EnableMobileBanking");
        int Dooro= input.nextInt();
        switch (Dooro){
            case 1:
                System.out.println("fadlan gali PIN-kaaga cusub");
                int gali= input.nextInt();
                System.out.println("hubi PIN-kaaga cusub");
                int hubi= input.nextInt();
                if (gali==1234 && hubi==1234)
                    System.out.println("fadlan isticmaal PIN ka kooban lambaro aan isku xigin");
                else if (gali!=hubi)
                    System.out.println("INPUT MISSMATCH Hubi PIN-kaaga cusub");
                else
                    System.out.println("[-EVC-Plus-] waad ku guuleystay in aad badasho PIN-kaaga");
                break;
            case 2:
                System.out.println("fadlan dooro luqada");
                System.out.println("1.english");
                System.out.println("2.somali");
                int luqadda= input.nextInt();
                if (luqadda==1)
                    System.out.println("[-EVCPlus-] you have successfully changed your language");
                else if (luqadda==2)
                    System.out.println("[-EVCPlus-] waad ku guuleysatay in aad badasho Luqada");
                else
                    System.out.println("fadlan dooro nambar sax ah");
                break;
            case 3:
                System.out.println("ma iidiyaarsano lambarka wax xog kama haysto");
                break;
            case 4:
                System.out.println("ma diyarin lambarka wax xog kama haysto");
                break;
            case 5:
                System.out.println("ma ma habayn lambarka wax xog kama haysto");
                break;
            case 6:
                break;
            default:
                System.out.println("lambar qaldan ayaad dooratay");
        }
    }



    public static void Bill_Payment(){
        System.out.println("ma diyarin lambarka wax xog kama haysto");
    }

}