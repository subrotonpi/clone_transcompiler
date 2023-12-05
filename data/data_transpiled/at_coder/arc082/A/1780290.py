def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
    def freq ( self ) :
        for i in range ( 100002 ) :
            a = sys.stdin.readline ( ).strip ( )
            self.freq [ a - 1 ] += 1
            self.freq [ a ] += 1
            self.freq [ a + 1 ] += 1
        print ( np.max ( self.freq ).astype ( int ) )
