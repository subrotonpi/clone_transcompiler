def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        if self.s [ - 1 ] == 'T' :
            sys.stdout.write ( 'YES\n' )
        else :
            sys.stdout.write ( 'NO\n' )
