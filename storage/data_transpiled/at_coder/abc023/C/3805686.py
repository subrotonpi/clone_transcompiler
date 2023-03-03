def import import _rectify
import os
import sys
from numpy.core import array
from numpy.core import zeros
from numpy.core import dot
from numpy.core import dot
from numpy.core import dot
from numpy.core import zeros
from numpy.core import dot
from numpy.core import dot
from numpy.core import dot
R , C , K , N = symbols ( 'R C K' )
cntR = zeros ( R )
cntC = zeros ( C )
adjs = [ [ ] for i in range ( C ) ]
for r , c in zip ( N , N ) :
    cntR [ r ] += 1
    cntC [ c ] += 1
    adjs [ c ].append ( r )
sumR = zeros ( N + 1 )
for c in cntR :
    sumR [ c ] += 1
res = 0
for c in range ( C ) :
    obj = K - cntC [ c ]
    if obj < 0 :
        continue
    res += sumR [ obj ]
    for n in adjs [ c ] :
        if cntR [ n ] == obj :
            res -= 1
        if cntR [ n ] == obj + 1 :
            res += 1
print ( res )
