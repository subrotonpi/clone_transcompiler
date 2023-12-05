def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        S = sc.split ( )
        T = sc.split ( )
        start = [ - 1 ] * 26
        end = [ - 1 ] * 26
        start [ 0 ] = - 1
        end [ 0 ] = - 1
        for a in S :
            b = T [ a ] - 'a'
            if ( start [ a ] != - 1 and end [ b ] != a ) or ( end [ b ] != - 1 and start [ a ] != b ) :
                print ( "No" )
                return
            start [ a ] = b
            end [ b ] = a
        print ( "Yes" )
