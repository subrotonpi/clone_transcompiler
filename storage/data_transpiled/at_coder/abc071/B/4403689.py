def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.S = _main ( )
    def __call__ ( self , * args ) :
        self.S = _main ( )
        for i in ( 'a' , 'z' ) :
            if i in S :
                continue
            else :
                print ( i )
                return
        print ( 'None' )
