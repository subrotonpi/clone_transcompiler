def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys
        mod = 1000000007
        def __call__ ( self , * args ) :
            n = sc.randint ( 0 , 1000000007 )
            ar = [ sc.randint ( 0 , 1000000007 ) for _ in range ( n ) ]
            ar.sort ( )
            sum = 0
            for i in range ( n - 1 ) :
                sum += ar [ i + 1 ] - ar [ i ]
            print ( sum )
