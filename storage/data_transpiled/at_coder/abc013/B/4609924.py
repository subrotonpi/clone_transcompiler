def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.randint ( 0 , 100 )
        b = self.sc.randint ( 0 , 100 )
        print ( min ( abs ( a - b ) , min ( abs ( a + 10 - b ) , abs ( b + 10 - a ) ) ) )
