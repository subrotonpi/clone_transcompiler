def _import ( ) :
    import os
    import sys
    import os
    import string
    import os
    import sys
    import os
    import sys
    class PonyExpress ( object ) :
        def __init__ ( self , * args ) :
            self._case = 0
        def __init__ ( self , * args ) :
            self._case = 0
        def __repr__ ( self ) :
            return 'Case #%d: %s' % ( self._case , self._case )
    joiner = string.join
    for i in range ( len ( sys.stdin ) ) :
        u = sys.stdin.read ( )
        v = sys.stdin.read ( )
        joiner.append ( '%.10f' % ( D [ u ] [ v ] ) )
    cout = open ( 'C-large.out' , 'w' )
    _case = 0
    for T in range ( len ( sys.stdin ) ) :
        _case += 1
        N , Q = sys.stdin.read ( )
        E = [ ]
        S = [ ]
        for i in range ( N ) :
            E.append ( '%.10f' % ( i ) )
            S.append ( '%.10f' % ( i ) )
        D = [ ]
        for i in range ( N ) :
            for j in range ( N ) :
                D [ i ] [ j ] = cin.read ( )
        for k in range ( N ) :
            for i in range ( N ) :
                if k == i : continue
                if D [ i ] [ k ] < 0 : continue
                for j in range ( N ) :
                    if D [ i ] [ j ] < 0 : continue
                    if D [ i ] [ j ] > D [ i ] [ k ] + D [ k ] [ j ] :
                        D [ i ] [ j ] = D [ i ] [ k ] + D [ k ] [ j ]
    for k in range ( N ) :
        for i in range ( N ) :
            for j in range ( N ) :
                if D [ i ] [ j ] < 0 : continue
                if D [ i ] [ j ] > E [ i ] [ j ] :
                    D [