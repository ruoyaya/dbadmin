package com.yikeo.dbadmin.modules.database.util;

public class NetUtils {
    /**
     * Appends short representation of the specified IP address to the string
     * builder.
     *
     * @param builder
     *            string builder to append to, or {@code null}
     * @param address
     *            IP address
     * @param addBrackets
     *            if ({@code true}, add brackets around IPv6 addresses
     * @return the specified or the new string builder with short representation
     *         of specified address
     */
    public static StringBuilder ipToShortForm(StringBuilder builder, byte[] address, boolean addBrackets) {
        switch (address.length) {
            case 4:
                if (builder == null) {
                    builder = new StringBuilder(15);
                }
                builder //
                        .append(address[0] & 0xff).append('.') //
                        .append(address[1] & 0xff).append('.') //
                        .append(address[2] & 0xff).append('.') //
                        .append(address[3] & 0xff).toString();
                break;
            case 16:
                short[] a = new short[8];
                int maxStart = 0, maxLen = 0, currentLen = 0;
                for (int i = 0, offset = 0; i < 8; i++) {
                    if ((a[i] = (short) ((address[offset++] & 0xff) << 8 | address[offset++] & 0xff)) == 0) {
                        currentLen++;
                        if (currentLen > maxLen) {
                            maxLen = currentLen;
                            maxStart = i - currentLen + 1;
                        }
                    } else {
                        currentLen = 0;
                    }
                }
                if (builder == null) {
                    builder = new StringBuilder(addBrackets ? 41 : 39);
                }
                if (addBrackets) {
                    builder.append('[');
                }
                int start;
                if (maxLen > 1) {
                    for (int i = 0; i < maxStart; i++) {
                        builder.append(Integer.toHexString(a[i] & 0xffff)).append(':');
                    }
                    if (maxStart == 0) {
                        builder.append(':');
                    }
                    builder.append(':');
                    start = maxStart + maxLen;
                } else {
                    start = 0;
                }
                for (int i = start; i < 8; i++) {
                    builder.append(Integer.toHexString(a[i] & 0xffff));
                    if (i < 7) {
                        builder.append(':');
                    }
                }
                if (addBrackets) {
                    builder.append(']');
                }
                break;
            default:
                StringUtils.convertBytesToHex(builder, address);
        }
        return builder;
    }

}
