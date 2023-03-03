def _import ( ) :
    from sys import stdin
    from os import devnull
    with open ( '/dev/tty' , 'r' ) as sc :
        A , B , C = stdin.read ( ).split ( '\n' )
        if A [ - 1 ] == B [ 0 ] and B [ - 1 ] == C [ 0 ] :
            print ( 'YES' , file = sys.stderr )
        else :
            print ( 'NO' , file = sys.stderr )
        sys.stdout.flush ( )
