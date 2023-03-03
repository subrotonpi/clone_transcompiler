def _import ( ) :
    import sys
    import os
    import sys
    import random
    import time
    import itertools
    def f ( ) :
        if sys.version_info [ 0 ] >= 3 :
            return ''
        else :
            return ''
    def _sort ( a ) :
        pp = [ i for i in range ( len ( a ) ) ]
        a.sort ( key = lambda x : x [ 1 ] )
        for i in range ( len ( a ) ) :
            print ( 'Case #%d: %s' % ( i + 1 , A ( ).solve ( ) ) )
    def solve ( ) :
        n = len ( a )
        a = [ i for i in range ( n + 1 ) ]
        b = [ i for i in range ( n + 1 ) ]
        c = [ i for i in range ( n + 1 ) ]
        n += 1
        pa = _sort ( a )
        pb = _sort ( b )
        za = [ False ]
        zb = [ False ]
        zc = [ False ]
        res = 0
        for cc in range ( 0 , 10000 ) :
            aa = bb = 10000 - aa - cc
            if bb < 0 :
                continue
            s = 0
            for i in range ( n ) :
                za [ i ] = ( a [ i ] <= aa )
                zb [ i ] = ( b [ i ] <= bb )
                zc [ i ] = ( c [ i ] <= cc )
                if za [ i ] and zb [ i ] and zc [ i ] :
                    s += 1
            if s > res :
                res = s
            j = n - 1
            for i in range ( n ) :
                if not za [ pa [ i ] ] :
                    aa = a [ pa [ i ] ]
                    bb = 10000 - aa - cc
                    if bb < 0 :
                        break
                    za [ pa [ i ] ] = True
                if za [ pb [ j ] ] and zc [ pb [ j ] ] :
                    s -= 1
                j -= 1
            if j < 0 :
                print ( '' )
        return res
    return _sort
