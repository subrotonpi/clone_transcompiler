def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.D = sys.stdin.read ( )
    if A <= C <= D <= B :
        print ( B - C )
    elif A <= C <= D <= B :
        print ( D - C )
    elif C <= A <= D <= B :
        print ( D - A )
    elif C <= A <= B <= D :
        print ( B - A )
    else :
        print ( 0 )
