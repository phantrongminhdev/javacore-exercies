package model15;

public class StudyResult {
	private String semester;
	private double avgScore;
	
	public StudyResult() {
		
	}
	
	public StudyResult(String semester, double avgScore) {
		super();
		this.semester = semester;
		this.avgScore = avgScore;
	}


	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}

	@Override
	public String toString() {
		return "StudyResult [semester=" + semester + ", avgScore=" + avgScore + "]";
	}
}
