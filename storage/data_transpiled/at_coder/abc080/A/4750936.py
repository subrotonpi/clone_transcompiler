def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        a = int ( sys.stdin.readline ( ) )
        b = int ( sys.stdin.readline ( ) )
        c = int ( sys.stdin.readline ( ) )
        if a * b <= c :
            print ( a * b )
        elif c < a * b :
            print ( c )
