package a9_inheritance;

import java.util.Arrays;
import java.util.List;

/* 음악앨범을 관리하는 클래스
요구사항:
 앨범제목 (title) - 문자열
 발매연도 (releaseYear) - 정수
 앨범내 곡들의 제목 배열 (tracks) - 문자열 배열

다음 메소드들을 수형하세요:
생성자(기본생성자, 모든 필드를 매개변수로 가지는 생성자)
각 필드의 getter/setter 메서드
toString 오버라이딩 메서드
 */
class  Album {
    private String title; // 필드클래스는 프라이빗
    private int releaseYear;
    private List<String> tracks;

    public Album() {
    }

    public Album(String title, int releaseYear, List<String> tracks) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) { // ???발매연도 수정가능, 조건추가 예) 미래는 안된다
        this.releaseYear = releaseYear;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Album{" +
                "앨범제목='" + title + '\'' +
                ", 발매연도=" + releaseYear +
                ", 수록곡=" + tracks +
                '}';
    }
}
public class Example2 {
    public static void main(String[] args) {
        Student s1 = new Student("steve1234", "Steve Jones", 1);
//        s1.grade = 2; // 오류 grade가 private이므로 참조 불가
        s1.setGrade(2);
        System.out.println(s1);
        // Student{studentId='steve1234', name='Steve Jones', grade=2}
    }
}
