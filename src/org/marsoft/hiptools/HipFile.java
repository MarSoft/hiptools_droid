package org.marsoft.hiptools;
import java.io.File;
import java.util.Iterator;

/**
 * Класс представляет собой HIP-файл, загруженный в память.
 * 
 * @author MarSoft
 */
public class HipFile implements Iterable<HipParagraph> {
	private HipParagraph[] paras;
	
	/**
	 * Конструктор загружает информацию из файла.
	 * TODO: загружать также закладки и правки (надо ли в этом классе?)
	 * @param file
	 */
	public HipFile(File file) {
		// TODO
	}
	
	/**
	 * Конвертирует данные из внутреннего представления обратно в HIP
	 * @return
	 */
	public String asHip() {
		String ret = "";
		for(HipParagraph p: paras)
			ret += p.asHip();
		return ret;
	}

	@Override
	public Iterator<HipParagraph> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
