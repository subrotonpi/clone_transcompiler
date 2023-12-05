def test_x ( ) :
    import sys
    import random
    random.seed ( 0 )
    mod = 30031
    x = random.choice ( range ( 1 , tn + 1 ) )
    for tt in range ( 1 , tn + 1 ) :
        n , k , p = random.randint ( 1 , n )
        Z = 1 << p
        D = [ [ Z ] * Z ]
        D [ k & 1 ] [ ( 1 << k ) - 1 ] = 1
        Z1 = Z >> 1
        for i in range ( k , n ) :
            for j in range ( Z ) :
                D [ ( i + 1 ) & 1 ] [ j ] = 0
            for j in range ( Z1 ) :
                for a in range ( p ) :
                    if j & ( 1 << a ) :
                        l = j & ( ~ ( 1 << a ) )
                        l = ( l << 1 ) + 1
                        D [ ( i + 1 ) & 1 ] [ l ] += D [ i & 1 ] [ j ]
                        if D [ ( i + 1 ) & 1 ] [ l ] >= mod :
                            D [ ( i + 1 ) & 1 ] [ l ] -= mod
                for j in range ( Z1 ) :
                    l = ( ( j << 1 ) & ( Z - 1 ) ) + 1
                    D [ ( i + 1 ) & 1 ] [ l ] += D [ i & 1 ] [ j ]
                    if D [ ( i + 1 ) & 1 ] [ l ] >= mod :
                        D [ ( i + 1 ) & 1 ] [ l ] -= mod
            print ( "Case #{}: {}".format ( tt , D [ n & 1 ] [ ( 1 << k ) - 1 ] % mod ) )
