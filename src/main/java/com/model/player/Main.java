package com.model.player;

import javax.naming.Name;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
            List<Arcade> arcades = new ArrayList<>(Arrays.asList(
                    new Arcade("0x03", "Gdansk", 389735, Arrays.asList(
                            new Score("coup", 17361, Game.MARIO, 289),
                            new Score("nest", 45632, Game.MARIO, 219),
                            new Score("help", 34007, Game.MARIO, 29),
                            new Score("cell", 19695, Game.MARIO, 282),
                            new Score("urge", 27231, Game.BARBIE_DESTRUCTION, 275),
                            new Score("pump", 73637, Game.MARIO, 216),
                            new Score("wire", 1573, Game.SIMS, 210),
                            new Score("feel", 31280, Game.TETRIS, 32),
                            new Score("mind", 18599, Game.TETRIS, 46),
                            new Score("tool", 81815, Game.TETRIS, 289),
                            new Score("main", 36893, Game.TETRIS, 274),
                            new Score("pace", 47560, Game.TETRIS, 61),
                            new Score("deal", 30300, Game.TETRIS, 183),
                            new Score("mold", 25172, Game.TETRIS, 100),
                            new Score("king", 75324, Game.MARIO, 67),
                            new Score("pain", 57717, Game.MARIO, 92),
                            new Score("iron", 86070, Game.MARIO, 77),
                            new Score("gasp", 43226, Game.MARIO, 113),
                            new Score("slam", 77368, Game.MARIO, 235),
                            new Score("mass", 35767, Game.PINBALL, 174),
                            new Score("rate", 71487, Game.PINBALL, 199),
                            new Score("poll", 95317, Game.PINBALL, 170),
                            new Score("fool", 88387, Game.PINBALL, 46),
                            new Score("vain", 57222, Game.PINBALL, 90),
                            new Score("draw", 82248, Game.PINBALL, 64),
                            new Score("half", 73406, Game.PINBALL, 11),
                            new Score("bush", 53742, Game.MARIO, 171),
                            new Score("unit", 61869, Game.MARIO, 137),
                            new Score("west", 6670, Game.MARIO, 93),
                            new Score("slip", 525, Game.SNAKE, 96),
                            new Score("acid", 29100, Game.MARIO, 222),
                            new Score("glue", 9892, Game.MARIO, 174),
                            new Score("wing", 18962, Game.MARIO, 251),
                            new Score("lean", 25084, Game.MARIO, 29),
                            new Score("walk", 79605, Game.MARIO, 39),
                            new Score("fold", 34033, Game.MARIO, 146),
                            new Score("cook", 10439, Game.MARIO, 147),
                            new Score("well", 21746, Game.MARIO, 237),
                            new Score("role", 369, Game.MARIO, 173),
                            new Score("bite", 52861, Game.MARIO_KART, 16),
                            new Score("warm", 14129, Game.MARIO_KART, 252),
                            new Score("read", 90230, Game.MARIO_KART, 75),
                            new Score("name", 26374, Game.MARIO_KART, 83),
                            new Score("boat", 42527, Game.MARIO_KART, 20),
                            new Score("dare", 32199, Game.MARIO_KART, 147),
                            new Score("sign", 18803, Game.MARIO_KART, 185),
                            new Score("sock", 40416, Game.MARIO, 182),
                            new Score("left", 24272, Game.MARIO, 116),
                            new Score("drop", 12260, Game.MORTAL_COMBAT, 197),
                            new Score("wine", 83008, Game.MARIO, 207)
                    )),
                    new Arcade("0x04", "Gdynia", 124987412, Arrays.asList(
                            new Score("dish", 3190, Game.MARIO, 155),
                            new Score("kick", 643, Game.MARIO, 146),
                            new Score("heel", 4243, Game.MARIO, 74),
                            new Score("hear", 5354, Game.PINBALL, 103),
                            new Score("move", 3090, Game.PINBALL, 149),
                            new Score("pull", 4614, Game.PINBALL, 142),
                            new Score("cage", 451, Game.MARIO, 70),
                            new Score("fist", 7456, Game.MARIO, 146),
                            new Score("tree", 6748, Game.MORTAL_COMBAT, 196),
                            new Score("AIDS", 7015, Game.MORTAL_COMBAT, 129),
                            new Score("girl", 1397, Game.MORTAL_COMBAT, 51),
                            new Score("risk", 1796, Game.MORTAL_COMBAT, 122),
                            new Score("lazy", 3287, Game.MORTAL_COMBAT, 128),
                            new Score("axis", 3292, Game.MORTAL_COMBAT, 186),
                            new Score("mole", 4565, Game.MORTAL_COMBAT, 118),
                            new Score("pony", 850, Game.MORTAL_COMBAT, 123),
                            new Score("slap", 4548, Game.MORTAL_COMBAT, 140),
                            new Score("vain", 2330, Game.MORTAL_COMBAT, 196),
                            new Score("fish", 3336, Game.MORTAL_COMBAT, 94),
                            new Score("urge", 5271, Game.MORTAL_COMBAT, 144),
                            new Score("name", 3786, Game.MORTAL_COMBAT, 87),
                            new Score("gasp", 8175, Game.MORTAL_COMBAT, 73),
                            new Score("read", 813, Game.MORTAL_COMBAT, 192),
                            new Score("bike", 8271, Game.MORTAL_COMBAT, 111),
                            new Score("lead", 7022, Game.MORTAL_COMBAT, 99),
                            new Score("card", 3207, Game.MORTAL_COMBAT, 149),
                            new Score("play", 9669, Game.MORTAL_COMBAT, 57),
                            new Score("body", 1460, Game.MARIO, 50),
                            new Score("last", 5242, Game.MARIO, 174),
                            new Score("rich", 3651, Game.MARIO, 99),
                            new Score("fame", 238, Game.MARIO, 177),
                            new Score("chin", 5235, Game.MARIO, 131),
                            new Score("oven", 2748, Game.MARIO, 52),
                            new Score("jest", 6915, Game.MARIO, 171),
                            new Score("chip", 7398, Game.MARIO, 66),
                            new Score("warn", 29, Game.MARIO, 95),
                            new Score("cook", 7292, Game.MARIO, 58),
                            new Score("suit", 5374, Game.MARIO, 174),
                            new Score("blue", 8980, Game.BARBIE_DESTRUCTION, 67),
                            new Score("pace", 1222, Game.BARBIE_DESTRUCTION, 120),
                            new Score("dash", 7839, Game.BARBIE_DESTRUCTION, 162),
                            new Score("nail", 3191, Game.BARBIE_DESTRUCTION, 142),
                            new Score("mist", 626, Game.BARBIE_DESTRUCTION, 106),
                            new Score("mile", 9626, Game.BARBIE_DESTRUCTION, 184),
                            new Score("wood", 651, Game.BARBIE_DESTRUCTION, 134),
                            new Score("lump", 5101, Game.BARBIE_DESTRUCTION, 168),
                            new Score("folk", 9688, Game.BARBIE_DESTRUCTION, 142),
                            new Score("tent", 5856, Game.BARBIE_DESTRUCTION, 145),
                            new Score("bank", 3956, Game.BARBIE_DESTRUCTION, 51),
                            new Score("navy", 5693, Game.BARBIE_DESTRUCTION, 116),
                            new Score("loss", 3120, Game.BARBIE_DESTRUCTION, 188),
                            new Score("beef", 27231, Game.BARBIE_DESTRUCTION, 191),
                            new Score("stun", 5762, Game.BARBIE_DESTRUCTION, 98),
                            new Score("text", 9570, Game.BARBIE_DESTRUCTION, 50),
                            new Score("sick", 9010, Game.BARBIE_DESTRUCTION, 116),
                            new Score("mood", 27231, Game.BARBIE_DESTRUCTION, 54),
                            new Score("plug", 6492, Game.BARBIE_DESTRUCTION, 99),
                            new Score("tape", 8793, Game.MARIO, 64),
                            new Score("crop", 6986, Game.MARIO, 61),
                            new Score("bean", 2409, Game.MARIO, 157),
                            new Score("moon", 5297, Game.MARIO, 191),
                            new Score("raid", 5986, Game.MARIO, 154),
                            new Score("glue", 6589, Game.MARIO, 92),
                            new Score("real", 4206, Game.MARIO, 106),
                            new Score("core", 1030, Game.MARIO, 131),
                            new Score("ball", 4309, Game.MARIO, 151),
                            new Score("fold", 6756, Game.MARIO, 71),
                            new Score("arch", 8634, Game.MARIO, 144),
                            new Score("love", 7185, Game.MARIO, 133),
                            new Score("cute", 1238, Game.MARIO, 168),
                            new Score("blow", 6309, Game.MARIO, 110),
                            new Score("wolf", 2170, Game.MARIO, 187),
                            new Score("hide", 1917, Game.MARIO, 130),
                            new Score("coup", 2387, Game.MARIO, 70),
                            new Score("work", 1175, Game.MARIO, 189),
                            new Score("zero", 504, Game.MARIO, 71),
                            new Score("poem", 7333, Game.MARIO, 50),
                            new Score("bulb", 8071, Game.MYLITTLEPONY, 115),
                            new Score("pain", 2149, Game.MYLITTLEPONY, 172),
                            new Score("trap", 8123, Game.MYLITTLEPONY, 58),
                            new Score("boat", 5292, Game.MARIO, 180),
                            new Score("salt", 176, Game.MARIO, 84),
                            new Score("sofa", 6562, Game.MARIO, 73),
                            new Score("wire", 9367, Game.TETRIS, 140),
                            new Score("club", 261, Game.TETRIS, 60),
                            new Score("news", 3051, Game.TETRIS, 162),
                            new Score("rear", 3409, Game.TETRIS, 163),
                            new Score("hook", 6270, Game.TETRIS, 66),
                            new Score("user", 828, Game.TETRIS, 131),
                            new Score("vein", 7665, Game.TETRIS, 162),
                            new Score("face", 3628, Game.TETRIS, 115),
                            new Score("ring", 3918, Game.TETRIS, 68),
                            new Score("tell", 3994, Game.TETRIS, 162),
                            new Score("push", 1092, Game.TETRIS, 180),
                            new Score("thaw", 8074, Game.TETRIS, 186),
                            new Score("spit", 1694, Game.TETRIS, 97),
                            new Score("iron", 8732, Game.TETRIS, 147),
                            new Score("easy", 5207, Game.TETRIS, 58),
                            new Score("shot", 1925, Game.TETRIS, 170),
                            new Score("role", 2708, Game.TETRIS, 166),
                            new Score("dump", 694, Game.TETRIS, 183),
                            new Score("rank", 3026, Game.TETRIS, 164),
                            new Score("late", 9599, Game.MARIO, 53),
                            new Score("just", 8274, Game.MARIO, 128),
                            new Score("post", 5554, Game.MARIO, 106),
                            new Score("idea", 149, Game.MARIO, 156),
                            new Score("TRUE", 4368, Game.MARIO, 106),
                            new Score("exit", 730, Game.MARIO, 56),
                            new Score("quit", 600, Game.MARIO, 96),
                            new Score("rage", 4556, Game.MARIO, 163),
                            new Score("firm", 4860, Game.MARIO, 176),
                            new Score("diet", 121, Game.MARIO, 134),
                            new Score("hate", 1166, Game.MARIO, 183),
                            new Score("pile", 1359, Game.MARIO, 161),
                            new Score("kill", 8907, Game.MARIO, 124),
                            new Score("maid", 8494, Game.MARIO, 105),
                            new Score("seed", 6113, Game.MARIO, 183),
                            new Score("bear", 1259, Game.MARIO, 199),
                            new Score("disk", 4300, Game.MARIO, 152),
                            new Score("good", 139, Game.MARIO, 160),
                            new Score("taxi", 6232, Game.MARIO, 149),
                            new Score("rent", 1534, Game.MARIO, 83),
                            new Score("fund", 2559, Game.MARIO, 97),
                            new Score("lock", 3935, Game.MARIO, 121),
                            new Score("note", 4801, Game.MARIO_KART, 190),
                            new Score("slip", 5746, Game.MARIO_KART, 115),
                            new Score("neck", 8867, Game.MARIO_KART, 85),
                            new Score("band", 9669, Game.MARIO_KART, 67),
                            new Score("mind", 4352, Game.MARIO_KART, 173),
                            new Score("goat", 2448, Game.MARIO_KART, 103),
                            new Score("able", 8298, Game.MARIO_KART, 190),
                            new Score("calf", 1961, Game.MARIO_KART, 84),
                            new Score("meal", 9351, Game.MARIO_KART, 66),
                            new Score("ward", 2092, Game.MARIO_KART, 92),
                            new Score("unit", 354, Game.MARIO_KART, 170),
                            new Score("bind", 9170, Game.MARIO_KART, 90),
                            new Score("find", 2259, Game.MARIO_KART, 50),
                            new Score("pour", 2425, Game.MARIO_KART, 74),
                            new Score("hike", 8660, Game.MARIO_KART, 81),
                            new Score("mass", 6411, Game.MARIO_KART, 69),
                            new Score("bury", 8752, Game.MARIO_KART, 87),
                            new Score("talk", 5637, Game.MARIO_KART, 67),
                            new Score("aunt", 5817, Game.MARIO_KART, 141),
                            new Score("cafe", 4342, Game.MARIO_KART, 172),
                            new Score("fare", 9317, Game.MARIO, 69),
                            new Score("walk", 2183, Game.MARIO, 155),
                            new Score("fuss", 50, Game.MARIO, 158),
                            new Score("hell", 223, Game.MARIO, 169),
                            new Score("drug", 1241, Game.MARIO, 116),
                            new Score("time", 1968, Game.MARIO, 146),
                            new Score("roof", 6834, Game.MARIO, 137),
                            new Score("site", 9023, Game.MARIO, 71),
                            new Score("huge", 2436, Game.MARIO, 176),
                            new Score("soar", 8201, Game.MARIO, 168),
                            new Score("slam", 4113, Game.MARIO, 87),
                            new Score("show", 45, Game.MARIO, 176),
                            new Score("herb", 1246, Game.MARIO, 136),
                            new Score("gene", 5594, Game.MARIO, 63),
                            new Score("lack", 2848, Game.MARIO, 168),
                            new Score("lung", 7383, Game.MARIO, 143),
                            new Score("fast", 3930, Game.MARIO, 148),
                            new Score("belt", 4125, Game.MARIO, 149),
                            new Score("dive", 2075, Game.MARIO, 74),
                            new Score("tile", 191, Game.MARIO, 183),
                            new Score("gear", 5890, Game.MARIO, 108),
                            new Score("give", 4256, Game.MARIO, 51),
                            new Score("well", 9254, Game.BARBIE_DESTRUCTION, 160),
                            new Score("damn", 4915, Game.BARBIE_DESTRUCTION, 133),
                            new Score("toss", 7834, Game.BARBIE_DESTRUCTION, 97),
                            new Score("soak", 9236, Game.BARBIE_DESTRUCTION, 188),
                            new Score("star", 4378, Game.BARBIE_DESTRUCTION, 75),
                            new Score("form", 7543, Game.BARBIE_DESTRUCTION, 84),
                            new Score("zone", 1536, Game.BARBIE_DESTRUCTION, 69),
                            new Score("bill", 5242, Game.BARBIE_DESTRUCTION, 96),
                            new Score("duty", 7056, Game.BARBIE_DESTRUCTION, 167),
                            new Score("rise", 4904, Game.BARBIE_DESTRUCTION, 90),
                            new Score("left", 2209, Game.BARBIE_DESTRUCTION, 93),
                            new Score("even", 8907, Game.BARBIE_DESTRUCTION, 199),
                            new Score("heir", 1565, Game.BARBIE_DESTRUCTION, 115),
                            new Score("nest", 6248, Game.BARBIE_DESTRUCTION, 194),
                            new Score("army", 27231, Game.BARBIE_DESTRUCTION, 123),
                            new Score("flow", 8176, Game.BARBIE_DESTRUCTION, 185),
                            new Score("weed", 9291, Game.BARBIE_DESTRUCTION, 57),
                            new Score("help", 7083, Game.BARBIE_DESTRUCTION, 101),
                            new Score("fall", 7462, Game.BARBIE_DESTRUCTION, 138),
                            new Score("whip", 6949, Game.BARBIE_DESTRUCTION, 195),
                            new Score("joke", 834, Game.MARIO, 169),
                            new Score("drop", 8232, Game.MARIO, 125),
                            new Score("sock", 9149, Game.MARIO, 110),
                            new Score("lend", 8930, Game.MARIO, 91),
                            new Score("term", 9018, Game.MARIO, 166),
                            new Score("dull", 3683, Game.MARIO, 172),
                            new Score("file", 7163, Game.MARIO, 136),
                            new Score("myth", 8956, Game.SIMS, 70),
                            new Score("side", 4540, Game.SIMS, 105),
                            new Score("load", 341, Game.SIMS, 78),
                            new Score("gain", 642, Game.SIMS, 77),
                            new Score("mess", 7615, Game.SIMS, 196),
                            new Score("line", 5003, Game.SIMS, 89),
                            new Score("stir", 3277, Game.SIMS, 78),
                            new Score("hard", 2663, Game.SIMS, 105),
                            new Score("drag", 705, Game.SIMS, 56),
                            new Score("pray", 5337, Game.SIMS, 60),
                            new Score("corn", 4354, Game.SIMS, 153),
                            new Score("feed", 875, Game.SIMS, 166),
                            new Score("link", 6055, Game.SIMS, 178),
                            new Score("wall", 8338, Game.SIMS, 59),
                            new Score("sand", 2439, Game.SIMS, 73),
                            new Score("hill", 1912, Game.SIMS, 89),
                            new Score("veil", 9707, Game.SIMS, 78),
                            new Score("sale", 9757, Game.SIMS, 162),
                            new Score("seat", 6138, Game.SIMS, 176),
                            new Score("rung", 6793, Game.MARIO, 182),
                            new Score("cake", 5194, Game.MARIO, 168),
                            new Score("pure", 6233, Game.MARIO, 107),
                            new Score("pump", 2775, Game.MARIO, 163),
                            new Score("cold", 5149, Game.MARIO, 98),
                            new Score("stab", 352, Game.MARIO, 115),
                            new Score("lion", 4993, Game.MARIO, 124),
                            new Score("swim", 2681, Game.MARIO, 134),
                            new Score("list", 402, Game.MARIO, 89),
                            new Score("test", 40, Game.MARIO, 152),
                            new Score("grow", 7974, Game.MARIO, 99),
                            new Score("area", 3307, Game.MARIO, 165),
                            new Score("fate", 7059, Game.MARIO, 170),
                            new Score("camp", 5576, Game.MARIO, 149),
                            new Score("need", 4073, Game.MARIO, 123),
                            new Score("team", 4606, Game.MARIO, 137),
                            new Score("tray", 5261, Game.MARIO, 143),
                            new Score("knot", 4193, Game.MARIO, 51),
                            new Score("like", 5547, Game.MARIO, 175),
                            new Score("seem", 9471, Game.MARIO, 103),
                            new Score("plan", 5175, Game.MARIO, 64),
                            new Score("seal", 2827, Game.MARIO, 64),
                            new Score("fork", 551, Game.MARIO, 138),
                            new Score("pick", 5510, Game.MARIO, 121),
                            new Score("shop", 1548, Game.MARIO, 172),
                            new Score("take", 5277, Game.TETRIS, 71),
                            new Score("fool", 5576, Game.TETRIS, 119),
                            new Score("cope", 4042, Game.TETRIS, 134),
                            new Score("crew", 6400, Game.TETRIS, 143),
                            new Score("fear", 2062, Game.TETRIS, 92),
                            new Score("weak", 9410, Game.TETRIS, 158),
                            new Score("lose", 1952, Game.TETRIS, 89),
                            new Score("hang", 8438, Game.TETRIS, 173),
                            new Score("lane", 5324, Game.TETRIS, 195),
                            new Score("care", 4122, Game.TETRIS, 55),
                            new Score("pair", 9620, Game.TETRIS, 120),
                            new Score("deck", 3531, Game.TETRIS, 200),
                            new Score("park", 1287, Game.TETRIS, 87),
                            new Score("eaux", 5067, Game.TETRIS, 154),
                            new Score("live", 4327, Game.TETRIS, 108),
                            new Score("dose", 3473, Game.TETRIS, 176),
                            new Score("boom", 4330, Game.TETRIS, 135),
                            new Score("week", 4091, Game.TETRIS, 81),
                            new Score("meet", 1338, Game.TETRIS, 120),
                            new Score("pawn", 2017, Game.MARIO, 196),
                            new Score("tank", 1274, Game.MARIO, 79),
                            new Score("loop", 6766, Game.MARIO, 187),
                            new Score("bird", 6897, Game.MARIO, 103),
                            new Score("save", 7736, Game.MARIO, 117),
                            new Score("coma", 4691, Game.MARIO, 162),
                            new Score("bite", 4851, Game.MARIO, 182),
                            new Score("boot", 6113, Game.MARIO, 196),
                            new Score("oral", 410, Game.MARIO, 169),
                            new Score("item", 8393, Game.MARIO, 78),
                            new Score("horn", 2310, Game.MARIO, 176),
                            new Score("wage", 4799, Game.MARIO, 147),
                            new Score("book", 8044, Game.MARIO, 161),
                            new Score("head", 3689, Game.MARIO_KART, 66),
                            new Score("wing", 9403, Game.MARIO_KART, 165),
                            new Score("nose", 1418, Game.MARIO_KART, 129),
                            new Score("west", 2068, Game.MARIO_KART, 105),
                            new Score("swop", 4279, Game.MARIO_KART, 152),
                            new Score("burn", 6205, Game.MARIO_KART, 98),
                            new Score("knit", 4690, Game.MARIO_KART, 132),
                            new Score("chop", 1885, Game.MARIO_KART, 64),
                            new Score("rest", 2078, Game.MARIO_KART, 129),
                            new Score("vote", 8919, Game.MARIO_KART, 190),
                            new Score("ruin", 603, Game.MARIO_KART, 92),
                            new Score("loot", 9126, Game.MARIO_KART, 186),
                            new Score("acid", 9730, Game.MARIO_KART, 93),
                            new Score("halt", 5011, Game.MARIO_KART, 132),
                            new Score("twin", 8143, Game.MARIO_KART, 125),
                            new Score("peak", 774, Game.MARIO_KART, 63),
                            new Score("rape", 9298, Game.MARIO_KART, 93),
                            new Score("coat", 243, Game.MARIO_KART, 112),
                            new Score("fill", 6227, Game.MARIO_KART, 192),
                            new Score("ally", 3797, Game.MARIO, 195),
                            new Score("calm", 9212, Game.MARIO, 83),
                            new Score("slab", 5675, Game.MARIO, 78),
                            new Score("frog", 8656, Game.MARIO, 199),
                            new Score("flag", 8614, Game.MARIO, 89),
                            new Score("clay", 3186, Game.MARIO, 68),
                            new Score("long", 6614, Game.MARIO, 73),
                            new Score("heal", 6135, Game.MARIO, 156),
                            new Score("skip", 2137, Game.MARIO, 109),
                            new Score("bold", 6010, Game.MARIO, 116),
                            new Score("beer", 6693, Game.MARIO, 152),
                            new Score("coin", 7767, Game.MARIO, 54),
                            new Score("date", 9369, Game.MARIO, 104),
                            new Score("clue", 4016, Game.MARIO, 113),
                            new Score("fail", 3380, Game.MARIO, 186),
                            new Score("beam", 3976, Game.MARIO, 178),
                            new Score("roar", 2673, Game.MARIO, 161),
                            new Score("tool", 9153, Game.MARIO, 161),
                            new Score("bond", 1832, Game.MARIO, 154),
                            new Score("snow", 8314, Game.SNAKE, 117),
                            new Score("drum", 3205, Game.SNAKE, 92),
                            new Score("full", 2658, Game.SNAKE, 92),
                            new Score("word", 700, Game.SNAKE, 186),
                            new Score("turn", 2234, Game.SNAKE, 142),
                            new Score("heat", 8646, Game.SNAKE, 140),
                            new Score("chew", 6335, Game.SNAKE, 88),
                            new Score("knee", 6469, Game.SNAKE, 158),
                            new Score("look", 1665, Game.SNAKE, 156),
                            new Score("echo", 2175, Game.SNAKE, 150),
                            new Score("gift", 310, Game.SNAKE, 105),
                            new Score("deny", 4346, Game.SNAKE, 113),
                            new Score("mask", 5479, Game.SNAKE, 168),
                            new Score("half", 9171, Game.SNAKE, 124),
                            new Score("wild", 7029, Game.SNAKE, 184),
                            new Score("dark", 6404, Game.SNAKE, 76),
                            new Score("part", 2853, Game.SNAKE, 116),
                            new Score("lake", 7875, Game.SNAKE, 162),
                            new Score("deer", 3684, Game.SNAKE, 75)
                    )),
                    new Arcade("0x05", "Sopot", 5092318, Arrays.asList(
                            new Score("oven", 3658, Game.MARIO, 194),
                            new Score("knit", 760, Game.MARIO, 133),
                            new Score("heir", 9146, Game.BARBIE_DESTRUCTION, 195),
                            new Score("cook", 2986, Game.BARBIE_DESTRUCTION, 170),
                            new Score("heal", 5311, Game.BARBIE_DESTRUCTION, 126),
                            new Score("curl", 1312, Game.BARBIE_DESTRUCTION, 156),
                            new Score("term", 245, Game.BARBIE_DESTRUCTION, 146),
                            new Score("site", 8435, Game.BARBIE_DESTRUCTION, 147),
                            new Score("silk", 8598, Game.BARBIE_DESTRUCTION, 103),
                            new Score("role", 4541, Game.BARBIE_DESTRUCTION, 153),
                            new Score("push", 8786, Game.BARBIE_DESTRUCTION, 128),
                            new Score("lock", 9982, Game.BARBIE_DESTRUCTION, 72),
                            new Score("sell", 3588, Game.BARBIE_DESTRUCTION, 54),
                            new Score("bear", 7426, Game.BARBIE_DESTRUCTION, 148),
                            new Score("make", 9548, Game.BARBIE_DESTRUCTION, 135),
                            new Score("riot", 5377, Game.BARBIE_DESTRUCTION, 159),
                            new Score("even", 7766, Game.BARBIE_DESTRUCTION, 155),
                            new Score("bomb", 1125, Game.BARBIE_DESTRUCTION, 192),
                            new Score("jest", 4233, Game.BARBIE_DESTRUCTION, 108),
                            new Score("chew", 9173, Game.BARBIE_DESTRUCTION, 99),
                            new Score("neck", 8342, Game.BARBIE_DESTRUCTION, 117),
                            new Score("navy", 4031, Game.BARBIE_DESTRUCTION, 167),
                            new Score("free", 8579, Game.BARBIE_DESTRUCTION, 196),
                            new Score("bond", 7291, Game.BARBIE_DESTRUCTION, 110),
                            new Score("seem", 5344, Game.BARBIE_DESTRUCTION, 96),
                            new Score("bush", 3835, Game.BARBIE_DESTRUCTION, 143),
                            new Score("take", 2970, Game.BARBIE_DESTRUCTION, 153),
                            new Score("deal", 4299, Game.BARBIE_DESTRUCTION, 148),
                            new Score("loop", 8830, Game.BARBIE_DESTRUCTION, 185),
                            new Score("size", 2346, Game.BARBIE_DESTRUCTION, 95),
                            new Score("tone", 662, Game.BARBIE_DESTRUCTION, 59),
                            new Score("high", 6264, Game.BARBIE_DESTRUCTION, 176),
                            new Score("rage", 644, Game.BARBIE_DESTRUCTION, 97),
                            new Score("wind", 670, Game.BARBIE_DESTRUCTION, 185),
                            new Score("rung", 8456, Game.BARBIE_DESTRUCTION, 79),
                            new Score("wife", 7749, Game.BARBIE_DESTRUCTION, 53),
                            new Score("loud", 2101, Game.BARBIE_DESTRUCTION, 54),
                            new Score("book", 5246, Game.BARBIE_DESTRUCTION, 186),
                            new Score("jury", 7543, Game.BARBIE_DESTRUCTION, 105),
                            new Score("self", 63, Game.BARBIE_DESTRUCTION, 192),
                            new Score("pony", 1633, Game.BARBIE_DESTRUCTION, 161),
                            new Score("nose", 8792, Game.BARBIE_DESTRUCTION, 175),
                            new Score("plug", 3860, Game.MARIO, 185),
                            new Score("baby", 9249, Game.MARIO, 61),
                            new Score("coma", 8654, Game.MARIO, 166),
                            new Score("rack", 1480, Game.SNAKE, 58),
                            new Score("gift", 1701, Game.SNAKE, 67),
                            new Score("orgy", 521, Game.SNAKE, 193),
                            new Score("lily", 717, Game.SNAKE, 61),
                            new Score("bake", 7797, Game.SNAKE, 122),
                            new Score("case", 6738, Game.SNAKE, 117),
                            new Score("cafe", 8338, Game.SNAKE, 109),
                            new Score("sail", 2677, Game.SNAKE, 107),
                            new Score("bend", 6176, Game.SNAKE, 136),
                            new Score("pipe", 9749, Game.SNAKE, 61),
                            new Score("form", 5142, Game.SNAKE, 61),
                            new Score("base", 5326, Game.SNAKE, 153),
                            new Score("post", 7575, Game.SNAKE, 176),
                            new Score("hall", 7338, Game.SNAKE, 119),
                            new Score("pool", 5637, Game.SNAKE, 101),
                            new Score("joke", 3394, Game.SNAKE, 187),
                            new Score("open", 1532, Game.SNAKE, 62),
                            new Score("copy", 8942, Game.SNAKE, 53),
                            new Score("kill", 1943, Game.SNAKE, 71),
                            new Score("girl", 7391, Game.SNAKE, 159),
                            new Score("bolt", 3620, Game.SNAKE, 140),
                            new Score("fast", 2021, Game.SNAKE, 168),
                            new Score("meat", 2788, Game.SNAKE, 53),
                            new Score("inch", 9456, Game.SNAKE, 146),
                            new Score("bill", 2072, Game.SNAKE, 78),
                            new Score("rare", 5741, Game.SNAKE, 99),
                            new Score("seat", 8197, Game.SNAKE, 150),
                            new Score("coal", 1162, Game.SNAKE, 164),
                            new Score("turn", 4434, Game.SNAKE, 185),
                            new Score("cart", 5498, Game.SNAKE, 178),
                            new Score("food", 8381, Game.SNAKE, 79),
                            new Score("heat", 5835, Game.SNAKE, 187),
                            new Score("work", 1822, Game.SNAKE, 153),
                            new Score("snow", 3431, Game.SNAKE, 153),
                            new Score("side", 1084, Game.SNAKE, 113),
                            new Score("sock", 8234, Game.SNAKE, 191),
                            new Score("poor", 9506, Game.SNAKE, 60),
                            new Score("half", 5951, Game.SNAKE, 109),
                            new Score("herb", 8996, Game.SNAKE, 126),
                            new Score("idea", 5801, Game.SNAKE, 184),
                            new Score("rise", 5868, Game.MARIO, 58),
                            new Score("gasp", 930, Game.MARIO, 88),
                            new Score("slam", 7028, Game.MARIO, 191),
                            new Score("dose", 4925, Game.MARIO, 144),
                            new Score("road", 1130, Game.MARIO, 189),
                            new Score("tidy", 1562, Game.MARIO, 165),
                            new Score("hold", 4509, Game.MARIO, 159),
                            new Score("park", 2501, Game.MARIO, 51),
                            new Score("king", 894, Game.PINBALL, 193),
                            new Score("burn", 506, Game.PINBALL, 55),
                            new Score("tool", 9691, Game.PINBALL, 85),
                            new Score("band", 9935, Game.PINBALL, 123),
                            new Score("rest", 6924, Game.PINBALL, 191),
                            new Score("maid", 8085, Game.PINBALL, 178),
                            new Score("core", 9208, Game.PINBALL, 178),
                            new Score("goal", 8762, Game.PINBALL, 159),
                            new Score("roll", 1422, Game.PINBALL, 170),
                            new Score("zone", 6510, Game.PINBALL, 129),
                            new Score("mild", 6471, Game.PINBALL, 136),
                            new Score("wild", 150, Game.PINBALL, 136),
                            new Score("ward", 5246, Game.PINBALL, 192),
                            new Score("harm", 847, Game.PINBALL, 164),
                            new Score("rape", 7683, Game.PINBALL, 104),
                            new Score("deck", 7068, Game.PINBALL, 174),
                            new Score("left", 8147, Game.PINBALL, 106),
                            new Score("hurt", 579, Game.PINBALL, 187),
                            new Score("fund", 2221, Game.PINBALL, 178),
                            new Score("step", 711, Game.PINBALL, 119),
                            new Score("mood", 6026, Game.PINBALL, 149),
                            new Score("test", 3680, Game.PINBALL, 162),
                            new Score("bait", 3372, Game.PINBALL, 124),
                            new Score("cast", 8142, Game.PINBALL, 76),
                            new Score("knee", 8575, Game.PINBALL, 67),
                            new Score("give", 9263, Game.PINBALL, 113),
                            new Score("lump", 9482, Game.PINBALL, 143),
                            new Score("tail", 6644, Game.PINBALL, 114),
                            new Score("solo", 9805, Game.PINBALL, 151),
                            new Score("wake", 8846, Game.PINBALL, 175),
                            new Score("well", 7481, Game.PINBALL, 74),
                            new Score("cage", 8215, Game.PINBALL, 178),
                            new Score("drag", 1426, Game.PINBALL, 138),
                            new Score("wait", 406, Game.PINBALL, 130),
                            new Score("part", 827, Game.PINBALL, 172),
                            new Score("meal", 2090, Game.PINBALL, 150),
                            new Score("slap", 3860, Game.PINBALL, 83),
                            new Score("skin", 8093, Game.PINBALL, 54),
                            new Score("fair", 9281, Game.PINBALL, 158),
                            new Score("sofa", 9787, Game.PINBALL, 74),
                            new Score("weak", 132, Game.MARIO, 77),
                            new Score("need", 219, Game.MARIO, 66),
                            new Score("wolf", 4599, Game.MARIO, 137),
                            new Score("call", 3400, Game.MARIO, 70),
                            new Score("spin", 7115, Game.MARIO, 85),
                            new Score("urge", 507, Game.MARIO, 111),
                            new Score("arch", 2025, Game.MARIO, 151),
                            new Score("easy", 8755, Game.MARIO, 82),
                            new Score("gold", 4329, Game.MARIO, 176),
                            new Score("tear", 9605, Game.MARIO, 183),
                            new Score("boat", 1044, Game.MORTAL_COMBAT, 127),
                            new Score("doll", 8370, Game.MORTAL_COMBAT, 145),
                            new Score("mist", 5991, Game.MORTAL_COMBAT, 163),
                            new Score("chip", 1088, Game.MORTAL_COMBAT, 186),
                            new Score("tape", 7199, Game.MORTAL_COMBAT, 120),
                            new Score("glow", 6948, Game.MORTAL_COMBAT, 152),
                            new Score("rain", 8091, Game.MORTAL_COMBAT, 54),
                            new Score("fare", 8672, Game.MORTAL_COMBAT, 168),
                            new Score("city", 5534, Game.MORTAL_COMBAT, 92),
                            new Score("sink", 2780, Game.MORTAL_COMBAT, 56),
                            new Score("will", 1810, Game.MORTAL_COMBAT, 122),
                            new Score("crew", 6943, Game.MORTAL_COMBAT, 157),
                            new Score("worm", 6279, Game.MORTAL_COMBAT, 139),
                            new Score("mask", 5679, Game.MORTAL_COMBAT, 168),
                            new Score("brag", 5261, Game.MORTAL_COMBAT, 96),
                            new Score("bind", 899, Game.MORTAL_COMBAT, 81),
                            new Score("snub", 7363, Game.MORTAL_COMBAT, 192),
                            new Score("hate", 8083, Game.MORTAL_COMBAT, 100),
                            new Score("fall", 2812, Game.MORTAL_COMBAT, 89),
                            new Score("poem", 1644, Game.MORTAL_COMBAT, 175),
                            new Score("pier", 5929, Game.MORTAL_COMBAT, 169),
                            new Score("like", 6853, Game.MORTAL_COMBAT, 152),
                            new Score("help", 8548, Game.MORTAL_COMBAT, 125),
                            new Score("sign", 5342, Game.MORTAL_COMBAT, 189),
                            new Score("nail", 9516, Game.MORTAL_COMBAT, 145),
                            new Score("clay", 9867, Game.MORTAL_COMBAT, 51),
                            new Score("time", 6959, Game.MORTAL_COMBAT, 191),
                            new Score("pile", 9428, Game.MORTAL_COMBAT, 193),
                            new Score("slab", 7159, Game.MORTAL_COMBAT, 137),
                            new Score("mass", 5964, Game.MORTAL_COMBAT, 93),
                            new Score("rate", 2140, Game.MORTAL_COMBAT, 134),
                            new Score("cord", 8660, Game.MORTAL_COMBAT, 177),
                            new Score("fist", 8668, Game.MORTAL_COMBAT, 160),
                            new Score("hour", 8806, Game.MORTAL_COMBAT, 188),
                            new Score("tile", 7934, Game.MORTAL_COMBAT, 123),
                            new Score("oral", 8152, Game.MORTAL_COMBAT, 127),
                            new Score("lost", 4139, Game.MORTAL_COMBAT, 115),
                            new Score("stay", 6783, Game.MORTAL_COMBAT, 112),
                            new Score("stun", 2655, Game.MORTAL_COMBAT, 129),
                            new Score("bird", 2401, Game.MORTAL_COMBAT, 90),
                            new Score("wall", 7086, Game.MARIO, 172),
                            new Score("weed", 449, Game.MARIO, 197),
                            new Score("loss", 3081, Game.MYLITTLEPONY, 192),
                            new Score("risk", 7670, Game.MYLITTLEPONY, 186),
                            new Score("lick", 6009, Game.MYLITTLEPONY, 181),
                            new Score("pack", 4608, Game.MYLITTLEPONY, 71),
                            new Score("move", 8885, Game.MYLITTLEPONY, 159),
                            new Score("halt", 1522, Game.MYLITTLEPONY, 178),
                            new Score("bold", 5101, Game.MYLITTLEPONY, 163),
                            new Score("want", 9234, Game.MYLITTLEPONY, 164),
                            new Score("peel", 3277, Game.MYLITTLEPONY, 91),
                            new Score("late", 4129, Game.MYLITTLEPONY, 191),
                            new Score("hair", 9802, Game.MYLITTLEPONY, 146),
                            new Score("disk", 7435, Game.MYLITTLEPONY, 158),
                            new Score("beat", 7728, Game.MYLITTLEPONY, 124),
                            new Score("drop", 1438, Game.MYLITTLEPONY, 138),
                            new Score("stem", 3867, Game.MYLITTLEPONY, 187),
                            new Score("soap", 5375, Game.MYLITTLEPONY, 117),
                            new Score("boot", 9597, Game.MYLITTLEPONY, 159),
                            new Score("root", 9615, Game.MYLITTLEPONY, 188),
                            new Score("name", 2183, Game.MYLITTLEPONY, 141),
                            new Score("cave", 781, Game.MYLITTLEPONY, 76),
                            new Score("nest", 6783, Game.MYLITTLEPONY, 86),
                            new Score("cute", 6225, Game.MYLITTLEPONY, 71),
                            new Score("full", 1962, Game.MYLITTLEPONY, 73),
                            new Score("dull", 2696, Game.MYLITTLEPONY, 148),
                            new Score("drug", 8602, Game.MYLITTLEPONY, 197),
                            new Score("yard", 6314, Game.MYLITTLEPONY, 93),
                            new Score("wine", 319, Game.MYLITTLEPONY, 143),
                            new Score("shot", 7662, Game.MYLITTLEPONY, 62),
                            new Score("host", 8449, Game.MYLITTLEPONY, 134),
                            new Score("shop", 9539, Game.MYLITTLEPONY, 81),
                            new Score("head", 9118, Game.MYLITTLEPONY, 98),
                            new Score("ruin", 4123, Game.MYLITTLEPONY, 112),
                            new Score("wire", 2674, Game.MYLITTLEPONY, 86),
                            new Score("just", 765, Game.MYLITTLEPONY, 157),
                            new Score("sour", 55, Game.MYLITTLEPONY, 198),
                            new Score("swim", 7900, Game.MYLITTLEPONY, 100),
                            new Score("rule", 1751, Game.MYLITTLEPONY, 89),
                            new Score("lace", 8089, Game.MYLITTLEPONY, 116),
                            new Score("fail", 4334, Game.MYLITTLEPONY, 158),
                            new Score("rice", 9308, Game.MYLITTLEPONY, 177),
                            new Score("card", 7123, Game.SIMS, 187),
                            new Score("bell", 7934, Game.SIMS, 184),
                            new Score("plot", 5195, Game.SIMS, 157),
                            new Score("pour", 8315, Game.SIMS, 94),
                            new Score("tire", 6587, Game.SIMS, 121),
                            new Score("save", 6180, Game.SIMS, 79),
                            new Score("belt", 7340, Game.SIMS, 158),
                            new Score("pest", 5553, Game.SIMS, 92),
                            new Score("real", 7762, Game.SIMS, 136),
                            new Score("pass", 8768, Game.SIMS, 59),
                            new Score("wave", 7832, Game.SIMS, 130),
                            new Score("sale", 1422, Game.SIMS, 78),
                            new Score("date", 7150, Game.SIMS, 135),
                            new Score("echo", 3252, Game.SIMS, 111),
                            new Score("tell", 6226, Game.SIMS, 65),
                            new Score("pure", 1063, Game.SIMS, 117),
                            new Score("read", 6884, Game.SIMS, 193),
                            new Score("hang", 5923, Game.SIMS, 200),
                            new Score("raid", 7811, Game.SIMS, 165),
                            new Score("hero", 8170, Game.SIMS, 184),
                            new Score("play", 1887, Game.SIMS, 194),
                            new Score("ride", 9722, Game.SIMS, 108),
                            new Score("unit", 6661, Game.SIMS, 86),
                            new Score("miss", 9482, Game.SIMS, 101),
                            new Score("pier", 2069, Game.SIMS, 90),
                            new Score("swop", 6490, Game.SIMS, 165),
                            new Score("dead", 644, Game.SIMS, 178),
                            new Score("bulb", 1444, Game.SIMS, 107),
                            new Score("vein", 7204, Game.SIMS, 146),
                            new Score("pair", 932, Game.SIMS, 61),
                            new Score("thin", 4245, Game.SIMS, 141),
                            new Score("file", 335, Game.SIMS, 144),
                            new Score("mole", 6151, Game.SIMS, 78),
                            new Score("twin", 4097, Game.SIMS, 188),
                            new Score("vain", 5239, Game.SIMS, 61),
                            new Score("scan", 8510, Game.SIMS, 116),
                            new Score("huge", 8628, Game.SIMS, 181),
                            new Score("camp", 507, Game.SIMS, 163),
                            new Score("fuss", 3922, Game.SIMS, 63),
                            new Score("seal", 2056, Game.SIMS, 84),
                            new Score("crop", 3053, Game.MARIO, 57),
                            new Score("soup", 2414, Game.MARIO, 182),
                            new Score("hope", 2062, Game.MARIO, 151),
                            new Score("coup", 1839, Game.MARIO, 124),
                            new Score("code", 2576, Game.MARIO, 150),
                            new Score("TRUE", 6213, Game.MARIO, 51),
                            new Score("jail", 2792, Game.MARIO, 137),
                            new Score("gate", 7801, Game.MARIO, 94),
                            new Score("glue", 1202, Game.TETRIS, 189),
                            new Score("load", 5741, Game.TETRIS, 59),
                            new Score("taxi", 3290, Game.TETRIS, 198),
                            new Score("rent", 6999, Game.TETRIS, 58),
                            new Score("sand", 6840, Game.TETRIS, 158),
                            new Score("tune", 8261, Game.TETRIS, 80),
                            new Score("pawn", 2855, Game.TETRIS, 83),
                            new Score("hear", 7897, Game.TETRIS, 176),
                            new Score("golf", 5598, Game.TETRIS, 163),
                            new Score("snap", 76, Game.TETRIS, 132),
                            new Score("tank", 5051, Game.TETRIS, 114),
                            new Score("pity", 9678, Game.TETRIS, 129),
                            new Score("myth", 331, Game.TETRIS, 151),
                            new Score("dive", 5625, Game.TETRIS, 52),
                            new Score("leaf", 772, Game.TETRIS, 125),
                            new Score("keep", 2698, Game.TETRIS, 62),
                            new Score("duck", 1888, Game.TETRIS, 72),
                            new Score("hole", 3993, Game.TETRIS, 115),
                            new Score("lack", 8866, Game.TETRIS, 65),
                            new Score("lamb", 7060, Game.TETRIS, 85),
                            new Score("fill", 8699, Game.MARIO, 157),
                            new Score("pain", 2264, Game.MARIO, 63),
                            new Score("beam", 1160, Game.MARIO, 140),
                            new Score("bean", 5726, Game.MARIO, 93),
                            new Score("blow", 6996, Game.MARIO, 96),
                            new Score("prey", 9982, Game.MARIO, 161),
                            new Score("mill", 2495, Game.MARIO, 110)
                    )),
                    new Arcade("0x06", "Koscierzyna", 412098412, Arrays.asList(
                            new Score("corn", 3695, Game.MARIO, 111),
                            new Score("good", 8862, Game.MARIO, 52),
                            new Score("bolt", 3220, Game.MARIO, 146),
                            new Score("tail", 2952, Game.MARIO, 63),
                            new Score("drop", 3001, Game.MARIO, 119),
                            new Score("give", 9897, Game.MARIO, 150),
                            new Score("copy", 8134, Game.MARIO, 195),
                            new Score("bend", 226, Game.PINBALL, 123),
                            new Score("bite", 2150, Game.PINBALL, 199),
                            new Score("jail", 7738, Game.PINBALL, 141),
                            new Score("navy", 8914, Game.PINBALL, 159),
                            new Score("team", 7475, Game.PINBALL, 153),
                            new Score("rock", 5144, Game.PINBALL, 187),
                            new Score("park", 4308, Game.PINBALL, 127),
                            new Score("seal", 2092, Game.PINBALL, 153),
                            new Score("fame", 4455, Game.PINBALL, 188),
                            new Score("halt", 9312, Game.PINBALL, 179),
                            new Score("rate", 6291, Game.PINBALL, 167),
                            new Score("news", 3792, Game.PINBALL, 149),
                            new Score("east", 6967, Game.PINBALL, 196),
                            new Score("exit", 1107, Game.PINBALL, 164),
                            new Score("hole", 8231, Game.PINBALL, 121),
                            new Score("glow", 894, Game.PINBALL, 83),
                            new Score("dump", 198, Game.PINBALL, 118),
                            new Score("stun", 6502, Game.PINBALL, 114),
                            new Score("quit", 2825, Game.PINBALL, 119),
                            new Score("user", 5114, Game.PINBALL, 86),
                            new Score("high", 9618, Game.SNAKE, 95),
                            new Score("hair", 7038, Game.SNAKE, 63),
                            new Score("cake", 1797, Game.SNAKE, 198),
                            new Score("name", 237, Game.SNAKE, 101),
                            new Score("herd", 686, Game.SNAKE, 144),
                            new Score("jump", 811, Game.SNAKE, 187),
                            new Score("safe", 5805, Game.SNAKE, 129),
                            new Score("load", 7027, Game.SNAKE, 117),
                            new Score("city", 9553, Game.SNAKE, 100),
                            new Score("chin", 4637, Game.SNAKE, 157),
                            new Score("skin", 8720, Game.SNAKE, 77),
                            new Score("AIDS", 9348, Game.SNAKE, 150),
                            new Score("roll", 188, Game.SNAKE, 193),
                            new Score("pump", 9370, Game.SNAKE, 175),
                            new Score("want", 7873, Game.SNAKE, 74),
                            new Score("star", 7825, Game.SNAKE, 118),
                            new Score("burn", 5317, Game.SNAKE, 182),
                            new Score("game", 7002, Game.SNAKE, 61),
                            new Score("drag", 5135, Game.SNAKE, 70),
                            new Score("sell", 9238, Game.SNAKE, 173),
                            new Score("dead", 3295, Game.MARIO, 57),
                            new Score("rule", 1745, Game.MARIO, 68),
                            new Score("dash", 7139, Game.MARIO, 121),
                            new Score("walk", 3684, Game.MARIO, 198),
                            new Score("ride", 1323, Game.MARIO, 86),
                            new Score("self", 4827, Game.MARIO, 151),
                            new Score("mood", 9711, Game.MARIO, 176),
                            new Score("love", 7733, Game.MARIO, 142),
                            new Score("mill", 3193, Game.MARIO, 136),
                            new Score("sign", 4283, Game.MARIO, 185),
                            new Score("swim", 3553, Game.MARIO, 71),
                            new Score("nail", 5789, Game.MARIO, 128),
                            new Score("king", 9167, Game.MARIO, 199),
                            new Score("ruin", 4571, Game.MARIO, 175),
                            new Score("zero", 2006, Game.MARIO, 128),
                            new Score("crop", 2464, Game.MARIO, 158),
                            new Score("thin", 4681, Game.MARIO, 141),
                            new Score("draw", 654, Game.MARIO, 129),
                            new Score("card", 1405, Game.MARIO, 175),
                            new Score("pity", 8550, Game.MARIO, 112),
                            new Score("hang", 2000, Game.MARIO, 139),
                            new Score("hurl", 808, Game.MARIO, 114),
                            new Score("link", 4482, Game.MARIO, 110),
                            new Score("inch", 8872, Game.MARIO, 160),
                            new Score("gene", 4574, Game.MARIO, 160),
                            new Score("coma", 7010, Game.MARIO, 126),
                            new Score("look", 322, Game.MARIO, 77),
                            new Score("path", 9219, Game.MARIO, 180),
                            new Score("move", 6161, Game.MARIO, 57),
                            new Score("coal", 2951, Game.MARIO, 55),
                            new Score("pure", 3357, Game.MARIO, 75),
                            new Score("taxi", 4435, Game.MARIO, 172),
                            new Score("cook", 3262, Game.MARIO, 112),
                            new Score("meat", 276, Game.MARIO, 52),
                            new Score("whip", 1970, Game.MARIO, 140),
                            new Score("film", 8657, Game.MARIO, 140),
                            new Score("aunt", 584, Game.MYLITTLEPONY, 78),
                            new Score("pick", 4283, Game.MYLITTLEPONY, 170),
                            new Score("wear", 1278, Game.MYLITTLEPONY, 135),
                            new Score("date", 9160, Game.MYLITTLEPONY, 63),
                            new Score("roof", 5135, Game.MYLITTLEPONY, 104),
                            new Score("node", 633, Game.MYLITTLEPONY, 50),
                            new Score("cage", 3056, Game.MYLITTLEPONY, 185),
                            new Score("myth", 5663, Game.MYLITTLEPONY, 51),
                            new Score("lock", 8433, Game.MYLITTLEPONY, 160),
                            new Score("bang", 8545, Game.MYLITTLEPONY, 143),
                            new Score("fast", 5144, Game.MYLITTLEPONY, 96),
                            new Score("dark", 2377, Game.MYLITTLEPONY, 189),
                            new Score("cold", 3703, Game.MYLITTLEPONY, 66),
                            new Score("lung", 7867, Game.MYLITTLEPONY, 150),
                            new Score("slap", 8325, Game.MYLITTLEPONY, 161),
                            new Score("weed", 7862, Game.MYLITTLEPONY, 191),
                            new Score("soft", 4697, Game.MYLITTLEPONY, 153),
                            new Score("sink", 1695, Game.MYLITTLEPONY, 84),
                            new Score("tile", 1220, Game.MYLITTLEPONY, 53),
                            new Score("unit", 5660, Game.MYLITTLEPONY, 184),
                            new Score("play", 6652, Game.MARIO, 135),
                            new Score("wrap", 3632, Game.MARIO, 168),
                            new Score("deep", 357, Game.MARIO, 107),
                            new Score("fist", 4442, Game.SIMS, 155),
                            new Score("pier", 6252, Game.SIMS, 192),
                            new Score("step", 8509, Game.SIMS, 174),
                            new Score("norm", 7427, Game.SIMS, 100),
                            new Score("lane", 6661, Game.SIMS, 192),
                            new Score("lump", 6216, Game.SIMS, 50),
                            new Score("snow", 1932, Game.SIMS, 132),
                            new Score("role", 1860, Game.SIMS, 52),
                            new Score("menu", 2471, Game.SIMS, 112),
                            new Score("jest", 8528, Game.SIMS, 127),
                            new Score("able", 4407, Game.SIMS, 62),
                            new Score("thaw", 1534, Game.SIMS, 155),
                            new Score("sigh", 2625, Game.SIMS, 149),
                            new Score("sour", 8416, Game.SIMS, 74),
                            new Score("dish", 1479, Game.SIMS, 199),
                            new Score("bike", 5428, Game.SIMS, 86),
                            new Score("call", 3781, Game.SIMS, 114),
                            new Score("blow", 2726, Game.SIMS, 168),
                            new Score("cord", 967, Game.SIMS, 109),
                            new Score("left", 8575, Game.SIMS, 53),
                            new Score("trap", 7387, Game.MARIO, 171),
                            new Score("dive", 4426, Game.MARIO, 103),
                            new Score("palm", 9752, Game.BARBIE_DESTRUCTION, 193),
                            new Score("live", 1086, Game.BARBIE_DESTRUCTION, 185),
                            new Score("stop", 6248, Game.BARBIE_DESTRUCTION, 71),
                            new Score("stay", 233, Game.BARBIE_DESTRUCTION, 141),
                            new Score("loud", 4593, Game.BARBIE_DESTRUCTION, 191),
                            new Score("even", 5070, Game.BARBIE_DESTRUCTION, 149),
                            new Score("bill", 1525, Game.BARBIE_DESTRUCTION, 174),
                            new Score("long", 6966, Game.BARBIE_DESTRUCTION, 92),
                            new Score("fork", 2131, Game.BARBIE_DESTRUCTION, 59),
                            new Score("arch", 6766, Game.BARBIE_DESTRUCTION, 69),
                            new Score("land", 551, Game.BARBIE_DESTRUCTION, 84),
                            new Score("bald", 6296, Game.BARBIE_DESTRUCTION, 162),
                            new Score("term", 6308, Game.BARBIE_DESTRUCTION, 77),
                            new Score("horn", 6820, Game.BARBIE_DESTRUCTION, 112),
                            new Score("push", 4513, Game.BARBIE_DESTRUCTION, 93),
                            new Score("gold", 5402, Game.BARBIE_DESTRUCTION, 92),
                            new Score("plan", 3300, Game.BARBIE_DESTRUCTION, 82),
                            new Score("size", 1296, Game.BARBIE_DESTRUCTION, 77),
                            new Score("well", 9939, Game.BARBIE_DESTRUCTION, 188),
                            new Score("deck", 9490, Game.BARBIE_DESTRUCTION, 109),
                            new Score("cafe", 988, Game.MARIO, 80),
                            new Score("file", 8381, Game.MARIO, 137),
                            new Score("pain", 8220, Game.PINBALL, 194),
                            new Score("feel", 9383, Game.PINBALL, 172),
                            new Score("mail", 3414, Game.PINBALL, 167),
                            new Score("firm", 6885, Game.PINBALL, 143),
                            new Score("huge", 1585, Game.PINBALL, 145),
                            new Score("rape", 2084, Game.PINBALL, 192),
                            new Score("rung", 2877, Game.PINBALL, 159),
                            new Score("peel", 548, Game.PINBALL, 63),
                            new Score("deal", 4871, Game.PINBALL, 103),
                            new Score("hell", 5454, Game.PINBALL, 166),
                            new Score("easy", 2120, Game.PINBALL, 95),
                            new Score("gift", 2029, Game.PINBALL, 88),
                            new Score("sick", 7558, Game.PINBALL, 72),
                            new Score("view", 6032, Game.PINBALL, 132),
                            new Score("slab", 9241, Game.PINBALL, 152),
                            new Score("oven", 694, Game.PINBALL, 181),
                            new Score("rack", 655, Game.PINBALL, 79),
                            new Score("maze", 4779, Game.PINBALL, 170),
                            new Score("mess", 5376, Game.PINBALL, 55),
                            new Score("idea", 9588, Game.PINBALL, 151),
                            new Score("seat", 3218, Game.MORTAL_COMBAT, 100),
                            new Score("bird", 6336, Game.MORTAL_COMBAT, 148),
                            new Score("kill", 7232, Game.MORTAL_COMBAT, 129),
                            new Score("herb", 8044, Game.MORTAL_COMBAT, 162),
                            new Score("flex", 8415, Game.MORTAL_COMBAT, 169),
                            new Score("stir", 719, Game.MORTAL_COMBAT, 60),
                            new Score("crew", 4882, Game.MORTAL_COMBAT, 161),
                            new Score("silk", 6714, Game.MORTAL_COMBAT, 197),
                            new Score("orgy", 9711, Game.MORTAL_COMBAT, 107),
                            new Score("baby", 8411, Game.MORTAL_COMBAT, 144),
                            new Score("rice", 6113, Game.MORTAL_COMBAT, 122),
                            new Score("monk", 6515, Game.MORTAL_COMBAT, 66),
                            new Score("food", 2467, Game.MORTAL_COMBAT, 88),
                            new Score("mask", 6829, Game.MORTAL_COMBAT, 115),
                            new Score("bold", 6237, Game.MORTAL_COMBAT, 88),
                            new Score("leaf", 4857, Game.MORTAL_COMBAT, 74),
                            new Score("fold", 7249, Game.MORTAL_COMBAT, 80),
                            new Score("rest", 4170, Game.MORTAL_COMBAT, 107),
                            new Score("plot", 9647, Game.MORTAL_COMBAT, 195),
                            new Score("frog", 5264, Game.MORTAL_COMBAT, 58),
                            new Score("cart", 2123, Game.MARIO, 91),
                            new Score("code", 5603, Game.MARIO, 87),
                            new Score("lack", 7196, Game.MYLITTLEPONY, 181),
                            new Score("bake", 6227, Game.MYLITTLEPONY, 155),
                            new Score("case", 3359, Game.MYLITTLEPONY, 183),
                            new Score("sail", 637, Game.MYLITTLEPONY, 200),
                            new Score("word", 8651, Game.MYLITTLEPONY, 57),
                            new Score("heat", 6860, Game.MYLITTLEPONY, 172),
                            new Score("back", 5015, Game.MYLITTLEPONY, 91),
                            new Score("duke", 6637, Game.MYLITTLEPONY, 150),
                            new Score("gear", 8661, Game.MYLITTLEPONY, 98),
                            new Score("bear", 4853, Game.MYLITTLEPONY, 175),
                            new Score("seek", 9873, Game.MYLITTLEPONY, 101),
                            new Score("rank", 7999, Game.MYLITTLEPONY, 112),
                            new Score("fill", 4739, Game.MYLITTLEPONY, 118),
                            new Score("heel", 1520, Game.MYLITTLEPONY, 51),
                            new Score("ally", 976, Game.MYLITTLEPONY, 70),
                            new Score("pass", 4448, Game.MYLITTLEPONY, 134),
                            new Score("lion", 4540, Game.MYLITTLEPONY, 186),
                            new Score("spin", 3698, Game.MYLITTLEPONY, 112),
                            new Score("jury", 1219, Game.MYLITTLEPONY, 52),
                            new Score("show", 4400, Game.MYLITTLEPONY, 58),
                            new Score("beef", 6715, Game.MARIO, 165),
                            new Score("item", 783, Game.MARIO, 167),
                            new Score("band", 7973, Game.SNAKE, 176),
                            new Score("worm", 7238, Game.SNAKE, 59),
                            new Score("tape", 2301, Game.SNAKE, 60),
                            new Score("note", 9793, Game.SNAKE, 80),
                            new Score("talk", 5840, Game.SNAKE, 191),
                            new Score("side", 2626, Game.SNAKE, 118),
                            new Score("test", 8901, Game.SNAKE, 100),
                            new Score("urge", 2195, Game.SNAKE, 58),
                            new Score("warn", 8230, Game.SNAKE, 190),
                            new Score("harm", 4019, Game.SNAKE, 140),
                            new Score("bomb", 7970, Game.SNAKE, 51),
                            new Score("mole", 778, Game.SNAKE, 143),
                            new Score("fate", 1935, Game.SNAKE, 64),
                            new Score("cute", 951, Game.SNAKE, 151),
                            new Score("miss", 3911, Game.SNAKE, 88),
                            new Score("soil", 3199, Game.SNAKE, 196),
                            new Score("fear", 9782, Game.SNAKE, 103),
                            new Score("face", 6504, Game.SNAKE, 164),
                            new Score("root", 9061, Game.SNAKE, 131),
                            new Score("pray", 8832, Game.SNAKE, 143),
                            new Score("veil", 6194, Game.MARIO, 69),
                            new Score("bean", 9093, Game.MARIO, 70),
                            new Score("stem", 552, Game.MARIO, 181),
                            new Score("fine", 8161, Game.MARIO, 129),
                            new Score("chew", 4230, Game.MARIO, 200),
                            new Score("glue", 9553, Game.MARIO, 160),
                            new Score("hope", 3446, Game.BARBIE_DESTRUCTION, 140),
                            new Score("yard", 9790, Game.BARBIE_DESTRUCTION, 78),
                            new Score("boom", 1701, Game.BARBIE_DESTRUCTION, 92),
                            new Score("edge", 6664, Game.BARBIE_DESTRUCTION, 168),
                            new Score("save", 4713, Game.BARBIE_DESTRUCTION, 176),
                            new Score("warm", 2136, Game.BARBIE_DESTRUCTION, 53),
                            new Score("deer", 5547, Game.BARBIE_DESTRUCTION, 83),
                            new Score("vein", 3962, Game.BARBIE_DESTRUCTION, 154),
                            new Score("take", 2686, Game.BARBIE_DESTRUCTION, 53),
                            new Score("neck", 5634, Game.BARBIE_DESTRUCTION, 95),
                            new Score("camp", 421, Game.BARBIE_DESTRUCTION, 57),
                            new Score("vain", 5097, Game.BARBIE_DESTRUCTION, 195),
                            new Score("last", 233, Game.BARBIE_DESTRUCTION, 52),
                            new Score("dorm", 9309, Game.BARBIE_DESTRUCTION, 70),
                            new Score("head", 431, Game.BARBIE_DESTRUCTION, 50),
                            new Score("wolf", 3660, Game.BARBIE_DESTRUCTION, 195),
                            new Score("bulb", 2002, Game.BARBIE_DESTRUCTION, 125),
                            new Score("flow", 7268, Game.BARBIE_DESTRUCTION, 116),
                            new Score("ward", 6990, Game.BARBIE_DESTRUCTION, 72),
                            new Score("hike", 3961, Game.BARBIE_DESTRUCTION, 172),
                            new Score("snub", 4727, Game.MARIO, 58),
                            new Score("peak", 9437, Game.MARIO, 80),
                            new Score("dawn", 7491, Game.MARIO, 160),
                            new Score("pack", 257, Game.TETRIS, 51),
                            new Score("sofa", 6784, Game.TETRIS, 62),
                            new Score("loop", 7717, Game.TETRIS, 174),
                            new Score("cash", 1421, Game.TETRIS, 99),
                            new Score("will", 6465, Game.TETRIS, 102),
                            new Score("beam", 7839, Game.TETRIS, 106),
                            new Score("weak", 2152, Game.TETRIS, 171),
                            new Score("vote", 3762, Game.TETRIS, 190),
                            new Score("wild", 9875, Game.TETRIS, 140),
                            new Score("heal", 8794, Game.TETRIS, 153),
                            new Score("core", 3578, Game.TETRIS, 158),
                            new Score("fall", 6666, Game.TETRIS, 183),
                            new Score("mile", 9951, Game.TETRIS, 137),
                            new Score("home", 2283, Game.TETRIS, 182),
                            new Score("cast", 6085, Game.TETRIS, 95),
                            new Score("stab", 8797, Game.TETRIS, 138),
                            new Score("scan", 9556, Game.TETRIS, 64),
                            new Score("ring", 2372, Game.TETRIS, 108),
                            new Score("bark", 4028, Game.TETRIS, 59),
                            new Score("hand", 3310, Game.TETRIS, 118),
                            new Score("poll", 3555, Game.MARIO, 139),
                            new Score("chip", 2507, Game.MARIO, 116),
                            new Score("tool", 1693, Game.MARIO, 123),
                            new Score("pipe", 7205, Game.MARIO, 169),
                            new Score("shed", 6507, Game.MARIO, 52),
                            new Score("tune", 6245, Game.MARIO, 97),
                            new Score("bank", 3298, Game.MARIO, 69),
                            new Score("cane", 4876, Game.MARIO, 127),
                            new Score("echo", 152, Game.MARIO, 162),
                            new Score("solo", 4403, Game.MARIO, 138),
                            new Score("wait", 910, Game.MARIO, 64),
                            new Score("clay", 5881, Game.MARIO, 199),
                            new Score("base", 502, Game.MARIO, 169),
                            new Score("blue", 6856, Game.MARIO, 182),
                            new Score("pull", 7099, Game.MARIO, 115),
                            new Score("wave", 777, Game.MARIO, 60),
                            new Score("lend", 1630, Game.MARIO, 162)
                    )),
                    new Arcade("0x19", "Rumia", 1552, new ArrayList<>(Arrays.asList(
                            new Score("lamb", 2928, Game.MARIO, 249),
                            new Score("chin", 217, Game.MARIO_KART, 278),
                            new Score("bury", 3606, Game.MARIO_KART, 231),
                            new Score("lack", 4524, Game.MARIO_KART, 300),
                            new Score("norm", 8130, Game.MARIO_KART, 238),
                            new Score("boom", 3026, Game.MARIO_KART, 122),
                            new Score("gift", 5182, Game.MARIO, 238),
                            new Score("loop", 2002, Game.MYLITTLEPONY, 90),
                            new Score("mole", 2146, Game.MYLITTLEPONY, 95),
                            new Score("drag", 3328, Game.MYLITTLEPONY, 277),
                            new Score("like", 8083, Game.MYLITTLEPONY, 192),
                            new Score("pawn", 2384, Game.MYLITTLEPONY, 72),
                            new Score("hill", 2669, Game.MARIO, 228),
                            new Score("poll", 2945, Game.TETRIS, 122),
                            new Score("date", 1194, Game.TETRIS, 224),
                            new Score("beef", 8072, Game.TETRIS, 144),
                            new Score("heir", 4411, Game.TETRIS, 284),
                            new Score("crop", 4130, Game.TETRIS, 290),
                            new Score("lead", 4458, Game.SIMS, 208),
                            new Score("hear", 8909, Game.SIMS, 297),
                            new Score("wood", 9039, Game.SIMS, 216),
                            new Score("nest", 654, Game.SIMS, 159),
                            new Score("pure", 9960, Game.SIMS, 282),
                            new Score("wild", 8541, Game.BARBIE_DESTRUCTION, 250),
                            new Score("exit", 2648, Game.BARBIE_DESTRUCTION, 116),
                            new Score("take", 7970, Game.BARBIE_DESTRUCTION, 272),
                            new Score("long", 5864, Game.BARBIE_DESTRUCTION, 270),
                            new Score("sale", 6807, Game.BARBIE_DESTRUCTION, 251),
                            new Score("ring", 3937, Game.MARIO, 200),
                            new Score("cell", 262, Game.MARIO, 119)
                    ))),
                    new Arcade("0x11", "Gdansk", 3423, new ArrayList<>(Arrays.asList(
                            new Score("well", 9371, Game.PINBALL, 68),
                            new Score("grip", 1419, Game.PINBALL, 221),
                            new Score("mild", 3239, Game.PINBALL, 262),
                            new Score("post", 3468, Game.PINBALL, 196),
                            new Score("cold", 8209, Game.PINBALL, 258),
                            new Score("whip", 8573, Game.MARIO, 150),
                            new Score("bake", 608, Game.MARIO_KART, 229),
                            new Score("card", 9512, Game.MARIO_KART, 213),
                            new Score("hike", 1871, Game.MARIO_KART, 84),
                            new Score("bark", 3364, Game.MARIO_KART, 158),
                            new Score("need", 6691, Game.MARIO_KART, 282),
                            new Score("warm", 9352, Game.MARIO, 96),
                            new Score("free", 7788, Game.TETRIS, 227),
                            new Score("seal", 8647, Game.TETRIS, 291),
                            new Score("time", 3033, Game.TETRIS, 114),
                            new Score("duck", 1246, Game.TETRIS, 276),
                            new Score("code", 3762, Game.TETRIS, 120),
                            new Score("monk", 7460, Game.MARIO, 224),
                            new Score("size", 1612, Game.SNAKE, 117),
                            new Score("weak", 5388, Game.SNAKE, 271),
                            new Score("tank", 7389, Game.SNAKE, 151),
                            new Score("full", 9071, Game.SNAKE, 83),
                            new Score("rich", 3278, Game.SNAKE, 59),
                            new Score("edge", 9108, Game.MARIO, 260),
                            new Score("west", 409, Game.MORTAL_COMBAT, 155),
                            new Score("cool", 3253, Game.MORTAL_COMBAT, 54),
                            new Score("dare", 1027, Game.MORTAL_COMBAT, 180),
                            new Score("heel", 4962, Game.MORTAL_COMBAT, 146),
                            new Score("disk", 2916, Game.MORTAL_COMBAT, 134),
                            new Score("leak", 7136, Game.MARIO, 167)
                    ))),
                    new Arcade("0x12", "Wejherowo", 132876, new ArrayList<>(Arrays.asList(
                            new Score("unit", 5034, Game.TETRIS, 286),
                            new Score("crew", 5009, Game.TETRIS, 249),
                            new Score("bomb", 7899, Game.TETRIS, 170),
                            new Score("pray", 5627, Game.TETRIS, 271),
                            new Score("prey", 7560, Game.TETRIS, 268),
                            new Score("feel", 3795, Game.MARIO, 237),
                            new Score("snap", 1378, Game.PINBALL, 277),
                            new Score("meal", 8894, Game.PINBALL, 202),
                            new Score("fast", 5041, Game.PINBALL, 57),
                            new Score("coal", 2851, Game.PINBALL, 85),
                            new Score("rich", 3205, Game.PINBALL, 259),
                            new Score("well", 5716, Game.MARIO, 230),
                            new Score("host", 1141, Game.MYLITTLEPONY, 288),
                            new Score("clue", 2768, Game.MYLITTLEPONY, 91),
                            new Score("flag", 9151, Game.MYLITTLEPONY, 227),
                            new Score("desk", 4357, Game.MYLITTLEPONY, 99),
                            new Score("nail", 1333, Game.MYLITTLEPONY, 140),
                            new Score("thin", 2447, Game.MARIO, 126),
                            new Score("lung", 7825, Game.SIMS, 62),
                            new Score("move", 7835, Game.SIMS, 288),
                            new Score("bait", 6376, Game.SIMS, 198),
                            new Score("term", 9030, Game.SIMS, 121),
                            new Score("cope", 2173, Game.SIMS, 98),
                            new Score("burn", 9623, Game.MARIO, 248),
                            new Score("bark", 9546, Game.BARBIE_DESTRUCTION, 157),
                            new Score("pony", 4596, Game.BARBIE_DESTRUCTION, 203),
                            new Score("knit", 3445, Game.BARBIE_DESTRUCTION, 215),
                            new Score("part", 3112, Game.BARBIE_DESTRUCTION, 299),
                            new Score("gene", 4444, Game.BARBIE_DESTRUCTION, 137),
                            new Score("wolf", 4491, Game.MARIO, 197)
                    ))),
                    new Arcade("0x15", "Tczew", 59871, new ArrayList<>(Arrays.asList(
                            new Score("show", 6995, Game.MARIO, 84),
                            new Score("stop", 2954, Game.TETRIS, 52),
                            new Score("mine", 3826, Game.TETRIS, 195),
                            new Score("spot", 1795, Game.TETRIS, 76),
                            new Score("rush", 2792, Game.TETRIS, 76),
                            new Score("snub", 9239, Game.MARIO, 130),
                            new Score("loud", 3104, Game.SNAKE, 266),
                            new Score("soft", 1535, Game.SNAKE, 295),
                            new Score("wrap", 455, Game.SNAKE, 267),
                            new Score("fuel", 9691, Game.MARIO, 247),
                            new Score("pier", 9705, Game.MARIO, 76),
                            new Score("fold", 9546, Game.BARBIE_DESTRUCTION, 204),
                            new Score("bird", 1496, Game.BARBIE_DESTRUCTION, 103),
                            new Score("duck", 5085, Game.BARBIE_DESTRUCTION, 229),
                            new Score("fire", 3360, Game.BARBIE_DESTRUCTION, 75),
                            new Score("wake", 1924, Game.MARIO, 245),
                            new Score("cane", 2016, Game.MARIO, 142),
                            new Score("root", 4656, Game.PINBALL, 100),
                            new Score("myth", 5341, Game.PINBALL, 215),
                            new Score("tear", 9808, Game.PINBALL, 122),
                            new Score("beer", 8294, Game.PINBALL, 231),
                            new Score("aunt", 7850, Game.MORTAL_COMBAT, 196),
                            new Score("dawn", 8861, Game.MORTAL_COMBAT, 59),
                            new Score("poll", 7181, Game.MORTAL_COMBAT, 268),
                            new Score("kill", 877, Game.MORTAL_COMBAT, 140),
                            new Score("pony", 6719, Game.MARIO_KART, 283),
                            new Score("hour", 5522, Game.MARIO_KART, 177),
                            new Score("worm", 9873, Game.MARIO_KART, 217),
                            new Score("sofa", 8570, Game.MARIO_KART, 217),
                            new Score("find", 1577, Game.MARIO, 236)
                    )))
            ));
            System.out.println(arcades);

            // Polecenia:
            // 1. Posortuj i wypisz automaty po ilości rozegranych meczy
            // 2. Posortuj i wypisz automaty po ilości zapisanych wyników (ilość score)
            // 3. Znadjź i zwróć automat który ma najwięcej zapisanych wyników z gry Mario
            // 4. Znajdź i wypisz wszystkie automaty z Gdańska
            // 5. Znajdź wszystkie wyniki z Mario i wypisz nazwy użytkowników które wystąpiły na więcej niż jednym automacie.
            // 6. Znajdź wyniki najlepszego gracza gry BARBIE_DESTRUCTION. Jeśli gracze mają tyle samo punktów to drugim kryterium jest czas. Im krótszy czas gry, tym wyżej powinien być gracz w rankingu.
            // 7. Dla każdego z automatów wypisz jaka jest proporcja ilości rozegranych gier do ilości wyników które przechowują. Wyniki posortuj i wypisz.
            // 8. Znajdź automat dla którego średni czas gry gracza był najkrótszy
            // 9. Wylistuj wszystkie automaty. wypisz je posortowane po średnim czasie gry gracza
            // 10. Wypisz wszystkie gry (unikalne)
            // 11. Wypisz wszystkie gry sortując je po ilości zebranych wyników
            // 12. Wypisz wszystkie gry sortując je po średnim wyniku z gry (najpierw dowiedz się ile śrendio gracze zdobywali punktów w danej grze, a następnie posortuj gry)
            // 13. Wypisz nazwisko najlepszego gracza w tetrisa.
            // 14. Znajdź listę nazw użytkowników którzy grali w Mortal combat. Posortuj je alfabetycznie.
            // 15. Znajdź nazwę użytkownika który miał najkrótszy czas gry w snake. Wypisz również jego ilość zdobytych punktów
            // 16. Wypisz wszystkie nazwy użytkowników (unikalne)
            // 17. Znajdź nazwę użytkownika który ma najwięcej zapisanych wyników (najwięcej Score)
            // 18. Wypisz ile czasu ludzie zmarnowali grając w każdą kolejną grę. (chodzi o sumę czasu gry dla zadanej gry, np. dla simsów trzeba zsumować wszystkie czasy gry)
            // 19. Wypisz grę która zajmuje użytkownikom najwięcej czasu (średni czas jest najwyższy)
            // 20. *Wypisz 3 najlepszych graczy z Każdej gry dla każdego automatu Map<Arcade, Map<Game, List<String>>> (automat ma mapy w których znajdują się mappingi: dla zadanej gry lista 3 najlepszych graczy)
            // 21. Wypisz jaka gra była najbardziej popularna na którym automacie: Map<Arcade, Game>

            System.out.println();
            System.out.println();

            System.out.println();
            // 1. Posortuj i wypisz automaty po ilości rozegranych meczy
            System.out.println();
            System.out.println("1test");
            arcades.stream()
                    .sorted(Comparator.comparingInt(Arcade::getGamesPlayed).reversed())
                    .forEach(System.out::println);

            System.out.println("1. Automaty posortowane po ilości rozegranych meczy.");
            wypiszPosortowanePoIlosciMeczy(arcades);

            System.out.println();


            // 2. Posortuj i wypisz automaty po ilości zapisanych wyników (ilość score)
            System.out.println();
            System.out.println("2test");
            arcades.stream()
                    .sorted(Comparator.comparingInt(
                            value -> value.getScoreList().size()
                    ))
    //                .sorted(Comparator.reverseOrder())
                    .forEach(arcade -> System.out.println(arcade.getName() + " " + arcade.getScoreList().size()));

            System.out.println();
            arcades.stream()
                    .collect(Collectors.toMap(
                            a -> a.getName(),
                            a -> a.getScoreList().size(),
                            (e1, e2) -> e1 + e2
                    ))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach((k) -> System.out.println(k.getKey() + " " + k.getValue()));
            System.out.println();

            System.out.println("2. Automaty posortowane po ilości zapisanych wyników.");
            wypiszPosortowanePoIlosciZapisanychWynikow(arcades);

            System.out.println();


            // 3. Znadjź i zwróć automat który ma najwięcej zapisanych wyników z gry Mario
            System.out.println();
            System.out.println("3test");
            Optional<Arcade> opt_3test = arcades.stream()
                    .max(Comparator.comparingLong(
                            value -> value.getScoreList().stream()
                                    .map(score -> score.getGame())
                                    .filter(game -> game.equals(Game.MARIO))
                                    .count()
                    ));

            if (opt_3test.isPresent()) {
                Arcade zad3test = opt_3test.get();
                System.out.println(zad3test);
            }

    //        Optional<Map.Entry<Arcade, Long>> opt_zad3test2 =
            arcades.stream()
                    .collect(Collectors.toMap(
                            a -> a,
                            a -> a.getScoreList().stream()
                                    .map(score -> score.getGame())
                                    .filter(game -> game.equals(Game.MARIO))
                                    .count()
                    )).entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .findFirst().ifPresent(arcadeLongEntry -> System.out.println(arcadeLongEntry.getKey().getName() + " " + arcadeLongEntry.getValue()));

            System.out.println();
            System.out.println("3. Automat, który ma najwięcej wyników gry Mario.");
            Optional<Map.Entry<Arcade, Long>> optMaxMario = maxArcadeOptional(arcades);
            if (optMaxMario.isPresent()) {
                Map.Entry<Arcade, Long> maxMario = optMaxMario.get();
                System.out.println(maxMario.getKey().getName() + " ma " + maxMario.getValue() + " wpisów");
            }

            System.out.println();


            // 4. Znajdź i wypisz wszystkie automaty z Gdańska
            System.out.println();
            System.out.println("4test");
            arcades.stream()
                    .filter(arcade -> arcade.getCity().startsWith("Gda"))
                    .forEach(arcade -> System.out.println(arcade.getName() + " " + arcade.getCity()));
            System.out.println();

            System.out.println("4. Automaty z Gdańska");
            automatyGdansk(arcades);

            // 5. Znajdź wszystkie wyniki z Mario i wypisz nazwy użytkowników które wystąpiły na więcej niż jednym automacie.

            System.out.println();
            System.out.println("5test");
            Set<String> arcadeNames = arcades.stream()
                    .map(arcade -> arcade.getName())
                    .collect(Collectors.toSet());

            Map<String, Set<String>> mapArcadesPlayers = arcadeNames.stream()
                    .collect(Collectors.toMap(
                            an -> an,
                            an -> arcades.stream()
                                    .filter(arcade -> arcade.getName().equals(an))
                                    .flatMap(arcade -> arcade.getScoreList().stream())
                                    .filter(score -> score.getGame().equals(Game.MARIO))
                                    .map(score -> score.getPlayerName())
                                    .collect(Collectors.toSet())
                    ));

            mapArcadesPlayers.forEach((k, v) -> System.out.println(k + " " + v));

            Set<Map.Entry<String, Set<String>>> entrySet = mapArcadesPlayers.entrySet();
            List<String> lista = new ArrayList<>();
            for (Map.Entry<String, Set<String>> stringSetEntry : entrySet) {
                Set<String> set = stringSetEntry.getValue();
                for (String s : set) {
                    lista.add(s);
                }
            }

            Set<String> setFromList = new HashSet<>(lista);
            List<String> singlePlayers = new ArrayList<>(setFromList);
            int[] tab = new int[singlePlayers.size()];
            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < singlePlayers.size(); j++) {
                    if (lista.get(i).equals(singlePlayers.get(j))) {
                        tab[j]++;
                    }
                }
            }

            for (int i = 0; i < singlePlayers.size(); i++) {
                if (tab[i] > 1) {
                    System.out.println(singlePlayers.get(i) + " " + tab[i]);
                }
            }


    //        Collection<Set<String>> collection = mapArcadesPlayers.values();
    //        List<Set<String>> listSets = new ArrayList<>(collection);
    //        List<String> list = listSets.stream().collect(Collectors.toList());

            System.out.println();


            // szukam listy imion graczy w grę Mario
            List<String> namesList = arcades.stream()
                    .map(arcade -> arcade.getScoreList()
                            .stream()
                            .filter(score -> score.getGame() == Game.MARIO)
                            .map(score -> score.getPlayerName()).distinct().collect(Collectors.toList())) // po tym zostaną tylko unikalne nazwy użytkowników w mario, wiele list.
                    .flatMap(list -> list.stream())
                    .collect(Collectors.toList()); // teraz mamy jedną listę wszystkich imion.

            List<String> namesThatComeUpTwiceOrMore = namesList.stream()
                    .filter(name -> Collections.frequency(namesList, name) > 1) // przez ten filtr przechodzą tylko imiona ktore wystepuja wiecej niz 1 raz
                    .collect(Collectors.toList());

            System.out.println();
            System.out.println("Nazwy użytkowników które wystąpiły na więcej niż jednym automacie: " + namesThatComeUpTwiceOrMore);

            // teraz zrobię liczność wystąpień:
            Map<String, Long> namesThatComeUpTwiceOrMoreMap = namesList.stream()
                    .filter(name -> Collections.frequency(namesList, name) > 1)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

            System.out.println();
            System.out.println("Liczność wystąpień:");
            namesThatComeUpTwiceOrMoreMap.entrySet().forEach(entry -> System.out.println(entry));

            // 6. Znajdź wyniki najlepszego gracza gry BARBIE_DESTRUCTION. Jeśli gracze mają tyle samo punktów to drugim kryterium jest czas. Im krótszy czas gry, tym wyżej powinien być gracz w rankingu.
            System.out.println();
            System.out.println("6test");

            Set<String> gamePlayersBARBIE_DESTRUCTION = arcades.stream()
                    .flatMap(arcade -> arcade.getScoreList().stream())
                    .filter(score -> score.getGame().equals(Game.BARBIE_DESTRUCTION))
                    .map(score -> score.getPlayerName())
                    .collect(Collectors.toSet());

            Map<String, List<Integer>> mapPlayerScore = gamePlayersBARBIE_DESTRUCTION.stream()
                    .collect(Collectors.toMap(
                            s -> s,
                            s -> arcades.stream()
                                    .flatMap(arcade -> arcade.getScoreList().stream())
                                    .filter(score -> score.getPlayerName().equals(s))
                                    .filter(score -> score.getGame().equals(Game.BARBIE_DESTRUCTION))
                                    .map(Score::getScore)
                                    .collect(Collectors.toList())
                    ));

            mapPlayerScore.forEach((k, v) -> System.out.println(k + " " + v));

            Map<String, Score> mapPlayerScore2 = gamePlayersBARBIE_DESTRUCTION.stream()
                    .collect(Collectors.toMap(
                            s -> s,
                            s -> arcades.stream()
                                .flatMap(arcade -> arcade.getScoreList().stream())
                                .filter(score -> score.getPlayerName().equals(s))
                                .filter(score -> score.getGame().equals(Game.BARBIE_DESTRUCTION))
                                .max(new Comparator<Score>() {
                                    @Override
                                    public int compare(Score o1, Score o2) {
                                        if (o1.getScore() > o2.getScore()) {
                                            return 1;
                                        } else if (o1.getScore() < o2.getScore()) {
                                            return -1;
                                        } else if (o1.getGameTime() < o2.getGameTime()) {
                                            return 1;
                                        } else if (o1.getGameTime() > o2.getGameTime()) {
                                            return -1;
                                        }
                                        return 0;
                                    }
                                })
                                .get()
                    ));

            System.out.println();

            mapPlayerScore2.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(new Comparator<Score>() {
                        @Override
                        public int compare(Score o1, Score o2) {
                            if (o1.getScore() > o2.getScore()) {
                                return -1;
                            } else if (o1.getScore() < o2.getScore()) {
                                return 1;
                            } else if (o1.getGameTime() < o2.getGameTime()) {
                                return -1;
                            } else if (o1.getGameTime() > o2.getGameTime()) {
                                return 1;
                            }
                            return 0;
                        }
                    }))
                    .findFirst().ifPresent(stringScoreEntry -> System.out.println(stringScoreEntry.getKey() + " " + stringScoreEntry.getValue().getScore() + " " + stringScoreEntry.getValue().getGameTime()));
    //                .forEach((k) -> System.out.println(k.getKey() + " " + k.getValue().getScore() + " " + k.getValue().getGameTime()));

            System.out.println();

            arcades.stream()
                    .flatMap(arcade -> arcade.getScoreList().stream())
                    .filter(score -> score.getGame().equals(Game.BARBIE_DESTRUCTION))
    //                .map(value -> value.getScore())
                    .max(new Comparator<Score>() {
                        @Override
                        public int compare(Score o1, Score o2) {
                            if (o1.getScore() > o2.getScore()) {
                                return 1;
                            } else if (o1.getScore() < o2.getScore()) {
                                return -1;
                            } else if (o1.getGameTime() < o2.getGameTime()) {
                                return 1;
                            } else if (o1.getGameTime() > o2.getGameTime()) {
                                return -1;
                            }
                            return 0;
                        }
                    })
                    .ifPresent(score -> System.out.println(score.getPlayerName() + " " + score.getScore() + " " + score.getGameTime()));

            // 7. Dla każdego z automatów wypisz jaka jest proporcja ilości rozegranych gier do ilości wyników które przechowują. Wyniki posortuj i wypisz.
            System.out.println();
            System.out.println("7test");
            Set<String> setArcadeNames = arcades.stream()
                    .map(arcade -> arcade.getName())
                    .collect(Collectors.toSet());

            Map<Arcade, Integer> mapArcadeProportion = arcades.stream()
                    .collect(Collectors.toMap(
                            s -> s,
                            s -> s.getGamesPlayed() / s.getScoreList().size()
    //                        s -> arcades.stream()
    //                            .filter(arcade -> arcade.equals(s))
    //                            .mapToInt(value -> value.getGamesPlayed() / value.getScoreList().size())
                    ));

            Map<Arcade, Integer> mapArcadeProportionSorted = mapArcadeProportion.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            mapArcadeProportionSorted.forEach((k, v) -> System.out.println(k.getName() + " " + v));

            System.out.println();
            System.out.println("7test2");
            List<Integer> integerListProportions = new ArrayList<>();
            for (int i = 0; i < arcades.size(); i++) {
                integerListProportions.add(arcades.get(i).getGamesPlayed() / arcades.get(i).getScoreList().size());
            }
            integerListProportions.stream()
                    .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                    .forEach(System.out::println);
            // i dalej zrobić mapę z arcades wziąć name a z listy proporcje...
            // dlaczego nie można zrobić mapy/listy na Double??????????????


            System.out.println();
            System.out.println("8test");
            // 8. Znajdź automat dla którego średni czas gry gracza był najkrótszy

            Map<Arcade, Double> mapArcadeGameTime = arcades.stream()
                    .collect(Collectors.toMap(
                            a -> a,
                            a -> a.getScoreList().stream()
                                .mapToLong(value -> value.getGameTime())
                                .average()
                                .getAsDouble()
                    ));

            mapArcadeGameTime.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Double::compareTo)) // lub forEach
                    .findFirst().ifPresent(e -> System.out.println(e.getKey().getName() + " " + e.getValue()));
    //                .forEach(e -> System.out.println(e.getKey().getName() + " " + e.getValue()));


            System.out.println();
            System.out.println("9test");
            // 9. Wylistuj wszystkie automaty. wypisz je posortowane po średnim czasie gry gracza
            arcades.stream()
                    .collect(Collectors.toMap(
                            a -> a,
                            a -> a.getScoreList().stream()
                                .mapToLong(value -> value.getGameTime())
                                .average()
                                .getAsDouble()
                    ))
                    .entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Double::compareTo))
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(e -> System.out.println(e.getKey().getName() + " " + e.getValue()));


            System.out.println();
            System.out.println("10test");
            // 10. Wypisz wszystkie gry (unikalne)
            Game[] games = Game.values();
        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i]);
        }

        System.out.println();
        Arrays.stream(games)
                .map(game -> game.toString())
                .sorted(Comparator.naturalOrder()).forEach(game -> System.out.println(game));


        System.out.println();
        System.out.println("11test");
        // 11. Wypisz wszystkie gry sortując je po ilości zebranych wyników
        Set<Game> gameSet = arcades.stream()
                .flatMap(arcade -> arcade.getScoreList().stream())
                .map(score -> score.getGame())
                .collect(Collectors.toSet());

        Map<Game, Integer> mapGameScore = gameSet.stream()
                .collect(Collectors.toMap(
                        g -> g,
                        g -> arcades.stream()
                            .flatMap(arcade -> arcade.getScoreList().stream())
                            .filter(score -> score.getGame().equals(g))
                            .mapToInt(Score::getScore).sum()
//                            .filter(arcade -> arcade.getScoreList().stream().map(score -> score.getGame()).equals(g))
//                            .flatMap(arcade -> arcade.getScoreList().stream())
//                            .mapToInt(value -> value.getScore()).sum()
                ));

        mapGameScore.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println();

        mapGameScore.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Integer::compareTo))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey().toString() + " " + e.getValue()));


        System.out.println();
        System.out.println("12test");
        // 12. Wypisz wszystkie gry sortując je po średnim wyniku z gry (najpierw dowiedz się ile śrendio gracze zdobywali punktów w danej grze, a następnie posortuj gry)

        Map<Game, Double> mapGameAverageScore = gameSet.stream()
                .collect(Collectors.toMap(
                        g -> g,
                        g -> arcades.stream()
                            .flatMap(arcade -> arcade.getScoreList().stream())
                            .filter(score -> score.getGame().equals(g))
                            .mapToInt(Score::getScore).average().getAsDouble()
                ));

        mapGameAverageScore.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Double::compareTo))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey().toString() + " " + e.getValue()));


        System.out.println();
        System.out.println("13test");
        // 13. Wypisz nazwisko najlepszego gracza w tetrisa.
        arcades.stream()
                .flatMap(arcade -> arcade.getScoreList().stream())
                .filter(score -> score.getGame().toString().equalsIgnoreCase("tetris"))
                .max(new Comparator<Score>() {
                    @Override
                    public int compare(Score o1, Score o2) {
                        if (o1.getScore() > o2.getScore()) {
                            return 1;
                        } else if (o1.getScore() < o2.getScore()) {
                            return -1;
                        }
                        return 0;
                    }
                })
                .ifPresent(score -> System.out.println(score.getPlayerName() + " " + score.getGame().toString() + " " + score.getScore()));


        // 14. Znajdź listę nazw użytkowników którzy grali w Mortal combat. Posortuj je alfabetycznie.
        System.out.println();
        System.out.println("14test");
        Set<String> setGamePlayers = arcades.stream()
                .flatMap(arcade -> arcade.getScoreList().stream())
                .filter(score -> score.getGame().equals(Game.MORTAL_COMBAT))
                .map(score -> score.getPlayerName())
                .collect(Collectors.toSet());
        List<String> listGamePlayersMortalCombat = new ArrayList<>(setGamePlayers).stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        listGamePlayersMortalCombat.forEach(System.out::println);


        // 15. Znajdź nazwę użytkownika który miał najkrótszy czas gry w snake. Wypisz również jego ilość zdobytych punktów
        System.out.println();
        System.out.println();
        Score minTimeSnakePlayer = arcades.stream()
                .flatMap(arcade -> arcade.getScoreList().stream())
                .filter(score -> score.getGame().equals(Game.SNAKE))
                .min(Comparator.comparingLong(Score::getGameTime))
                .get();
        System.out.println(minTimeSnakePlayer.getPlayerName() + " " + minTimeSnakePlayer.getGame() + " " + minTimeSnakePlayer.getScore() + " " + minTimeSnakePlayer.getGameTime());


        System.out.println();
        System.out.println("16test");
        // 16. Wypisz wszystkie nazwy użytkowników (unikalne)
        arcades.stream()
                .flatMap(arcade -> arcade.getScoreList().stream())
                .map(score -> score.getPlayerName())
                .distinct()
                .collect(Collectors.toList())
                .stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);


        System.out.println();
        System.out.println("17test");
        // 17. Znajdź nazwę użytkownika który ma najwięcej zapisanych wyników (najwięcej Score)
        Set<String> setAllPlayers = arcades.stream()
                .flatMap(arcade -> arcade.getScoreList().stream())
                .map(score -> score.getPlayerName())
                .collect(Collectors.toSet());
        Map<String, Integer> mapPlayerNumberOfScores = setAllPlayers.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> arcades.stream()
                            .flatMap(arcade -> arcade.getScoreList().stream())
                            .filter(score -> score.getPlayerName().equals(s))
                            .collect(Collectors.toList())
                            .size()
                ));

        mapPlayerNumberOfScores.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEach(System.out::println);
                .findFirst()
                .ifPresent(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue()));


        // 18. Wypisz ile czasu ludzie zmarnowali grając w każdą kolejną grę. (chodzi o sumę czasu gry dla zadanej gry, np. dla simsów trzeba zsumować wszystkie czasy gry)
        System.out.println();
        System.out.println("18test");
        Set<Game> setAllGames = arcades.stream()
                .flatMap(arcade -> arcade.getScoreList().stream())
                .map(score -> score.getGame())
                .collect(Collectors.toSet());

        Map<Game, Long> mapGameTime = setAllGames.stream()
                .collect(Collectors.toMap(
                        g -> g,
                        g -> arcades.stream()
                            .flatMap(arcade -> arcade.getScoreList().stream())
                            .filter(score -> score.getGame().equals(g))
                            .mapToLong(value -> value.getGameTime())
                            .sum()
                ));

        mapGameTime.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(gameLongEntry -> System.out.println(gameLongEntry.getKey().toString() + " " + gameLongEntry.getValue()));


        // 19. Wypisz grę która zajmuje użytkownikom najwięcej czasu (średni czas jest najwyższy)
        System.out.println();
        System.out.println("19test");
        Map<Game, Double> mapGameAverageTime = setAllGames.stream()
                .collect(Collectors.toMap(
                        g -> g,
                        g -> arcades.stream()
                            .flatMap(arcade -> arcade.getScoreList().stream())
                            .filter(score -> score.getGame().equals(g))
                            .mapToLong(value -> value.getGameTime())
                            .average()
                            .getAsDouble()
                ));

        mapGameAverageTime.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Double::compareTo))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(gameDoubleEntry -> System.out.println(gameDoubleEntry.getKey().toString() + " " + gameDoubleEntry.getValue()));



        // 20. *Wypisz 3 najlepszych graczy z Każdej gry dla każdego automatu Map<Arcade, Map<Game, List<String>>> (automat ma mapy w których znajdują się mappingi: dla zadanej gry lista 3 najlepszych graczy)
        System.out.println();
        System.out.println("20test");
        Map<Arcade, Map<Game, List<String>>> map20 = new HashMap<>();
        for (int i = 0; i < arcades.size(); i++) {
            List<Game> gamesI = arcades.get(i).getScoreList().stream()
                    .map(score -> score.getGame())
                    .collect(Collectors.toSet())
                    .stream()
                    .collect(Collectors.toList());

            List<String> namesI = arcades.get(i).getScoreList().stream()
                    .map(score -> score.getPlayerName())
                    .collect(Collectors.toSet())
                    .stream()
                    .collect(Collectors.toList());


//            Game[] tabGames = Game.values();
            Arcade arcadeI = arcades.get(i); // bieżący Arcade
            List<List<Score>> listScores = new ArrayList<>(); // lista list Score dla danego Game
            for (int j = 0; j < gamesI.size(); j++) {
                Game game = gamesI.get(j);
                List<Score> scoreList = arcadeI.getScoreList().stream()
                        .filter(score -> score.getGame().equals(game))
                        .collect(Collectors.toList());
                listScores.add(scoreList);
            }
            Map<Game, List<String>> mapI = new HashMap<>(); // mapa Game 3 best Players

//            Map<Game, List<String>> mapGameListString = setGames.stream()
//                    .collect(Collectors.toMap(
//                            g -> g,
//                            g -> arcadeI.getScoreList().stream()
//                                .filter(score -> score.getGame().equals(g))
//                                .map(score -> score.getPlayerName())
//                                .distinct()
//                                .collect(Collectors.toList())
//                    ));
//            Set<String> stringSet = list.stream()
//                    .map(score -> score.getPlayerName())
//                    .collect(Collectors.toSet());
            for (int j = 0; j < gamesI.size(); j++) {
//                List<Score> list = listScores.get(j);
                Game game = gamesI.get(j);
//                List<Score> list = arcadeI.getScoreList().stream()
//                        .filter(score -> score.getGame().equals(game))
//                        .collect(Collectors.toList());
                Map<String, Integer> mapNameHowMany = namesI.stream() // mapa
                        .collect(Collectors.toMap(
                                n -> n,
                                n -> arcadeI.getScoreList().stream()
                                    .filter(score -> score.getPlayerName().equals(n))
//                                    .filter(score -> score.getPlayerName().equals(n) && score.getGame().equals(game))
//                                    .filter(score -> score.getGame().equals(game))
                                    .map(score -> score.getScore())
                                    .max(Integer::compareTo)
                                    .get()
                        ));

                List<Map.Entry<String, Integer>> listMapEntry = mapNameHowMany.entrySet().stream().collect(Collectors.toList());

//                listMapEntry.stream().forEach(System.out::println);

                List<Map.Entry<String, Integer>> sortedListMapEntry = listMapEntry.stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toList());

                System.out.println();
                System.out.println(arcadeI.getName());
                System.out.println(gamesI.get(j));
                sortedListMapEntry.stream().forEach(System.out::println);
//                System.out.println();

                Map<String, Integer> map3NameBest = new HashMap<>();
                List<String> list3NamesBest = new ArrayList<>();
                for (int k = 0; k < 3; k++) {
                    map3NameBest.put(sortedListMapEntry.get(k).getKey(), sortedListMapEntry.get(k).getValue());
                    list3NamesBest.add(sortedListMapEntry.get(k).getKey());
                }


//                System.out.println("M");
//                map3NameBest.forEach((k, v) -> System.out.println(k + " " + v));
                System.out.println("L");
                list3NamesBest.stream().forEach(System.out::println);

                mapI.put(gamesI.get(j), list3NamesBest);
            }

            map20.put(arcadeI, mapI);
        }

        map20.entrySet().stream()
                .forEach(arcadeMapEntry -> System.out.println(arcadeMapEntry.getKey().getName() + " " + arcadeMapEntry.getValue()));

        // 21. Wypisz jaka gra była najbardziej popularna na którym automacie: Map<Arcade, Game>
        System.out.println();
        System.out.println("21test");
//        System.out.println();
//        System.out.println("21test");
//        Map<Arcade, Game> mapArcadeGame = arcades.stream()
//                .collect(Collectors.toMap(
//                        a -> a,
//                        a -> a.getScoreList().stream()
//                            .collect(Collectors.toMap())
//
        // Tworzę mapę Arcade, Game i w pętli dodaję do niej elementy: key:arcade biorę z listy, value:ustalam z drugiej mapy
        Map<Arcade, Game> mapAG2 = new HashMap<>();
        for (int i = 0; i < arcades.size(); i++) {
            Set<Game> setGames = arcades.get(i).getScoreList().stream()
                    .map(score -> score.getGame())
                    .collect(Collectors.toSet());

            Arcade arcadeI = arcades.get(i);

            Map<Game, Integer> mapGI = setGames.stream()
                    .collect(Collectors.toMap(
                            g -> g,
                            g -> arcadeI.getScoreList().stream()
                                .filter(score -> score.getGame().equals(g))
                                .collect(Collectors.toList())
                                .size()
                    ));

            Game gameI = mapGI.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .findFirst()
                    .get()
                    .getKey();

            mapAG2.put(arcadeI, gameI);
        }

        mapAG2.forEach((k, v) -> System.out.println(k.getName() + " " + v.name()));


        System.out.println();
        System.out.println("20test2");
        Arcade arcade0x15 = arcades.stream()
                .filter(arcade -> arcade.getName().equals("0x03"))
                .findFirst().get();

        Game[] tabG = Game.values();

        Game game0 = tabG[7];
        System.out.println(game0);
        List<Score> filtredByGame = arcade0x15.getScoreList().stream()
                .filter(score -> score.getGame().equals(game0))
                .collect(Collectors.toList());
        filtredByGame.stream().forEach(System.out::println);

        System.out.println();
        List<Score> sorted = filtredByGame.stream()
                .sorted(new Comparator<Score>() {
                    @Override
                    public int compare(Score o1, Score o2) {
                        if (o1.getScore() > o2.getScore()) {
                            return -1;
                        } else if (o1.getScore() < o2.getScore()) {
                            return 1;
                        }
                            return 0;
                    }
                })
                .collect(Collectors.toList());

        sorted.stream().forEach(System.out::println);

        System.out.println();
        List<Score> scoreT = arcades.stream()
                .flatMap(arcade -> arcade.getScoreList().stream())
                .filter(score -> score.getPlayerName().equals("worm") && score.getScore() == 9873)
                .collect(Collectors.toList());
        System.out.println(scoreT);


        System.out.println();
        System.out.println("20test3");
        for (int i = 0; i < arcades.size(); i++) {
            Arcade arcadeI = arcades.get(i);
//            System.out.println(arcadeI.getName());

            List<Game> gameList = arcadeI.getScoreList().stream()
                    .map(score -> score.getGame())
                    .collect(Collectors.toSet())
                    .stream()
                    .collect(Collectors.toList());

//            Map<Game, List<Score>> gameScoreMapI = gameList.stream()
//                    .collect(Collectors.toMap(
//                            g -> g,
//                            g -> arcadeI.getScoreList().stream()
//                                .filter(score -> score.equals(g))
//                                .collect(Collectors.toList())
//                    ));
//
//            gameScoreMapI.forEach((k, v) -> System.out.println(k + " " + v));

            Map<Game, List<String>> gameListStringMapI = new LinkedHashMap<>();

            for (int j = 0; j < gameList.size(); j++) {
//                List<Score> scoreListSingleG = gameScoreMapI.get(gameList.get(i));
                Game gameG = gameList.get(j);

                List<Score> scoreListSingleG = arcadeI.getScoreList().stream()
                        .filter(score -> score.getGame().equals(gameG))
                        .collect(Collectors.toList());

                List<Score> sortedScoreListSingleG = scoreListSingleG.stream()
                        .sorted(new Comparator<Score>() {
                            @Override
                            public int compare(Score o1, Score o2) {
                                if (o1.getScore() > o2.getScore()) {
                                    return -1;
                                } else if (o1.getScore() < o2.getScore()) {
                                    return 1;
                                }
                                return 0;
                            }
                        })
                        .collect(Collectors.toList());

                List<Score> scoreList3Best = new ArrayList<>();
                for (int k = 0; k < 3; k++) {
                    if (k <= sortedScoreListSingleG.size() - 1) {
                        scoreList3Best.add(sortedScoreListSingleG.get(k));
                    }
                }

//                scoreList3Best.forEach(System.out::println);
//                System.out.println();

                List<String> stringList3BestPlayersG = new ArrayList<>();
                for (int k = 0; k < 3; k++) {
                    if (k <= scoreList3Best.size() - 1) {
                        stringList3BestPlayersG.add(scoreList3Best.get(k).getPlayerName());
                    }
                }

//                stringList3BestPlayersG.forEach(System.out::println);
//                System.out.println();


                gameListStringMapI.put(gameG, stringList3BestPlayersG);
            }
            Map<Arcade, Map<Game, List<String>>> mapMap = new HashMap<>();
            mapMap.put(arcadeI, gameListStringMapI);
            mapMap.forEach((k, v) -> System.out.println(k.getName() + " " + v));
        }
   }



    // 1. Posortuj i wypisz automaty po ilości rozegranych meczy
    public static void wypiszPosortowanePoIlosciMeczy(List<Arcade> arcades) {
        arcades.stream().sorted((a1, a2) -> Integer.compare(a1.getGamesPlayed(), a2.getGamesPlayed()))
                .forEach(arcade -> System.out.println(arcade.getName() + " " + arcade.getGamesPlayed()));
    }

    // 2. Posortuj i wypisz automaty po ilości zapisanych wyników (ilość score)
    public static void wypiszPosortowanePoIlosciZapisanychWynikow(List<Arcade> arcades) {
        arcades.stream().sorted((a1, a2) -> Integer.compare(a1.getScoreList().size(), a2.getScoreList().size()))
                .forEach(arcade -> System.out.println(arcade.getName() + " " + arcade.getScoreList().size()));
    }

    // 3. Znadjź i zwróć automat który ma najwięcej zapisanych wyników z gry Mario
    public static Optional<Map.Entry<Arcade, Long>> maxArcadeOptional(List<Arcade> arcades) {
        return arcades.stream()
                .collect(Collectors.toMap(arcade -> arcade, arcade ->
                        arcade.getScoreList().stream().filter(score -> score.getGame() == Game.MARIO).count()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
    }

    // 4. Znajdź i wypisz wszystkie automaty z Gdańska
    public static void automatyGdansk(List<Arcade> arcades) {
        arcades.stream().filter(arcade -> arcade.getCity().equals("Gdansk"))
                .forEach(arcade -> System.out.println(arcade.getName() + " " + arcade.getCity()));
    }

    // 5. Znajdź wszystkie wyniki z Mario i wypisz nazwy użytkowników które wystąpiły na więcej niż jednym automacie.
//    public static void wynikiMarioINazwyUzytkownikowNeWiecejNiz1Automacie(List<Arcade> arcades) {
//        arcades.stream()
//                .map(arcade -> arcade.getScoreList())
//                .flatMap(scores -> scores.stream())
//                .filter(score -> score.getGame().equals("Mario"))
//                .count() > 1
//                .
//    }

    // 6. Znajdź wyniki najlepszego gracza gry BARBIE_DESTRUCTION. Jeśli gracze mają tyle samo punktów to drugim kryterium jest czas. Im krótszy czas gry, tym wyżej powinien być gracz w rankingu.
    public static void znajdzMaxScoreBARBIE_DESTRUCTION(List<Arcade> arcades) {
         arcades.stream()
                .map(arcade -> arcade.getScoreList())
                .flatMap(scores -> scores.stream())
                .filter(score -> score.getGame().equals("BARBIE_DESTRUCTION"))
                .map(score -> score.getScore())
                .max(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if (o1 > o2) {
                            return 1;
                        } else if (o1 < o2) {
                            return -1;
                        }
                        return 0;
                    }
                });
    }
}
