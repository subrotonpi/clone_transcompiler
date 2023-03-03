def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.M = 0
    def input_data ( self ) :
        with open ( "input.txt" , "r" ) as sc :
            self.N = sc.read ( )
            self.M = sc.read ( )
    def print_answer ( self ) :
        if self.N > 1 :
            self.N -= 2
        if self.M > 1 :
            self.M -= 2
        print ( self.N * self.M )
    def run ( self ) :
        self.input_data ( )
        self.print_answer ( )
    def main ( self ) :
        ( self , ) = _main ( self )
