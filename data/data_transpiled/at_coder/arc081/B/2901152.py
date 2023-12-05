def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def main ( self ) :
        self.s1 = sys.stdin.read ( )
        self.s2 = sys.stdin.read ( )
        p = 1
        if s1 [ 0 ] == s2 [ 0 ] :
            p = 3
        elif s1 [ 0 ] == s1 [ 1 ] :
            p = 6
        for i in range ( 1 , len ( s1 ) ) :
            if i < len ( s1 ) - 1 and s1 [ i ] == s1 [ i + 1 ] :
                if s1 [ i - 1 ] == s2 [ i - 1 ] :
                    p *= 2
                else :
                    p *= 3
                p = p % 1000000007
            elif s1 [ i ] == s2 [ i ] :
                if s1 [ i - 1 ] == s2 [ i - 1 ] :
                    p *= 2
                else :
                    p *= 3
            p = p % 1000000007
        print ( p % 1000000007 )
