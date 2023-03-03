def main ( ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a , b , c , d = [ int ( x ) for x in sc.readline ( ).split ( ) ]
            a = int ( a )
            b = int ( b )
            c = int ( c )
            d = int ( d )
            left = a + b
            right = c + d
            if left > right :
                print ( "Left" )
            elif left < right :
                print ( "Right" )
            else :
                print ( "Balanced" )
