package Current_train_information;

public class Train_class {

	private String trainname;
	private int trainnumber;
	private String traininfo;
	private String traininfo1;
	private String traininfo2;
	
	
	public Train_class(String trainname, int trainnumber, String traininfo, String traininfo1, String traininfo2) {
		super();
		this.trainname = trainname;
		this.trainnumber = trainnumber;
		this.traininfo = traininfo;
		this.traininfo1 = traininfo1;
		this.traininfo2 = traininfo2;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public int getTrainnumber() {
		return trainnumber;
	}

	public void setTrainnumber(int trainnumber) {
		this.trainnumber = trainnumber;
	}
	public String getTraininfo() {
		return traininfo;
	}

	public void setTraininfo(String traininfo) {
		this.traininfo = traininfo;
	}
	public String getTraininfo1() {
		return traininfo1;
	}

	public void setTraininfo1(String traininfo1) {
		this.traininfo = traininfo1;
	}
	public String getTraininfo2() {
		return traininfo2;
	}

	public void setTraininfo2(String traininfo2) {
		this.traininfo2 = traininfo2;
	}
	
}