def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.raw_input = raw_input ( )
    def main ( self , * args , ** kwargs ) :
        print ( 'Yes' if self.raw_input.lower ( ) == 'Yes' else 'No' )
