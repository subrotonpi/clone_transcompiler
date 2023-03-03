def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sys.stdin.close ( )
    n , t = [ ] , [ ]
    for i in range ( 3 ) :
        n.append ( stdscr.getch ( ) )
    for i in range ( 2 ) :
        for j in range ( 2 , i - 1 , - 1 ) :
            if n [ j - 1 ] > n [ j ] :
                t = n [ j - 1 ]
                n [ j - 1 ] = n [ j ]
                n [ j ] = t
    sys.stdout.write ( n [ 0 ] * n [ 1 ] * ( ( n [ 2 ] + 1 ) / 2 ) - n [ 0 ] * n [ 1 ] * ( n [ 2 ] / 2 ) )
