def main ( ) :
    import sys
    stdin_stream = sys.stdin
    N = stdin_stream.read ( )
    A = stdin_stream.read ( )
    B = stdin_stream.read ( )
    if N == 2 :
        print ( "Borys" )
    elif ( A - B - 1 ) % 2 == 0 :
        print ( "Borys" )
    else :
        print ( "Alice" )
