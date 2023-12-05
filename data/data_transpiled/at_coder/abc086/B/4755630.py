def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.readline ( )
        b = self.sc.readline ( )
        c = int ( a + b )
        for i in range ( 1 , 100100 ) :
            if c == i * i :
                print ( "Yes" )
                return
        print ( "No" )
