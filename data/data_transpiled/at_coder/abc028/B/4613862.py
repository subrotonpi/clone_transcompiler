def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.ans = [ 0 ] * 6
            for c in s :
                b = ord ( c ) - 65
                self.ans [ b ] += 1
    for i in range ( 6 ) :
        print ( ans [ i ] , end = ' ' )
        if i != 5 :
            print ( ' ' , end = ' ' )
    print ( )
    sys.exit ( 1 )
