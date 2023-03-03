def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
    def __init__ ( self ) :
        self.s = [ ]
        self.p = [ ]
        sum = 0
        for i in range ( self.n ) :
            self.s.append ( self.s [ i ] )
            x = self.p [ i ]
            self.p.append ( x )
            sum += x
    ans = 'atcoder'
    for i in range ( self.n ) :
        if self.p [ i ] * 2 > sum :
            ans = self.s [ i ]
    print ( ans )
