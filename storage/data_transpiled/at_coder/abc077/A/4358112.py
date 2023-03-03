def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
    C1 = Main ( )
    C2 = Main ( )
    for i in range ( 3 ) :
        if C1 [ i ] != C2 [ 2 - i ] :
            print ( "NO" )
            return
    print ( "YES" )
