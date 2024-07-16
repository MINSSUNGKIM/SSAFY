package labWork;

public class Direction {

	public static void main(String[] args) {

		int[][] map = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int r = 1; // row 행
		int c = 1; // col 열

		int[] dr1 = { -1, 1, 0, 0 };
		int[] dc1 = { 0, 0, -1, 1 };

		for (int i = 0; i < 4; i++) {
			int nr = r + dr1[i];
			int nc = c + dc1[i];
			System.out.print(map[nr][nc] + " ");
		}
		System.out.println();

		// 상 우 하 좌 순서
		int[] dr2 = { -1, 0, 1, 0 };
		int[] dc2 = { 0, 1, 0, -1 };

		r = 0;
		c = 1;
		for (int i = 0; i < 4; i++) {
			int nr = r + dr2[i];
			int nc = c + dc2[i];
			// 상 우 하 좌 순서로 하는데 배열의 크기를 벗어나므로 넘어나지 않도록 조건문 작성
			if (nr>=00 && nc>=0) {
				System.out.print(map[nr][nc] + " ");
			}
		}
		System.out.println();
	}

}
