package office.staff;

import utility.date.Date;


	public class SalesManager extends Emp implements ITraveller {
		 double target;
		 double incentive;
		private double totalsales;
		private double commissionPercentage;
		private String passportNo;
		private  int travelHours;

		public SalesManager() {
			super();
		}

		public SalesManager(String name, Date bdate, int empid, double salary, double target, double incentive,String passportNo,int travelHours) {
			super(name, bdate, empid, salary);
			this.target = target;
			this.incentive = incentive;
			this.passportNo=passportNo;
			this.travelHours=travelHours;
		}
		public void display() {
			super.display();
			System.out.println("Target : "+target+"\nIncentive : "+incentive);
			
		}

		@Override
		public String toString() {
			return "SalesManager [target=" + target + ", incentive=" + incentive + "]";
		}

		@Override
		public double calSalary() {
			// TODO Auto-generated method stub
			double commission =totalsales*commissionPercentage/100;
			return  salary+commission;
		}

		public String getPassportDetail() {
			System.out.println("Passport Number is: "+passportNo);
			return passportNo;
		}

		
		public int getTravelHours() {
			// TODO Auto-generated method stub
		System.out.println("Travel Hours; "+travelHours);
			return travelHours;
		}

	

}
