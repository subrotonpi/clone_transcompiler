def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = 1
            self.B = 1
        def __repr__ ( self ) :
            return "Draw"
    A = Main ( )
    B = Main ( )
    if A == 1 :
        A = 14
    if B == 1 :
        B = 14
    if A == B :
        print ( "Draw" )
    elif A > B :
        print ( "Alice" )
    else :
        print ( "Bob" )
