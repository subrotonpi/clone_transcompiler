def main ( ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a = int ( sc.readline ( ) )
            b = int ( sc.readline ( ) )
            c = int ( sc.readline ( ) )
            d = int ( sc.readline ( ) )
            if a + b == c + d :
                print ( "Balanced" )
            elif a + b > c + d :
                print ( "Left" )
            elif a + b < c + d :
                print ( "Right" )
