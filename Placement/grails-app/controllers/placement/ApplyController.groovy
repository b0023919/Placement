package placement

class ApplyController {

    def index() { }

                def appProcess(){

                        log.debug(params.yourName)

                        redirect(action:'index')

                };

}
