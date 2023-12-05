def main ( ) :
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.C = int ( sys.stdin.read ( ) )
    C = B ( )
    for this_case in range ( 1 , C + 1 ) :
        counts = [ 0 ] * 2500
        N = len ( sys.stdin.read ( ) )
        for i in range ( 2 * N - 1 ) :
            for j in range ( N ) :
                counts [ sys.stdin.read ( ) - 1 ] += 1
        print ( "Case #%d:" % this_case , end = ' ' )
        for i in range ( 2500 ) :
            if counts [ i ] % 2 == 1 :
                print ( " %d" % ( i + 1 ) , end = ' ' )
        print ( )
