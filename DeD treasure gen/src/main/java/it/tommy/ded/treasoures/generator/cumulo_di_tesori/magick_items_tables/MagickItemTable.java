package it.tommy.ded.treasoures.generator.cumulo_di_tesori.magick_items_tables;

import it.tommy.ded.treasoures.generator.dice.Dice;
import it.tommy.ded.treasoures.generator.dice.DiceType;

import java.util.ArrayList;

public abstract class MagickItemTable {

    protected ArrayList<Item> items;
    private static Dice dice = new Dice(DiceType.D100);

    private static MagickItemTable a, b, c, d, e, f, g, h, i;

    private MagickItemTable(){
        items = buildTable();
    }

    protected abstract ArrayList<Item> buildTable();

    public Item roll(){
        int rolled = dice.throwDice()-1;
        int min = 0;
        int max = items.size()-1;
        while(min<=max)
        {
            int med = (min+max)/2;
            Item item = items.get(med);
            if(item.getMin() > rolled)
                max = med-1;
            else if(item.getMax() < rolled)
                min = med+1;
            else return items.get(med);
        }
        System.out.println(rolled);
        return null;
    }

    public static MagickItemTable getTableInstance(MagickItemTableType tableType){
        if(tableType!=null)
            return switch(tableType)
                    {
                        case A-> {
                            a = a==null? new MagickItemTableA(): a ;
                            yield a;
                        }
                        case B-> {
                            b = b==null?new MagickItemTableB(): b ;
                            yield b;
                        }
                        case C-> {
                            c = c==null?new MagickItemTableC(): c ;
                            yield c;
                        }
                        case D-> {
                            d = d==null?new MagickItemTableD(): d ;
                            yield d;
                        }
                        case E-> {
                            e = e==null?new MagickItemTableE(): e ;
                            yield e;
                        }
                        case F-> {
                            f = f==null?new MagickItemTableF(): f ;
                            yield f;
                        }
                        case G-> {
                            g = g==null?new MagickItemTableG(): g ;
                            yield g;
                        }
                        case H-> {
                            h = h==null?new MagickItemTableH(): h ;
                            yield h;
                        }
                        case I-> {
                            i = i==null?new MagickItemTableI(): i ;
                            yield i;
                        }
                    };
        return null;
    }

    public ArrayList<Item>generateItems(int timesToRoll){
        ArrayList<Item> items = new ArrayList<>();
        while(timesToRoll-->0)
            items.add(roll());
        return items;
    }


    public static class MagickItemTableA extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>();
            array.add(new Item(0,0, "Globo fluttuante"));
            array.add(new Item(1,50 , "Pozione di guarigione"));
            array.add(new Item(51,60 , "Pergamena magica (cantrip)"));
            array.add(new Item(61,70 , "Pozione di arrampicata"));
            array.add(new Item(71,90 , "Pergamena magica (1 ° livello)"));
            array.add(new Item(91,94 , "Pergamena magica (2 ° livello)"));
            array.add(new Item(95,98 , "Pozione di guarigione maggiore"));
            array.add(new Item(99,99, "Borsa da viaggio"));
            return array;
        }
    }

    public static class MagickItemTableB extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>(36);
            array.add(new Item(0,0, "Bacchetta dei segreti"));
            array.add(new Item(1,15 , "Pozione di maggiore guarigione"));
            array.add(new Item(16,22 , "Pozione soffio di fuoco"));
            array.add(new Item(23,29 , "Pozione di resistenza"));
            array.add(new Item(30,34 , "Munizione +1"));
            array.add(new Item(35,39 , "Pozione di amicizia animai"));
            array.add(new Item(40,44 , "Pozione della forza del gigante delle colline"));
            array.add(new Item(45,49 , "Pozione di crescita"));
            array.add(new Item(50,54 , "Pozione di respirazione acquatica"));
            array.add(new Item(55,59 , "Pergamena magica (2 ° livello)"));
            array.add(new Item(60,64 , "Pergamena magica (3 ° livello)"));
            array.add(new Item(65,67 , "Borsa da viaggio"));
            array.add(new Item(68,70 , "Unguento di Keoghtom"));
            array.add(new Item(71,73 , "Olio di scivolosità"));
            array.add(new Item(74,75 , "Polvere di scomparsa"));
            array.add(new Item(76,77 , "Polvere di secchezza"));
            array.add(new Item(78,79 , "Polvere di starnuti e soffocamento"));
            array.add(new Item(80,81 , "Gemma elementale"));
            array.add(new Item(82,83 , "Filtratore d'amore"));
            array.add(new Item(84,84, "Giara alchemica"));
            array.add(new Item(85,85, "Tappo di respirazione dell'acqua"));
            array.add(new Item(86,86, "Mantello della manta"));
            array.add(new Item(87,87, "Globo fluttunate"));
            array.add(new Item(88,88, "Occhiali della notte"));
            array.add(new Item(89,89, "Elmo della comprensione delle lingue"));
            array.add(new Item(90,90, "Verga amovibile"));
            array.add(new Item(91,91, "Lanterna di rivelazione"));
            array.add(new Item(92,92, "Armatura da marinaio"));
            array.add(new Item(93,93, "Armatura Mithral"));
            array.add(new Item(94,94, "Pozione di veleno"));
            array.add(new Item(95,95, "Anello di nuoto"));
            array.add(new Item(96,96, "Tunica di oggetti utili"));
            array.add(new Item(97,97, "Corda di arrampicata"));
            array.add(new Item(98,98, "Sella del cavaliere"));
            array.add(new Item(99,99, "Bacchetta magica di rilevamento"));
            return array;
        }

    }

    public static class MagickItemTableC extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>(28);
            array.add(new Item(0,0, "Collana di palle di fuoco"));
            array.add(new Item(1,15 , "Pozione di guarigione superiore"));
            array.add(new Item(16,22 , "Speli scroll (4 ° livello)"));
            array.add(new Item(23,27 , "Munizioni, +2"));
            array.add(new Item(28,32 , "Pozione di chiaroveggenza"));
            array.add(new Item(33,37 , "Pozione di diminuzione"));
            array.add(new Item(38,42 , "Pozione di forma gassosa"));
            array.add(new Item(43,47 , "Potere della forza del gigante del gelo"));
            array.add(new Item(48,52 , "Pozione della forza del gigante di pietra"));
            array.add(new Item(53,57 , "Pozione dell'eroismo"));
            array.add(new Item(58,62 , "Pozione di invulnerabilità"));
            array.add(new Item(63,67 , "Pozione di lettura della mente"));
            array.add(new Item(68,72 , "Speli scroli (5 ° livello)"));
            array.add(new Item(73,75 , "Elisir di salute"));
            array.add(new Item(76,78 , "Olio di eterea"));
            array.add(new Item(79,81 , "Pozione della forza del gigante di fuoco"));
            array.add(new Item(82,84 , "Piuma di Quaal"));
            array.add(new Item(85,87 , "Pergamena di protezione"));
            array.add(new Item(88,89 , "Sacco di fagioli"));
            array.add(new Item(90,91 , "Perlina di forza"));
            array.add(new Item(92,92, "Campanello d'apertura"));
            array.add(new Item(93,93, "Decanter di acqua infinita"));
            array.add(new Item(94,94, "Il pratico zaino di Heward"));
            array.add(new Item(95,95, "Periapt di salute"));
            array.add(new Item(96,96, "Invio di pietre"));
            array.add(new Item(97,97, "Occhi di minuto che vedono"));
            array.add(new Item(98,98, "Barca pieghevole"));
            array.add(new Item(99,99, "Ferri di cavallo della velocità"));
            return array;
        }

    }


    public static class MagickItemTableD extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>();
            array.add(new Item(0,0, "Buco portatile"));
            array.add(new Item(1,20 , "Pozione di guarigione suprema"));
            array.add(new Item(21,30 , "Pozione dell'invisibilità"));
            array.add(new Item(31,40 , "Pozione della velocità"));
            array.add(new Item(41,50 , "Pergamena magica (6 ° livello)"));
            array.add(new Item(51,57 , "Pergamena magica (7 ° livello)"));
            array.add(new Item(58,62 , "Munizioni, +3"));
            array.add(new Item(63,67 , "Olio di nitidezza"));
            array.add(new Item(68,72 , "Pozione di volo"));
            array.add(new Item(73,77 , "Pozione della forza del gigante delle nuvole"));
            array.add(new Item(78,82 , "Pozione della longevità"));
            array.add(new Item(83,87 , "Pozione di vitalità"));
            array.add(new Item(88,92 , "Pergamena magica (8 ° livello I)"));
            array.add(new Item(93,95 , "Ferri di cavallo dello zefiro"));
            array.add(new Item(96,98 , "I meravigliosi pigmenti di Nolzur"));
            array.add(new Item(99,99, "Borsa divorante"));
            return array;
        }

    }

    public static class MagickItemTableE extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>();
            array.add(new Item(0,0 , "Colla meravigliosa"));
            array.add(new Item(1,30 , "Speli scroll (8 ° livello!)"));
            array.add(new Item(31,55 , "Pozione della forza del gigante della tempesta"));
            array.add(new Item(56,70 , "Pozione di guarigione suprema"));
            array.add(new Item(71,85 , "pergamena degli incantesimi (9 ° livello)"));
            array.add(new Item(86,93 , "Solvente universale"));
            array.add(new Item(94,98 , "Freccia assassina"));
            array.add(new Item(99,99 , "Colla meravigliosa"));
            return array;
        }

    }

    public static class MagickItemTableF extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>(61);
            array.add(new Item(0,0, "Stivali alati"));
            array.add(new Item(1,15 , "Arma, + 1"));
            array.add(new Item(16,18 , "Scudo, + 1"));
            array.add(new Item(19,21 , "Sentine! scudo"));
            array.add(new Item(22,23 , "Amuleto di prova contro il rilevamento e la posizione"));
            array.add(new Item(24,25 , "Stivali del genere elfico"));
            array.add(new Item(26,27 , "Stivali del passo e del balzo"));
            array.add(new Item(28,29 , "Bracciali del tiro con l'arco"));
            array.add(new Item(30,31 , "Spilla di scudo"));
            array.add(new Item(32,33 , "Scopa offesa"));
            array.add(new Item(34,35 , "Mantello del genere elfico"));
            array.add(new Item(36,37 , "Mantello di protezione"));
            array.add(new Item(38,39 , "Guanti del potere degli orchi"));
            array.add(new Item(40,41 , "Cappello da travestimento"));
            array.add(new Item(42,43 , "Giavellotto di fulmini"));
            array.add(new Item(44,45 , "Perla del potere"));
            array.add(new Item(46,47 , "Bastone del custode del patto, + 1"));
            array.add(new Item(48,49 , "Pantofole di ragno rampicante"));
            array.add(new Item(50,51 , "Bastone del sommatore"));
            array.add(new Item(52,53 , "Bastone del pitone"));
            array.add(new Item(54,55 , "Spada della vendetta"));
            array.add(new Item(56,57 , "Trident of fish command"));
            array.add(new Item(58,59 , "Bacchetta dardi incantati"));
            array.add(new Item(60,61 , "Bacchetta del mago della guerra, + 1"));
            array.add(new Item(62,63 , "Bacchetta di ragnatela"));
            array.add(new Item(64,65 , "Arma di avvertimento"));
            array.add(new Item(66,66, "Armatura adamantina (cotta di maglia)"));
            array.add(new Item(67,67, "Armatura adamantina (maglia a catena)"));
            array.add(new Item(68,68, "Armatura adamantina (cotta di maglia)"));
            array.add(new Item(69,69, "Borsa dei trucchi (grigia)"));
            array.add(new Item(70,70, "Borsa di trucchi (ruggine)"));
            array.add(new Item(71,71, "Borsa di trucchi (marrone chiaro)"));
            array.add(new Item(72,72, "Stivali delle Terre dell'Inverno"));
            array.add(new Item(73,73, "Cerchietto di sabbiatura"));
            array.add(new Item(74,74, "Mazzo di illusioni"));
            array.add(new Item(75,75, "Bottiglia per fumatori"));
            array.add(new Item(76,76, "Occhi affascinanti"));
            array.add(new Item(77,77, "Occhi dell'aquila"));
            array.add(new Item(78,78, "Statuetta del potere meraviglioso (corvo d'argento)"));
            array.add(new Item(79,79, "Gemma di luminosità"));
            array.add(new Item(80,80, "Guanti di missile snaring"));
            array.add(new Item(81,81, "Guanti da nuoto e da arrampicata"));
            array.add(new Item(82,82, "Guanti del furto"));
            array.add(new Item(83,83, "Fascia dell'intelletto"));
            array.add(new Item(84,84, "Elmo della telepatia"));
            array.add(new Item(85,85, "Strumento dei bardi (Doss Iute)"));
            array.add(new Item(86,86, "Strumento dei bardi (Fochlucan bandore)"));
            array.add(new Item(87 ,87, "Strumento dei bardi (cetra di Mac-Fuimidh)"));
            array.add(new Item(88,88, "Medaglione dei pensieri"));
            array.add(new Item(89,89, "Collana di adattamento"));
            array.add(new Item(90,90, "Talismano della rigenerazione"));
            array.add(new Item(91,91, "Tubi di caccia"));
            array.add(new Item(92,92, "Pi pes delle fogne"));
            array.add(new Item(93,93, "Anello di salto"));
            array.add(new Item(94,94, "Anello di schermatura mentale"));
            array.add(new Item(95,95, "Anello di calore"));
            array.add(new Item(96,96, "Anello del camminare sull'acqua"));
            array.add(new Item(97,97, "Faretra di Ehlonna"));
            array.add(new Item(98,98, "Pietra di buona fortuna"));
            array.add(new Item(99,99, "Ventaglio"));
            return array;
        }

    }

    public static class MagickItemTableG extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>(87);
            array.add(new Item(0, 0, "Ali di volo"));
            array.add(new Item(1, 11, "Arma, +2"));
            array.add(new Item(12, 14, "Statuetta del potere meraviglioso: "+getStatuetta()));
            array.add(new Item(15, 15, "armatura Adamantina (corazza)"));
            array.add(new Item(16, 16, "armatura Adamantina (stecca)"));
            array.add(new Item(17, 17, "Amuleto della salute"));
            array.add(new Item(18, 18, "Armatura della vulnerabilità"));
            array.add(new Item(19, 19, "Scudo che cattura le frecce"));
            array.add(new Item(20, 20, "Cintura di razza nanica"));
            array.add(new Item(21, 21, "Cintura della forza dei giganti delle colline"));
            array.add(new Item(22, 22, "Ascia Berserker"));
            array.add(new Item(23, 23, "Stivali di levitazione"));
            array.add(new Item(24, 24, "stivali di velocità"));
            array.add(new Item(25, 25, "Ciotola di comandanti elementali dell'acqua"));
            array.add(new Item(26, 26, "Bracciali della difesa"));
            array.add(new Item(27, 27, "Braciere di comandanti elementali del fuoco"));
            array.add(new Item(28, 28, "Capo del saltimbanco"));
            array.add(new Item(29, 29, "Incensiere per il controllo degli elementali dell'aria"));
            array.add(new Item(30, 30, "armatura, +1 cotta di maglia"));
            array.add(new Item(31, 31, "Armatura della resistenza (cotta di maglia)"));
            array.add(new Item(32, 32, "Armatura, + 1 maglia a catena"));
            array.add(new Item(33, 33, "Armatura della resistenza (maglia a catena)"));
            array.add(new Item(34, 34, "Mantello dello spostamento"));
            array.add(new Item(35, 35, "Mantello del pipistrello"));
            array.add(new Item(36, 36, "Cube afforce"));
            array.add(new Item(37, 37, "La fortezza istantanea di Daern"));
            array.add(new Item(38, 38, "Pugnale di veleno"));
            array.add(new Item(39, 39, "Grilli dimensionali"));
            array.add(new Item(40, 40, "Uccisore di draghi"));
            array.add(new Item(41, 41, "Catena elfica"));
            array.add(new Item(42, 42, "Lingua di fiamma"));
            array.add(new Item(43, 43, "Gemma della vista"));
            array.add(new Item(44, 44, "Uccisore di giganti"));
            array.add(new Item(45, 45, "Armatura in pelle borchiata"));
            array.add(new Item(46, 46, "Elmo del teletrasporto"));
            array.add(new Item(47, 47, "Corno di brillamento"));
            array.add(new Item(48, 48, "Corno di Valhalla (argento o ottone)"));
            array.add(new Item(49, 49, "Strumento dei bardi (mandolino Canaith)"));
            array.add(new Item(50, 50, "Strumento dei bardi (Cii lyre)"));
            array.add(new Item(51, 51, "Pietra di Loun (consapevolezza)"));
            array.add(new Item(52, 52, "Pietra di Loun (protezione)"));
            array.add(new Item(53, 53, "Pietra di Loun (Riserva)"));
            array.add(new Item(54, 54, "Pietra di Loun (sostentamento)"));
            array.add(new Item(55, 55, "bande di ferro del Bilarro"));
            array.add(new Item(56, 56, "Armatura, + 1 cuoio"));
            array.add(new Item(57, 57, "Armatura della resistenza (cuoio)"));
            array.add(new Item(58, 58, "Mazza di interruzione"));
            array.add(new Item(59, 59, "Mazza di percosse"));
            array.add(new Item(60, 60, "Mazza del terrore"));
            array.add(new Item(61, 61, "Mantello della resistenza agli incantesimi"));
            array.add(new Item(62, 62, "Collana di grani di preghiera"));
            array.add(new Item(63, 63, "Amuleto anti veleno"));
            array.add(new Item(64, 64, "Anello di influenza animale"));
            array.add(new Item(65, 65, "Anello di evasione"));
            array.add(new Item(66, 66, "Anello di piuma che cade"));
            array.add(new Item(67, 67, "Anello di azione gratuita"));
            array.add(new Item(68, 68, "Anello di protezione"));
            array.add(new Item(69, 69, "Anello di resistenza"));
            array.add(new Item(70, 70, "Anello di conservazione degli incantesimi"));
            array.add(new Item(71, 71, "Anello dell'ariete"));
            array.add(new Item(72, 72, "Anello di visione a raggi X."));
            array.add(new Item(73, 73, "Tunica degli occhi"));
            array.add(new Item(74, 74, "Verga del governo"));
            array.add(new Item(75, 75, "Verga del custode del patto, +2"));
            array.add(new Item(76, 76, "Corda di impigliamento"));
            array.add(new Item(77, 77, "Armatura, +1 posta in scala"));
            array.add(new Item(78, 78, "Armatura della resistenza (cotta di maglia)"));
            array.add(new Item(79, 79, "Scudo, +2"));
            array.add(new Item(80, 80, "Scudo di attrazione missilistica"));
            array.add(new Item(81, 81, "Personale di charme"));
            array.add(new Item(82, 82, "Personale di guarigione"));
            array.add(new Item(83, 83, "Personale di sciami di insetti"));
            array.add(new Item(84, 84, "Personale dei boschi"));
            array.add(new Item(85, 85, "Bastone di appassimento"));
            array.add(new Item(86, 86, "Pietra del controllo degli elementali della terra"));
            array.add(new Item(87, 87, "Lama solare"));
            array.add(new Item(88, 88, "Spada della vita che ruba"));
            array.add(new Item(89, 89, "Spada ferita"));
            array.add(new Item(90, 90, "Asta per tentacoli"));
            array.add(new Item(91, 91, "Arma viziosa"));
            array.add(new Item(92, 92, "Bacchetta di rilegatura"));
            array.add(new Item(93, 93, "Bacchetta di rilevamento nemico"));
            array.add(new Item(94, 94, "Bacchetta della paura"));
            array.add(new Item(95, 95, "Bacchetta di palle di fuoco"));
            array.add(new Item(96, 96, "Bacchetta di fulmini"));
            array.add(new Item(97, 97, "Bacchetta di paralisi"));
            array.add(new Item(98, 98, "Bacchetta del mago della guerra, +2"));
            array.add(new Item(99, 99, "Bacchetta magica"));
            return array;
        }

        private String getStatuetta(){
            String[] statuette = {"Cane d'onice", "Cane d'onice",
                                "Capre d'avorio",
                                "Elefante di marmo",
                                "Grifone di bronzo",
                                "Gufo di serpentino",
                                "Leoni d'oro",
                                "Mosca d'ebano"
                            };
            Dice d8 = new Dice(DiceType.D8);
            return statuette[d8.throwDice()-1];
        }

        @Override
        public Item roll() {
            Item i = super.roll();
            if(i.getMax()<=14 && i.getMin()>=12)
                items.set(2, new Item(12, 14, "Statuetta del potere meraviglioso: "+getStatuetta()));
            return i;
        }
    }

    public static class MagickItemTableH extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>(69);
            array.add(new Item(0 ,0 , "Tomo della comprensione"));
            array.add(new Item(1,10 , "Arma, +3"));
            array.add(new Item(11,12 , "Amuleto degli aerei"));
            array.add(new Item(13,14 , "Tappeto volante"));
            array.add(new Item(15,16 , "Sfera di cristallo (versione molto rara)"));
            array.add(new Item(17,18 , "Anello di rigenerazione"));
            array.add(new Item(19,20 , "Anello delle stelle cadenti"));
            array.add(new Item(21,22 , "Anello di telecinesi"));
            array.add(new Item(23,24 , "Veste dai colori scintillanti"));
            array.add(new Item(25,26 , "Abito di stelle"));
            array.add(new Item(27,28 , "Asta di assorbimento"));
            array.add(new Item(29,30 , "Bastone della vigilanza"));
            array.add(new Item(31,32 , "Verga di sicurezza"));
            array.add(new Item(33,34 , "Verga del custode del patto, +3"));
            array.add(new Item(35,36 , "Scimitarra della velocità"));
            array.add(new Item(37,38 , "Scudo, +3"));
            array.add(new Item(39,40 , "Bastone di fuoco"));
            array.add(new Item(41,42 , "Bastone del gelo"));
            array.add(new Item(43,44 , "Personale del potere"));
            array.add(new Item(45,46 , "Bastone di sciopero"));
            array.add(new Item(47,48 , "Bastone di tuoni e fulmini"));
            array.add(new Item(49,50 , "Spada affilata"));
            array.add(new Item(51,52 , "Bacchetta di polimorfo"));
            array.add(new Item(53,54 , "Bacchetta del mago della guerra, +3"));
            array.add(new Item(55,55, "armatura Adamantina (mezzo piatto)"));
            array.add(new Item(56,56, "armatura Adamantina (piastra)"));
            array.add(new Item(57,57, "Scudo animato"));
            array.add(new Item(58,58, "Cintura di fuoco gigante forza"));
            array.add(new Item(59,59, "Cintura di gelo (o pietra) forza gigante"));
            array.add(new Item(60,60, "Armatura, + 1 pettorale"));
            array.add(new Item(61,61, "Armatura della resistenza (corazza)"));
            array.add(new Item(62,62, "Candela di invocazione"));
            array.add(new Item(63,63, "Armatura, +2 cotta di maglia"));
            array.add(new Item(64,64, "Armatura, +2 maglia a catena"));
            array.add(new Item(65,65, "Mantello di aracnida"));
            array.add(new Item(66,66, "Spada danzante"));
            array.add(new Item(67,67, "Armatura demoniaca"));
            array.add(new Item(68,68, "Cotta di scaglie di drago"));
            array.add(new Item(69,69, "Piatto nanico"));
            array.add(new Item(70,70, "Lanciatore nanico"));
            array.add(new Item(71,71, "Bottiglia Efreeti"));
            array.add(new Item(72,72, "Statuetta del meraviglioso potere (destriero di ossidiana)"));
            array.add(new Item(73,73, "Spada del gelo"));
            array.add(new Item(74,74, "Elmo della brillantezza"));
            array.add(new Item(75,75, "Corno del Valhalla (bronzo)"));
            array.add(new Item(76,76, "Strumento dei bardi (arpa di Anstruth)"));
            array.add(new Item(77,77, "loun stone (assorbimento)"));
            array.add(new Item(78,78, "loun stone (agilità)"));
            array.add(new Item(79,79, "loun stone (fortezza)"));
            array.add(new Item(80,80, "loun stone (intuizione)"));
            array.add(new Item(81,81, "loun stone (intelletto)"));
            array.add(new Item(82,82, "loun stone (leadership)"));
            array.add(new Item(83,83, "loun stone (forza)"));
            array.add(new Item(84,84, "Armatura, +2 cuoio"));
            array.add(new Item(85,85, "Manuale di salute corporea"));
            array.add(new Item(86,86, "Manuale di esercizio lucrativo"));
            array.add(new Item(87,87, "Manuale dei golem"));
            array.add(new Item(88,88, "Manuale di rapidità d'azione"));
            array.add(new Item(89,89, "Specchio della trappola della vita"));
            array.add(new Item(90,90, "Spada ruba nove vite"));
            array.add(new Item(91,91, "Arco del giuramento"));
            array.add(new Item(92,92, "Armatura, +2 scaglie di posta"));
            array.add(new Item(93,93, "Scudo della guardia magica"));
            array.add(new Item(94,94, "Armatura, + 1 stecca"));
            array.add(new Item(95,95, "Armatura di resistenza (stecca)"));
            array.add(new Item(96,96, "Armatura, + 1 cuoio borchiato"));
            array.add(new Item(97,97, "Armatura della resistenza (pelle borchiata)"));
            array.add(new Item(98,98, "Tomo di pensiero chiaro"));
            array.add(new Item(99,99, "Tomo della leadership e dell'influenza"));
            return array;
        }

    }

    public static class MagickItemTableI extends MagickItemTable{

        @Override
        protected ArrayList<Item> buildTable() {
            ArrayList<Item> array = new ArrayList<>(53);
            array.add(new Item(0,0, "Tomo della lingua essiccata"));
            array.add(new Item(1,5 , "Difensiva"));
            array.add(new Item(6,10 , "Martello dei fulmini"));
            array.add(new Item(11,15 , "Lama della fortuna"));
            array.add(new Item(16,20 , "Spada di risposta"));
            array.add(new Item(21,23 , "Santo vendicatore"));
            array.add(new Item(24,26 , "Anello dell'evocazione dei djinni"));
            array.add(new Item(27,29 , "Anello dell'invisibilità"));
            array.add(new Item(30,32 , "Anello rifletti incantesimo"));
            array.add(new Item(33,35 , "Verga del potere signore"));
            array.add(new Item(36,38 , "Bastone dei magi"));
            array.add(new Item(39,41 , "Spada Vorpal"));
            array.add(new Item(42,43 , "Cintura della forza del gigante delle nuvole"));
            array.add(new Item(44,45 , "Armatura, +2 corazza"));
            array.add(new Item(46,47 , "Armatura, +3 cotta di maglia"));
            array.add(new Item(48,49 , "Armatura, +3 maglia a catena"));
            array.add(new Item(50,51 , "Mantello dell'invisibilità"));
            array.add(new Item(52,53 , "Sfera di cristallo (versione leggendaria)"));
            array.add(new Item(54,55 , "Armatura, + 1 mezza piastra"));
            array.add(new Item(56,57 , "Fiaschetta di ferro"));
            array.add(new Item(58,59 , "Armatura, +3 cuoio"));
            array.add(new Item(60,61 , "Armatura, +1 piastra"));
            array.add(new Item(62,63 , "Tonaca dell'Arcimago"));
            array.add(new Item(64,65 , "Verga della risurrezione"));
            array.add(new Item(66,67 , "Armatura, +1 posta in scala"));
            array.add(new Item(68,69 , "Scarabeo di protezione"));
            array.add(new Item(70,71 , "Armatura, +2 stecca"));
            array.add(new Item(72,73 , "Armatura, +2 cuoio borchiato"));
            array.add(new Item(74,75 , "Bene di molti mondi"));
            array.add(new Item(76,76, "Armatura magica: "+getMagickArmor()));
            array.add(new Item(77,77, "Apparato di Kwalish"));
            array.add(new Item(78,78, "Armatura dell'invulnerabilità"));
            array.add(new Item(79,79, "Cintura della forza del gigante della tempesta"));
            array.add(new Item(80,80, "Cancello cubico"));
            array.add(new Item(81,81, "Mazzo di molte cose"));
            array.add(new Item(82,82, "Catena Efreeti"));
            array.add(new Item(83,83, "Armatura di resistenza (mezza piastra)"));
            array.add(new Item(84,84, "Corno di Valhalla (ferro)"));
            array.add(new Item(85,85, "Strumento dei bardi (arpa OIIamh)"));
            array.add(new Item(86,86, "loun stone (maggiore assorbimento)"));
            array.add(new Item(87,87, "loun stone (maestria)"));
            array.add(new Item(88,88, "loun stone (rigenerazione)"));
            array.add(new Item(89,89, "Armatura a piastre dell'eterea"));
            array.add(new Item(90,90, "Armatura a piastre di resistenza"));
            array.add(new Item(91,91, "Anello di comando elementale dell'aria"));
            array.add(new Item(92,92, "Anello di comando elementale della terra"));
            array.add(new Item(93,93, "Comando elementale Anello di fuoco"));
            array.add(new Item(94,94, "Anello dei tre desideri"));
            array.add(new Item(95,95, "Anello di comando elementale dell'acqua"));
            array.add(new Item(96,96, "Sfera di annientamento"));
            array.add(new Item(97,97, "Talismano di puro bene"));
            array.add(new Item(98,98, "Talismano della sfera"));
            array.add(new Item(99,99, "Talismano del male assoluto"));
            return array;
        }

        private String getMagickArmor(){
            String[] armors = {
                    "armatura, mezza armatura +2",
                    "armatura, mezza armatura +2",
                    "armatura, armatura completa +2",
                    "armatura, armatura completa +2",
                    "cuoio borchiato +3",
                    "cuoio borchiato +3",
                    "corazza di piastre +3",
                    "corazza di piastre +3",
                    "corazza a strisce +3",
                    "corazza a strisce +3",
                    "mezza armatura +3",
                    "armatura completa +3"
            };
            Dice d12 = new Dice(DiceType.D12);
            return armors[d12.throwDice()-1];
        }

        @Override
        public Item roll() {
            Item i = super.roll();
            if(i.getMax()==76)
                items.set(29, new Item(76,76, "Armatura magica: "+getMagickArmor()));
            return i;
        }

    }
}
