def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            s = self.sc.readline ( )
            print ( ( s.rfind ( "Z" ) - s.find ( "A" ) ) + 1 )
