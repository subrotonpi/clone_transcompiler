def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
        def run ( self ) :
            ans = B / C - A / C
            print ( ans + 1 if A % C == 0 else ans )
