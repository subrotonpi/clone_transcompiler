def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        import sys
        sys.stdout.write ( "\n" )
    def __init__ ( self ) :
        import sys
        sys.stdout.write ( "\n" )
    K = sys.stdin.read ( )
    xs = [ ]
    N = 50
    for i in range ( N ) :
        if i < K % N :
            xs.append ( i + ( K / N + 1 ) * ( N + 1 ) - K )
        else :
            xs.append ( i + K / N * ( N + 1 ) - K )
    sys.stdout.write ( "%d\n" % N )
    sys.stdout.write ( "%d" % xs [ 0 ] )
    for i in range ( 1 , N ) :
        sys.stdout.write ( " %d" % xs [ i ] )
    sys.stdout.write ( "\n" )
