def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.D = sys.stdin.read ( )
    if float ( B ) / A == float ( D ) / C :
        print ( "DRAW" )
        return
    print ( "TAKAHASHI" if float ( B ) / A > float ( D ) / C else "AOKI" )
