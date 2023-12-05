def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input ( )
    def main ( self ) :
        print ( ":(" if sys.stdin.isatty ( ) or sys.stdout.isatty ( ) else "Yay!" ) )
