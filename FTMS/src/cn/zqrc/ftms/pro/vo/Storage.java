package cn.zqrc.ftms.pro.vo;

import java.util.Date;


/**
 * Storage entity. @author guo
 * Storage	货物库存
 */

public class Storage  implements java.io.Serializable {


	// Fields    

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private Goods goods;//对应的商品
	private String info;//备注
	private Date inTime;//入库时间
	private Date outTime;//出库时间
	private String add;//仓库地址
	private String phone;//仓库联系方式

	public Storage() {
	}
	public Storage(Integer id, Goods goods, String info, Date inTime,
			Date outTime, String add, String phone) {
		super();
		this.id = id;
		this.goods = goods;
		this.info = info;
		this.inTime = inTime;
		this.outTime = outTime;
		this.add = add;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}



}