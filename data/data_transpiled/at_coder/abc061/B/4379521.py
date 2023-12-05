def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.a = [ ]
        self.b = [ ]
        self.ans = [ ]
        for i in range ( M ) :
            self.a.append ( sys.stdin.read ( ) )
            self.b.append ( sys.stdin.read ( ) )
        for i in range ( 1 , N + 1 ) :
            for j in range ( M ) :
                if i == self.a [ j ] :
                    self.ans [ i - 1 ] += 1
                if i == self.b [ j ] :
                    self.ans [ i - 1 ] += 1
    for i in range ( N ) :
        print ( self.ans [ i ] )
