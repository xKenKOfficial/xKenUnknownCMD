package x.KenKOfficial.UnknownCMD.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.UnknownCMD.Main.*;
import x.KenKOfficial.UnknownCMD.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] IIl;
    private static final /* synthetic */ int[] lll;
    
    private static String IIIl(final String lIlIlIlIlllllll, final String IIlIlIlIlllllll) {
        try {
            final SecretKeySpec IIIllIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIlIlIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lll[8]), "DES");
            final Cipher lllIlIlIlllllll = Cipher.getInstance("DES");
            lllIlIlIlllllll.init(PlayerJoin.lll[2], IIIllIlIlllllll);
            return new String(lllIlIlIlllllll.doFinal(Base64.getDecoder().decode(lIlIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIlIlIlllllll) {
            IllIlIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIl(final int IIIlIlIIlllllll, final int lllIIlIIlllllll) {
        return IIIlIlIIlllllll < lllIIlIIlllllll;
    }
    
    private static String Ill(final String IllIIIlIlllllll, final String lIlIIIlIlllllll) {
        try {
            final SecretKeySpec llIlIIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIlIIlIlllllll = Cipher.getInstance("Blowfish");
            IlIlIIlIlllllll.init(PlayerJoin.lll[2], llIlIIlIlllllll);
            return new String(IlIlIIlIlllllll.doFinal(Base64.getDecoder().decode(IllIIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIlIlllllll) {
            lIIlIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIl() {
        (lll = new int[14])[0] = ((203 + 94 - 236 + 151 ^ 58 + 157 - 123 + 103) & (0xE3 ^ 0xC6 ^ (0x45 ^ 0x77) ^ -" ".length()));
        PlayerJoin.lll[1] = " ".length();
        PlayerJoin.lll[2] = "  ".length();
        PlayerJoin.lll[3] = "   ".length();
        PlayerJoin.lll[4] = (0x13 ^ 0x7A ^ (0x7E ^ 0x13));
        PlayerJoin.lll[5] = (0x4C ^ 0x49);
        PlayerJoin.lll[6] = (0x6E ^ 0x73 ^ (0x98 ^ 0x83));
        PlayerJoin.lll[7] = (0xB1 ^ 0xB6);
        PlayerJoin.lll[8] = (0x98 ^ 0x90);
        PlayerJoin.lll[9] = (0xA5 ^ 0xAF ^ "   ".length());
        PlayerJoin.lll[10] = (40 + 21 - 16 + 82 ^ (0x1C ^ 0x69));
        PlayerJoin.lll[11] = (0x57 ^ 0x5C);
        PlayerJoin.lll[12] = (0x18 ^ 0x14);
        PlayerJoin.lll[13] = (0x16 ^ 0x76 ^ (0x67 ^ 0xA));
    }
    
    private static boolean IIlIl(final int lIlIIlIIlllllll) {
        return lIlIIlIIlllllll != 0;
    }
    
    private static void IlIIl() {
        (IIl = new String[PlayerJoin.lll[13]])[PlayerJoin.lll[0]] = Ill("X7Gry++2hYg2GW4BugwEdw==", "QfPEy");
        PlayerJoin.IIl[PlayerJoin.lll[1]] = lll("PC0EAiMqLQ8DISolDAh4JSIMBThqNg0ZMS0o", "DFalV");
        PlayerJoin.IIl[PlayerJoin.lll[2]] = Ill("AF8c5VS0jBCE2MZVxHn5HYXTp1FsQqy3rmBwk3Lr7AhQSJ/azsA4BOnmEe+qnsRu6u3CsdqzsFU=", "MGLhh");
        PlayerJoin.IIl[PlayerJoin.lll[3]] = Ill("eOIH2RpJSz4=", "XxvAm");
        PlayerJoin.IIl[PlayerJoin.lll[4]] = lll("Y2VeORUxMAMPVnt5SUgScm1ZQzImNwg=", "CCinp");
        PlayerJoin.IIl[PlayerJoin.lll[5]] = IIIl("HgJvfABjrec=", "UbBkv");
        PlayerJoin.IIl[PlayerJoin.lll[6]] = lll("bldxIyQ6GSkQd3ZLZkQzNjojDBoBFyALMicQKg==", "NqFbQ");
        PlayerJoin.IIl[PlayerJoin.lll[7]] = lll("", "sLNma");
        PlayerJoin.IIl[PlayerJoin.lll[8]] = IIIl("gpnVPkhcnJCzYMz7ih7ijtwVYJXDhdSwlFDRyK4kcaDjf8LmSzAjVVh+G2ZCIB18", "WEvng");
        PlayerJoin.IIl[PlayerJoin.lll[9]] = Ill("KsV+CRitz5Q=", "SNKkB");
        PlayerJoin.IIl[PlayerJoin.lll[10]] = Ill("Tgie6FdazrGpwPlzwKkwEetsDV34get8gv0a6+rT8dUVCt72L4caA1VJzeGHLzHV", "kkBoI");
        PlayerJoin.IIl[PlayerJoin.lll[11]] = Ill("bl/glGdgpro=", "xnHwK");
        PlayerJoin.IIl[PlayerJoin.lll[12]] = Ill("2Qy/E1YBPe8TnSmMXPZdkwV0b5HSO1J5ppR/CGnmQaFRLIJFWsVqdaj86fh964Ppfkk4XJgM99A=", "demMI");
    }
    
    static {
        llIIl();
        IlIIl();
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IllllIlIlllllll) {
        final Player lllllIlIlllllll = IllllIlIlllllll.getPlayer();
        if (IIlIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.IIl[PlayerJoin.lll[0]]) ? 1 : 0) && IIlIl(lllllIlIlllllll.hasPermission(PlayerJoin.IIl[PlayerJoin.lll[1]]) ? 1 : 0)) {
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[2]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[3]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[4]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[5]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[6]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[7]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[8]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[9]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[10]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[11]]));
            lllllIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lll[12]]));
        }
    }
    
    private static String lll(String llIIllIIlllllll, final String lllIllIIlllllll) {
        llIIllIIlllllll = (float)new String(Base64.getDecoder().decode(((String)llIIllIIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllIllIIlllllll = new StringBuilder();
        final char[] lIlIllIIlllllll = lllIllIIlllllll.toCharArray();
        int IIlIllIIlllllll = PlayerJoin.lll[0];
        final char IlllIlIIlllllll = (Object)((String)llIIllIIlllllll).toCharArray();
        final boolean lIllIlIIlllllll = IlllIlIIlllllll.length != 0;
        char IIllIlIIlllllll = (char)PlayerJoin.lll[0];
        while (lIlIl(IIllIlIIlllllll, lIllIlIIlllllll ? 1 : 0)) {
            final char lIIlllIIlllllll = IlllIlIIlllllll[IIllIlIIlllllll];
            IllIllIIlllllll.append((char)(lIIlllIIlllllll ^ lIlIllIIlllllll[IIlIllIIlllllll % lIlIllIIlllllll.length]));
            "".length();
            ++IIlIllIIlllllll;
            ++IIllIlIIlllllll;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(IllIllIIlllllll);
    }
}
