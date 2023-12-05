def import _solve_problem
import os
import sys
from numpy.testing import assert_allclose
from numpy.testing import assert_allclose
from numpy.testing import assert_allclose
from numpy.testing import assert_allclose
from numpy.testing import assert_raises
from numpy.testing import assert_raises
from numpy.testing import assert_raises
from numpy.testing import assert_raises
import numpy.random
import numpy.random
import sys
f = open ( 'a_in.txt' , 'r' )
f.write ( 'a_out.txt' )
n = f.tell ( )
f.seek ( 0 )
t = 1
while n :
    yield t
    t += 1
f = open ( 'a_out.txt' , 'w' )
f.write ( 'Case #%d: ' % nr )
n = f.tell ( )
p = [ float ( pp ) for pp in f.read ( ) ]
som = 0
for pp in p :
    som += float ( pp )
for i in range ( n ) :
    lo = 0.0
    hi = 1.
    for l in range ( 500 ) :
        mid = ( lo + hi ) / 2.0
        eind = p [ i ] + mid * som
        tot = mid
        for j in range ( n ) :
            if i == j :
                continue
            if p [ j ] >= eind - eps :
                continue
            tot += ( eind - p [ j ] ) / som
        if tot > 1.0 :
            hi = mid
        else :
            lo = mid
    ou = ( 100.0 * lo )
    if ou < eps :
        ou = 0.0
    f.write ( ou )
    if i == n - 1 :
        f.write ( '\n' )
    else :
        f.write ( ' ' )
    print ( 'Case #%d solved' % nr , file = sys.stderr )
eps = 1e-9
