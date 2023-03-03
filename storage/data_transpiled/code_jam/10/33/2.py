def _import ( ) :
    import locale
    import os
    import sys
    import os
    import locale
    import os
    import sys
    class Board ( object ) :
        def __init__ ( self ) :
            self.test = 0
            self.n = len ( self.cuts ) - 1
            self.board = [ ]
            self.left = [ ]
            self.top = [ ]
            for i in range ( self.m ) :
                s = self.test
                for j in range ( self.n // 4 ) :
                    hex = s [ j ]
                    value = ( hex >= '0' and hex <= '9' ) or ( hex - 'A' + 10 )
                    for k in range ( 4 ) :
                        self.board [ i ] [ 4 * j + k ] = 1 if value & ( 1 << ( 3 - k ) ) else 0
    cuts = [ ]
    diff = 0
    for size in range ( min ( m , n ) ) :
        cutcount = 0
        for i in range ( self.m ) :
            for j in range ( self.n ) :
                if j > 0 and board [ i ] [ j ] == 1 - board [ i ] [ j - 1 ] :
                    left [ i ] [ j ] = - 1
                    left [ i ] [ j - 1 ] = 0
                else :
                    left [ i ] [ j ] = 1 if board [ i ] [ j ] != - 1 else 0
                good = left [ i ] [ j ] >= size
                if good :
                    if i > 0 and board [ i - 1 ] [ j ] == 1 - board [ i ] [ j ] :
                        top [ i ] [ j ] = top [ i - 1 ] [ j ] + 1
                    else :
                        top [ i ] [ j ] = 1
                else :
                    top [ i ] [ j ] = 0
    if cutcount :
        cuts.append ( cutcount )
    print ( "Case #%d: %d" % ( test , diff ) )
    for i in cuts :
        print ( "%d %d" % ( i , diff ) )
