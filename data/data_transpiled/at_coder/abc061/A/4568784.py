def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        out = sys.stdout
        N = int ( sc.read ( ) )
        M = int ( sc.read ( ) )
        O = int ( sc.read ( ) )
        if O >= N and O <= M :
            out.write ( "Yes\n" )
        else :
            out.write ( "No\n" )
        out.flush ( )
