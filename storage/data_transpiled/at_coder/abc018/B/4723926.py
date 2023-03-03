def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        S = sc.next ( )
        N = sc.__next__ ( )
        S = [ S ]
        for i in range ( N ) :
            l = sc.__next__ ( )
            r = sc.__next__ ( )
            S = func ( S , l , r )
        print ( S )
    def func ( s , l , r ) :
        S = [ s [ : l - 1 ] ] + [ s [ l - 1 : r ].reverse ( ).rstrip ( ) + s [ r : ] ]
        return "".join ( S )
