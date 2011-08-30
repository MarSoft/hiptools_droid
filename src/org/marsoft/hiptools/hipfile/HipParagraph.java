package org.marsoft.hiptools.hipfile;

import java.util.Arrays;
import java.util.Iterator;

public class HipParagraph implements Iterable<HipSpan> {
	private HipSpan[] spans;
	
	protected HipParagraph(String paragraph) {
		parse(paragraph);
	}
	
	/**
	 * Вызывается конструктором.
	 * Разбивает строку на span'ы.
	 * @param p
	 */
	private void parse(String p) {
		String[] spans = p.split("<::слав>|<::рус>|<::греч>|<::лат>|<::глаг>");
		// TODO
	}
	
	/**
	 * Конвертирует данные из внутреннего представления обратно в HIP
	 * @return
	 */
	public String asHip() {
		// TODO: теги
		String ret = "";
		for(HipSpan s: spans)
			ret += s.asHip();
		return ret;
	}
	
	/**
	 * Возвращает количество span'ов в параграфе.
	 * @return
	 */
	public int getSpansCount() {
		return spans.length;
	}
	/**
	 * Возвращает n-й HipSpan.
	 * @throws IndexOutOfBoundsException
	 * @param n
	 * @return
	 */
	public HipSpan getSpan(int n) {
		return spans[n];
	}

	@Override
	public Iterator<HipSpan> iterator() {
		return Arrays.asList(spans).iterator();
	}
}