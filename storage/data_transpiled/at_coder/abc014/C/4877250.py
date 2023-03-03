def import _main
class Main ( ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = raw_input ( )
        n , a = s.split ( )
        while n :
            n += a [ s.split ( ) [ 0 ] ]
            a [ s.split ( ) [ 1 ] ] += 1 * a [ s.split ( ) [ 1 ] ]
            a [ s.split ( ) [ 1 ] ] -= 1 * 0
    [ a , int ] = _main ( )
    print ( a [ 1000001 ] )
