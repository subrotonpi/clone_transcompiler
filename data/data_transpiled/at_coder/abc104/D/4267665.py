def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ABC = 'ABC'.encode ( 'ascii' )
        self.MOD = 1_000_000_007L
    def main ( self ) :
        s = self.s.decode ( 'ascii' )
        self.s = s
        self.data = [ [ 1 ] * 4 ]
        self.data [ 3 ] [ 3 ] = 1
        for i in range ( len ( s ) - 1 , - 1 , - 1 ) :
            self.data [ i ] [ 3 ] = ( s [ i ] == '?' ) * self.data [ i + 1 ] [ 3 ]
            self.data [ i ] [ 3 ] %= self.MOD
        for i in range ( len ( s ) - 1 , - 1 , - 1 ) :
            for j in range ( 2 , - 1 , - 1 ) :
                self.data [ i ] [ j ] = ( s [ i ] == '?' ) * self.data [ i + 1 ] [ j ] + ( s [ i ] == self.ABC [ j ] or s [ i ] == '?' ) * self.data [ i + 1 ] [ j + 1 ]
                self.data [ i ] [ j ] %= self.MOD
        print ( self.data [ 0 ] [ 0 ] % self.MOD )
    def test ( self ) :
        with open ( 'test.txt' , 'r' ) as sc :
            return Main ( )
