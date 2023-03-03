def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
        self.x = int ( sys.stdin.read ( ) )
        self.a = [ ]
        self.right = 0
        self.left = 0
        for i in range ( self.m ) :
            self.a.append ( self.a [ i ] )
        for i in range ( 1 , x ) :
            for j in range ( self.m ) :
                if i == self.a [ j ] :
                    self.left += 1
        for i in range ( self.x + 1 , self.n ) :
            for j in range ( self.m ) :
                if i == self.a [ j ] :
                    self.right += 1
        if self.left <= self.right :
            print ( self.left )
        else :
            print ( self.right )
