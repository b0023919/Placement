package placement

class ApplyController {

    def index() { }

                def appProcess(){

        log.debug(params.yourName)
        log.debug(params.yourPlacement)
        log.debug(params.yourStatus)

        def findStudent = Student.findByName(params.yourName)
        def findPlacement = Placement.findByJobTitle(params.yourPlacement)
        def findStatus = Status.findByCode("0")

        log.debug(findStudent)
        log.debug(findPlacement)
        log.debug(findStatus)

        def applyJob = new Application(student:findStudent, placement:findPlacement, status:findStatus)
 
             if (applyJob.save()){
                log.debug("Saved Okay")
        }else{
                log.debug("Saved Failed")
        }  
     
        redirect(action:'index')

                };

}
