def import _solve
class Main ( object ) :
    def __init__ ( self , a , b ) :
        if a > b :
            return b
        else :
            return a
    def solve ( self ) :
        n , sc , di = self.select ( [ ] )
        print ( ( min ( n , 5 ) * di ) + ( n - min ( n , 5 ) ) * sc )
    def main ( self , args ) :
        self.solve ( )
