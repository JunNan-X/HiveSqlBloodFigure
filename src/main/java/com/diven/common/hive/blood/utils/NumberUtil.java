package com.diven.common.hive.blood.utils;

/**
 *	 数字相关的辅助函数
 * @author divenwu
 */
public final class NumberUtil {

	public static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
			'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	/**
	 *  数字转换成字符串
	 * @param n 将要转换的数
	 * @return String
	 */
	public static String formatThousandString(final long n) {
		final String s = Long.toString(n);
		final int nSize = s.length();
		int i;
		if (n < 0) {
			i = 1 + (nSize - 1) % 3;
			if (i == 1) {
				i = 4;
			}
		} else {
			i = nSize % 3;
			if (i == 0) {
				i = 3;
			}
		}
		final StringBuilder sb = new StringBuilder(nSize + nSize / 3);
		sb.append(s.substring(0, i));
		for (; i + 3 <= nSize; i += 3) {
			sb.append(',');
			sb.append(s.substring(i, i + 3));
		}
		return sb.toString();
	}

	public static String getDecimalString(final double value, final int decimal) {
		if (0.0 == value) {
			return "0";
		}

		final long x = (long) (value * 100);
		final long y = x % 100;

		return Long.toString(x / 100) + (y > 0 ? ("." + (y)) : "");
	}

	public static String getPercentString(final long value, final long total) {
		return getPercentString(value, total, 2);
	}

	/**
	 * 百分比字符串
	 * 
	 * @param value
	 * @param total
	 * @param precision
	 * @return
	 */
	public static String getPercentString(final long value, final long total, final int precision) {
		if (0 == total) {
			return "0";
		}

		final long x = value * 100;
		final long y = x * 100 / total % 100;

		return Long.toString(x / total) + (y > 0 ? ("." + (y)) : "");
	}

	/**
	 * 判断是否是数字字符串
	 * 
	 * @return
	 */
	public static boolean isNumeric(final String value) {
		if (Check.isEmpty(value)) {
			return false;
		}

		// 去掉负号
		String sNum = value;
		if (sNum.startsWith("-")) {
			sNum = sNum.substring(1);
		}

		final int n = sNum.length();
		for (int i = 0; i < n; i++) {
			if (!Character.isDigit(sNum.charAt(i)) && sNum.charAt(i) != '.') {
				return false;
			}
		}
		return true;
	}

	public static double parseDouble(final String s) {
		return parseDouble(s, 0);
	}

	public static double parseDouble(final String s, final double nDefault) {
		try {
			return Double.parseDouble(s);
		} catch (final NumberFormatException e) {
			return nDefault;
		}
	}

	public static int parseInt(final String s) {
		return parseInt(s, 0);
	}

	/**
	 * 字符串装换为数字
	 * 
	 * @param s        数字字符
	 * @param nDefault 缺省
	 * @return 数字
	 */
	public static int parseInt(final String s, final int nDefault) {
		try {
			return Integer.parseInt(s, 10);
		} catch (final NumberFormatException e) {
			return nDefault;
		}
	}

	public static long parseLong(final String s) {
		return parseLong(s, 0);
	}

	public static long parseLong(final String s, final long nDefault) {
		try {
			return Long.parseLong(s);
		} catch (final NumberFormatException e) {
			return nDefault;
		}
	}

	/**
	 * Convert the integer to an unsigned number.
	 */
	public static String toBinaryString(final int value) {
		int i = value;
		final char[] buf = new char[32];
		int charPos = 32;
		final int radix = 1 << 1;
		final int mask = radix - 1;
		do {
			buf[--charPos] = DIGITS[(i & mask)];
			i >>>= 1;
		} while (i != 0);

		while (charPos > 0) {
			buf[--charPos] = '0';
		}

		return new String(buf, charPos, (32 - charPos));
	}

	/**
	 * Convert the integer to an unsigned number.
	 */
	public static String toBinaryString(final long value) {
		long i = value;
		final char[] buf = new char[64];
		int charPos = 64;
		final int radix = 1 << 1;
		final long mask = radix - 1;
		do {
			buf[--charPos] = DIGITS[(int) (i & mask)];
			i >>>= 1;
		} while (i != 0);

		while (charPos > 0) {
			buf[--charPos] = '0';
		}

		return new String(buf, charPos, (64 - charPos));
	}

	public static String toHexString(final byte[] bytes) {
		if (null == bytes) {
			return "";
		}

		final StringBuilder sb = new StringBuilder(bytes.length);
		for (final byte b : bytes) {
			sb.append(ByteUtil.toHexString(b));
		}
		return sb.toString();
	}

	/**
	 * 将数字转换成十六进制字符串并在前面补
	 * 
	 * @param value
	 * @return
	 */
	public static String toHexString(final int value) {
		final String hex = "0000000" + Integer.toHexString(value);
		return hex.substring(hex.length() - 8);
	}

	/**
	 * 将数字转换成十六进制字符串并在前面补
	 * 
	 * @param value
	 * @return
	 */
	public static String toHexString(final long value) {
		final String hex = "000000000000000" + Long.toHexString(value);
		return hex.substring(hex.length() - 16);
	}

	/**
	 * 私有构�?函数防止被构
	 */
	private NumberUtil() {
	}
}
