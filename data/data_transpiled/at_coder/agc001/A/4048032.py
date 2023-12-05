def import import StringIO
from itertools import repeat
from itertools import chain
from itertools import chain
from random import randint
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import next , next , next , next
class TaskA ( object ) :
    def solve ( self , test_number , stream , next ) :
        n = next ( stream )
        l = chain ( range ( n * 2 ) , repeat ( 2 , n ) )
        l.sort ( )
        ans = 0
        for i in range ( 0 , 2 * n , 2 ) :
            ans += next ( l )
        return chain ( ans , repeat ( next ) )
    def read ( self , n ) :
        if self._buffer_available :
            if n == - 1 :
                raise StopIteration
            self._buffer_available = 0
            try :
                bufptr = next ( self._buffer_available )
            except StopIteration :
                raise StopIteration
            if bufptr <= 0 :
                return - 1
            return next ( self._buffer_available )
        def isSpaceChar ( c ) :
            return c in chain ( chain ( [ ' ' , '\n' , '\r' , '\t' , - 1 ] , repeat ( c ) ) )
        def __next__ ( self ) :
            n = 0
            b = next ( self._buffer_available )
            while isSpaceChar ( b ) :
                b = next ( self._buffer_available )
                minus = ( b == '-' )
                if minus :
                    b = next ( self._buffer_available )
                while b >= '0' and b <= '9' :
                    n *= 10
                    n += b - '0'
                    b = next ( self._buffer_available )
                if not isSpaceChar ( b ) :
                    raise StopIteration
            return minus ( n )
        next ( self._buffer_available )
    return TaskA ( ).solve
