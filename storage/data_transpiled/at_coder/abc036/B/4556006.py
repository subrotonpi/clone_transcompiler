def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.stdin )
        self.s = [ ]
        for str in sys.stdin :
            for i , c in enumerate ( str ) :
                self.s.append ( [ c ] )
    for i in range ( n ) :
        for j in range ( n ) :
            sys.stdout.write ( s [ n - 1 - j ] [ i ] )
        sys.stdout.write ( '\n' )
