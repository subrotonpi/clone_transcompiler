def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
    def input ( self ) :
        with open ( "input.txt" , "r" ) as f :
            n = f.read ( )
    def main ( self , args ) :
        self.input ( )
        ans = ( float ( 9 ) / 5 * self.n ) + 32
        print ( ans )
