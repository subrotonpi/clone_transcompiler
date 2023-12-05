def import import _sys , os , sys
class Main ( object ) :
    def __init__ ( self ) :
        self._sys = sys
        self.D = sys.stdin.read ( )
        self.N = sys.stdin.read ( )
        self.ans = int ( sum ( [ 100 ] * D ) )
        if self.N == 100 :
            self.print ( self.ans * 101 )
        else :
            self.print ( self.ans * N )
