package org.marsoft.hiptools;

import java.util.Iterator;

public class HipParagraph implements Iterable<HipSpan> {
	private HipSpan[] spans;
	
	protected HipParagraph(String paragraph) {
		// TODO: распарсить параграф
	}
	
	/**
	 * Конвертирует данные из внутреннего представления обратно в HIP
	 * @return
	 */
	public String asHip() {
		// TODO
		String ret = "";
		for(HipSpan s: spans)
			ret += s.asHip();
		return ret;
	}

	@Override
	public Iterator<HipSpan> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}