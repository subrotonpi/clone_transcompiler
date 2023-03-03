def c_2015 ( ) :
    import sys
    from pylada.utils import pylada
    from pylada.utils import pylada
    kases = pylada.get_kases ( )
    for kas in range ( 1 , kases + 1 ) :
        R , C , W = pylada.get_kases ( )
        ans = C / W * R + W - 1
        if C % W != 0 :
            ans += 1
        print ( "Case #{}: {}".format ( kas , ans ) )
