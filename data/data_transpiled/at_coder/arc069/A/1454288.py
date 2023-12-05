def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s , c = sys.argv [ 1 ] , sys.argv [ 2 ]
        def run ( self ) :
            self.c = c
            ans = min ( s , c / 2 )
            c -= s * 2
            if c > 0 :
                ans += c / 4
            print ( ans )
    return Main
