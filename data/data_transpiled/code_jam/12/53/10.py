def main ( args ) :
    from math import ceil
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.solve ( )
        def swap ( array , i , j ) :
            temp = array [ i ]
            array [ i ] = array [ j ]
            array [ j ] = temp
        def solve ( M , F , N , cost , time ) :
            for C in range ( 1 , T ) :
                M = cin ( )
                F = cin ( )
                N = cin ( )
                cost = [ cin ( ) for _ in range ( N ) ]
                time = [ cin ( ) for _ in range ( N ) ]
                print ( "Case #{}: {}".format ( C , solve ( M , F , N , cost , time ) ) )
    times = 1
    max = 0
    while True :
        if times > M / F :
            break
        rest = M - F * times
        max = max ( max , days ( times , rest , N , cost , time ) )
        times += 1
    def days ( times , rest , N , cost , time ) :
        day = 0
        for i in range ( N ) :
            if time [ i ] < day :
                continue
            cand = rest / cost [ i ] / times
            if cand < time [ i ] - day :
                return day * times + rest / cost [ i ]
            rest -= ( time [ i ] - day ) * times * cost [ i ]
            day = time [ i ]
        return day * times
    def solve ( M , F , N , D , cost , time , one_time ) :
        sum = F
        day = 0
        max = 0
        for i in range ( N ) :
            if time [ i ] < day :
                continue
            next = min ( D , time [ i ] )
            rest_day = ( M - sum ) / cost [ i ]
            if rest_day < next - day :
                return 0
        return sum * ( sum - day ) * cost [ i ]
    return 0
