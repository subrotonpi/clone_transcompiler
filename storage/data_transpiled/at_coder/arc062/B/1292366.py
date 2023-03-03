def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.str = sys.stdin.read ( )
        self.count = 0
        for ch in self.str :
            if ch == 'g' :
                self.count += 1
        if len ( self.str ) % 2 == 1 :
            self.print ( self.count - ( len ( self.str ) / 2 + 1 ) )
        else :
            self.print ( self.count - len ( self.str ) / 2 )
