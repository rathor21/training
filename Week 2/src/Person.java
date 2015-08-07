public class Person {
    //composition has-a relationship
	
    private Job job;
    private Education edu;
    
    public Job getJob() {
		return job;
	}
	public Education getEdu() {
		return edu;
	}
	public Person(){
        this.job=new Job();
        job.setSalary(50000L);
        this.edu=new Education();
    }
    public long getSalary() {
        return job.getSalary();
    }
}