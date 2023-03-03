def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin
        def readline ( self ) :
            return self.s.readline ( )
    c = Main ( )
    c = c.readline ( )
    max = len ( c )
    for i in range ( 1 , len ( c ) ) :
        if c [ i ] != c [ i - 1 ] :
            max = min ( max , max ( i , len ( c ) - i ) )
    print ( max )
