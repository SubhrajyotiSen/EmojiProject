package com.anonymous.emojiproject;

import org.json.JSONArray;
import org.json.JSONException;


public class EmojiList {
    String source = "[\n" +
            "  {\n" +
            "    \"name\":\"grinning\" ,\n" +
            "    \"keywords\": [\"face\", \"smile\", \"happy\", \"joy\"],\n" +
            "    \"char\": \"\uD83D\uDE00\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"grin\",\n" +
            "    \"keywords\": [\"face\", \"happy\", \"smile\", \"joy\"],\n" +
            "    \"char\": \"\uD83D\uDE01\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"joy\",\n" +
            "    \"keywords\": [\"face\", \"cry\", \"tears\", \"weep\", \"happy\", \"haha\"],\n" +
            "    \"char\": \"\uD83D\uDE02\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"smiley\",\n" +
            "    \"keywords\": [\"face\", \"happy\", \"joy\", \"haha\"],\n" +
            "    \"char\": \"\uD83D\uDE03\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"smile\" ,\n" +
            "    \"keywords\": [\"face\", \"happy\", \"joy\", \"funny\", \"haha\", \"laugh\", \"like\"],\n" +
            "    \"char\": \"\uD83D\uDE04\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"sweat_smile\",\n" +
            "    \"keywords\": [\"face\", \"hot\", \"happy\", \"laugh\"],\n" +
            "    \"char\": \"\uD83D\uDE05\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"laughing\",\n" +
            "    \"keywords\": [\"happy\", \"joy\", \"lol\", \"satisfied\", \"haha\", \"face\", \"glad\"],\n" +
            "    \"char\": \"\uD83D\uDE06\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"innocent\",\n" +
            "    \"keywords\": [\"face\", \"angel\", \"heaven\", \"halo\"],\n" +
            "    \"char\": \"\uD83D\uDE07\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"smiling_imp\",\n" +
            "    \"keywords\": [\"devil\", \"horns\"],\n" +
            "    \"char\": \"\uD83D\uDE08\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"imp\" ,\n" +
            "    \"keywords\": [\"devil\", \"angry\", \"horns\"],\n" +
            "    \"char\": \"\uD83D\uDC7F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"wink\",\n" +
            "    \"keywords\": [\"face\", \"happy\", \"mischievous\", \"secret\"],\n" +
            "    \"char\": \"\uD83D\uDE09\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"blush\" ,\n" +
            "    \"keywords\": [\"face\", \"smile\", \"happy\", \"flushed\", \"crush\", \"embarrassed\", \"shy\", \"joy\"],\n" +
            "    \"char\": \"\uD83D\uDE0A\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"relaxed\",\n" +
            "    \"keywords\": [\"face\", \"blush\", \"massage\", \"happiness\"],\n" +
            "    \"char\": \"☺️\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"yum\",\n" +
            "    \"keywords\": [\"happy\", \"joy\", \"tongue\", \"smile\", \"face\", \"silly\"],\n" +
            "    \"char\": \"\uD83D\uDE0B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"relieved\",\n" +
            "    \"keywords\": [\"face\", \"relaxed\", \"phew\", \"massage\", \"happiness\"],\n" +
            "    \"char\": \"\uD83D\uDE0C\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"heart_eyes\",\n" +
            "    \"keywords\": [\"face\", \"love\", \"like\", \"affection\", \"valentines\", \"infatuation\", \"crush\"],\n" +
            "    \"char\": \"\uD83D\uDE0D\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sunglasses\",\n" +
            "    \"keywords\": [\"face\", \"cool\", \"smile\", \"summer\", \"beach\"],\n" +
            "    \"char\": \"\uD83D\uDE0E\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"smirk\",\n" +
            "    \"keywords\": [\"face\", \"smile\", \"mean\", \"prank\", \"smug\", \"sarcasm\"],\n" +
            "    \"char\": \"\uD83D\uDE0F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"neutral_face\",\n" +
            "    \"keywords\": [\"indifference\", \"meh\"],\n" +
            "    \"char\": \"\uD83D\uDE10\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"expressionless\",\n" +
            "    \"keywords\": [\"face\", \"indifferent\", \"-_-\", \"meh\"],\n" +
            "    \"char\": \"\uD83D\uDE11\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"unamused\",\n" +
            "    \"keywords\": [\"indifference\", \"bored\", \"straight face\", \"serious\"],\n" +
            "    \"char\": \"\uD83D\uDE12\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sweat\",\n" +
            "    \"keywords\": [\"face\", \"hot\", \"sad\", \"tired\", \"exercise\"],\n" +
            "    \"char\": \"\uD83D\uDE13\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"pensive\",\n" +
            "    \"keywords\": [\"face\", \"sad\", \"depressed\", \"okay\", \"upset\"],\n" +
            "    \"char\": \"\uD83D\uDE14\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"confused\",\n" +
            "    \"keywords\": [\"face\", \"indifference\", \"huh\", \"weird\", \"hmmm\"],\n" +
            "    \"char\": \"\uD83D\uDE15\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"confounded\",\n" +
            "    \"keywords\": [\"face\", \"confused\", \"sick\", \"unwell\", \"oops\"],\n" +
            "    \"char\": \"\uD83D\uDE16\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"kissing\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"face\", \"3\", \"valentines\", \"infatuation\"],\n" +
            "    \"char\": \"\uD83D\uDE17\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"kissing_heart\" ,\n" +
            "    \"keywords\": [\"face\", \"love\", \"like\", \"affection\", \"valentines\", \"infatuation\"],\n" +
            "    \"char\": \"\uD83D\uDE18\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"kissing_smiling_eyes\",\n" +
            "    \"keywords\": [\"face\", \"affection\", \"valentines\", \"infatuation\"],\n" +
            "    \"char\": \"\uD83D\uDE19\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"kissing_closed_eyes\",\n" +
            "    \"keywords\": [\"face\", \"love\", \"like\", \"affection\", \"valentines\", \"infatuation\"],\n" +
            "    \"char\": \"\uD83D\uDE1A\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"stuck_out_tongue\",\n" +
            "    \"keywords\": [\"face\", \"prank\", \"childish\", \"playful\", \"mischievous\", \"smile\"],\n" +
            "    \"char\": \"\uD83D\uDE1B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"stuck_out_tongue_winking_eye\",\n" +
            "    \"keywords\": [\"face\", \"prank\", \"childish\", \"playful\", \"mischievous\", \"smile\"],\n" +
            "    \"char\": \"\uD83D\uDE1C\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"stuck_out_tongue_closed_eyes\",\n" +
            "    \"keywords\": [\"face\", \"prank\", \"playful\", \"mischievous\", \"smile\"],\n" +
            "    \"char\": \"\uD83D\uDE1D\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"disappointed\",\n" +
            "    \"keywords\": [\"face\", \"sad\", \"upset\", \"depressed\"],\n" +
            "    \"char\": \"\uD83D\uDE1E\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"worried\" ,\n" +
            "    \"keywords\": [\"face\", \"concern\", \"nervous\"],\n" +
            "    \"char\": \"\uD83D\uDE1F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"angry\" ,\n" +
            "    \"keywords\": [\"mad\", \"face\", \"annoyed\", \"frustrated\"],\n" +
            "    \"char\": \"\uD83D\uDE20\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"rage\",\n" +
            "    \"keywords\": [\"angry\", \"mad\", \"hate\", \"despise\"],\n" +
            "    \"char\": \"\uD83D\uDE21\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cry\",\n" +
            "    \"keywords\": [\"face\", \"tears\", \"sad\", \"depressed\", \"upset\"],\n" +
            "    \"char\": \"\uD83D\uDE22\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"persevere\",\n" +
            "    \"keywords\": [\"face\", \"sick\", \"no\", \"upset\", \"oops\"],\n" +
            "    \"char\": \"\uD83D\uDE23\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"triumph\",\n" +
            "    \"keywords\": [\"face\", \"gas\", \"phew\", \"proud\", \"pride\"],\n" +
            "    \"char\": \"\uD83D\uDE24\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"disappointed_relieved\",\n" +
            "    \"keywords\": [\"face\", \"phew\", \"sweat\", \"nervous\"],\n" +
            "    \"char\": \"\uD83D\uDE25\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"frowning\",\n" +
            "    \"keywords\": [\"face\", \"aw\", \"what\"],\n" +
            "    \"char\": \"\uD83D\uDE26\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"anguished\",\n" +
            "    \"keywords\": [\"face\", \"stunned\", \"nervous\"],\n" +
            "    \"char\": \"\uD83D\uDE27\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"fearful\",\n" +
            "    \"keywords\": [\"face\", \"scared\", \"terrified\", \"nervous\", \"oops\", \"huh\"],\n" +
            "    \"char\": \"\uD83D\uDE28\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"weary\",\n" +
            "    \"keywords\": [\"face\", \"tired\", \"sleepy\", \"sad\", \"frustrated\", \"upset\"],\n" +
            "    \"char\": \"\uD83D\uDE29\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sleepy\",\n" +
            "    \"keywords\": [\"face\", \"tired\", \"rest\", \"nap\"],\n" +
            "    \"char\": \"\uD83D\uDE2A\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tired_face\",\n" +
            "    \"keywords\": [\"sick\", \"whine\", \"upset\", \"frustrated\"],\n" +
            "    \"char\": \"\uD83D\uDE2B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"grimacing\",\n" +
            "    \"keywords\": [\"face\", \"grimace\", \"teeth\"],\n" +
            "    \"char\": \"\uD83D\uDE2C\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sob\",\n" +
            "    \"keywords\": [\"face\", \"cry\", \"tears\", \"sad\", \"upset\", \"depressed\"],\n" +
            "    \"char\": \"\uD83D\uDE2D\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"open_mouth\",\n" +
            "    \"keywords\": [\"face\", \"surprise\", \"impressed\", \"wow\"],\n" +
            "    \"char\": \"\uD83D\uDE2E\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"hushed\",\n" +
            "    \"keywords\": [\"face\", \"woo\", \"shh\"],\n" +
            "    \"char\": \"\uD83D\uDE2F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cold_sweat\",\n" +
            "    \"keywords\": [\"face\", \"nervous\"],\n" +
            "    \"char\": \"\uD83D\uDE30\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"scream\",\n" +
            "    \"keywords\": [\"face\", \"munch\", \"scared\", \"omg\"],\n" +
            "    \"char\": \"\uD83D\uDE31\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"astonished\",\n" +
            "    \"keywords\": [\"face\", \"xox\", \"surprised\", \"poisoned\"],\n" +
            "    \"char\": \"\uD83D\uDE32\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"flushed\",\n" +
            "    \"keywords\": [\"face\", \"blush\", \"shy\", \"flattered\"],\n" +
            "    \"char\": \"\uD83D\uDE33\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sleeping\",\n" +
            "    \"keywords\": [\"face\", \"tired\", \"sleepy\", \"night\", \"zzz\"],\n" +
            "    \"char\": \"\uD83D\uDE34\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dizzy_face\",\n" +
            "    \"keywords\": [\"spent\", \"unconscious\", \"xox\"],\n" +
            "    \"char\": \"\uD83D\uDE35\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"no_mouth\",\n" +
            "    \"keywords\": [\"face\", \"hellokitty\"],\n" +
            "    \"char\": \"\uD83D\uDE36\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"mask\",\n" +
            "    \"keywords\": [\"face\", \"sick\", \"ill\", \"disease\"],\n" +
            "    \"char\": \"\uD83D\uDE37\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"smile_cat\",\n" +
            "    \"keywords\": [\"animal\", \"cats\"],\n" +
            "    \"char\": \"\uD83D\uDE38\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"joy_cat\",\n" +
            "    \"keywords\": [\"animal\", \"cats\", \"haha\", \"happy\", \"tears\"],\n" +
            "    \"char\": \"\uD83D\uDE39\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"smiley_cat\",\n" +
            "    \"keywords\": [\"animal\", \"cats\", \"happy\"],\n" +
            "    \"char\": \"\uD83D\uDE3A\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"heart_eyes_cat\",\n" +
            "    \"keywords\": [\"animal\", \"love\", \"like\", \"affection\", \"cats\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDE3B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"smirk_cat\",\n" +
            "    \"keywords\": [\"animal\", \"cats\"],\n" +
            "    \"char\": \"\uD83D\uDE3C\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"kissing_cat\",\n" +
            "    \"keywords\": [\"animal\", \"cats\"],\n" +
            "    \"char\": \"\uD83D\uDE3D\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"pouting_cat\",\n" +
            "    \"keywords\": [\"animal\", \"cats\"],\n" +
            "    \"char\": \"\uD83D\uDE3E\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"crying_cat_face\",\n" +
            "    \"keywords\": [\"animal\", \"tears\", \"weep\", \"sad\", \"cats\", \"upset\"],\n" +
            "    \"char\": \"\uD83D\uDE3F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"scream_cat\",\n" +
            "    \"keywords\": [\"animal\", \"cats\", \"munch\", \"scared\"],\n" +
            "    \"char\": \"\uD83D\uDE40\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"footprints\",\n" +
            "    \"keywords\": [\"feet\", \"tracking\", \"walking\", \"beach\"],\n" +
            "    \"char\": \"\uD83D\uDC63\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bust_in_silhouette\",\n" +
            "    \"keywords\": [\"user\", \"person\", \"human\"],\n" +
            "    \"char\": \"\uD83D\uDC64\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"busts_in_silhouette\",\n" +
            "    \"keywords\": [\"user\", \"person\", \"human\", \"group\", \"team\"],\n" +
            "    \"char\": \"\uD83D\uDC65\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"baby\",\n" +
            "    \"keywords\": [\"child\", \"boy\", \"girl\", \"toddler\"],\n" +
            "    \"char\": \"\uD83D\uDC76\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"boy\",\n" +
            "    \"keywords\": [\"man\", \"male\", \"guy\", \"teenager\"],\n" +
            "    \"char\": \"\uD83D\uDC66\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"girl\",\n" +
            "    \"keywords\": [\"female\", \"woman\", \"teenager\"],\n" +
            "    \"char\": \"\uD83D\uDC67\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"man\",\n" +
            "    \"keywords\": [\"mustache\", \"father\", \"dad\", \"guy\", \"classy\", \"sir\", \"moustache\"],\n" +
            "    \"char\": \"\uD83D\uDC68\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"woman\",\n" +
            "    \"keywords\": [\"female\", \"girls\", \"lady\"],\n" +
            "    \"char\": \"\uD83D\uDC69\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"family\",\n" +
            "    \"keywords\": [\"home\", \"parents\", \"child\", \"mom\", \"dad\", \"father\", \"mother\", \"people\", \"human\"],\n" +
            "    \"char\": \"\uD83D\uDC6A\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"couple\",\n" +
            "    \"keywords\": [\"pair\", \"people\", \"human\", \"love\", \"date\", \"dating\", \"like\", \"affection\", \"valentines\", \"marriage\"],\n" +
            "    \"char\": \"\uD83D\uDC6B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"two_men_holding_hands\",\n" +
            "    \"keywords\": [\"pair\", \"couple\", \"love\", \"like\", \"bromance\", \"friendship\", \"people\", \"human\"],\n" +
            "    \"char\": \"\uD83D\uDC6C\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"two_women_holding_hands\",\n" +
            "    \"keywords\": [\"pair\", \"friendship\", \"couple\", \"love\", \"like\", \"female\", \"people\", \"human\"],\n" +
            "    \"char\": \"\uD83D\uDC6D\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\":  \"cop\",\n" +
            "    \"keywords\": [\"man\", \"police\", \"law\", \"legal\", \"enforcement\", \"arrest\", \"911\"],\n" +
            "    \"char\": \"\uD83D\uDC6E\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dancers\",\n" +
            "    \"keywords\": [\"female\", \"bunny\", \"women\", \"girls\"],\n" +
            "    \"char\": \"\uD83D\uDC6F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bride_with_veil\",\n" +
            "    \"keywords\": [\"couple\", \"marriage\", \"wedding\"],\n" +
            "    \"char\": \"\uD83D\uDC70\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"person_with_blond_hair\",\n" +
            "    \"keywords\": [\"man\", \"male\", \"boy\", \"blonde\", \"guy\"],\n" +
            "    \"char\": \"\uD83D\uDC71\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"man_with_gua_pi_mao\",\n" +
            "    \"keywords\": [\"male\", \"boy\"],\n" +
            "    \"char\": \"\uD83D\uDC72\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"man_with_turban\",\n" +
            "    \"keywords\": [\"male\", \"indian\", \"hinduism\", \"arabs\"],\n" +
            "    \"char\": \"\uD83D\uDC73\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"older_man\",\n" +
            "    \"keywords\": [\"human\", \"male\", \"men\"],\n" +
            "    \"char\": \"\uD83D\uDC74\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"older_woman\",\n" +
            "    \"keywords\": [\"female\", \"women\", \"girl\", \"lady\"],\n" +
            "    \"char\": \"\uD83D\uDC75\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"baby\",\n" +
            "    \"keywords\": [\"child\", \"boy\", \"girl\", \"toddler\"],\n" +
            "    \"char\": \"\uD83D\uDC76\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"construction_worker\",\n" +
            "    \"keywords\": [\"male\", \"human\", \"wip\", \"guy\", \"build\"],\n" +
            "    \"char\": \"\uD83D\uDC77\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"princess\",\n" +
            "    \"keywords\": [\"girl\", \"woman\", \"female\", \"blond\", \"crown\", \"royal\", \"queen\"],\n" +
            "    \"char\": \"\uD83D\uDC78\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"guardsman\",\n" +
            "    \"keywords\": [\"uk\", \"gb\", \"british\", \"male\", \"guy\", \"royal\"],\n" +
            "    \"char\": \"\uD83D\uDC82\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"angel\" ,\n" +
            "    \"keywords\": [\"heaven\", \"wings\", \"halo\"],\n" +
            "    \"char\": \"\uD83D\uDC7C\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"santa\",\n" +
            "    \"keywords\": [\"festival\", \"man\", \"male\", \"xmas\", \"father christmas\"],\n" +
            "    \"char\": \"\uD83C\uDF85\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ghost\",\n" +
            "    \"keywords\": [\"halloween\", \"spooky\", \"scary\"],\n" +
            "    \"char\": \"\uD83D\uDC7B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"japanese_ogre\",\n" +
            "    \"keywords\": [\"monster\", \"red\", \"mask\", \"halloween\", \"scary\", \"creepy\", \"devil\", \"demon\"],\n" +
            "    \"char\": \"\uD83D\uDC79\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"japanese_goblin\",\n" +
            "    \"keywords\": [\"red\", \"evil\", \"mask\", \"monster\", \"scary\", \"creepy\"],\n" +
            "    \"char\": \"\uD83D\uDC7A\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"hankey\",\n" +
            "    \"keywords\": [\"poop\", \"shitface\", \"fail\", \"turd\"],\n" +
            "    \"char\": \"\uD83D\uDCA9\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"skull\",\n" +
            "    \"keywords\": [\"dead\", \"skeleton\", \"creepy\"],\n" +
            "    \"char\": \"\uD83D\uDC80\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"alien\",\n" +
            "    \"keywords\": [\"UFO\", \"paul\", \"weird\", \"outer_space\"],\n" +
            "    \"char\": \"\uD83D\uDC7D\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"space_invader\",\n" +
            "    \"keywords\": [\"game\", \"arcade\", \"play\"],\n" +
            "    \"char\": \"\uD83D\uDC7E\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bow\",\n" +
            "    \"keywords\": [\"man\", \"male\", \"boy\"],\n" +
            "    \"char\": \"\uD83D\uDE47\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"information_desk_person\",\n" +
            "    \"keywords\": [\"female\", \"girl\", \"woman\", \"human\"],\n" +
            "    \"char\": \"\uD83D\uDC81\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"no_good\",\n" +
            "    \"keywords\": [\"female\", \"girl\", \"woman\", \"nope\"],\n" +
            "    \"char\": \"\uD83D\uDE45\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ok_woman\",\n" +
            "    \"keywords\": [\"women\", \"girl\", \"female\", \"pink\", \"human\"],\n" +
            "    \"char\": \"\uD83D\uDE46\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"raising_hand\",\n" +
            "    \"keywords\": [\"female\", \"girl\", \"woman\"],\n" +
            "    \"char\": \"\uD83D\uDE4B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"person_with_pouting_face\",\n" +
            "    \"keywords\": [\"female\", \"girl\", \"woman\"],\n" +
            "    \"char\": \"\uD83D\uDE4E\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"person_frowning\",\n" +
            "    \"keywords\": [\"female\", \"girl\", \"woman\", \"sad\", \"depressed\", \"discouraged\", \"unhappy\"],\n" +
            "    \"char\": \"\uD83D\uDE4D\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"massage\",\n" +
            "    \"keywords\": [\"female\", \"girl\", \"woman\", \"head\"],\n" +
            "    \"char\": \"\uD83D\uDC86\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"haircut\",\n" +
            "    \"keywords\": [\"female\", \"girl\", \"woman\"],\n" +
            "    \"char\": \"\uD83D\uDC87\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"couple_with_heart\",\n" +
            "    \"keywords\": [\"pair\", \"love\", \"like\", \"affection\", \"human\", \"dating\", \"valentines\", \"marriage\"],\n" +
            "    \"char\": \"\uD83D\uDC91\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"couplekiss\",\n" +
            "    \"keywords\": [\"pair\", \"valentines\", \"love\", \"like\", \"dating\", \"marriage\"],\n" +
            "    \"char\": \"\uD83D\uDC8F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"raised_hands\",\n" +
            "    \"keywords\": [\"gesture\", \"hooray\", \"yea\", \"celebration\"],\n" +
            "    \"char\": \"\uD83D\uDE4C\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"clap\",\n" +
            "    \"keywords\": [\"hands\", \"praise\", \"applause\", \"congrats\", \"yay\"],\n" +
            "    \"char\": \"\uD83D\uDC4F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ear\",\n" +
            "    \"keywords\": [\"face\", \"hear\", \"sound\", \"listen\"],\n" +
            "    \"char\": \"\uD83D\uDC42\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"keywords\": [\"look\", \"watch\", \"stalk\", \"peek\"],\n" +
            "    \"name\": \"eyes\",\n" +
            "    \"char\": \"\uD83D\uDC40\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"nose\",\n" +
            "    \"keywords\": [\"smell\", \"sniff\"],\n" +
            "    \"char\": \"\uD83D\uDC43\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"lips\",\n" +
            "    \"keywords\": [\"mouth\", \"kiss\"],\n" +
            "    \"char\": \"\uD83D\uDC44\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"kiss\",\n" +
            "    \"keywords\": [\"face\", \"lips\", \"love\", \"like\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC8B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tongue\",\n" +
            "    \"keywords\": [\"mouth\", \"playful\"],\n" +
            "    \"char\": \"\uD83D\uDC45\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"nail_care\",\n" +
            "    \"keywords\": [\"beauty\", \"manicure\", \"fashion\"],\n" +
            "    \"char\": \"\uD83D\uDC85\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"wave\",\n" +
            "    \"keywords\": [\"hands\", \"gesture\", \"goodbye\", \"solong\", \"farewell\", \"hello\", \"palm\"],\n" +
            "    \"char\": \"\uD83D\uDC4B\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"thumbsup\",\n" +
            "    \"keywords\": [\"thumbsup\", \"yes\", \"awesome\", \"good\", \"agree\", \"accept\", \"cool\", \"hand\", \"like\"],\n" +
            "    \"char\": \"\uD83D\uDC4D\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"thumbsdown\",\n" +
            "    \"keywords\": [\"thumbsdown\", \"no\", \"dislike\", \"hand\"],\n" +
            "    \"char\": \"\uD83D\uDC4E\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"point_up\" ,\n" +
            "    \"keywords\": [\"hand\", \"fingers\", \"direction\"],\n" +
            "    \"char\": \"☝️\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"point_up_2\",\n" +
            "    \"keywords\": [\"fingers\", \"hand\", \"direction\"],\n" +
            "    \"char\": \"\uD83D\uDC46\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"point_down\",\n" +
            "    \"keywords\": [\"fingers\", \"hand\", \"direction\"],\n" +
            "    \"char\": \"\uD83D\uDC47\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"point_left\",\n" +
            "    \"keywords\": [\"direction\", \"fingers\", \"hand\"],\n" +
            "    \"char\": \"\uD83D\uDC48\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"point_right\",\n" +
            "    \"keywords\": [\"fingers\", \"hand\", \"direction\"],\n" +
            "    \"char\": \"\uD83D\uDC49\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ok_hand\",\n" +
            "    \"keywords\": [\"fingers\", \"limbs\", \"perfect\"],\n" +
            "    \"char\": \"\uD83D\uDC4C\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"v\",\n" +
            "    \"keywords\": [\"fingers\", \"ohyeah\", \"hand\", \"peace\", \"victory\", \"two\"],\n" +
            "    \"char\": \"✌️\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"facepunch\",\n" +
            "    \"keywords\": [\"angry\", \"violence\", \"fist\", \"hit\", \"attack\", \"hand\"],\n" +
            "    \"char\": \"\uD83D\uDC4A\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"fist\",\n" +
            "    \"keywords\": [\"fingers\", \"hand\", \"grasp\"],\n" +
            "    \"char\": \"✊\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"hand\",\n" +
            "    \"keywords\": [\"fingers\", \"stop\", \"highfive\", \"palm\", \"ban\", \"raised_hand\"],\n" +
            "    \"char\": \"✋\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"muscle\",\n" +
            "    \"keywords\": [\"arm\", \"flex\", \"hand\", \"summer\", \"strong\"],\n" +
            "    \"char\": \"\uD83D\uDCAA\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"openhands\",\n" +
            "    \"keywords\": [\"fingers\", \"butterfly\"],\n" +
            "    \"char\": \"\uD83D\uDC50\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"pray\",\n" +
            "    \"keywords\": [\"please\", \"hope\", \"wish\", \"namaste\", \"highfive\"],\n" +
            "    \"char\": \"\uD83D\uDE4F\",\n" +
            "    \"category\": \"people\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"seedling\",\n" +
            "    \"keywords\": [\"plant\", \"nature\", \"grass\", \"lawn\", \"spring\"],\n" +
            "    \"char\": \"\uD83C\uDF31\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"evergreentree\",\n" +
            "    \"keywords\": [\"plant\", \"nature\"],\n" +
            "    \"char\": \"\uD83C\uDF32\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"deciduoustree\",\n" +
            "    \"keywords\": [\"plant\", \"nature\"],\n" +
            "    \"char\": \"\uD83C\uDF33\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"palmtree\",\n" +
            "    \"keywords\": [\"plant\", \"vegetable\", \"nature\", \"summer\", \"beach\"],\n" +
            "    \"char\": \"\uD83C\uDF34\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cactus\",\n" +
            "    \"keywords\": [\"vegetable\", \"plant\", \"nature\"],\n" +
            "    \"char\": \"\uD83C\uDF35\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tulip\",\n" +
            "    \"keywords\": [\"flowers\", \"plant\", \"nature\", \"summer\", \"spring\"],\n" +
            "    \"char\": \"\uD83C\uDF37\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"rose\",\n" +
            "    \"keywords\": [\"flowers\", \"valentines\", \"love\", \"spring\"],\n" +
            "    \"char\": \"\uD83C\uDF39\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"hibiscus\",\n" +
            "    \"keywords\": [\"plant\", \"vegetable\", \"flowers\", \"beach\"],\n" +
            "    \"char\": \"\uD83C\uDF3A\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sunflower\",\n" +
            "    \"keywords\": [\"nature\", \"plant\", \"fall\"],\n" +
            "    \"char\": \"\uD83C\uDF3B\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "  \n" +
            "   {\n" +
            "    \"name\": \"bouquet\",\n" +
            "    \"keywords\": [\"flowers\", \"nature\", \"spring\"],\n" +
            "    \"char\": \"\uD83D\uDC90\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"rat\",\n" +
            "    \"keywords\": [\"animal\", \"mouse\", \"rodent\"],\n" +
            "    \"char\": \"\uD83D\uDC00\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"mouse2\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"rodent\"],\n" +
            "    \"char\": \"\uD83D\uDC01\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"mouse\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"cheese\"],\n" +
            "    \"char\": \"\uD83D\uDC2D\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"hamster\",\n" +
            "    \"keywords\": [\"animal\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC39\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"ox\" ,\n" +
            "    \"keywords\": [\"animal\", \"cow\", \"beef\"],\n" +
            "    \"char\": \"\uD83D\uDC02\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"water_buffalo\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"ox\", \"cow\"],\n" +
            "    \"char\": \"\uD83D\uDC03\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cow2\",\n" +
            "    \"keywords\": [\"beef\", \"ox\", \"animal\", \"nature\", \"moo\", \"milk\"],\n" +
            "    \"char\": \"\uD83D\uDC04\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":  \"cow\",\n" +
            "    \"keywords\": [\"beef\", \"ox\", \"animal\", \"nature\", \"moo\", \"milk\"],\n" +
            "    \"char\": \"\uD83D\uDC2E\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tiger2\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"roar\"],\n" +
            "    \"char\": \"\uD83D\uDC05\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\":  \"leopard\",\n" +
            "    \"keywords\": [\"animal\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC06\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tiger\",\n" +
            "    \"keywords\": [\"animal\", \"cat\", \"danger\", \"wild\", \"nature\", \"roar\"],\n" +
            "    \"char\": \"\uD83D\uDC2F\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"rabbit2\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"pet\", \"magic\", \"spring\"],\n" +
            "    \"char\": \"\uD83D\uDC07\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"rabbit\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"pet\", \"spring\", \"magic\"],\n" +
            "    \"char\": \"\uD83D\uDC30\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cat2\" ,\n" +
            "    \"keywords\": [\"animal\", \"meow\", \"pet\", \"cats\"],\n" +
            "    \"char\": \"\uD83D\uDC08\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cat\",\n" +
            "    \"keywords\": [\"animal\", \"meow\", \"nature\", \"pet\"],\n" +
            "    \"char\": \"\uD83D\uDC31\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"racehorse\",\n" +
            "    \"keywords\": [\"animal\", \"gamble\", \"luck\"],\n" +
            "    \"char\": \"\uD83D\uDC0E\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"horse\",\n" +
            "    \"keywords\": [\"animal\", \"brown\", \"nature\", \"unicorn\"],\n" +
            "    \"char\": \"\uD83D\uDC34\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ram\",\n" +
            "    \"keywords\": [\"animal\", \"sheep\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC0F\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sheep\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"wool\", \"shipit\"],\n" +
            "    \"char\": \"\uD83D\uDC11\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"goat\",\n" +
            "    \"keywords\": [\"animal\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC10\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"rooster\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"chicken\"],\n" +
            "    \"char\": \"\uD83D\uDC13\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"chicken\",\n" +
            "    \"keywords\": [\"animal\", \"cluck\", \"nature\", \"bird\"],\n" +
            "    \"char\": \"\uD83D\uDC14\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"babychick\",\n" +
            "    \"keywords\": [\"animal\", \"chicken\", \"bird\"],\n" +
            "    \"char\": \"\uD83D\uDC24\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"hatchingchick\",\n" +
            "    \"keywords\": [\"animal\", \"chicken\", \"egg\", \"born\", \"baby\", \"bird\"],\n" +
            "    \"char\": \"\uD83D\uDC23\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"hatchedchick\",\n" +
            "    \"keywords\": [\"animal\", \"chicken\", \"baby\", \"bird\"],\n" +
            "    \"char\": \"\uD83D\uDC25\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bird\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"fly\", \"tweet\", \"spring\"],\n" +
            "    \"char\": \"\uD83D\uDC26\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"penguin\",\n" +
            "    \"keywords\": [\"animal\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC27\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"elephant\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"nose\", \"thailand\", \"circus\"],\n" +
            "    \"char\": \"\uD83D\uDC18\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dromedary_camel\",\n" +
            "    \"keywords\": [\"animal\", \"hot\", \"desert\", \"hump\"],\n" +
            "    \"char\": \"\uD83D\uDC2A\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"camel\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"hot\", \"desert\", \"hump\"],\n" +
            "    \"char\": \"\uD83D\uDC2B\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"boar\",\n" +
            "    \"keywords\": [\"animal\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC17\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"pig2\",\n" +
            "    \"keywords\": [\"animal\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC16\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"pig\",\n" +
            "    \"keywords\": [\"animal\", \"oink\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC37\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"pig_nose\" ,\n" +
            "    \"keywords\": [\"animal\", \"oink\"],\n" +
            "    \"char\": \"\uD83D\uDC3D\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dog2\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"friend\", \"doge\", \"pet\", \"faithful\"],\n" +
            "    \"char\": \"\uD83D\uDC15\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"poodle\",\n" +
            "    \"keywords\": [\"dog\", \"animal\", \"101\", \"nature\", \"pet\"],\n" +
            "    \"char\": \"\uD83D\uDC29\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dog\",\n" +
            "    \"keywords\": [\"animal\", \"friend\", \"nature\", \"woof\", \"puppy\", \"pet\", \"faithful\"],\n" +
            "    \"char\": \"\uD83D\uDC36\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"wolf\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"wild\"],\n" +
            "    \"char\": \"\uD83D\uDC3A\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bear\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"wild\"],\n" +
            "    \"char\": \"\uD83D\uDC3B\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"koala\",\n" +
            "    \"keywords\": [\"animal\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC28\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"pandaface\" ,\n" +
            "    \"keywords\": [\"animal\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC3C\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"monkeyface\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"circus\"],\n" +
            "    \"char\": \"\uD83D\uDC35\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"seenoevil\",\n" +
            "    \"keywords\": [\"monkey\", \"animal\", \"nature\", \"haha\"],\n" +
            "    \"char\": \"\uD83D\uDE48\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"hearnoevil\" ,\n" +
            "    \"keywords\": [\"animal\", \"monkey\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDE49\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"speaknoevil\",\n" +
            "    \"keywords\": [\"monkey\", \"animal\", \"nature\", \"omg\"],\n" +
            "    \"char\": \"\uD83D\uDE4A\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"monkey\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"banana\", \"circus\"],\n" +
            "    \"char\": \"\uD83D\uDC12\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dragon\",\n" +
            "    \"keywords\": [\"animal\", \"myth\", \"nature\", \"chinese\", \"green\"],\n" +
            "    \"char\": \"\uD83D\uDC09\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dragonface\",\n" +
            "    \"keywords\": [\"animal\", \"myth\", \"nature\", \"chinese\", \"green\"],\n" +
            "    \"char\": \"\uD83D\uDC32\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"crocodile\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"reptile\"],\n" +
            "    \"char\": \"\uD83D\uDC0A\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"snake\",\n" +
            "    \"keywords\": [\"animal\", \"evil\", \"nature\", \"hiss\"],\n" +
            "    \"char\": \"\uD83D\uDC0D\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"turtle\",\n" +
            "    \"keywords\": [\"animal\", \"slow\", \"nature\", \"tortoise\"],\n" +
            "    \"char\": \"\uD83D\uDC22\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"frog\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"croak\"],\n" +
            "    \"char\": \"\uD83D\uDC38\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"whale2\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"sea\", \"ocean\"],\n" +
            "    \"char\": \"\uD83D\uDC0B\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"whale\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"sea\", \"ocean\"],\n" +
            "    \"char\": \"\uD83D\uDC33\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dolphin\",\n" +
            "    \"keywords\": [\"animal\", \"nature\", \"fish\", \"sea\", \"ocean\", \"flipper\", \"fins\", \"beach\"],\n" +
            "    \"char\": \"\uD83D\uDC2C\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"octopus\",\n" +
            "    \"keywords\": [\"animal\", \"creature\", \"ocean\", \"sea\", \"nature\", \"beach\"],\n" +
            "    \"char\": \"\uD83D\uDC19\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"fish\",\n" +
            "    \"keywords\": [\"animal\", \"food\", \"nature\"],\n" +
            "    \"char\": \"\uD83D\uDC1F\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tropicalfish\",\n" +
            "    \"keywords\": [\"animal\", \"swim\", \"ocean\", \"beach\"],\n" +
            "    \"char\": \"\uD83D\uDC20\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"blowfish\",\n" +
            "    \"keywords\": [\"nature\", \"food\", \"sea\", \"ocean\"],\n" +
            "    \"char\": \"\uD83D\uDC21\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\":  \"shell\",\n" +
            "    \"keywords\": [\"nature\", \"sea\", \"beach\"],\n" +
            "    \"char\": \"\uD83D\uDC1A\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"snail\",\n" +
            "    \"keywords\": [\"slow\", \"animal\", \"shell\"],\n" +
            "    \"char\": \"\uD83D\uDC0C\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bug\",\n" +
            "    \"keywords\": [\"insect\", \"nature\", \"worm\"],\n" +
            "    \"char\": \"\uD83D\uDC1B\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ant\",\n" +
            "    \"keywords\": [\"animal\", \"insect\", \"nature\", \"bug\"],\n" +
            "    \"char\": \"\uD83D\uDC1C\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bee\",\n" +
            "    \"keywords\": [\"animal\", \"insect\", \"nature\", \"bug\", \"spring\"],\n" +
            "    \"char\": \"\uD83D\uDC1D\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"beetle\",\n" +
            "    \"keywords\": [\"insect\", \"nature\", \"bug\"],\n" +
            "    \"char\": \"\uD83D\uDC1E\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"feet\",\n" +
            "    \"keywords\": [\"animal\", \"tracking\", \"footprints\", \"dog\", \"cat\", \"pet\", \"paw_prints\"],\n" +
            "    \"char\": \"\uD83D\uDC3E\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"thunder\",\n" +
            "    \"keywords\": [\"thunder\", \"weather\", \"lightning bolt\", \"fast\"],\n" +
            "    \"char\": \"⚡\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"fire\",\n" +
            "    \"keywords\": [\"hot\", \"cook\", \"flame\"],\n" +
            "    \"char\": \"\uD83D\uDD25\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"crescentmoon\",\n" +
            "    \"keywords\": [\"night\", \"sleep\", \"sky\", \"evening\", \"magic\"],\n" +
            "    \"char\": \"\uD83C\uDF19\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sunny\",\n" +
            "    \"keywords\": [\"weather\", \"nature\", \"brightness\", \"summer\", \"beach\", \"spring\"],\n" +
            "    \"char\": \"☀️\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"partlysunny\",\n" +
            "    \"keywords\": [\"weather\", \"nature\", \"cloudy\", \"morning\", \"fall\", \"spring\"],\n" +
            "    \"char\": \"⛅\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cloud\",\n" +
            "    \"keywords\": [\"weather\", \"sky\"],\n" +
            "    \"char\": \"☁️\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"droplet\",\n" +
            "    \"keywords\": [\"water\", \"drip\", \"faucet\", \"spring\"],\n" +
            "    \"char\": \"\uD83D\uDCA7\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sweatdrops\",\n" +
            "    \"keywords\": [\"water\", \"drip\", \"oops\"],\n" +
            "    \"char\": \"\uD83D\uDCA6\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"umbrella\",\n" +
            "    \"keywords\": [\"rainy\", \"weather\", \"spring\"],\n" +
            "    \"char\": \"☔\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dash\",\n" +
            "    \"keywords\": [\"wind\", \"air\", \"fast\", \"shoo\", \"fart\", \"smoke\", \"puff\"],\n" +
            "    \"char\": \"\uD83D\uDCA8\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"snowflake\",\n" +
            "    \"keywords\": [\"winter\", \"season\", \"cold\", \"weather\", \"christmas\", \"xmas\"],\n" +
            "    \"char\": \"❄️\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"star2\",\n" +
            "    \"keywords\": [\"night\", \"sparkle\", \"awesome\", \"good\", \"magic\"],\n" +
            "    \"char\": \"\uD83C\uDF1F\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"star\",\n" +
            "    \"keywords\": [\"night\", \"yellow\"],\n" +
            "    \"char\": \"⭐\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"stars\",\n" +
            "    \"keywords\": [\"night\", \"photo\"],\n" +
            "    \"char\": \"\uD83C\uDF20\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sunriseovermountains\",\n" +
            "    \"keywords\": [\"view\", \"vacation\", \"photo\"],\n" +
            "    \"char\": \"\uD83C\uDF04\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sunrise\",\n" +
            "    \"keywords\": [\"morning\", \"view\", \"vacation\", \"photo\"],\n" +
            "    \"char\": \"\uD83C\uDF05\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"rainbow\",\n" +
            "    \"keywords\": [\"nature\", \"happy\", \"unicorn\", \"photo\", \"sky\", \"spring\"],\n" +
            "    \"char\": \"\uD83C\uDF08\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ocean\",\n" +
            "    \"keywords\": [\"sea\", \"water\", \"wave\", \"nature\", \"tsunami\", \"disaster\"],\n" +
            "    \"char\": \"\uD83C\uDF0A\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"volcano\",\n" +
            "    \"keywords\": [\"photo\", \"nature\", \"disaster\"],\n" +
            "    \"char\": \"\uD83C\uDF0B\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"milkyway\",\n" +
            "    \"keywords\": [\"photo\", \"space\", \"stars\"],\n" +
            "    \"char\": \"\uD83C\uDF0C\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"mountfuji\" ,\n" +
            "    \"keywords\": [\"photo\", \"mountain\", \"nature\", \"japanese\"],\n" +
            "    \"char\": \"\uD83D\uDDFB\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"japan\",\n" +
            "    \"keywords\": [\"nation\", \"country\", \"japanese\", \"asia\"],\n" +
            "    \"char\": \"\uD83D\uDDFE\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"globewithmeridians\",\n" +
            "    \"keywords\": [\"earth\", \"international\", \"world\", \"internet\", \"interweb\"],\n" +
            "    \"char\": \"\uD83C\uDF10\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"africa\",\n" +
            "    \"keywords\": [\"globe\", \"world\", \"international\"],\n" +
            "    \"char\": \"\uD83C\uDF0D\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"america\",\n" +
            "    \"keywords\": [\"globe\", \"world\", \"USA\", \"international\"],\n" +
            "    \"char\": \"\uD83C\uDF0E\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"asia\",\n" +
            "    \"keywords\": [\"globe\", \"world\", \"east\", \"international\"],\n" +
            "    \"char\": \"\uD83C\uDF0F\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"moon\",\n" +
            "    \"keywords\": [\"nature\", \"night\", \"sky\", \"gray\", \"twilight\", \"planet\", \"space\", \"evening\", \"sleep\"],\n" +
            "    \"char\": \"\uD83C\uDF14\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"fullmoon\",\n" +
            "    \"keywords\": [\"nature\", \"yellow\", \"twilight\", \"planet\", \"space\", \"night\", \"evening\", \"sleep\"],\n" +
            "    \"char\": \"\uD83C\uDF15\",\n" +
            "    \"category\": \"nature\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\":  \"tomato\",\n" +
            "    \"keywords\": [\"fruit\", \"vegetable\", \"nature\", \"food\"],\n" +
            "    \"char\": \"\uD83C\uDF45\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"grapes\",\n" +
            "    \"keywords\": [\"fruit\", \"food\", \"wine\"],\n" +
            "    \"char\": \"\uD83C\uDF47\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"watermelon\",\n" +
            "    \"keywords\": [\"fruit\", \"food\", \"picnic\", \"summer\"],\n" +
            "    \"char\": \"\uD83C\uDF49\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"lemon\",\n" +
            "    \"keywords\": [\"fruit\", \"nature\"],\n" +
            "    \"char\": \"\uD83C\uDF4B\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"banana\",\n" +
            "    \"keywords\": [\"fruit\", \"food\", \"monkey\"],\n" +
            "    \"char\": \"\uD83C\uDF4C\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"pineapple\",\n" +
            "    \"keywords\": [\"fruit\", \"nature\", \"food\"],\n" +
            "    \"char\": \"\uD83C\uDF4D\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"apple\",\n" +
            "    \"keywords\": [\"fruit\", \"mac\", \"school\"],\n" +
            "    \"char\": \"\uD83C\uDF4E\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cherries\",\n" +
            "    \"keywords\": [\"food\", \"fruit\"],\n" +
            "    \"char\": \"\uD83C\uDF52\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"strawberry\",\n" +
            "    \"keywords\": [\"fruit\", \"food\", \"nature\"],\n" +
            "    \"char\": \"\uD83C\uDF53\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"hamburger\",\n" +
            "    \"keywords\": [\"meat\", \"fast food\", \"beef\", \"cheeseburger\", \"mcdonalds\", \"burger king\"],\n" +
            "    \"char\": \"\uD83C\uDF54\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"pizza\",\n" +
            "    \"keywords\": [\"food\", \"party\"],\n" +
            "    \"char\": \"\uD83C\uDF55\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"rice\",\n" +
            "    \"keywords\": [\"food\", \"china\", \"asian\"],\n" +
            "    \"char\": \"\uD83C\uDF5A\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"curry\",\n" +
            "    \"keywords\": [\"food\", \"spicy\", \"hot\", \"indian\"],\n" +
            "    \"char\": \"\uD83C\uDF5B\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ramen\",\n" +
            "    \"keywords\": [\"food\", \"japanese\", \"noodle\", \"chipsticks\"],\n" +
            "    \"char\": \"\uD83C\uDF5C\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"spaghetti\",\n" +
            "    \"keywords\": [\"food\", \"italian\", \"noodle\"],\n" +
            "    \"char\": \"\uD83C\uDF5D\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bread\",\n" +
            "    \"keywords\": [\"food\", \"wheat\", \"breakfast\", \"toast\"],\n" +
            "    \"char\": \"\uD83C\uDF5E\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"fries\",\n" +
            "    \"keywords\": [\"chips\", \"snack\", \"fast food\"],\n" +
            "    \"char\": \"\uD83C\uDF5F\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"dango\" ,\n" +
            "    \"keywords\": [\"food\", \"barbecue\", \"meat\"],\n" +
            "    \"char\": \"\uD83C\uDF61\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"oden\",\n" +
            "    \"keywords\": [\"food\", \"japanese\"],\n" +
            "    \"char\": \"\uD83C\uDF62\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sushi\",\n" +
            "    \"keywords\": [\"food\", \"fish\", \"japanese\", \"rice\"],\n" +
            "    \"char\": \"\uD83C\uDF63\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"friedshrimp\",\n" +
            "    \"keywords\": [\"food\", \"animal\", \"appetizer\", \"summer\"],\n" +
            "    \"char\": \"\uD83C\uDF64\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"fishcake\",\n" +
            "    \"keywords\": [\"food\", \"japan\", \"sea\", \"beach\"],\n" +
            "    \"char\": \"\uD83C\uDF65\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"icecream\",\n" +
            "    \"keywords\": [\"food\", \"hot\", \"dessert\", \"summer\"],\n" +
            "    \"char\": \"\uD83C\uDF66\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"shavedice\",\n" +
            "    \"keywords\": [\"hot\", \"dessert\", \"summer\"],\n" +
            "    \"char\": \"\uD83C\uDF67\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"icecream\",\n" +
            "    \"keywords\": [\"food\", \"hot\", \"dessert\"],\n" +
            "    \"char\": \"\uD83C\uDF68\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"doughnut\",\n" +
            "    \"keywords\": [\"food\", \"dessert\", \"snack\", \"sweet\", \"donut\"],\n" +
            "    \"char\": \"\uD83C\uDF69\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cookie\",\n" +
            "    \"keywords\": [\"food\", \"snack\", \"oreo\", \"chocolate\", \"sweet\", \"dessert\"],\n" +
            "    \"char\": \"\uD83C\uDF6A\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"chocolate_bar\",\n" +
            "    \"keywords\": [\"food\", \"snack\", \"dessert\", \"sweet\"],\n" +
            "    \"char\": \"\uD83C\uDF6B\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"candy\",\n" +
            "    \"keywords\": [\"snack\", \"dessert\", \"sweet\"],\n" +
            "    \"char\": \"\uD83C\uDF6C\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"lollipop\",\n" +
            "    \"keywords\": [\"food\", \"snack\", \"candy\", \"sweet\"],\n" +
            "    \"char\": \"\uD83C\uDF6D\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"custard\",\n" +
            "    \"keywords\": [\"dessert\", \"food\"],\n" +
            "    \"char\": \"\uD83C\uDF6E\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"honeypot\",\n" +
            "    \"keywords\": [\"bees\", \"sweet\", \"kitchen\"],\n" +
            "    \"char\": \"\uD83C\uDF6F\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cake\",\n" +
            "    \"keywords\": [\"food\", \"dessert\"],\n" +
            "    \"char\": \"\uD83C\uDF70\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bento\",\n" +
            "    \"keywords\": [\"food\", \"japanese\", \"box\"],\n" +
            "    \"char\": \"\uD83C\uDF71\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"stew\",\n" +
            "    \"keywords\": [\"food\", \"meat\", \"soup\"],\n" +
            "    \"char\": \"\uD83C\uDF72\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"egg\",\n" +
            "    \"keywords\": [\"food\", \"breakfast\", \"kitchen\"],\n" +
            "    \"char\": \"\uD83C\uDF73\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"forkandknife\",\n" +
            "    \"keywords\": [\"cutlery\", \"kitchen\"],\n" +
            "    \"char\": \"\uD83C\uDF74\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tea\",\n" +
            "    \"keywords\": [\"drink\", \"bowl\", \"breakfast\", \"green\", \"british\"],\n" +
            "    \"char\": \"\uD83C\uDF75\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"coffee\",\n" +
            "    \"keywords\": [\"drink\", \"beverage\", \"cafe\", \"espresso\"],\n" +
            "    \"char\": \"☕\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sake\",\n" +
            "    \"keywords\": [\"wine\", \"drink\", \"drunk\", \"beverage\", \"japanese\", \"alcohol\", \"booze\"],\n" +
            "    \"char\": \"\uD83C\uDF76\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"wineglass\",\n" +
            "    \"keywords\": [\"drink\", \"beverage\", \"drunk\", \"alcohol\", \"booze\"],\n" +
            "    \"char\": \"\uD83C\uDF77\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cocktail\",\n" +
            "    \"keywords\": [\"drink\", \"drunk\", \"alcohol\", \"beverage\", \"booze\"],\n" +
            "    \"char\": \"\uD83C\uDF78\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tropicaldrink\",\n" +
            "    \"keywords\": [\"beverage\", \"cocktail\", \"summer\", \"beach\", \"alcohol\", \"booze\"],\n" +
            "    \"char\": \"\uD83C\uDF79\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"beer\",\n" +
            "    \"keywords\": [\"relax\", \"beverage\", \"drink\", \"drunk\", \"party\", \"pub\", \"summer\", \"alcohol\", \"booze\"],\n" +
            "    \"char\": \"\uD83C\uDF7A\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"beers\",\n" +
            "    \"keywords\": [\"relax\", \"beverage\", \"drink\", \"drunk\", \"party\", \"pub\", \"summer\", \"alcohol\", \"booze\"],\n" +
            "    \"char\": \"\uD83C\uDF7B\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"babybottle\",\n" +
            "    \"keywords\": [\"food\", \"container\", \"milk\"],\n" +
            "    \"char\": \"\uD83C\uDF7C\",\n" +
            "    \"category\": \"foodanddrink\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ribbon\",\n" +
            "    \"keywords\": [\"decoration\", \"pink\", \"girl\", \"bowtie\"],\n" +
            "    \"char\": \"\uD83C\uDF80\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"gift\",\n" +
            "    \"keywords\": [\"present\", \"birthday\", \"christmas\", \"xmas\"],\n" +
            "    \"char\": \"\uD83C\uDF81\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"birthday\",\n" +
            "    \"keywords\": [\"party\", \"cake\", \"celebration\"],\n" +
            "    \"char\": \"\uD83C\uDF82\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"jackolantern\",\n" +
            "    \"keywords\": [\"halloween\", \"light\", \"pumpkin\", \"creepy\", \"fall\"],\n" +
            "    \"char\": \"\uD83C\uDF83\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"christmastree\",\n" +
            "    \"keywords\": [\"festival\", \"vacation\", \"december\", \"xmas\", \"celebration\"],\n" +
            "    \"char\": \"\uD83C\uDF84\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tanabatatree\",\n" +
            "    \"keywords\": [\"plant\", \"nature\", \"branch\", \"summer\"],\n" +
            "    \"char\": \"\uD83C\uDF8B\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bamboo\",\n" +
            "    \"keywords\": [\"plant\", \"nature\", \"vegetable\", \"panda\"],\n" +
            "    \"char\": \"\uD83C\uDF8D\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ricescene\",\n" +
            "    \"keywords\": [\"photo\", \"japan\", \"asia\", \"tsukimi\"],\n" +
            "    \"char\": \"\uD83C\uDF91\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"fireworks\",\n" +
            "    \"keywords\": [\"photo\", \"festival\", \"carnival\", \"congratulations\"],\n" +
            "    \"char\": \"\uD83C\uDF86\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\":  \"sparkler\",\n" +
            "    \"keywords\": [\"stars\", \"night\", \"shine\"],\n" +
            "    \"char\": \"\uD83C\uDF87\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"tada\",\n" +
            "    \"keywords\": [\"party\", \"contulations\", \"birthday\", \"magic\", \"circus\"],\n" +
            "    \"char\": \"\uD83C\uDF89\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"confettiball\",\n" +
            "    \"keywords\": [\"festival\", \"party\", \"birthday\", \"circus\"],\n" +
            "    \"char\": \"\uD83C\uDF8A\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"balloon\",\n" +
            "    \"keywords\": [\"party\", \"celebration\", \"birthday\", \"circus\"],\n" +
            "    \"char\": \"\uD83C\uDF88\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dizzy\",\n" +
            "    \"keywords\": [\"star\", \"sparkle\", \"shoot\", \"magic\"],\n" +
            "    \"char\": \"\uD83D\uDCAB\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sparkles\",\n" +
            "    \"keywords\": [\"stars\", \"shine\", \"shiny\", \"cool\", \"awesome\", \"good\", \"magic\"],\n" +
            "    \"char\": \"✨\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"boom\",\n" +
            "    \"keywords\": [\"bomb\", \"explode\", \"explosion\", \"collision\", \"blown\"],\n" +
            "    \"char\": \"\uD83D\uDCA5\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"mortarboard\",\n" +
            "    \"keywords\": [\"school\", \"college\", \"degree\", \"university\", \"graduation\", \"cap\", \"hat\", \"legal\", \"learn\", \"education\"],\n" +
            "    \"char\": \"\uD83C\uDF93\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"crown\",\n" +
            "    \"keywords\": [\"king\", \"kod\", \"leader\", \"royalty\", \"lord\"],\n" +
            "    \"char\": \"\uD83D\uDC51\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dolls\",\n" +
            "    \"keywords\": [\"japanese\", \"toy\", \"kimono\"],\n" +
            "    \"char\": \"\uD83C\uDF8E\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"flags\",\n" +
            "    \"keywords\": [\"fish\", \"japanese\", \"koinobori\", \"carp\", \"banner\"],\n" +
            "    \"char\": \"\uD83C\uDF8F\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"windchime\",\n" +
            "    \"keywords\": [\"nature\", \"ding\", \"spring\", \"bell\"],\n" +
            "    \"char\": \"\uD83C\uDF90\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"crossedflags\",\n" +
            "    \"keywords\": [\"japanese\", \"nation\", \"country\", \"border\"],\n" +
            "    \"char\": \"\uD83C\uDF8C\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"izakayalantern\",\n" +
            "    \"keywords\": [\"light\", \"paper\", \"halloween\", \"spooky\"],\n" +
            "    \"char\": \"\uD83C\uDFEE\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ring\",\n" +
            "    \"keywords\": [\"wedding\", \"propose\", \"marriage\", \"valentines\", \"diamond\", \"fashion\", \"jewelry\", \"gem\"],\n" +
            "    \"char\": \"\uD83D\uDC8D\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"heart\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"valentines\"],\n" +
            "    \"char\": \"❤️\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"brokenheart\",\n" +
            "    \"keywords\": [\"sad\", \"sorry\", \"break\"],\n" +
            "    \"char\": \"\uD83D\uDC94\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"loveletter\",\n" +
            "    \"keywords\": [\"email\", \"like\", \"affection\", \"envelope\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC8C\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"twohearts\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC95\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"revolvinghearts\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC9E\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"heartbeat\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"affection\", \"valentines\", \"pink\"],\n" +
            "    \"char\": \"\uD83D\uDC93\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"heartpulse\",\n" +
            "    \"keywords\": [\"like\", \"love\", \"affection\", \"valentines\", \"pink\"],\n" +
            "    \"char\": \"\uD83D\uDC97\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"sparklingheart\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC96\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"cupid\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"heart\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC98\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"giftheart\",\n" +
            "    \"keywords\": [\"love\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC9D\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"heartdecoration\",\n" +
            "    \"keywords\": [\"purple-square\", \"love\", \"like\"],\n" +
            "    \"char\": \"\uD83D\uDC9F\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "     \"name\":\"purpleheart\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC9C\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "     \"name\":\"yellowheart\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC9B\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "     \"name\":\"greenheart\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC9A\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "     \"name\":\"blueheart\",\n" +
            "    \"keywords\": [\"love\", \"like\", \"affection\", \"valentines\"],\n" +
            "    \"char\": \"\uD83D\uDC99\",\n" +
            "    \"category\": \"celebration\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"runner\",\n" +
            "    \"keywords\": [\"man\", \"walking\", \"exercise\", \"race\", \"running\"],\n" +
            "    \"char\": \"\uD83C\uDFC3\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"walking\",\n" +
            "    \"keywords\": [\"human\", \"feet\", \"steps\"],\n" +
            "    \"char\": \"\uD83D\uDEB6\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"dancer\",\n" +
            "    \"keywords\": [\"female\", \"girl\", \"woman\", \"fun\"],\n" +
            "    \"char\": \"\uD83D\uDC83\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"rowboat\",\n" +
            "    \"keywords\": [\"sports\", \"hobby\", \"water\", \"ship\"],\n" +
            "    \"char\": \"\uD83D\uDEA3\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"swimmer\",\n" +
            "    \"keywords\": [\"sports\", \"exercise\", \"human\", \"athlete\", \"water\", \"summer\"],\n" +
            "    \"char\": \"\uD83C\uDFCA\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"surfer\",\n" +
            "    \"keywords\": [\"sports\", \"ocean\", \"sea\", \"summer\", \"beach\"],\n" +
            "    \"char\": \"\uD83C\uDFC4\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"bath\",\n" +
            "    \"keywords\": [\"clean\", \"shower\", \"bathroom\"],\n" +
            "    \"char\": \"\uD83D\uDEC0\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\":\"snowboarder\" ,\n" +
            "    \"keywords\": [\"sports\", \"winter\"],\n" +
            "    \"char\": \"\uD83C\uDFC2\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"ski\",\n" +
            "    \"keywords\": [\"sports\", \"winter\", \"cold\", \"snow\"],\n" +
            "    \"char\": \"\uD83C\uDFBF\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "   {\n" +
            "    \"name\": \"snowman\",\n" +
            "    \"keywords\": [\"winter\", \"season\", \"cold\", \"weather\", \"christmas\", \"xmas\", \"frozen\"],\n" +
            "    \"char\": \"⛄\",\n" +
            "    \"category\": \"activity\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\":\"bicyclist\" ,\n" +
            "    \"keywords\": [\"sports\", \"bike\", \"exercise\", \"hipster\"],\n" +
            "    \"char\": \"\uD83D\uDEB4\",\n" +
            "    \"category\": \"activity\"\n" +
            "  }\n" +
            "]\n";

    JSONArray jsonArray;

    public void main() {
        try {
            jsonArray = new JSONArray(source);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}