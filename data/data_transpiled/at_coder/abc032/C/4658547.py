def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        k = sc.__next__ ( )
        values = [ sc.get ( i ) for i in range ( n ) ]
        if not values :
            print ( n )
            return
    l , r , res = 0 , 0 , 1
    prod = 1
    while l < n :
        while r < n and prod * values [ r ] <= k :
            prod *= values [ r ]
            r += 1
        res = max ( res , r - l )
        if l == r :
            prod *= values [ r ]
        prod /= values [ l ]
        l += 1
    print ( res )
