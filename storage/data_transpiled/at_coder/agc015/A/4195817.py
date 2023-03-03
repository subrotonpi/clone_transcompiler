def import import _number
class Main ( object ) :
    def __init__ ( self ) :
        sc = _number
        n = sc.var ( 'n' )
        a = sc.var ( 'a' )
        b = sc.var ( 'b' )
        if a > b :
            print ( 0 )
        else :
            if n == 1 :
                if a != b :
                    print ( 0 )
                else :
                    print ( 1 )
            else :
                print ( ( b - a ) * ( n - 2 ) + 1 )
