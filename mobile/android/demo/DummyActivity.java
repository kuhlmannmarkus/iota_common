package org.iota.mobile;

import android.os.*;
import android.app.*;
import android.util.Log;
import java.util.Arrays;


public class DummyActivity extends Activity{
    public final String TX_TRYTES = "XYIUIABLAEBBFCTMDCGPVNCQELHIEBVNRPWBSCABWRAVGVOVMFEHWJCUILYIXOPJNASEOHXPJBXFNHHSWEKEGEEFSAZDENWMOAXGJCQZQDGSTTMNQPYJBLRVY9T9HSQNXWYCSMLEXVWCASQ9MHPMBZ9PSSZEKCXYLDYKTOVAWQXOTGMWHUIACLUTAIKUIXZND9YMQKZBTIWOUIVQWTSBNVDCUWYP9HDMQPTXWEQYXVEOFXVGQSBHGHMKVFZZQIALVLMINZGNLEAOCQZFHPTQTQXGZQJLTBFPLWTESFYOJNJGJRYWHPEBSPSXEWCITXBJBMXDFCUDUKKGZMDOOPIBJLC9GPIBTLVQWPGTADEXNI9SWJNJXKXIJCPMICHBIFRXVWNJDP9BDELH9NOMJKGEBOCLWEXPEBFBWQLHFWQVCFIPVUXNREWXTCTFQHZYTMSUXQZTJQOWZZZCFIJ9NFXVSDFEXLODNJFREDOQ9WLLQAKRYKUCGUYEFICOLCKZHWFCLFGLKORFQFZXZXTEXWGRJPZ99KAJYFDWZNMBKQXOLRCAPDZWTZIMSUDSNDTKJLKJWFCTHZFYFW9EF9T9OGNFBNCRDDTRQUBIBSIWJNRAFXG9UDRGSXDQ9OKAREHQOCXSULYOA9IWJOYGWYOZGVQUDNBZXHZBCCBQ9PPKIKSWLNLPRSRRYLGCQIJKYNTAJBGPAOYWIUOIR9WOQYLSQYPWKUWBD9AUVZZT9KWUNQZYLOKTWRVJDVJSDBO9XYEGJIZWRMU9SRUVGMZUX9BXACUDYNXXRTYN9UVLJUIJGNAHVWSWRFHKIXTYINVHFHGXJVVJFLFTJR9LPZCJPHQOZQRXFJPYIHCVBXCIXZFPCC9RYLOYMBXDTRDEDWPZMZYIKGTXAQYJVEFDSF9QWROXAJS9ZPAWHLKIEKUPFKXOGLUYXCQNVVBYEJG9STYYRHKAOOID9UDPCMSBOVKWXCTSRSBKOZIIUDAABKXIBIDNTXZWLITYANTGVRYBEOZAOEWGPGLKGICMPADAEHHOCUSKXBKO9REVSI9FDFDCPMUGCLJVNHMHWHAIURTWDTSHMOPVVMGWLECCPXHAAQRCDCUWDVMBRLMQYTY9PLIFIUNXZUNY9UIVHBZKMNYOPRSIKBKWDDOYJQWCSPFBLODZVAPGWHJJKOBYETEUUPJDIFLWUCMYWEUSZLWANGHYSNUXJAPFZJADQWAZCOYXWJAQCYWFBRNXJRHMIUFEROW9Z9QJAPFDIRUUTD9RPZYFD9PRPU9YVGIQMHNEYVDLEIESZEO9QLOLNHSVNGNZFHODQXXX9K9NAUDG9UENCXFTS9FQXVXJYIVBL9OPHXTPCWKEDMXXJQLXHBNTNVWHGFNNXAEKGHSBGCQFFIIRKMSYRXBCDTUCJESVXJGZTHUJWGWDD9MDXBCXEPBMDZEVUGIXHVCGDFVOYY9QEJJYQALKJWFKMYSKZRXQNGI9MC9FLSIYER9BZGDXGZUAMBZFJLWNBKMWWOSUE9XGOUPDDSCJWN9PJD9LKUVVYHCRBBBABVKZJOXFGCRXXDEGLGYDXLFFPWFNCGCRPKGSEXQNONXKJWDGTFZWWOSK9TKUTHGHBNLQADQ9QS9XLNRVUMSRFVYVSEQEGGTOWHUMZUEVQEROFMYLXYXU9GUJSQFSMMVHQS9SVIH9X9RNORYZOLIIA9RWAUFWDKQXRAHPALEW9LDXZFSRDCPYVSSXGOEPSVZCVWXDXVJKDWUBGQEUGNAUD9GNEQEVXXLTNVBIWJLLBCTFZWODFLIIDSNUPDJRHNPH9NBOKOVXCGEEZA9ZWKRNBL9XOOPF9OCP9VORMMVSIASCEAUVVJHBLWLHDHWVJDDTEBFIKHOEVIIDJXA9MTLUSZVPJPHLRASOAGNNPQYIAZVKTROQXISIALDESIHLNREAAPXCFU9AZTORQGYCFWVFHFQMAJPUSYVAEERWGQSKYFZJPWMOAEWXTUEGIDOSSCLBFLMBIZHYIQWSCNPZUTTSKCZXDSELK9KSBHTDSUID9LMBMYXQFAWBBRHFKMMBPTFKDNLQSZAMHMYASZXXKHXKPH9TOHVZUOXDCFHBDNAQEVOQQUGKEW9YQBZWMSVTJGNVUN9TUVYJ9XECFMVIIFTNSNBCUA9TOHPHAYDSAWJTJANNPZELFSWMVLBRUKJDT9B9VWCXBMUDNLVDEEWQRITLOTFLVOUDQGEEXK9CO9DCMNDY9VZUGMLVFKLUBNSQOABRDMIWVYGMENSBHUOMGIJ9MNKLST999999999999999999999999999999999999999999999999UMJOPYD99A99999999C99999999WUIHHDPDFBHIQLKEFLUOKIOVFOCPFPWBKUCCGA9YUUEPTLUXRLZHVKEOLJQWHBOLSCWKVXCOBSVJHY9YXDMTFSSWIPNAYXJPQNQCZAIT9ADYOLDXZVBTEUWMVYOOODSCPKAWWHOFQTLZKRPURYBMCU9YHSIYQZ9999W9VELHQPPERYSG9ZLLAHQKDLJQBKYYZOSRQOESEELED9CZHBLAMALTJJZAFWNMWGAAUFJMNQDGKVA9999999999999999999999999999999HDU9RGVJE999999999MMMMMMMMMDC99999999OKGA9999999999999";

    public final byte[] BUNDLE_NORMALIZED_MAX = new byte[] {13, 13, 13, 13, 13, 11, -7,  -3, 6, 4,  9,  11, 13, -7, 5,  5,  9, -9, 1,  5,  -4,
                                        9,  0,  -8, -9, 6,  10, 13,  11, 8, 2,  7,  13, 1,  6,  -1, 6,  7, 6,  7,  11, 4,
                                        -1, 4,  -3, 11, -8, 6,  -1,  1,  0, 1,  10, 8,  13, 13, 1,  2,  7, 7,  11, 9,  10,
                                        1,  -5, 1,  12, 11, 13, -10, 12, 5, 12, 0,  -5, 2,  -8, 6,  11, 6, 5};

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    setContentView(android.R.layout.simple_list_item_1);

    Log.e("IOTA", "Starting PoW");
    String nonce = Interface.iota_pow_trytes(TX_TRYTES, 9);
    Log.e("IOTA", "Retrieved nonce: " + nonce);

    String SEED = "ABCDEFGHIJKLMNOPQRSTUVWXYZ9ABCDEFGHIJKLMNOPQRSTUVWXYZ9ABCDEFGHIJKLMNOPQRSTUVWXYZ9";

    Log.e("IOTA", "Starting Address");
    String address = Interface.iota_sign_address_gen_trytes(SEED, 2, 2);
    Log.e("IOTA", "Calculated address: " + address);

    Log.e("IOTA", "Starting Signature");
    String signature = Interface.iota_sign_signature_gen_trytes(SEED, 2, 2, SEED);
    Log.e("IOTA", "Seed: " + SEED);
    Log.e("IOTA", "Calculated signature: " + signature);

    Log.e("IOTA", "Starting Bundle Miner");
    byte[] essence = new byte[486 * 4];
    Arrays.fill(essence, (byte) 0);
    int essenceLength = 486 * 4;
    // Basically UINT32_MAX
    int miningThreshold = (int) 4294967295L;
    long index = Interface.bundle_miner_mine(BUNDLE_NORMALIZED_MAX, 2, essence, essenceLength, 1000000, 0, miningThreshold, false);
    Log.e("IOTA", "Calculated index: " + index);


  }
}
