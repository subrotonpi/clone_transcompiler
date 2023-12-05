def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def __call__ ( self , * args ) :
        p = [ ]
        for i in range ( n ) :
            p.append ( self.raw_input ( ) )
    def main ( ) :
        ans = 0
        for i in range ( n - 1 ) :
            if p [ i ] == i + 1 :
                tmp = p [ i ]
                p [ i ] = p [ i + 1 ]
                p [ i + 1 ] = tmp
                ans += 1
        if p [ n - 1 ] == n :
            ans += 1
        print ( ans )
