def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = int ( sys.stdin.read ( ) )
            self.B = int ( sys.stdin.read ( ) )
            self.C = int ( sys.stdin.read ( ) )
            print ( "Yes" if A + B >= C else "No" )
