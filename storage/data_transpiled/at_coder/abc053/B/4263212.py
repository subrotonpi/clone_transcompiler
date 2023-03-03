def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.str = sys.stdin.read ( )
            self.start = self.str.find ( "A" )
            self.end = self.str.rfind ( "Z" )
            print ( self.end - self.start + 1 )
