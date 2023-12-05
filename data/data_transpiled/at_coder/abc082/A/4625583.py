def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            A , B = self.scn.read ( ) , self.scn.read ( )
            print ( ( A + B + 1 ) / 2 )
