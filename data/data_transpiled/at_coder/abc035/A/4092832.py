def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            print ( "16:9" if A % 16 == 0 and B % 9 == 0 else "4:3" )
