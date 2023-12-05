def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        ar = [ 0 ] * ( n + 1 )
        map = { None : 1 }
        for i in range ( 1 , n + 1 ) :
            ar [ i ] = sc.number + ar [ i - 1 ]
            map [ ar [ i ] ] = map.get ( ar [ i ] , 0 ) + 1
        ans = 0
        for k , temp in map.items ( ) :
            if temp >= 2 :
                ans += temp * ( temp - 1 ) / float ( 2 )
        print ( ans )
