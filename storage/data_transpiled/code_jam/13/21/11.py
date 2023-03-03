def _import ( ) :
    import sys
    import tokenize
    import math
    class A ( object ) :
        def __init__ ( self ) :
            super ( A , self ).__init__ ( )
        def __next__ ( self ) :
            INF = 1111111
            def eat ( x , y ) :
                return x + y >= INF
            return int ( next ( self ) )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return int ( next ( self ) )
    def run ( ) :
        f = InputReader ( sys.stdin )
        out = sys.stdout
        test_cases = f.read ( )
        for index in range ( 1 , test_cases + 1 ) :
            m , n = next ( self ) , next ( self )
            a = [ ]
            for i in range ( n ) :
                a.append ( f.read ( ) )
            a.sort ( )
            dp = [ [ m ] for _ in range ( 1 , n + 1 ) ]
            for i in range ( 1 , n + 1 ) :
                for j in range ( 0 , n ) :
                    if dp [ i - 1 ] [ j ] > a [ i - 1 ] :
                        dp [ i ] [ j ] = max ( dp [ i ] [ j ] , eat ( dp [ i - 1 ] [ j ] , a [ i - 1 ] ) )
                    if j > 0 :
                        dp [ i ] [ j ] = max ( dp [ i ] [ j ] , dp [ i ] [ j - 1 ] )
                for j in range ( 1 , n + 1 ) :
                    dp [ i ] [ j ] = max ( dp [ i ] [ j ] , eat ( dp [ i ] [ j - 1 ] , dp [ i ] [ j - 1 ] - 1 ) )
            ret = 0
            for i in range ( 0 , n ) :
                if dp [ n ] [ i ] > 0 :
                    ret = i
                    break
            out.write ( "Case #%d: %d\n" % ( index , ret ) )
    return run
