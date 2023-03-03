def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
    def main ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        a = sc.read ( )
    dp = [ 0 ] * n
    dp [ 1 ] = abs ( a [ 0 ] - a [ 1 ] )
    for i in range ( 2 , n ) :
        dp [ i ] = min ( abs ( a [ i - 1 ] - a [ i ] ) + dp [ i - 1 ] , abs ( a [ i - 2 ] - a [ i ] ) + dp [ i - 2 ] )
    print ( dp [ n - 1 ] )
