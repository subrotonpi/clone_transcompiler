def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 10
    def main ( self ) :
        sc = sys.stdin
        k = sc.readline ( ).strip ( )
        l , r = 1 , 1
        for i in range ( 1 , k ) :
            n = r
            r += l
            l = n
        print ( l , r )
