package JavaFinalReport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 임의의 위치에 txt 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠
*  이름 국어 영어 수학 형식
*  해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같은 경우 이름순) */

public class JavaFinalMain {
    public static void main(String[] args) {
        // 파일 경로 변수 설정
        String filePath = "src/JavaFinalReport/student.txt";

        // Map 선언하여 이름과 점수를 담는다
        Map<String, List<Integer>> studentScores = new HashMap<>();
        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String lines;
            while ((lines = br.readLine()) != null) {
                String[] names = lines.split("\\s+");   // 공백을 기준으로 이름, 점수 분리
                String name = names[0]; // 0번째 인덱스는 이름으로 채움

                List<Integer> scores = new ArrayList<>();   // 각 점수 값을 담을 List
                scores.add(Integer.parseInt(names[1]));
                scores.add(Integer.parseInt(names[2]));
                scores.add(Integer.parseInt(names[3]));

                studentScores.put(name, scores);    // 이름과 점수들을 Map 안에 저장
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 결과를 저장할 List 선언부
        List<Map.Entry<String, List<Integer>>> studentList = new ArrayList<>(studentScores.entrySet());
        studentList.sort(new Comparator<Map.Entry<String, List<Integer>>>() {
            // 재정의로 이름이 같을 시 점수 2개로 나눈다
            @Override
            public int compare(Map.Entry<String, List<Integer>> o1, Map.Entry<String, List<Integer>> o2) {
                int totalScore1 = o1.getValue().stream().mapToInt(Integer::intValue).sum();
                int totalScore2 = o2.getValue().stream().mapToInt(Integer::intValue).sum();

                // 점수는 오름차순으로 정렬 하며 이름이 같을때 이름순으로 정렬
                if (totalScore1 != totalScore2) {
                    return Integer.compare(totalScore2, totalScore1);
                } else {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
        // 정렬 결과를 출력
        for (Map.Entry<String, List<Integer>> entry : studentList) {
            String name = entry.getKey();
            List <Integer> scores = entry.getValue();

            int totalScore = scores.stream().mapToInt(Integer::intValue).sum();
            System.out.println(name + " - " + totalScore);
        }
    }
}
