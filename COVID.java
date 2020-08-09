import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;


public class COVID{
    public static void main(String[] args)
    {
        //create a list for each province
        ArrayList<EntryADT> ON = new ArrayList<>();
        ArrayList<EntryADT> QB = new ArrayList<>();
        ArrayList<EntryADT> BC = new ArrayList<>();
        ArrayList<EntryADT> AB = new ArrayList<>();
        ArrayList<EntryADT> SK = new ArrayList<>();
        ArrayList<EntryADT> MT = new ArrayList<>();
        ArrayList<EntryADT> NB = new ArrayList<>();
        ArrayList<EntryADT> NF = new ArrayList<>();
        ArrayList<EntryADT> PE = new ArrayList<>();
        ArrayList<EntryADT> NW = new ArrayList<>();
        ArrayList<EntryADT> NV = new ArrayList<>();
        ArrayList<EntryADT> YK = new ArrayList<>();
        ArrayList<EntryADT> NS = new ArrayList<>();
        ArrayList<EntryADT> CAN = new ArrayList<>();

        // priority queue for the deaths

        PriorityQueue<DeathsQueue> DON = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DQB = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DBC = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DAB = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DSK = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DMT = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DNB = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DNF = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DPE = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DNW = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DNV = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DYK = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DNS = new PriorityQueue<>();
        PriorityQueue<DeathsQueue> DCAN = new PriorityQueue<>();

        //priority queue for the cases
        PriorityQueue<CasesQueue> CON = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CQB = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CBC = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CAB = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CSK = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CMT = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CNB = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CNF = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CPE = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CNW = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CNV = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CYK = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CNS = new PriorityQueue<>();
        PriorityQueue<CasesQueue> CCAN = new PriorityQueue<>();




        boolean first = true;
        //get the csv file
        // String csvFile = "/home/mackjp99/VScodeProjects/COMP2540/Final_Project/covid19.csv";
        //relaive path should be given
        String csvFile = "./covid19.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";//use comma as our delimeter
        EntryADT ent;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {// loop unitl EOF

                if(first)// skip colllumn headers
                {
                    first = false;
                }
                else
                {

                
                    // use comma as delimeter
                    String[] country = line.split(cvsSplitBy);

                   
                    
                    switch(Integer.parseInt(country[0]))
                    {
                        case 35://ontario
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            ON.add(ent);
                            break;
                        case 24://quebec
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            QB.add(ent);
                            break;
                        case 59://British Columbia
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            BC.add(ent);
                            break;
                        case 48://Alberta
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            AB.add(ent);
                            break;
                        case 47://Saskatchewan
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            SK.add(ent);
                            break;
                        case 46://Manitoba
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            MT.add(ent);
                            break;
                        case 13://New Brunswick
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            NB.add(ent);
                            break;
                        case 12:
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            NS.add(ent);
                            break;
                        case 10://New Foundland
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            NF.add(ent);
                            break;
                        case 11://PEI
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            PE.add(ent);
                            break;
                        case 61://Northwest Territories
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            NW.add(ent);
                            break;
                        case 62://Nunavut
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            NV.add(ent);
                            break;
                        case 60://Yukon
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            YK.add(ent);
                            break;
                        case 1://Canada
                            ent = new EntryADT(country[3], Integer.parseInt(country[4]), Integer.parseInt(country[6]));
                            CAN.add(ent);
                            break;
                        default:
                            break;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        //now we must calculate the number of cases/deaths per day as each entry in the csv is total to date
        
        for(int i = ON.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(ON.get(i).getDate(), ON.get(i).getCase()-ON.get(i-1).getCase(), ON.get(i).getDeath()-ON.get(i-1).getDeath());
            ON.set(i, up);
        }
        for(int i = QB.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(QB.get(i).getDate(), QB.get(i).getCase()-QB.get(i-1).getCase(), QB.get(i).getDeath()-QB.get(i-1).getDeath());
            QB.set(i, up);
        }
        for(int i = BC.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(BC.get(i).getDate(), BC.get(i).getCase()-BC.get(i-1).getCase(), BC.get(i).getDeath()-BC.get(i-1).getDeath());
            BC.set(i, up);
        }
        for(int i = AB.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(AB.get(i).getDate(), AB.get(i).getCase()-AB.get(i-1).getCase(), AB.get(i).getDeath()-AB.get(i-1).getDeath());
            AB.set(i, up);
        }
        for(int i = SK.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(SK.get(i).getDate(), SK.get(i).getCase()-SK.get(i-1).getCase(), SK.get(i).getDeath()-SK.get(i-1).getDeath());
            SK.set(i, up);
        }
        for(int i = MT.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(MT.get(i).getDate(), MT.get(i).getCase()-MT.get(i-1).getCase(), MT.get(i).getDeath()-MT.get(i-1).getDeath());
            MT.set(i, up);
        }
        for(int i = NB.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(NB.get(i).getDate(), NB.get(i).getCase()-NB.get(i-1).getCase(), NB.get(i).getDeath()-NB.get(i-1).getDeath());
            NB.set(i, up);
        }
        for(int i = NF.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(NF.get(i).getDate(), NF.get(i).getCase()-NF.get(i-1).getCase(), NF.get(i).getDeath()-NF.get(i-1).getDeath());
            NF.set(i, up);
        }
        for(int i = PE.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(PE.get(i).getDate(), PE.get(i).getCase()-PE.get(i-1).getCase(), PE.get(i).getDeath()-PE.get(i-1).getDeath());
            PE.set(i, up);
        }
        for(int i = NW.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(NW.get(i).getDate(), NW.get(i).getCase()-NW.get(i-1).getCase(), NW.get(i).getDeath()-NW.get(i-1).getDeath());
            NW.set(i, up);
        }
        for(int i = NV.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(NV.get(i).getDate(), NV.get(i).getCase()-NV.get(i-1).getCase(), NV.get(i).getDeath()-NV.get(i-1).getDeath());
            NV.set(i, up);
        }
        for(int i = YK.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(YK.get(i).getDate(), YK.get(i).getCase()-YK.get(i-1).getCase(), YK.get(i).getDeath()-YK.get(i-1).getDeath());
            YK.set(i, up);
        }
        for(int i = NS.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(NS.get(i).getDate(), NS.get(i).getCase()-NS.get(i-1).getCase(), NS.get(i).getDeath()-NS.get(i-1).getDeath());
            NS.set(i, up);
        }
        for(int i = CAN.size()-1;i > 0;i--)
        {
            EntryADT up = new EntryADT(CAN.get(i).getDate(), CAN.get(i).getCase()-CAN.get(i-1).getCase(), CAN.get(i).getDeath()-CAN.get(i-1).getDeath());
            CAN.set(i, up);
        }
        System.out.println("Done for reading data and storing in Arraylist");

        //Here is where we can now populate the priority queues for each province

        // priority queues for the cases
        for(int i = ON.size()-1;i > 0;i--) {
            CON.add(new CasesQueue(ON.get(i).getDate(), ON.get(i).getCase()));
        }
        System.out.println("Done for the ON priority queues for Cases");

        for(int i = QB.size()-1;i > 0;i--) {
            CQB.add(new CasesQueue(QB.get(i).getDate(), QB.get(i).getCase()));
        }
        
        System.out.println("Done for the QB priority queues for Cases");


        for(int i = BC.size()-1;i > 0;i--) {
            CBC.add(new CasesQueue(BC.get(i).getDate(), BC.get(i).getCase()));
        }
        System.out.println("Done for the BC priority queues for Cases");
        

        for(int i = AB.size()-1;i > 0;i--) {
            CAB.add(new CasesQueue(AB.get(i).getDate(), AB.get(i).getCase()));
        }

        System.out.println("Done for the AB priority queues for Cases");

        
        for(int i = SK.size()-1;i > 0;i--) {
            CSK.add(new CasesQueue(SK.get(i).getDate(), SK.get(i).getCase()));
        }

        System.out.println("Done for the SK priority queues for Cases");

        
        for(int i = MT.size()-1;i > 0;i--) {
            CMT.add(new CasesQueue(MT.get(i).getDate(), MT.get(i).getCase()));
        }

        System.out.println("Done for the MT priority queues for Cases");

        
        for(int i = NB.size()-1;i > 0;i--) {
            CNB.add(new CasesQueue(NB.get(i).getDate(), NB.get(i).getCase()));
        }
        System.out.println("Done for the NB priority queues for Cases");
        


        for(int i = NF.size()-1;i > 0;i--) {
            CNF.add(new CasesQueue(NF.get(i).getDate(), NF.get(i).getCase()));
        }

        System.out.println("Done for the NF priority queues for Cases");


        
        for(int i = PE.size()-1;i > 0;i--)  {
            CPE.add(new CasesQueue(PE.get(i).getDate(), PE.get(i).getCase()));
        }

        System.out.println("Done for the PE priority queues for Cases");

        
        for(int i = NW.size()-1;i > 0;i--) {
            CNW.add(new CasesQueue(NW.get(i).getDate(), NW.get(i).getCase()));
        }

        System.out.println("Done for the NW priority queues for Cases");


        
        for(int i = NV.size()-1;i > 0;i--) {
            CNV.add(new CasesQueue(NV.get(i).getDate(), NV.get(i).getCase()));
        }

        System.out.println("Done for the NV priority queues for Cases");

        
        for(int i = YK.size()-1;i > 0;i--) {
            CYK.add(new CasesQueue(YK.get(i).getDate(), YK.get(i).getCase()));
        }
        

        System.out.println("Done for the YK priority queues for Cases");



        for(int i = NS.size()-1;i > 0;i--) {
            CNS.add(new CasesQueue(NS.get(i).getDate(), NS.get(i).getCase()));
        }

        System.out.println("Done for the NS priority queues for Cases");

        
        for(int i = CAN.size()-1;i > 0;i--) {
            CCAN.add(new CasesQueue(CAN.get(i).getDate(), CAN.get(i).getCase()));
        }
        System.out.println("Done for the CAN priority queues for Cases");


        System.out.println("Done for the priority queues for cases according to the provience");


        //priority queues for the Deaths

        for(int i = ON.size()-1;i > 0;i--) {
            DON.add(new DeathsQueue(ON.get(i).getDate(), ON.get(i).getDeath()));
        }

        System.out.println("Done for the ON priority queues for Deaths");

        
        for(int i = QB.size()-1;i > 0;i--) {
            DQB.add(new DeathsQueue(QB.get(i).getDate(), QB.get(i).getDeath()));
        }

        System.out.println("Done for the QB priority queues for Deaths");

        
        for(int i = BC.size()-1;i > 0;i--) {
            DBC.add(new DeathsQueue(BC.get(i).getDate(), BC.get(i).getDeath()));
        }

        System.out.println("Done for the BC priority queues for Deaths");

        
        for(int i = AB.size()-1;i > 0;i--) {
            DAB.add(new DeathsQueue(AB.get(i).getDate(), AB.get(i).getDeath()));
        }

        System.out.println("Done for the AB priority queues for Deaths");

        
        for(int i = SK.size()-1;i > 0;i--) {
            DSK.add(new DeathsQueue(SK.get(i).getDate(), SK.get(i).getDeath()));
        }

        System.out.println("Done for the SK priority queues for Deaths");

        
        for(int i = MT.size()-1;i > 0;i--) {
            DMT.add(new DeathsQueue(MT.get(i).getDate(), MT.get(i).getDeath()));
        }

        System.out.println("Done for the MT priority queues for Deaths");

        
        for(int i = NB.size()-1;i > 0;i--) {
            DNB.add(new DeathsQueue(NB.get(i).getDate(), NB.get(i).getDeath()));
        }

        System.out.println("Done for the NB priority queues for Deaths");

        
        for(int i = NF.size()-1;i > 0;i--) {
            DNF.add(new DeathsQueue(NF.get(i).getDate(), NF.get(i).getDeath()));
        }

        System.out.println("Done for the NF priority queues for Deaths");

        
        for(int i = PE.size()-1;i > 0;i--)  {
            DPE.add(new DeathsQueue(PE.get(i).getDate(), PE.get(i).getDeath()));
        }

        System.out.println("Done for the PE priority queues for Deaths");

        
        for(int i = NW.size()-1;i > 0;i--) {
            DNW.add(new DeathsQueue(NW.get(i).getDate(), NW.get(i).getDeath()));
        }

        System.out.println("Done for the NW priority queues for Deaths");

        
        for(int i = NV.size()-1;i > 0;i--) {
            DNV.add(new DeathsQueue(NV.get(i).getDate(), NV.get(i).getDeath()));
        }

        System.out.println("Done for the NV priority queues for Deaths");

        
        for(int i = YK.size()-1;i > 0;i--) {
            DYK.add(new DeathsQueue(YK.get(i).getDate(), YK.get(i).getDeath()));
        }

        System.out.println("Done for the YK priority queues for Deaths");

        
        for(int i = NS.size()-1;i > 0;i--) {
            DNS.add(new DeathsQueue(NS.get(i).getDate(), NS.get(i).getDeath()));
        }

        System.out.println("Done for the NS priority queues for Deaths");

        
        for(int i = CAN.size()-1;i > 0;i--) {
            DCAN.add(new DeathsQueue(CAN.get(i).getDate(), CAN.get(i).getDeath()));
        }

        System.out.println("Done for the CAN priority queues for Deaths");


        System.out.println("Done for the priority queues for deaths according to the provience");
    }

}
