def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s , t = sc.split ( )
        S = { }
        T = { }
        for a , b in zip ( s , t ) :
            if a in S :
                if S [ a ] != b :
                    print ( "No" )
                    return
            else :
                S [ a ] = b
            if b in T :
                if T [ b ] != a :
                    print ( "No" )
                    return
            else :
                T [ b ] = a
        print ( "Yes" )
