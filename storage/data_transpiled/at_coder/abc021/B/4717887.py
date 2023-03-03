def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( sys.stdin.read ( ) )
        self.a = int ( sys.stdin.read ( ) )
        self.b = int ( sys.stdin.read ( ) )
        self.K = int ( sys.stdin.read ( ) )
        self.P = [ ]
        self.visited = [ ]
        self.visited.append ( 0 )
        for i in range ( self.K ) :
            self.P [ i ] = self.P [ i ]
            if self.P [ i ] == self.a or self.P [ i ] == self.b :
                print ( "NO" )
                return
            if self.visited [ self.P [ i ] ] > 0 :
                print ( "NO" )
                return
            self.visited [ self.P [ i ] ] += 1
        print ( "YES" )
