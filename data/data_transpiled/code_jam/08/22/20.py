def _import ( ) :
    from math import factorial , set , Decimal
    from math import factorial , factorial
    from math import gcd , sqrt
    from math import log
    scin = Scanner ( )
    N = int ( scin )
    for z in range ( 1 , N + 1 ) :
        A , B , P = [ x for x in scin [ A , B , P ] ]
        equiv = [ i for i in range ( int ( A ) , int ( B ) + 1 ) if i == j ]
        for i in range ( int ( A ) , int ( B ) + 1 ) :
            for j in range ( i + 1 , B + 1 ) :
                if equiv [ i ] == equiv [ j ] :
                    continue
                gcd = int ( gcd ( i , j ) )
                ok = False
                for k in range ( int ( P ) , gcd ) :
                    if pow ( k , factorial ( k ) ) == gcd % k :
                        ok = True
                        break
                if ok :
                    for k in range ( int ( A ) , int ( B ) + 1 ) :
                        if equiv [ k ] == equiv [ j ] :
                            equiv [ k ] = equiv [ i ]
        equiv = set ( [ i for i in equiv if i not in equiv ] )
        print ( "Case #{}: {}".format ( z , len ( equiv ) - 1 ) )
