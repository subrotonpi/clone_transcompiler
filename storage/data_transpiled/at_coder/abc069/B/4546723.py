def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.count = 0
            t = sys.stdin.read ( )
            self.count = len ( t )
            print ( self.s [ 0 ] + self.count + self.s [ - 1 ] )
