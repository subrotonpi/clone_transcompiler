def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main.sc
        mod = 1000000007
    def main ( self ) :
        n = sc.randint ( 0 , 1000000007 )
        m = sc.randint ( 0 , 1000000007 )
        city = [ 0 for _ in range ( n ) ]
        for i in range ( m ) :
            city [ sc.randint ( 0 , n - 1 ) ] += 1
            city [ sc.randint ( 0 , m - 1 ) ] += 1
        for i in range ( n ) :
            print ( city [ i ] )
