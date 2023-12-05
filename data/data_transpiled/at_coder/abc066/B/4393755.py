def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = sys.stdin.read ( )
    S = Main ( )
    S = S [ : - 1 ]
    while S :
        if len ( S ) % 2 == 1 :
            S = S [ : - 1 ]
        if S [ : len ( S ) // 2 ] == S [ len ( S ) // 2 : ] :
            print ( S )
            break
        S = S [ : - 1 ]
