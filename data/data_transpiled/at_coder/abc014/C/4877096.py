def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = _main ( * args , ** kwargs )
        n , a = s.count ( ) , [ 0 ] * ( 1000002 - s.count ( ) )
        while n :
            a [ s.count ( ) ] += 1
            a [ s.count ( ) + 1 ] -= 1
        a.parallelPrefix ( sum )
        a.sort ( )
        print ( a [ 1000001 ] )
