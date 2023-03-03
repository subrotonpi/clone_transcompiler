def main ( ) :
    import sys
    from time import sleep
    from time import sleep
    from sys import stdin
    try :
        num = int ( stdin.read ( ) )
    except :
        print ( "Error: %s" % sys.exc_info ( ) [ 0 ] )
        sys.exit ( 1 )
    time = sleep ( int ( sleep ( 1 ) ) )
    min = sleep ( int ( sleep ( 1 ) ) )
    for t in time :
        if t < min :
            min = t
    print ( min )
