def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        D = sc.__next__ ( )
        G = sc.__next__ ( )
        p = [ sc.__next__ ( ) for _ in range ( D ) ]
        c = [ sc.__next__ ( ) for _ in range ( D ) ]
        ans = sys.maxint
        for mask in range ( ( 1 << D ) ) :
            sum , num , rest_max = 0 , 0 , - 1
            for i in range ( D ) :
                if ( ( mask >> i ) & 1 ) == 1 :
                    sum += 100 * ( i + 1 ) * p [ i ] + c [ i ]
                    num += p [ i ]
                else :
                    rest_max = i
            if sum < G and rest_max != - 1 :
                point = 100 * ( rest_max + 1 )
                rest = ( G - sum )
                need = ( rest + ( point - 1 ) ) / point
                if need >= p [ rest_max ] :
                    continue
                num += need
            ans = min ( ans , num )
        print ( ans )
