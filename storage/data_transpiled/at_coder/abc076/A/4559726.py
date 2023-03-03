def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        sys.stdout = sys.__stdout__
        r = int ( sc.read ( ) )
        g = int ( sc.read ( ) )
        ans = g * 2 - r
        sys.stdout.write ( ans )
        sys.stdout.flush ( )
