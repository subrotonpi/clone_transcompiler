def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        s = self.sc.readline ( )
        for i in range ( 0 , len ( s ) , 2 ) :
            c = s [ i : i + 2 ]
            print ( c , end = ' ' )
