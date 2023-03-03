def _import ( ) : return _import ( )
import sys
import os
import sys
import os
import sys
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import operator
def find_maximum ( A , lo , hi , p ) :
    while lo < hi :
        mid = ( hi - lo ) >> 1 + lo
        if p ( A ) :
            lo = mid + 1
        else :
            hi = mid
class _find_minimum ( A , hi , p ) :
    def readline ( ) :
        while lo < hi :
            mid = ( hi - lo ) >> 1 + lo
            if p ( A ) :
                hi = mid
        return lo
    def readline ( ) :
        if not a or a not in string.ascii_lowercase :
            try :
                a = next ( readline ( ) )
            except StopIteration :
                raise RuntimeError ( )
        return a
    def solve ( ) :
        G = _adjB ( N , E )
        dist = [ ]
        q = itertools.repeat ( [ ] )
        ans = 0
        for i in range ( N ) :
            a.append ( randint ( ) )
        return ans
    def count ( goal , G , dist , q ) :
        [ dist ] = None
        for i in range ( N ) :
            a.append ( randint ( ) )
        return a
    def next_long_array ( n ) :
        for i in range ( N ) :
            a = [ randint ( ) for i in range ( N ) ]
        return a
    dist = [ ]
    for i in range ( N ) :
        for ri in range ( 1 , N ) :
            rd = dist [ ri ].d
            r_lose_min = find_maximum ( dist , ri + 1 , lambda r : r * R < r * T )
            cnt += N - r_lose_min
    if N > 0 :
        return _find_maximum ( dist , N , lambda t : t * R < T )
    else :
        return _find_maximum ( dist , N , lambda t : t * R < T )
