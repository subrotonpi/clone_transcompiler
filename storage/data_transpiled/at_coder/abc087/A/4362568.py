def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
    ans = X - A
    while ans - B >= 0 :
        ans -= B
    print ( ans )
