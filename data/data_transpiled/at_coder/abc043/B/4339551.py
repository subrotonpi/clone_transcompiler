def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.num = len ( self.s )
        self.s = [ ]
        for i in range ( num ) :
            if len ( self.s ) == 0 and self.s [ i ] == 'B' :
                continue
            if self.s [ i ] == '0' :
                self.s.append ( '0' )
            if self.s [ i ] == '1' :
                self.s.append ( '1' )
            if self.s [ i ] == 'B' :
                self.s.pop ( )
    for i in range ( len ( self.s ) ) :
        sys.stdout.write ( self.s [ i ] )
