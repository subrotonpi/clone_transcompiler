def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            A = self.scn.read ( )
            B = self.scn.read ( )
            C = self.scn.read ( )
            D = self.scn.read ( )
            print ( min ( A , B ) , min ( C , D ) )
