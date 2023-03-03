def main ( args ) :
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.T = int ( sys.stdin.read ( ) )
    for ca in range ( 1 , T + 1 ) :
        m = int ( sys.stdin.read ( ) )
        n = int ( sys.stdin.read ( ) )
        a = [ ]
        for i in range ( m ) :
            for j in range ( n ) :
                a.append ( [ i , j ] )
        good = True
        gr = [ False ] * m
        gc = [ False ] * n
        for k in range ( 1 , 100 ) :
            gr [ k ] = True
            gc [ k ] = True
            for i in range ( m ) :
                for j in range ( n ) :
                    if a [ i ] [ j ] > k :
                        gr [ i ] = gc [ j ] = False
                for i in range ( m ) :
                    for j in range ( n ) :
                        if a [ i ] [ j ] == k and not gr [ i ] and not gc [ j ] :
                            good = False
            print ( "Case #%d: %s" % ( ca , "YES" if good else "NO" ) )
