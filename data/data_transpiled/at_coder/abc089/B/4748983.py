def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        a = [ sc.readline ( ) for i in range ( n ) ]
        a = set ( a )
        if len ( a ) == 4 :
            print ( "Four" )
        else :
            print ( "Three" )
