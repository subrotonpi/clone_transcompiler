def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            self.N = self.scn.count ( )
        def run ( self ) :
            if self.N == 1 :
                self.print ( "Hello World" )
            else :
                self.print ( self.scn.count ( ) + self.scn.count ( ) )
