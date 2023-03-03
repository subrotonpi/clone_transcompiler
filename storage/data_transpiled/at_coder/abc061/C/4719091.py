def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.ans = 0
        self.a = [ 0 ] * 100001
        self.k = int ( sys.stdin.readline ( ) )
        for i in range ( self.n ) :
            po = sys.stdin.readline ( )
            self.a [ po ] += sys.stdin.readline ( )
        for i in range ( 100001 ) :
            self.ans += self.a [ i ]
            if self.ans >= self.k :
                print ( i )
                break
