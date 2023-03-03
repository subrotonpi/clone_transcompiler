def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        for c in self.s :
            if c in ( 'a' , 'i' , 'u' , 'e' , 'o' ) :
                continue
            print ( c , end = ' ' )
        print ( )
