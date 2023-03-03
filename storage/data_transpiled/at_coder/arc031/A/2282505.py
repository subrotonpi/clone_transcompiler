def main ( ) :
    import sys
    import os
    s = os.path.split ( sys.argv [ 0 ] )
    for i in range ( len ( s ) / 2 ) :
        if s [ i ] == s [ len ( s ) - 1 - i ] :
            pass
        else :
            print ( "NO" )
            return
    print ( "YES" )
