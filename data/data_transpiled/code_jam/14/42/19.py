def _import ( ) :
    from itertools import chain
    from math import sin , cos , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , cos , sin , cos , sin , cos , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , , sin , cos , , , ]
    out = [ ]
    cas = atoi ( sys.stdin.readline ( ) )
    for z in range ( 1 , cas + 1 ) :
        n = atoi ( sys.stdin.readline ( ) )
        ss = _import ( )
        arr = [ atoi ( x ) for x in ss ]
        cl = [ ]
        cr = [ ]
        where = { }
        for i in range ( n ) :
            where [ arr [ i ] ] = i
            for j in range ( n ) :
                if i == j : continue
                if i < j and arr [ j ] > arr [ i ] :
                    cl [ i ] += 1
                if i > j and arr [ j ] > arr [ i ] :
                cr [ i ] += 1
        ans = 0
        arr.sort ( )
        for x in arr [ : - 2 ] :
            ans += min ( cl [ j ] , cr