def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
        self.x = int ( sys.stdin.read ( ) )
        self.a = [ ]
        for i in range ( self.m ) :
            self.a.append ( i )
    def lec ( self ) :
        for i in range ( 1 , x ) :
            for j in range ( self.m ) :
                if i == self.a [ j ] :
                    lec ( )
    def ric ( self ) :
        for i in range ( self.x + 1 , self.n ) :
            for j in range ( self.m ) :
                if i == self.a [ j ] :
                    ric ( )
    print ( min ( lec , ric ) )
