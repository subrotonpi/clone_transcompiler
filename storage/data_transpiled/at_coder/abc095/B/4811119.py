def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
    def __call__ ( self , X ) :
        m = [ ]
        for i in range ( self.N ) :
            m.append ( i )
        for i in range ( self.X ) :
            X -= m [ i ]
        min = sys.maxsize
        for i in range ( self.X ) :
            min = min ( min , m [ i ] )
        print ( self.N , ( X / min ) )
