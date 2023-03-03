def _import ( ) : return _import ( )
import time
import math
import random
import math
import random
import math
import random
import time
class Main :
    def __init__ ( self ) :
        self.s = sys.stdin
        self._import ( )
    def fal_rnd ( self , ar , sp ) :
        return 0 <= y < self._h and 0 <= x < self._w
    def _range ( self , y ) :
        self._l , self._r = y , self._l
        while self._l + 1 != self._r :
            self._ar [ random.random ( ) < 0.5 ] += 1
        return self._ar
    def _REPS ( self , v ) :
        return random.randint ( 0 , v )
    def _main ( __ ) :
        h , w , k = s.__next__ ( )
        f = [ ]
        x , y = - 1 , - 1
        for i in range ( h ) :
            inp = s.__next__ ( )
            if x == - 1 :
                x , y = inp.find ( 'S' ) , i
            f.append ( inp.decode ( 'utf-8' ) )
        u , d , r , l = y , y , x , - 1
        dx = [ 0 , 1 , 0 , - 1 ]
        dy = [ 1 , 0 , - 1 , 0 ]
        deque = [ ( y , x ) ]
        for i in range ( 0 , k ) :
            for poll in deque :
                u , d , l , r = poll
                f [ poll [ 1 ] + dy [ bufd ] ] = '#'
                for bufd in range ( 4 ) :
                    if _range ( poll [ 1 ] + dy [ bufd ] , poll [ 0 ] + dx [ bufd ] ) and f [ poll [ 1 ] + dy [ bufd ] ] [ poll [ 0 ] + dx [ bufd ] ] == '#' :
                        deque.append ( ( poll [ 1 ] , poll [ 0 ] + dx [ bufd ] ) )
        print ( ( u , d , r , l , r ) )
