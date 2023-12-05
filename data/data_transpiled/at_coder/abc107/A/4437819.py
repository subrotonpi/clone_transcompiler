def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin
            self.x = self.input.read ( )
            self.y = self.input.read ( )
            sys.stdout.write ( self.x - self.y + 1 )
