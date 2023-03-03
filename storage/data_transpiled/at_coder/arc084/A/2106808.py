def import import struct
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
A = get_symbols ( 'A' )
B = get_symbols ( 'B' )
C = get_symbols ( 'C' )
A = get_symbols ( 'A' )
B = get_symbols ( 'B' )
C = get_symbols ( 'C' )
A = get_symbols ( 'A' )
B = get_symbols ( 'B' )
C = get_symbols ( 'C' )
A = get_symbols ( 'A' )
B = get_symbols ( 'B' )
C = get_symbols ( 'C' )
A = get_symbols ( 'A' )
B = get_symbols ( 'B' )
C = get_symbols ( 'C' )
AB = [ ]
ai = 0
bi = 0
for ai in range ( n ) :
    if A [ ai ] < B [ bi ] :
        AB.append ( ai )
        ai += 1
    else :
        bi += 1
        if bi == n :
            break
        AB.append ( AB [ bi - 1 ] )
    bi += 1
    for bi in range ( n ) :
        AB.append ( AB [ bi - 1 ] )
    BC = [ ]
    bi = 0
    ci = 0
    for bi in range ( n ) :
        if B [ bi ] < C [ ci ] :
            BC [ ci ] += AB [ bi ]
            bi += 1
        else :
            ci += 1
            if ci == n :
                break
            BC.append ( BC [ ci - 1 ] )
    ci += 1
    for ci in range ( n ) :
        BC [ ci ] = BC [ ci - 1 ]
    res = get_symbols ( 'B' )
    return res
