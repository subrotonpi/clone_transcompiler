def main ( args ) :
    import sys
    class z ( object ) :
        def __init__ ( self ) :
            self.t = args.t
    for i in range ( 1 , t + 1 ) :
        n = len ( sys.argv )
        A = [ ]
        B = [ ]
        for j in range ( n ) :
            A.append ( sys.stdin.read ( ) )
        for j in range ( n ) :
            B.append ( sys.stdin.read ( ) )
        A.sort ( )
        B.sort ( )
        ans = 0
        for j in range ( n ) :
            ans += A [ j ] * B [ n - j - 1 ]
        print ( "Case #{}: {}".format ( i , ans ) )
