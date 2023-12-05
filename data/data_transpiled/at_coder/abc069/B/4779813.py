def main ( ) :
    import sys
    import os
    import string
    class Main ( object ) :
        def __init__ ( self ) :
            input = sys.stdin.readline ( )
            word = input.split ( )
            print ( word [ 0 ] + str ( len ( word ) - 2 ) + word [ - 1 ] )
