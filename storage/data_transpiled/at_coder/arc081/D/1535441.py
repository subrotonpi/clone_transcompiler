def _import ( ) :
    from itertools import chain
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
        def __call__ ( self ) :
            sc = chain ( [ 0 ] , [ ] )
            h = sc.__next__ ( )
            w = sc.__next__ ( )
            s = [ [ ] for _ in range ( h ) ]
            for i in range ( h ) :
                S = [ ]
                S = sc.next ( ).split ( )
                for j in range ( w ) :
                    if S [ j ] == '#' :
                        s.append ( [ i , j ] )
            map = [ [ ] for _ in range ( h - 1 , w - 1 ) ]
            for i in range ( h ) :
                for j in range ( w ) :
                    if ( s [ i ] [ j ] + s [ i + 1 ] [ j ] + s [ i + 1 ] [ j + 1 ] + s [ i ] [ j + 1 ] ) % 2 :
                        map [ i ].append ( [ j ] )
            ans = solver ( map )
            ans = max ( ans , h )
            ans = max ( ans , w )
            print ( ans )
        def solver ( map ) :
            h , w = map.shape
            cum = [ ]
            ans = 2
            for i in range ( h ) :
                for j in range ( w ) :
                    c = map [ i ] [ j ]
                    if c == 0 :
                        cum [ i % 2 ] [ j ] = ( cum [ ( i - 1 ) % 2 ] [ j ] if i > 0 else 0 ) + 1
                    else :
                        cum [ i % 2 ] [ j ] = 0
                ans = max ( ans , calc ( cum [ i % 2 ] , w ) )
            return ans
    return Main ( )
