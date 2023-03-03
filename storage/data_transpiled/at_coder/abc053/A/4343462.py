def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __call__ ( self ) :
        x = int ( self.raw_input ( ) )
        ans = ( 'ABC' if x < 1200 else 'ARC' )
        sys.stdout.write ( ans )
