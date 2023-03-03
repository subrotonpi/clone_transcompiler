def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
        self.A = [ ]
        for i in range ( 1010 ) :
            self.A.append ( sys.stdin.read ( ) )
    def sum ( self ) :
        cnt = 0
        for i in range ( self.N ) :
            sum += self.A [ i ]
            if S <= sum <= T :
                cnt += 1
        print ( cnt )
