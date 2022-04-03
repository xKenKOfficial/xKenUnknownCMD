package x.KenKOfficial.UnknownCMD.Listeners;

import java.nio.charset.*;
import org.bukkit.event.player.*;
import org.bukkit.*;
import x.KenKOfficial.UnknownCMD.Utils.*;
import x.KenKOfficial.UnknownCMD.Main.*;
import x.KenKOfficial.UnknownCMD.Utils.Loggers.*;
import org.bukkit.entity.*;
import org.bukkit.help.*;
import org.bukkit.event.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PlayerCommandPreprocess implements Listener
{
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String CANCEL_MESSAGE;
    private static final /* synthetic */ String NOT_FIND_COMMAND;
    private static final /* synthetic */ String[] lIl;
    private static final /* synthetic */ int[] Ill;
    
    private static boolean Illl(final int lllIIllIlllllll) {
        return lllIIllIlllllll == 0;
    }
    
    private static boolean llll(final Object llIlIllIlllllll) {
        return llIlIllIlllllll == null;
    }
    
    private static boolean IIIIl(final int lIIlIllIlllllll) {
        return lIIlIllIlllllll != 0;
    }
    
    private static String lIIl(String llIIlIIllllllll, final String lllIlIIllllllll) {
        llIIlIIllllllll = new String(Base64.getDecoder().decode(llIIlIIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllIlIIllllllll = new StringBuilder();
        final char[] lIlIlIIllllllll = lllIlIIllllllll.toCharArray();
        int IIlIlIIllllllll = PlayerCommandPreprocess.Ill[0];
        final short IlllIIIllllllll = (Object)llIIlIIllllllll.toCharArray();
        final Exception lIllIIIllllllll = (Exception)IlllIIIllllllll.length;
        char IIllIIIllllllll = (char)PlayerCommandPreprocess.Ill[0];
        while (lIIIl(IIllIIIllllllll, (int)lIllIIIllllllll)) {
            final char lIIllIIllllllll = IlllIIIllllllll[IIllIIIllllllll];
            IllIlIIllllllll.append((char)(lIIllIIllllllll ^ lIlIlIIllllllll[IIlIlIIllllllll % lIlIlIIllllllll.length]));
            "".length();
            ++IIlIlIIllllllll;
            ++IIllIIIllllllll;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(IllIlIIllllllll);
    }
    
    @EventHandler
    public void onCommandUse(final PlayerCommandPreprocessEvent IIllIlIllllllll) {
        final Player llIlIlIllllllll = IIllIlIllllllll.getPlayer();
        if (Illl(IIllIlIllllllll.isCancelled() ? 1 : 0)) {
            final String IIIIllIllllllll = IIllIlIllllllll.getMessage().split(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[0]])[PlayerCommandPreprocess.Ill[0]];
            final HelpTopic llllIlIllllllll = Bukkit.getServer().getHelpMap().getHelpTopic(IIIIllIllllllll);
            if (llll(llllIlIllllllll)) {
                IIllIlIllllllll.setCancelled((boolean)(PlayerCommandPreprocess.Ill[1] != 0));
                llIlIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.PREFIX).append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[1]]).append(PlayerCommandPreprocess.NOT_FIND_COMMAND))));
            }
        }
        final String[] IlIlIlIllllllll = IIllIlIllllllll.getMessage().split(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[2]]);
        final List<String> lIIlIlIllllllll = (List<String>)Main.getPlugin().getConfig().getStringList(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[3]]);
        if (IIIIl(Main.getPlugin().getConfig().getBoolean(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[4]]) ? 1 : 0) && Illl(llIlIlIllllllll.hasPermission(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[5]]) ? 1 : 0)) {
            final String IIlIIlIllllllll = (String)lIIlIlIllllllll.iterator();
            while (IIIIl(((Iterator)IIlIIlIllllllll).hasNext() ? 1 : 0)) {
                final String IlllIlIllllllll = ((Iterator<String>)IIlIIlIllllllll).next();
                if (IIIIl(IlIlIlIllllllll[PlayerCommandPreprocess.Ill[0]].equalsIgnoreCase(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[6]]).append(IlllIlIllllllll))) ? 1 : 0)) {
                    IIllIlIllllllll.setCancelled((boolean)(PlayerCommandPreprocess.Ill[1] != 0));
                    llIlIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.PREFIX).append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[7]]).append(PlayerCommandPreprocess.CANCEL_MESSAGE))));
                    PLogger.getPluginLog().info(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[8]]).append(llIlIlIllllllll.getName()).append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[9]]).append(IlIlIlIllllllll[PlayerCommandPreprocess.Ill[0]])));
                    "".length();
                    if (((0x23 ^ 0x1) & ~(0x23 ^ 0x1)) != 0x0) {
                        return;
                    }
                }
                else if (IIIIl(IlIlIlIllllllll[PlayerCommandPreprocess.Ill[0]].equalsIgnoreCase(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[10]]).append(IlllIlIllllllll))) ? 1 : 0)) {
                    IIllIlIllllllll.setCancelled((boolean)(PlayerCommandPreprocess.Ill[1] != 0));
                    llIlIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.PREFIX).append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[11]]).append(PlayerCommandPreprocess.CANCEL_MESSAGE))));
                    PLogger.getPluginLog().info(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[12]]).append(llIlIlIllllllll.getName()).append(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[13]]).append(IlIlIlIllllllll[PlayerCommandPreprocess.Ill[0]])));
                }
                "".length();
                if ("   ".length() <= ((0x55 ^ 0x7D ^ (0x3 ^ 0xA)) & (0xB2 ^ 0x8B ^ (0x99 ^ 0x81) ^ -" ".length()))) {
                    return;
                }
            }
        }
    }
    
    private static boolean lIIIl(final int IlllIllIlllllll, final int lIllIllIlllllll) {
        return IlllIllIlllllll < lIllIllIlllllll;
    }
    
    private static void IIll() {
        (lIl = new String[PlayerCommandPreprocess.Ill[17]])[PlayerCommandPreprocess.Ill[0]] = lIIl("cg==", "RVFJC");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[1]] = IlIl("4mRe65MNIRY=", "QZXvD");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[2]] = IlIl("qroTFRHk2EM=", "dboiO");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[3]] = IlIl("J1a6cE4GbCqVo9dVHbJ2UyM+rQD4apzwyVOPsxgKFiE=", "JEWtJ");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[4]] = lIIl("FBk/JjUbJzIqPRoZPyEj", "wxQEP");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[5]] = IlIl("DIsOe4dkf63gyC4dy2my+gcii0cfnCOpckYOru3O6jw=", "Ajqnm");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[6]] = IlIl("wXkMttpOnY8=", "JhMCf");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[7]] = lIIl("Tw==", "ogjQN");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[8]] = llIl("0vo0ytxD3Ks=", "HIUvs");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[9]] = lIIl("Uxo9CDgcHS4LegYQNgR6GAUiAjQXE3VH", "sjOgZ");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[10]] = IlIl("c9veKsQodzc=", "Qphdb");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[11]] = IlIl("9cfnSiPEK4c=", "CEzUC");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[12]] = llIl("jAeQAtnEaow=", "Rycop");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[13]] = lIIl("bSAnARciJzQCVTgqLA1VJj84CxspKW9O", "MPUnu");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[14]] = llIl("3sy+VG4dbE8=", "vOyXo");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[15]] = IlIl("yZ50DAJ4Pz5bX0ZBJep6W9gaKnNuaSHQ", "Ynhcp");
        PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[16]] = llIl("HjKItdrjMqJl0GALfcZ7DFjn/iJwzoTM", "SbSPg");
    }
    
    private static void lIll() {
        (Ill = new int[18])[0] = ((0x87 ^ 0xB0) & ~(0x62 ^ 0x55));
        PlayerCommandPreprocess.Ill[1] = " ".length();
        PlayerCommandPreprocess.Ill[2] = "  ".length();
        PlayerCommandPreprocess.Ill[3] = "   ".length();
        PlayerCommandPreprocess.Ill[4] = (0x4 ^ 0x0);
        PlayerCommandPreprocess.Ill[5] = (0x0 ^ 0x5);
        PlayerCommandPreprocess.Ill[6] = (0x15 ^ 0x13);
        PlayerCommandPreprocess.Ill[7] = (0xF5 ^ 0xB2 ^ (0x35 ^ 0x75));
        PlayerCommandPreprocess.Ill[8] = (0x33 ^ 0x3B);
        PlayerCommandPreprocess.Ill[9] = (0x65 ^ 0x6C);
        PlayerCommandPreprocess.Ill[10] = (0x86 ^ 0x8D ^ " ".length());
        PlayerCommandPreprocess.Ill[11] = (0x5 ^ 0xE);
        PlayerCommandPreprocess.Ill[12] = (0x16 ^ 0x1A);
        PlayerCommandPreprocess.Ill[13] = (" ".length() ^ (0x7 ^ 0xB));
        PlayerCommandPreprocess.Ill[14] = (0x26 ^ 0x28);
        PlayerCommandPreprocess.Ill[15] = (0x42 ^ 0x4D);
        PlayerCommandPreprocess.Ill[16] = (0x27 ^ 0x37);
        PlayerCommandPreprocess.Ill[17] = (0x6C ^ 0x7D);
    }
    
    private static String IlIl(final String lIIIIIIllllllll, final String IlIIIIIllllllll) {
        try {
            final SecretKeySpec IllIIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlIIIIllllllll = Cipher.getInstance("Blowfish");
            lIlIIIIllllllll.init(PlayerCommandPreprocess.Ill[2], IllIIIIllllllll);
            return new String(lIlIIIIllllllll.doFinal(Base64.getDecoder().decode(lIIIIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIIIllllllll) {
            IIlIIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIll();
        IIll();
        PREFIX = Main.getPlugin().getConfig().getString(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[14]]);
        NOT_FIND_COMMAND = Main.getPlugin().getConfig().getString(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[15]]);
        CANCEL_MESSAGE = Main.getPlugin().getConfig().getString(PlayerCommandPreprocess.lIl[PlayerCommandPreprocess.Ill[16]]);
    }
    
    private static String llIl(final String IIlIlllIlllllll, final String lIlIlllIlllllll) {
        try {
            final SecretKeySpec lIIllllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerCommandPreprocess.Ill[8]), "DES");
            final Cipher IIIllllIlllllll = Cipher.getInstance("DES");
            IIIllllIlllllll.init(PlayerCommandPreprocess.Ill[2], lIIllllIlllllll);
            return new String(IIIllllIlllllll.doFinal(Base64.getDecoder().decode(IIlIlllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlllIlllllll) {
            lllIlllIlllllll.printStackTrace();
            return null;
        }
    }
}
