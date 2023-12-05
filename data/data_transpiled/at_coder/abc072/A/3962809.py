def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
    def __call__ ( self , x , a ) :
        ans = x - a
        if ans < 1 :
            sys.stdout.write ( '0' )
        else :
            sys.stdout.write ( ans )
