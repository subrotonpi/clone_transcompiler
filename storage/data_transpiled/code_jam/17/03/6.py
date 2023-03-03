def main ( args ) :
    import sys
    sys.stdin = open ( 'C2.in' , 'r' )
    sys.stdout = open ( 'C2.out' , 'w' )
    with open ( 'C2.in' , 'r' ) as sn :
        t = sn.read ( )
    for tt in range ( 1 , t + 1 ) :
        mp = defaultdict ( lambda : [ ] )
        n , k = sn.read ( )
        mp [ n ] += 1
        mini = - 1
        maxi = - 1
        while True :
            k , cnt = mp.popitem ( )
            if k <= cnt :
                mini = ( k - 1 ) // 2
                maxi = k // 2
                break
            k -= cnt
            del mp [ k ]
            cur = 0
            if mp.has_key ( k // 2 ) :
                cur = mp [ k // 2 ]
            mp [ k // 2 ] = cur + cnt
            cur = 0
            if mp.has_key ( ( k + 1 ) // 2 ) :
                cur = mp [ ( k + 1 ) // 2 ]
            mp [ ( k + 1 ) // 2 ] = cur + cnt
        print ( 'Case #%d: %d %d' % ( tt , maxi , mini ) )
