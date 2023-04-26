package com.example.javaproject3.psstudy;

import java.util.*;

public class Solution81302_BFS {
    static final int dx[] = {0, 0, 1, -1};
    static final int dy[] = {1, -1, 0, 0};
    static int[][] visit;
    static char[][] map;

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        Arrays.fill(answer, 1);
        int idx = 0;

        for (String[] place : places) {
            visit = new int[5][5];
            map = new char[5][5];

            for(int i=0; i<5; i++){
                map[i] = place[i].toCharArray();
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (map[i][j] == 'P') {
                        if (!bfs(i, j)) {
                            answer[idx] = 0;
                            break;
                        }
                    }
                }
            }
            idx++;
        }

        return answer;
    }

    static boolean bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        visit = new int[5][5];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(visit[i], -1);
        }
        q.add(new Point(x, y));
        visit[x][y] = 0;
        while (!q.isEmpty()) {
            Point point = q.poll();
            x = point.x;
            y = point.y;

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                    if (map[nx][ny] != 'X' && visit[nx][ny] == -1) {
                        visit[nx][ny] = visit[x][y] + 1;
                        if (map[nx][ny] == 'P' && visit[nx][ny] <= 2)
                            return false;
                        q.add(new Point(nx, ny));
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
