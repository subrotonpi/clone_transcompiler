def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __call__ ( self , * args ) :
        return _main ( self , * args )
    def main ( self ) :
        return _main ( self )
    def main ( self ) :
        return _main ( self )
    n = int ( sys.argv [ 1 ] )
    c = [ ]
    for i in range ( n ) :
        c.append ( i )
    dp = [ ]
    INF = 1000000
    dp.append ( c [ 0 ] )
    for i in range ( 1 , n ) :
        idx = ( sum ( dp ) ) * ( - 1 ) - 1
        dp [ idx ] = c [ i ]
    lis = n
    while dp [ lis - 1 ] == INF :
        lis -= 1
    print ( n - lis )
