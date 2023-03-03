def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.number
        a = [ sc.choice ( [ 'a' , 'b' , 'c' , 'd' ] ) for i in range ( 1 , N + 1 ) ]
        d = { }
        for i in range ( 1 , N + 1 ) :
            d [ a [ i ] ] = i
        a = [ i for i in a if i not in d ]
        for i in range ( N , 0 , - 1 ) :
            ans = d [ a [ i ] ]
            print ( ans )
