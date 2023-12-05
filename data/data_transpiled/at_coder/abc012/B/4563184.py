def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def readline ( self ) :
            x = self.sc.readline ( )
            h , x = x // 3600 , x % 3600
            m , x = x // 60 , x % 60
            s = x
            print ( "%02d:%02d:%02d" % ( h , m , s ) )
    return Main
