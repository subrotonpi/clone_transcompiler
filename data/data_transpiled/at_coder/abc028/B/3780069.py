def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.count = [ 0 ] * 6
        for c in s :
            self.count [ c - 'A' ] += 1
    def main ( ) :
        sys.stdout.write ( '{}\n'.format ( count ) )
        if sys.version_info [ 0 ] == 5 :
            sys.stdout.write ( '\n' )
        else :
            sys.stdout.write ( ' ' )
