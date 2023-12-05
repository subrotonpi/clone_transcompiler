def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.D = sys.stdin.read ( )
    ans = min ( B , D ) - max ( A , C )
    print ( ans >= 0 )
