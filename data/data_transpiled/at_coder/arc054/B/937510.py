def _import ( ) : return _import ( )
from math import pow
from math import sin , cos , pow
from math import log
from math import pi , pi , pi
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def f ( x ) :
        return x + p / pow ( 2.0 , x / 1.5 )
    def find_x ( self ) :
        return ( 3 * log ( p * pow ( 2 , pi ) / 1.5 ) ) / log ( 4 )
    def run ( self ) :
        p = self.sc.get ( )
        x = find_x ( )
        print ( f ( x ) if x >= 0 else p )
    def ni ( self ) :
        return int ( self.sc.get ( ) )
    def debug ( * os ) :
        print ( " ".join ( os ) , file = sys.stderr )
    class BIT ( object ) :
        def __init__ ( self ) :
            self.n = n
            self.bit = [ ]
            self.bif = lambda x : x
            self.bif = lambda x : x
        def update ( self , v ) :
            for x in range ( self.n + 1 , self.n + 1 , self.bif , default ) :
                self.bit [ x ] = self.bif ( self.bit [ x ] , v )
        def reduce ( self , i ) :
            ret = self.default
            for x in range ( self.n ) :
                ret = self.bif ( ret , self.bit [ x ] )
            return ret
    MOD = 1_000_000_007
    def pow ( a , r ) :
        sum = 1
        while r > 0 :
            if r & 1 == 1 :
                sum *= a
                sum %= MOD
            a *= a
            a %= MOD
            r >>= 1
        return sum
    C = C ( )
    def f ( x ) :
        return x + p / pow ( 2.0 , x / pow ( 2.0 , x / pow ( 2.0 , x / pow ( 2.0 , x / pow ( 2.0 , x / pow ( 2.0 , x / pow ( 2.0 , x / pow ( 2.0 , x / pow ( 2.0 ,