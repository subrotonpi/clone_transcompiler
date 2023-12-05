def import _main
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        k = sc.count ( ' ' )
        p = [ ]
        for i in range ( len ( s ) - k + 1 ) :
            if s [ i : i + k ] not in p :
                p.append ( s [ i : i + k ] )
        print ( len ( p ) )
