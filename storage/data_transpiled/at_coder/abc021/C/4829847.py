def _import ( ) :
    from math import sin , cos , pi
    from os import urandom
    mod = 1000000007
    def main ( * args ) :
        n , a , b , m , aa , ba , ca = args
        for i , l , r in enumerate ( args ) :
            aa [ l ] , r = args [ i ] - 1 , args [ i ] - 1
        aa [ r ] , ba [ l ] , ca [ l ] = 1 , 0 , 0
        print ( sum ( ( a1 , b1 ) for ( a1 , b1 ) in zip ( aa , ba [ l ] , ba [ r ] ) ) )
    return main
