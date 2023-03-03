def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.l = int ( sys.stdin.readline ( ) )
        self.a = [ ]
        self.last_idx = 0
        self.b = True
        self.a.append ( sys.stdin.readline ( ) )
        for i in range ( 1 , n ) :
            self.a.append ( sys.stdin.readline ( ) )
            if self.b and self.a [ i - 1 ] + self.a [ i ] >= self.l :
                self.b = False
                self.last_idx = i
        if self.b :
            print ( "Impossible" )
            return
        print ( "Possible" )
        for i in range ( 1 , last_idx ) :
            print ( i )
        for i in range ( n - 1 , - 1 , - 1 ) :
            print ( i )
