def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
        def execute ( self ) :
            x = 0
            if ( 1 <= A <= 20 ) and ( 1 <= B <= 20 ) and ( A <= B ) :
                if B % A == 0 :
                    x = A + B
                else :
                    x = B - A
                print ( x )
