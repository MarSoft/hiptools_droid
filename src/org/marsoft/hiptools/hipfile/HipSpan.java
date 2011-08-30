package org.marsoft.hiptools.hipfile;

public class HipSpan {
	private static final String[] langNames = {
		"cлав", "рус", "греч", "лат", "глаг"
	};
	/**
	 * <::слав>, церковнославянский язык
	 */
	public static final int LANG_SLAVONIC = 1;
	/**
	 * <::рус>, русский язык
	 */
	public static final int LANG_RUSSIAN = 2;
	/**
	 * <::греч>, греческий язык
	 */
	public static final int LANG_GREEK = 3;
	/**
	 * <::лат>, латынь (латинский алфавит)
	 */
	public static final int LANG_LATIN = 4;
	/**
	 * <::глаг>, глаголица
	 */
	public static final int LANG_GLAGOL = 5;
	
	private String hip;
	/**
	 * %<Киноварь%>
	 */
	private boolean red;
	/**
	 * %[Разрядка%]
	 */
	private boolean spaced;
	/**
	 * %(Подзаголовок%)
	 */
	private boolean capitalized;
	private int language;
	
	protected HipSpan(String hip, boolean red, boolean spaced, boolean capitalized, int language) {
		this.hip = hip;
		this.red = red;
		this.spaced = spaced;
		this.capitalized = capitalized;
		if(language < LANG_SLAVONIC || language > LANG_GLAGOL)
			throw new IllegalArgumentException("Неизвестный язык: "+language);
		this.language = language;
	}
	
	public String getHip() {
		return hip;
	}
	public boolean isRed() {
		return red;
	}
	public boolean isSpaced() {
		return spaced;
	}
	public boolean isCapitalized() {
		return capitalized;
	}
	public int getLanguage() {
		return language;
	}
	
	/**
	 * То же, что и getHip. Для единообразия.
	 * @return
	 */
	public String asHip() {
		return getHip();
	}
	
	public static String getLangName(int langId) {
		if(langId < 0 || langId >= langNames.length)
			throw new IllegalArgumentException("Неизвестный язык: "+langId);
		return langNames[langId];
	}
}
