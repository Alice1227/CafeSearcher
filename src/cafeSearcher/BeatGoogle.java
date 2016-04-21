package cafeSearcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class BeatGoogle {
	private ArrayList<Keyword> keywords;
	public ArrayList<Website> roots;

	public BeatGoogle(ArrayList<Keyword> keywords) {
		this.keywords = keywords;
	}

	public ArrayList<Website> query(String searchWord) throws IOException {
		GoogleSearch gSearch = new GoogleSearch(searchWord);
		HashMap<String, String> titleUrlMap = gSearch.getResults();

		roots = new ArrayList<>();
		for (Entry<String, String> entry : titleUrlMap.entrySet()) {

			String title = entry.getKey();
			String urlStr = entry.getValue();

			Website root = new Website(title, urlStr);
			roots.add(root);

			root.grows(keywords);
			root.evaluate();
		}

		this.roots = doQuickSort(roots);
		return this.roots;
	}
	
	private ArrayList<Website> doQuickSort(ArrayList<Website> r) {
		if (r.size() <= 1) {
			return r;
		}
		// less than
		ArrayList<Website> lt = new ArrayList<>();
		// equal to
		ArrayList<Website> eq = new ArrayList<>();
		// greater than
		ArrayList<Website> gt = new ArrayList<>();

		ArrayList<Website> retVal = new ArrayList<>();

		int indexOfPivot = r.size() / 2;
		Website pivot =r.get(indexOfPivot);

		for (Website a : r) {
			if (a.globalScore < pivot.globalScore) {
				lt.add(a);
			} else if (a.globalScore > pivot.globalScore) {
				gt.add(a);
			} else {
				eq.add(a);
			}
		}

		retVal.addAll(doQuickSort(gt));
		retVal.addAll(eq);
		retVal.addAll(doQuickSort(lt));
		
		return retVal;
	}
}
