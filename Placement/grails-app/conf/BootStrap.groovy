import placement.Student
import placement.Status
import placement.Placement

class BootStrap {

    def init = { servletContext ->

        def Available = new Status(code:"0",description:"Available").save();
        def Unavailable = new Status(code:"1",description:"Unavialable").save();

        def Luke = new Student(name:"Luke Turnbull",courseCode:"9876",notes:"Web Systems Design Course").save();
        def Chris = new Student(name:"Chris Cowan",courseCode:"9876",notes:"Loves finding Nemo").save();
        def Jack = new Student(name:"Jack Turnbull",courseCode:"7867",notes:"Student Nurse").save();
        def Paul = new Student(name:"Paul McGowan",courseCode:"9876",notes:"Is Irish").save();

        def WebDesign = new Placement(jobTitle:"Web Design",companyName:"Web Masters",status:Unavailable).save();
        def aNursing = new Placement(jobTitle:"Adult Nursing",companyName:"NHS",status:Available).save();
        def cNursing = new Placement(jobTitle:"Child Nursing",companyName:"NHS",status:Available).save();

    }

    def destroy = {
    }
}
