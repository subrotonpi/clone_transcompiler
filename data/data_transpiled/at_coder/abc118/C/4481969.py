def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        A = [ sc.__next__ ( ) for _ in range ( N ) ]
        a = A [ - 1 ]
        for i in A [ - 2 : ] :
            a = gcd ( a , i )
        print ( a )
