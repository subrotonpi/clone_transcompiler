def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.readline ( )
        b = self.sc.readline ( )
        num = int ( a + b )
        for i in range ( 1 , 400 ) :
            if i * i == num :
                print ( "Yes" )
                sys.exit ( )
        print ( "No" )
