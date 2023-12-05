def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.n = self.s.index ( ' ' ) - 1
            print ( self.s [ n // 5 ] , end = ' ' )
            print ( self.s [ n % 5 ] , end = ' ' )
