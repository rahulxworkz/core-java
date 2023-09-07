class Bank{
    
	private int bankid;
	private String name;
	 private String cifNo;
    private String address;
    private String ifscCode;
    private String branchName;
    private String customerName;
    private long customerPhoneNo;

    public void setBankId(int bankid){
	      this.bankid = bankid;
	}
	public int getBankId(){
	      return bankid;
	}
	
	public void setName(String name ){
	       this.name = name;
	}
	public String getName(){
	      return name;
	}
    

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    public String getCifNo() {
        return cifNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerPhoneNo(long customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public long getCustomerPhoneNo() {
        return customerPhoneNo;
    }

   } 	
