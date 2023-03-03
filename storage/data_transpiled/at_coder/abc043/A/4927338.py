def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def run ( self ) :
        try :
            with open ( "/proc/self/" , "r" ) as f :
                n = f.read ( )
            print ( n * ( n + 1 ) / 2 )
        finally :
            sys.exit ( 0 )
