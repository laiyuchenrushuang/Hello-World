import java.util.ArrayList;
import java.util.Collection;

public class Test {
	static ArrayList<Integer> muBiaoShu = new ArrayList<Integer>();
	static int sum = 0;

	public static void main(String[] args) {
		int begin = 1;
		int zongShu = 1000;
		for (int i = begin; i < zongShu; i++) {
			getOnePoint(i);
			getArrayListSum();
			if (sum == i) {
				System.out.println(sum);
				sum = 0;
				muBiaoShu.clear();
			} else {
				sum = 0;
				muBiaoShu.clear();
			}
		}
	}

	// 取得每个数的因子之和
	private static void getArrayListSum() {
		for (int i = 0; i < muBiaoShu.size(); i++) {
			sum += muBiaoShu.get(i);
		}
	}

	// 把所有因子添加到数组
	private static void getOnePoint(int i) {
		for (int j = 1; j <= i; j++) {
			if (j != i && i % j == 0) {
				muBiaoShu.add(j);
			}
		}
	}

}
