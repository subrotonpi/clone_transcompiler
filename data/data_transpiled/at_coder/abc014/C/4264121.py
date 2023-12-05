def import import StringIO
from itertools import chain
from itertools import repeat
from itertools import chain
from StringIO import StringIO
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import islice
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import islice
from itertools import chain as chain
from itertools import chain as chain
from itertools import islice
from itertools import islice
from itertools import chain as chain
from itertools import chain as chain
class TaskC ( object ) :
    def solve ( self , test_number , in_stream , out_stream ) :
        n = len ( chain ( [ 0 ] , repeat ( test_number ) ) )
        a = chain ( [ 1 ] , repeat ( test_number ) )
        for i in range ( 1000002 ) :
            a [ in_stream ] += 1
            a [ in_stream ] -= 1
        max = a [ 0 ]
        for i in range ( 1 , 1000000 ) :
            a [ i ] += a [ i - 1 ]
            if a [ i ] > max :
                max = a [ i ]
        return chain ( a , repeat ( test_number ) )
    def read ( self , n ) :
        if n >= len ( chain ( [ 0 ] , repeat ( n ) ) ) :
            if n == 0 :
                raise StopIteration
            bufptr = iter ( chain ( [ 0 ] , repeat ( n ) ) )
            try :
                bufptr = next ( self._genfrom_ ( bufptr ) )
            except StopIteration :
                raise StopIteration
            if bufptr <= len ( self._genfrom_ ( bufptr ) ) :
                return - 1
            return chain ( [ chain ( [ bufptr ] , repeat ( bufptr ) ) ] , repeat ( bufptr ) )
    def islice ( self , n ) :
        n = 0
        b = next ( self._genfrom_ ( bufptr ) )
        while islice ( self , n ) :
            n = n [ n ]
        return n
    def remove ( self , o ) :
        self._genfrom_ ( o )
    remove ( self )
