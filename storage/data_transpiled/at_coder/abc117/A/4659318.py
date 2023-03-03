def import sys
class Main ( object ) :
    def __init__ ( self ) :
        scn = sys.stdin
        T = scn.read ( )
        X = scn.read ( )
        sys.stdout.write ( float ( T ) / X )
