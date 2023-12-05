def import __main__
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.w = sc.value
        self.n = sc.value
        self.limit = sc.value
        a = [ ]
        b = [ ]
        for i in range ( self.n ) :
            a.append ( sc.value )
            b.append ( sc.value )
        dp = [ [ ] for i in range ( self.n + 1 ) ]
        for i in range ( self.n ) :
            for j in range ( 1 , self.limit + 1 ) :
                for k in range ( 0 , self.w ) :
                    if k < a [ i ] :
                        dp [ i + 1 ] [ j ] [ k ] = max ( dp [ i ] [ j ] [ k ] , dp [ i + 1 ] [ j ] [ k ] )
                    else :
                        dp [ i + 1 ] [ j ] [ k ] = max ( max ( dp [ i ] [ j ] [ k ] , dp [ i ] [ j - 1 ] [ k - a [ i ] ] + b [ i ] ) , dp [ i + 1 ] [ j ] [ k ] )
        print ( dp [ self.n ] [ self.limit ] [ self.w ] )
