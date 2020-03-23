package com.yikeo.dbadmin.modules.database.util;

import java.lang.ref.SoftReference;

public class StringUtils {

    private static SoftReference<String[]> softCache;
    private static long softCacheCreatedNs;

    private static final char[] HEX = "0123456789abcdef".toCharArray();
    private static final int[] HEX_DECODE = new int['f' + 1];

    // memory used by this cache:
    // 4 * 1024 * 2 (strings per pair) * 64 * 2 (bytes per char) = 0.5 MB
    private static final int TO_UPPER_CACHE_LENGTH = 2 * 1024;
    private static final int TO_UPPER_CACHE_MAX_ENTRY_LENGTH = 64;
    private static final String[][] TO_UPPER_CACHE = new String[TO_UPPER_CACHE_LENGTH][];

    static {
        for (int i = 0; i < HEX_DECODE.length; i++) {
            HEX_DECODE[i] = -1;
        }
        for (int i = 0; i <= 9; i++) {
            HEX_DECODE[i + '0'] = i;
        }
        for (int i = 0; i <= 5; i++) {
            HEX_DECODE[i + 'a'] = HEX_DECODE[i + 'A'] = i + 10;
        }
    }

    /**
     * Convert a byte array to a hex encoded string and appends it to a specified string builder.
     *
     * @param builder string builder to append to
     * @param value the byte array
     * @return the hex encoded string
     */
    public static StringBuilder convertBytesToHex(StringBuilder builder, byte[] value) {
        return convertBytesToHex(builder, value, value.length);
    }

    /**
     * Convert a byte array to a hex encoded string and appends it to a specified string builder.
     *
     * @param builder string builder to append to
     * @param value the byte array
     * @param len the number of bytes to encode
     * @return the hex encoded string
     */
    public static StringBuilder convertBytesToHex(StringBuilder builder, byte[] value, int len) {
        char[] hex = HEX;
        for (int i = 0; i < len; i++) {
            int c = value[i] & 0xff;
            builder.append(hex[c >>> 4]).append(hex[c & 0xf]);
        }
        return builder;
    }
}
