def Main ( ) :
    _sys.stdin.write ( "\n" )
    n , k = _sys.stdin.read ( ).split ( " " )
    s = [ _sys.stdin.read ( ).split ( " " ) [ 0 ] for _ in range ( n ) ]
    if ( s == [ ] ) :
        print ( n )
        return
    if k == 0 or _sys.stdin.read ( ).min ( ).astype ( int ) > k :
        print ( 0 )
        return
    ans , p = 0 , 1
    for l , r in enumerate ( s ) :
        if p * s [ r ] <= k :
            p *= s [ r ]
            ans = max ( ans , r )
            r += 1 - l + 1
        else :
            p /= s [ l ]
            r = max ( r , 1 )
    print ( ans )
