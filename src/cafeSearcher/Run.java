package cafeSearcher;

import java.io.IOException;
import java.util.ArrayList;

public class Run {
	public ArrayList<Website> output(String queryStr) throws IOException {
		ArrayList<Keyword> keywords = new ArrayList<>();
		
		keywords.add(new Keyword("咖啡店", 500));
		keywords.add(new Keyword("咖啡廳", 500));
		keywords.add(new Keyword("咖啡館", 500));
		keywords.add(new Keyword("咖啡", 500));
		keywords.add(new Keyword("coffee", 500));
		keywords.add(new Keyword("cafe", 500));

		keywords.add(new Keyword("插座", 50));
		keywords.add(new Keyword("wifi", 50));
		keywords.add(new Keyword("無線網路", 50));
		keywords.add(new Keyword("久坐", 50));
		keywords.add(new Keyword("不限時", 50));
		keywords.add(new Keyword("適合工作讀書", 50));
		keywords.add(new Keyword("平價", 50));
		keywords.add(new Keyword("不收服務費", 50));
		keywords.add(new Keyword("不需服務費", 50));
		keywords.add(new Keyword("沒服務費", 50));

		keywords.add(new Keyword("香", 3));
		keywords.add(new Keyword("氣氛", 3));
		keywords.add(new Keyword("品質好", 3));
		keywords.add(new Keyword("好吃", 3));
		keywords.add(new Keyword("好喝", 3));
		keywords.add(new Keyword("特色", 3));
		keywords.add(new Keyword("設計感", 3));
		keywords.add(new Keyword("文青", 3));
		keywords.add(new Keyword("舒適", 3));
		keywords.add(new Keyword("推薦", 3));
		keywords.add(new Keyword("音樂", 3));
		keywords.add(new Keyword("裝潢", 3));
		keywords.add(new Keyword("安靜", 3));
		keywords.add(new Keyword("質感", 3));
		keywords.add(new Keyword("甜點", 3));
		keywords.add(new Keyword("蛋糕", 3));
		keywords.add(new Keyword("布丁", 3));
		keywords.add(new Keyword("餅乾", 3));
		keywords.add(new Keyword("鬆餅", 3));
		keywords.add(new Keyword("派", 3));

		keywords.add(new Keyword("維基", -100));
		keywords.add(new Keyword("百科", -100));
		keywords.add(new Keyword("新聞", -100));

		keywords.add(new Keyword("價位高", -10));
		keywords.add(new Keyword("貴", -10));
		keywords.add(new Keyword("假日限時", -10));
		keywords.add(new Keyword("限制用餐時間", -10));

		BeatGoogle beatGoogle = new BeatGoogle(keywords);
		ArrayList<Website> resultWebs = beatGoogle.query(queryStr);

		return resultWebs;
	}

}
