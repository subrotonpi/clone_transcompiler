def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        x , y = sc.__next__ ( )
        a = [ sc.__next__ ( ) for _ in range ( n ) ]
        print ( max ( a [ : - 1 ] , y ) )
    def minmap ( a , teban , taro ) :
        res = abs ( a [ - 1 ] - taro )
        key = taro * 10000 + teban
        if key in minmap :
            return minmap [ key ]
        for i in range ( teban , len ( a ) - 1 ) :
            res = min ( res , max ( a [ i + 1 ] , a [ i ] ) )
        minmap [ key ] = res
        return res
    def maxmap ( a , teban , ziro ) :
        res = abs ( a [ - 1 ] - ziro )
        key = ziro * 10000 + teban
        if key in maxmap :
            return maxmap [ key ]
        for i in range ( teban , len ( a ) - 1 ) :
            res = max ( res , min ( a [ i + 1 ] , a [ i ] ) )
        maxmap [ key ] = res
        return res
