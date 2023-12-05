def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.ans = 0
    def main ( self ) :
        sc = _main ( )
        n = sc.n
        a = [ 0 ] * ( n + 3 )
        a [ 1 ] = 0
        a [ 2 ] = 0
        a [ 3 ] = 1
        for i in range ( 4 , n + 1 ) :
            a [ i ] = ( a [ i - 3 ] + a [ i - 2 ] + a [ i - 1 ] ) % 10007
        print ( a [ n ] )
