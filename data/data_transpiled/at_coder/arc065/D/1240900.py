def _import ( ) :
    import os
    import sys
    import os
    import math
    import os
    import math
    import re
    class Main ( object ) :
        def __init__ ( self ) :
            self._import ( )
            self._import ( )
    MODULO = int ( 1e9 + 7 )
    def tr ( * args ) :
        print ( [ str ( x ) for x in args ] )
    def f ( * args ) :
        sc = os.popen ( "/usr/bin/sh -c " + str ( MODULO ) )
        n , m , s = sc.read ( ).split ( )
        S = sc.read ( ).decode ( 'utf-8' )
        l = [ i for i in range ( m ) ]
        r = [ ]
        for i in range ( n ) :
            s.append ( ( S [ i ] == '0' ) )
        for i in range ( m ) :
            l.append ( sc.read ( ).rstrip ( ) )
            del l [ i ]
            r [ l [ i ] ] = max ( r [ l [ i ] ] , sc.read ( ).rstrip ( ) - 1 )
        for i in range ( 1 , n ) :
            r [ i ] = max ( r [ i - 1 ] , r [ i ] )
        c = [ ( i > 0 ) and c [ i - 1 ] or 0 for i in range ( n ) ]
        memo = [ - 1 for i in range ( n ) ]
        print ( f ( 0 , c [ r [ 0 ] ] ) )
    f = 0
    def f ( l , cur_c ) :
        if r [ l ] - ( l - 1 ) < cur_c :
            return memo [ l ] [ cur_c ] = 0
        if l == n - 1 :
            if cur_c > 1 :
                raise AssertionError ( )
            return memo [ l ] [ cur_c ]
        if cur_c == 0 :
            return 0
        return 1
    f = 1
    f = 0
    for i in range ( n ) :
        f ( l , cur_c )
    f ( 0 , 0 )
    f ( 1 , 0 )
    f ( 1 , 0 )
    f ( 1 , 0 )
