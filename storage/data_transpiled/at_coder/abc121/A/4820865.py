def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def __call__ ( self , * args ) :
        try :
            with open ( self.sys ) as f :
                H , W = struct.unpack ( '>H' , f.read ( 1 ) )
            self.sys.stdout.write ( '\n' )
            h , w = struct.unpack ( '>h' , f.read ( 1 ) )
            self.sys.stdout.write ( '\n' )
            print ( ( H - h ) * ( W - w ) )
        finally :
            self.sys.stdout.write ( '\n' )
