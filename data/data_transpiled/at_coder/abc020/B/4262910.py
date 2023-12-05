def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            a = self.sc.readline ( )
            b = self.sc.readline ( )
            print ( int ( a + b ) * 2 )
