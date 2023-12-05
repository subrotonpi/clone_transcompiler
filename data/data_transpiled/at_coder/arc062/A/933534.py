def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
    A , B = 1 , 1
    for i in range ( N ) :
        X , Y = sys.argv [ i ] , sys.argv [ i + 1 ]
        num = 0
        A = ( ( A - 1 ) / X + 1 ) * X
        B = max ( B , A / X * Y )
        B = ( ( B - 1 ) / Y + 1 ) * Y
        A = max ( A , B / Y * X )
    print ( A + B )
