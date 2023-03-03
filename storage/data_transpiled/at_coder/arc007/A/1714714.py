def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __call__ ( self , x , s ) :
        self.sc.close ( )
        for buf in s :
            if not buf :
                sys.stdout.write ( buf )
        print ( )
