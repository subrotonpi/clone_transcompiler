def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.log = len ( self.s )
        if self.s [ log - 1 ] == 'T' :
            sys.stdout.write ( 'YES\n' )
        else :
            sys.stdout.write ( 'NO\n' )
