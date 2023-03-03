def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.S = self.s.split ( '' )
        for i , s in enumerate ( s ) :
            if i % 2 == 0 :
                print ( '%s' % s )
