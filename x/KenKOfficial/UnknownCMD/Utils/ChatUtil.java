package x.KenKOfficial.UnknownCMD.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] lIIl;
    private static final /* synthetic */ String[] IIIl;
    
    static {
        IlIll();
        lIIll();
    }
    
    private static String IIIll(final String IlIIllllIllllll, final String lIIIllllIllllll) {
        try {
            final SecretKeySpec lIlIllllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIllllIllllll = Cipher.getInstance("Blowfish");
            IIlIllllIllllll.init(ChatUtil.lIIl[2], lIlIllllIllllll);
            return new String(IIlIllllIllllll.doFinal(Base64.getDecoder().decode(IlIIllllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllllIllllll) {
            llIIllllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lllIl(final String lllIlIIIlllllll, final String IllIlIIIlllllll) {
        try {
            final SecretKeySpec IlIllIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIlIIIlllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIIl[8]), "DES");
            final Cipher lIIllIIIlllllll = Cipher.getInstance("DES");
            lIIllIIIlllllll.init(ChatUtil.lIIl[2], IlIllIIIlllllll);
            return new String(lIIllIIIlllllll.doFinal(Base64.getDecoder().decode(lllIlIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIllIIIlllllll) {
            IIIllIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIll(final int IlIlIlllIllllll, final int lIIlIlllIllllll) {
        return IlIlIlllIllllll < lIIlIlllIllllll;
    }
    
    public static String fixColor(final String lllllIIIlllllll) {
        return lllllIIIlllllll.replaceAll(ChatUtil.IIIl[ChatUtil.lIIl[0]], ChatUtil.IIIl[ChatUtil.lIIl[1]]).replace(ChatUtil.IIIl[ChatUtil.lIIl[2]], ChatUtil.IIIl[ChatUtil.lIIl[3]]).replace(ChatUtil.IIIl[ChatUtil.lIIl[4]], ChatUtil.IIIl[ChatUtil.lIIl[5]]).replace(ChatUtil.IIIl[ChatUtil.lIIl[6]], ChatUtil.IIIl[ChatUtil.lIIl[7]]);
    }
    
    private static void IlIll() {
        (lIIl = new int[9])[0] = ((0xF ^ 0x15) & ~(0x48 ^ 0x52));
        ChatUtil.lIIl[1] = " ".length();
        ChatUtil.lIIl[2] = "  ".length();
        ChatUtil.lIIl[3] = "   ".length();
        ChatUtil.lIIl[4] = (0xAB ^ 0xAF);
        ChatUtil.lIIl[5] = (0x5 ^ 0x8 ^ (0x5 ^ 0xD));
        ChatUtil.lIIl[6] = (0x6D ^ 0x6B);
        ChatUtil.lIIl[7] = (0x1C ^ 0x6C ^ (0xE3 ^ 0x94));
        ChatUtil.lIIl[8] = (136 + 114 - 172 + 65 ^ 116 + 69 - 53 + 3);
    }
    
    private static String IllIl(String lllIIIIIlllllll, final String lIIIIIIIlllllll) {
        lllIIIIIlllllll = new String(Base64.getDecoder().decode(lllIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIlIIIIIlllllll = new StringBuilder();
        final char[] IIlIIIIIlllllll = lIIIIIIIlllllll.toCharArray();
        int llIIIIIIlllllll = ChatUtil.lIIl[0];
        final String lIllllllIllllll = (Object)lllIIIIIlllllll.toCharArray();
        final char IIllllllIllllll = (char)lIllllllIllllll.length;
        String llIlllllIllllll = (String)ChatUtil.lIIl[0];
        while (llIll((int)llIlllllIllllll, IIllllllIllllll)) {
            final char IIIlIIIIlllllll = lIllllllIllllll[llIlllllIllllll];
            lIlIIIIIlllllll.append((char)(IIIlIIIIlllllll ^ IIlIIIIIlllllll[llIIIIIIlllllll % IIlIIIIIlllllll.length]));
            "".length();
            ++llIIIIIIlllllll;
            ++llIlllllIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lIlIIIIIlllllll);
    }
    
    private static void lIIll() {
        (IIIl = new String[ChatUtil.lIIl[8]])[ChatUtil.lIIl[0]] = IllIl("dg==", "PirTp");
        ChatUtil.IIIl[ChatUtil.lIIl[1]] = lllIl("Tjs+vPTKAx4=", "ZHlzg");
        ChatUtil.IIIl[ChatUtil.lIIl[2]] = IIIll("11t4QF9mJ1s=", "caDyI");
        ChatUtil.IIIl[ChatUtil.lIIl[3]] = IIIll("2TTvRjDlLyI=", "klbgu");
        ChatUtil.IIIl[ChatUtil.lIIl[4]] = IllIl("Tns=", "rGpMb");
        ChatUtil.IIIl[ChatUtil.lIIl[5]] = IIIll("i7oaoW6kgt8=", "TSNIU");
        ChatUtil.IIIl[ChatUtil.lIIl[6]] = IIIll("yP251eBGPjA=", "qOuvb");
        ChatUtil.IIIl[ChatUtil.lIIl[7]] = IllIl("Qw==", "ISiSi");
    }
}
