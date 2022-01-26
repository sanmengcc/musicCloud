package cc.sanmeng.core.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    private static final String[] hexDigits = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    private static MessageDigest messagedigest = null;

    public MD5Util() {
    }

    public static String eccrypt(String info) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] srcBytes = info.getBytes();
            md5.update(srcBytes);
            byte[] resultBytes = md5.digest();
            return toHex(resultBytes).toUpperCase();
        } catch (Exception var4) {
            return null;
        }
    }

    private static String toHex(byte[] buffer) {
        StringBuffer sb = new StringBuffer(buffer.length * 2);

        for(int i = 0; i < buffer.length; ++i) {
            sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
            sb.append(Character.forDigit(buffer[i] & 15, 16));
        }

        return sb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (b < 0) {
            n = 256 + b;
        }

        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();

        for(int i = 0; i < b.length; ++i) {
            resultSb.append(byteToHexString(b[i]));
        }

        return resultSb.toString();
    }

    public static String encode32L(String origin) {
        String resultString = null;
        byte[] originBytes = origin.getBytes();

        try {
            new String(origin);
            resultString = byteArrayToHexString(messagedigest.digest(originBytes));
        } catch (Exception var4) {
        }

        return resultString;
    }

    public static String MD5Encode(String origin, String charsetname) {
        String resultString = null;

        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetname != null && !"".equals(charsetname)) {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            }
        } catch (Exception var4) {
        }

        return resultString;
    }

    static {
        try {
            messagedigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException var1) {
        }

    }
}