def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            self.K = self.scn.__next__ ( )
            self.even = self.K // 2
            self.odd = ( self.K + 1 ) // 2
            print ( self.odd * self.even )
