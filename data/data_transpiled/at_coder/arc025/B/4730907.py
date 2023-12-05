def _import ( ) :
    import sys
    import os
    import os
    import __builtin__ as builtins
    import __builtin__ as builtins
    class Main ( object ) :
        sc = __builtin__.sc
        H = sc.__next__ ( )
        W = sc.__next__ ( )
        Bl = [ ]
        Wh = [ ]
        for i in range ( 0 , H ) :
            for j in range ( 0 , W ) :
                Bl.append ( 0 )
                Wh.append ( 0 )
        for i in range ( 1 , H ) :
            for j in range ( 1 , W ) :
                if ( ( i - 1 ) + ( j - 1 ) ) % 2 == 0 :
                    Bl.append ( sc.__next__ ( ) )
                else :
                    Wh.append ( sc.__next__ ( ) )
        for i in range ( 0 , H ) :
            for j in range ( 1 , W ) :
                Bl [ i ] [ j ] = Bl [ i ] [ j ] + Bl [ i ] [ j - 1 ]
                Wh [ i ] [ j ] = Wh [ i ] [ j ] + Wh [ i ] [ j - 1 ]
        for i in range ( 0 , W ) :
            for j in range ( 1 , H ) :
                Bl [ j ] [ i ] = Bl [ j ] [ i ] + Bl [ j - 1 ] [ i ] - Bl [ k - 1 ] [ l - 1 ] [ j ] - Wl [ k - 1 ] [ l - 1 ] [ i ]
                Wh [ j ] [ i ] = Wh [ j ] [ i ] + Wh [ j - 1 ] [ i ]
    max = 0
    for i in range ( 0 , H ) :
        for j in range ( 0 , W ) :
            for k in range ( 1 , H - i ) :
                for l in range ( 1 , W - j ) :
                    if l == 0 :
                        max = max + l
    return Main ( )
