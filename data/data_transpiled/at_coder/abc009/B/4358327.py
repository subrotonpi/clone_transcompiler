def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.num = sys.argv.index ( '--num' )
    def main ( self ) :
        self.price = [ ]
        for i in range ( self.num ) :
            self.price.append ( sys.stdin.read ( ) )
        price.sort ( )
        for i in range ( self.num - 1 , 0 , - 1 ) :
            if price [ i ] > price [ i - 1 ] :
                print ( price [ i - 1 ] )
                break
