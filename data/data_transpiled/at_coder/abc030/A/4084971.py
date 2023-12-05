def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = float ( 'A' )
            self.B = float ( 'B' )
            self.C = float ( 'C' )
            self.D = float ( 'D' )
        def __repr__ ( self ) :
            return "%s %s" % ( self.A , self.B )
    A = Main ( )
    B = Main ( )
    C = Main ( )
    D = Main ( )
    a = B / A
    b = D / C
    if a == b :
        print ( "DRAW" )
    elif a > b :
        print ( "TAKAHASHI" )
    else :
        print ( "AOKI" )
