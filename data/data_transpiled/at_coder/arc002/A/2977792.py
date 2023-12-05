def main ( ) :
    import sys
    stdin_stream = sys.stdin
    s = stdin_stream.read ( )
    if s % 4 :
        print ( "NO" )
    elif s % 100 == 0 and s % 400 != 0 :
        print ( "NO" )
    elif s % 100 == 0 and s % 400 == 0 :
        print ( "YES" )
    else :
        print ( "YES" )
