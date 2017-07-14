package cn.zqrc.ftms.pro.vo;



/**
 * Contract entity. @author guo
 * Contract合同书	
 */

public class Contract  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private Project project;//合同书对应的项目
	private String contract;//合同书对应的文件
	private String info;//备注
	
	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contract(Integer id, Project project, String contract, String info) {
		super();
		this.id = id;
		this.project = project;
		this.contract = contract;
		this.info = info;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}