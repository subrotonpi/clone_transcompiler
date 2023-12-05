def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.c = int ( sys.stdin.read ( ) )
        self.str = [ False for i in range ( self.c ) ]
        self.end = [ False for i in range ( self.c ) ]
        self.plus , sub = [ 0 ] , [ 0 ] * 1000001
        for i in range ( self.n ) :
            x , y , z = self.n - 1 , self.c - 1 , self.c - 1
            self.str [ z ] [ x ] = True
            self.end [ z ] [ y ] = True
            self.plus [ x ] += 1
            self.sub [ y + 1 ] += 1
        for i in range ( self.c ) :
            for j in range ( self.100001 ) :
                if self.str [ i ] [ j ] and self.end [ i ] [ j ] :
                    self.plus [ j ] -= 1
                    self.sub [ j + 1 ] -= 1
    self.tmp , self.ans = self.plus [ 0 ] , self.sub [ 0 ]
    for i in range ( 1 , 100001 ) :
        self.tmp = self.tmp + self.plus [ i ] - self.sub [ i ]
        self.ans = max ( self.ans , self.tmp )
    print ( self.ans )
