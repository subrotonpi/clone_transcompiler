def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _sys.stdin
    def main ( self ) :
        res = - 1145141919
        for n in range ( self.s.n , 0 , - 1 ) :
            sum = 0
            for j in range ( 4 ) :
                sum += self.s.get ( j )
            sum += self.s.get ( n ) * 110 / 900.0
            res = max ( res , sum )
        print ( res )
