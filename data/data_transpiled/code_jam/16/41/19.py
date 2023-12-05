def import_string ( ) :
    import string
    class A ( object ) :
        def __init__ ( self ) :
            sc = string.ascii_lowercase
            self.cs = [ 'P' , 'R' , 'S' ]
        def __init__ ( self ) :
            dp = [ [ ] for i in range ( 3 ) ]
            for i in range ( 1 , len ( dp [ 0 ] ) ) :
                for j in range ( 3 ) :
                    dp [ j ] [ i ] = dp [ j ] [ i - 1 ] + dp [ ( j + 1 ) % 3 ] [ i - 1 ]
                    o = dp [ ( j + 1 ) % 3 ] [ i - 1 ] + dp [ j ] [ i - 1 ]
                    if o < dp [ j ] [ i ] :
                        dp [ j ] [ i ] = o
        self.T = sc.__next__ ( )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #{}: ".format ( i ) , end = ' ' )
            print ( solve ( ) )
    def solve ( ) :
        N , R , P , S = [ ] , [ ] , [ ] , [ ]
        for i in range ( 3 ) :
            c = [ ]
            for ch in dp [ i ] [ N ] :
                if ch == 'P' : c.append ( 0 )
                if ch == 'R' : c.append ( 1 )
                if ch == 'S' : c.append ( 2 )
            if c [ 0 ] == P and c [ 1 ] == R and c [ 2 ] == S :
                ret = dp [ i ] [ N ]
        return ret or 'IMPOSSIBLE'
    return A
