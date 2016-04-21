package cafeSearcher;

import java.io.IOException;
import java.util.ArrayList;

public class Run {
	public ArrayList<Website> output(String queryStr) throws IOException {
		ArrayList<Keyword> keywords = new ArrayList<>();
		
		keywords.add(new Keyword("�@�ة�", 500));
		keywords.add(new Keyword("�@���U", 500));
		keywords.add(new Keyword("�@���]", 500));
		keywords.add(new Keyword("�@��", 500));
		keywords.add(new Keyword("coffee", 500));
		keywords.add(new Keyword("cafe", 500));

		keywords.add(new Keyword("���y", 50));
		keywords.add(new Keyword("wifi", 50));
		keywords.add(new Keyword("�L�u����", 50));
		keywords.add(new Keyword("�[��", 50));
		keywords.add(new Keyword("������", 50));
		keywords.add(new Keyword("�A�X�u�@Ū��", 50));
		keywords.add(new Keyword("����", 50));
		keywords.add(new Keyword("�����A�ȶO", 50));
		keywords.add(new Keyword("���ݪA�ȶO", 50));
		keywords.add(new Keyword("�S�A�ȶO", 50));

		keywords.add(new Keyword("��", 3));
		keywords.add(new Keyword("��^", 3));
		keywords.add(new Keyword("�~��n", 3));
		keywords.add(new Keyword("�n�Y", 3));
		keywords.add(new Keyword("�n��", 3));
		keywords.add(new Keyword("�S��", 3));
		keywords.add(new Keyword("�]�p�P", 3));
		keywords.add(new Keyword("��C", 3));
		keywords.add(new Keyword("�ξA", 3));
		keywords.add(new Keyword("����", 3));
		keywords.add(new Keyword("����", 3));
		keywords.add(new Keyword("���C", 3));
		keywords.add(new Keyword("�w�R", 3));
		keywords.add(new Keyword("��P", 3));
		keywords.add(new Keyword("���I", 3));
		keywords.add(new Keyword("�J�|", 3));
		keywords.add(new Keyword("���B", 3));
		keywords.add(new Keyword("�氮", 3));
		keywords.add(new Keyword("�P��", 3));
		keywords.add(new Keyword("��", 3));

		keywords.add(new Keyword("����", -100));
		keywords.add(new Keyword("�ʬ�", -100));
		keywords.add(new Keyword("�s�D", -100));

		keywords.add(new Keyword("���찪", -10));
		keywords.add(new Keyword("�Q", -10));
		keywords.add(new Keyword("���魭��", -10));
		keywords.add(new Keyword("������\�ɶ�", -10));

		BeatGoogle beatGoogle = new BeatGoogle(keywords);
		ArrayList<Website> resultWebs = beatGoogle.query(queryStr);

		return resultWebs;
	}

}
