package org.marsoft.hiptools.hipfile;
import java.io.File;
import java.util.Iterator;

/**
 * Класс представляет собой HIP-файл, загруженный в память.
 * 
 * TODO: не хранить все данные в памяти, а загружать лишь при создании.
 * Запоминать номера символов и потом динамически подгружать.
 * Оправдано ли это?
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
	
	private HipFile parse(String[] paras) {
		// TODO
		return null;
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
	
	/**
	 * Возвращает количество параграфов в файле.
	 * @return
	 */
	public int getParasCount() {
		return paras.length;
	}
	/**
	 * Возвращает n-й параграф.
	 * @throws IndexOutOfBoundsException
	 * @param n
	 * @return
	 */
	public HipParagraph getPara(int n) {
		return paras[n];
	}

	@Override
	public Iterator<HipParagraph> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
