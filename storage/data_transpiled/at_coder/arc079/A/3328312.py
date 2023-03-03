def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.m = int ( sys.stdin.readline ( ).strip ( ) )
    def __init__ ( self ) :
        self.d = [ [ False ] * 2 ]
        for a , b in zip ( self.n , self.m ) :
            if a == 0 :
                self.d [ b ] [ 0 ] = True
            if b == self.n - 1 :
                self.d [ a ] [ 1 ] = True
    self.ans = False
    for i in range ( self.n ) :
        if self.d [ i ] [ 0 ] and self.d [ i ] [ 1 ] :
            self.ans = True
    if self.ans :
        print ( "POSSIBLE" )
    else :
        print ( "IMPOSSIBLE" )
