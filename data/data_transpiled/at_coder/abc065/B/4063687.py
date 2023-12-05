def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
    def __init__ ( self ) :
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( int ( self.a [ i ] ) - 1 )
    def __init__ ( self ) :
        self.b = [ ]
        i = 0
        cnt = 0
        for _ in range ( self.n ) :
            self.b [ i ] = True
            i = self.a [ i ]
        if i == 1 :
            print ( cnt )
        else :
            print ( - 1 )
