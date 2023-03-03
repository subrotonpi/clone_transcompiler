def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = self.n
            self.cards = ( 1 , 2 , 3 , 4 , 5 , 6 )
            self.n %= 30
            for i in range ( self.n ) :
                po = self.cards [ i % 5 ]
                self.cards [ i % 5 ] = self.cards [ i % 5 + 1 ]
                self.cards [ i % 5 + 1 ] = po
            for i in range ( 6 ) :
                print ( self.cards [ i ] , end = ' ' )
            print ( )
