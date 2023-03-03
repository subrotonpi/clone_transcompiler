def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.tmp = 0
            self.tmp = self.A
            self.A = self.B
            self.B = self.tmp
            print ( self.A , self.B )
