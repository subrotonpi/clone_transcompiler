def import import random
import locale
import random
import locale
import time
class B ( object ) :
    def __init__ ( self ) :
        self._in = open ( 'b.in' , 'r' )
        self._out = open ( 'b.out' , 'w' )
        self.dsu = [ ]
        self.sets = 0
    def get ( x ) :
        if self.dsu [ x ] == x : return x
        self.dsu.append ( get ( self.dsu [ x ] ) )
        return self.dsu [ x ]
    def merge ( self , x , y ) :
        x = get ( x )
        y = get ( y )
        if x == y : return x
        if random.random ( ) < 0.5 :
            self.dsu.append ( y )
        else :
            self.dsu.append ( x )
            self.sets -= 1
    def solve ( case ) :
        a , b , p = random.randint ( 1 , 10 )
        self.dsu = [ i for i in range ( b - a + 1 ) ]
        self.sets = set ( )
        self.prime = [ True ] * ( max - len ( self.sets ) )
        for i in range ( 2 , max ) :
            if not prime [ i ] : continue
            for j in range ( 2 * i , max - i , i ) :
                self.prime [ j ] = False
        for q in range ( p , max ) :
            if not prime [ int ( q ) ] : continue
            d = a - a % q
            if d < a : d += q
            while d + q <= b :
                merge ( int ( d - a ) , int ( d + q - a ) )
                d += q
        print ( 'Case #%d: %d' % ( case , sets ) , file = sys.stderr )
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        with open ( 'b.in' , 'r' ) as f :
            n = f.read ( )
            for i in range ( 1 , n + 1 ) :
                solve ( i )
            f.close ( )
