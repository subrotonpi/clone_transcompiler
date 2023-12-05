def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        s = _sys.stdin.read ( )
        self.n , sum = s.n , 0
        for _ in range ( 0 , 80 - s.n ) :
            sum += max ( 0 , 80 - s.n )
        print ( sum )
