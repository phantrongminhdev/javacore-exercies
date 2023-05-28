package controller15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model15.InServiceStudent;
import model15.School;
import model15.Student;
import model15.StudyResult;

public class SchoolManagement {
	public void totalStudent(School school) {
		List<Student> listStudent = school.getStudentList();
		System.out.println("total student in each school : "+  listStudent.size());
	}
	
	public void scoreMax(School school) {
		List<Student> listStudent = school.getStudentList();
		List<Double> scoreList = new ArrayList<>();
		for(int i = 0 ; i < listStudent.size() ; i++) {
			scoreList.add(listStudent.get(i).getInScore());
		}
		System.out.println("Max score : " + Collections.max(scoreList));
	}
	
	public void getRegularStudent(School school) {
		List<Student> listStudents = school.getStudentList();
		
		if(listStudents.get(0) instanceof InServiceStudent) {
			for(int i  = 0 ; i < listStudents.size() ; i++) {
				InServiceStudent inServiceStudent = (InServiceStudent) listStudents.get(i);
				System.out.println(inServiceStudent.toString());
			}
		}
	}
	
	public void getStudentScoreThanEight(School school) {
		List<Student> listStudents = school.getStudentList();
		for(int i = 0 ; i < listStudents.size() ; i++) {
			List<StudyResult> studyResults = listStudents.get(i).getStudyResults();
			for(int j = 0 ; j < studyResults.size() ; j++) {
				if(j == studyResults.size() - 1) {
					if(studyResults.get(j).getAvgScore() > 8) {
						System.out.println(listStudents.get(i).toString());
					}
				}
			}
		}
	}
	
	public void getStudentScoreMax(School school) {
		List<Student> listStudents = school.getStudentList();
		List<Double> listScore = new ArrayList<>();
		for(int i = 0 ; i < listStudents.size() ; i++) {
			List<StudyResult> studyResults = listStudents.get(i).getStudyResults();
			for(int j = 0 ; j < studyResults.size() ; j++) {
				listScore.add(studyResults.get(i).getAvgScore());
			}
		}
		
		Double maxScore = Collections.max(listScore);
		
		for(int i = 0 ; i < listStudents.size() ; i++) {
			List<StudyResult> studyResults = listStudents.get(i).getStudyResults();
			for(int j = 0 ; j < studyResults.size() ; j++) {
				if(maxScore == studyResults.get(i).getAvgScore()) {
					System.out.println(listStudents.get(i).toString());
				}
			}
		}
	}
	
	public void sapXepStudent(School school) {
		List<Student> listStudents = school.getStudentList();
		Collections.sort(listStudents , new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getYearLearned() > o2.getYearLearned()) {
					return 1;
				}else {
					return -1;
				}
			}
			
		});
		
		Collections.reverse(listStudents);
	}
	
	public void countStudentByYearLearned(School school) {
		List<Student> listStudents = school.getStudentList();
		List<Integer> yearLearnedList = new ArrayList<>();
		for(int i = 0 ; i < listStudents.size() ; i++) {
			yearLearnedList.add(listStudents.get(i).getYearLearned());
		}
		
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0 ; i < yearLearnedList.size() ; i++) {
			addElement(map, yearLearnedList.get(i));
		}
		
		for (Integer key : map.keySet()) {
            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
        }
	}
	
	 public static void addElement(Map<Integer, Integer> map, int element) {
	        if (map.containsKey(element)) {
	            int count = map.get(element) + 1;
	            map.put(element, count);
	        } else {
	            map.put(element, 1);
	        }
	    }
}






















