def _solve ( ) : return _solve_stupid ( r , c , n )
def solve ( ) :
    if False :
        for r in range ( 1 , 4 ) :
            for c in range ( 2 , 25 ) :
                for n in range ( 0 , r * c ) :
                    ans = _solve_stupid ( r , c , n )
                    if ans != smart :
                        print ( "!! %d %d %d %d" % ( r , c , n , ans ) )
    else :
        for r in range ( 1 , 4 ) :
            for c in range ( 1 , 4 ) :
                for n in range ( 0 , r * c ) :
                    ans = _solve_stupid ( r , c , n )
                    if ans != smart :
                        print ( "!! %d %d %d\n" % ( r , c , ans ) )
    for mask in [ 0 , ( 1 << ( r * c ) ) ] :
        if sum ( mask ) == n :
            k = 0
            for i in range ( r ) :
                for j in range ( c ) :
                    a [ i ] [ j ] = ( mask & ( 1 << k ) ) != 0
                    k += 1
        cnt = 0
        for i in range ( r ) :
            for j in range ( c ) :
                for f in range ( 4 ) :
                    for d in range ( i + d ) :
                        ni = i + dx [ d ]
                        nj = j + dy [ d ]
                        if not f or not f :
                            try :
                                f = open ( f , "r" )
                            except IOError :
                                pass
                            else :
                                if f and f.read ( ) == "" :
                                    return ""
            if cnt < best :
                best = cnt
    return ans
return solve ( )
