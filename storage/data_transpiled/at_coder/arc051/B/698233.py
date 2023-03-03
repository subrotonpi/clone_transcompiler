def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.K = sys.stdin.read ( )
    a , b = 1 , 1
    for i in range ( K ) :
        temp = a + b
        b = a
        a = temp
    print ( a , b )
    sys.exit ( 0 )
