def import _np
import sys
import numpy
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
from numpy.core import get_symbols
n = get_symbols ( 'n' )
m = get_symbols ( 'm' )
a = get_symbols ( 'a' )
for i in range ( n ) :
    for j in range ( m ) :
        a [ i ] [ j ] = get_symbols ( )
        del a [ i ] [ j ]
invalid = [ ]
ans = sys.maxsize
for t in get_symbols ( ) :
    cnt = [ ]
    for i in range ( m ) :
        for j in range ( m ) :
            if invalid [ a [ i ] [ j ] ] :
                continue
            cnt.append ( a [ i ] [ j ] )
            break
    max = [ ]
    for i in range ( m ) :
        max = max ( max , cnt [ i ] )
        ans = min ( ans , max )
        for i in range ( m ) :
            if cnt [ i ] == max :
                invalid.append ( True )
                break
    print ( ans )
def tr ( * args ) :
    print ( * args )
return tr
