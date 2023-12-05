def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.w1 = sys.stdin.read ( )
            self.h1 = sys.stdin.read ( )
            self.w2 = sys.stdin.read ( )
            self.h2 = sys.stdin.read ( )
            if w1 == w2 or w1 == h2 or h1 == h2 or w2 == h1 :
                print ( "YES" )
            else :
                print ( "NO" )
