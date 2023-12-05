def import import sys , string , count , c , d , dict , count , N , c , count , c , count , ** kwargs ) :
    from collections import defaultdict
    from itertools import count , combinations
    sc = Scanner ( string )
    N = int ( count )
    d = { }
    for i in range ( N ) :
        c = int ( sc.next ( ) )
        if c not in d :
            d [ c ] = 1
        else :
            num = d [ c ]
            d [ c ] += 1
    res = 0
    for c , cnt in d.items ( ) :
        if cnt < c :
            res += cnt
        else :
            res += ( cnt - c )
    print ( res )
