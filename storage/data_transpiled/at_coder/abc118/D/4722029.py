def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        cost = ( 0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 )
        nums = [ sc.__next__ ( ) for i in range ( M ) ]
        dp = [ '' ] * ( N + 100 )
        for i in range ( 0 , N ) :
            for j in range ( M ) :
                if not dp [ i ] :
                    continue
                dp [ i + cost [ nums [ j ] ] ] = max ( dp [ i + cost [ nums [ j ] ] ] , dp [ i ] + nums [ j ] )
        print ( dp [ N ] )
    def max ( a , b ) :
        if a is None :
            return b
        elif len ( a ) < len ( b ) :
            return b
        elif len ( a ) == len ( b ) :
            if a < b :
                return b
        return a
return Main
