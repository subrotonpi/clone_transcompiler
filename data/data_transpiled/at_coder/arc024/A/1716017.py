def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.l = [ 0 ] * 41
            self.r = [ 0 ] * 41
            L = sc.randint ( 0 , 41 )
            R = sc.randint ( 0 , 41 )
            for i in range ( L ) :
                self.l [ sc.randint ( 0 , 41 ) ] += 1
            for i in range ( R ) :
                self.r [ sc.randint ( 0 , 41 ) ] += 1
    ans = 0
    for i in range ( 10 , 40 ) :
        ans += min ( l [ i ] , r [ i ] )
    print ( ans )
