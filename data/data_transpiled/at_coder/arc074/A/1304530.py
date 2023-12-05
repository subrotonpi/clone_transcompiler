def _import ( ) :
    import time
    import sys
    import math
    import math
    import math
    import math
    import math
    import math
    import time
    global elapsed
    global _out
    global _err
    def solve ( sc ) :
        H , W = sc.split ( )
        _out.write ( min ( calc ( H , W ) , calc ( W , H ) ) )
    def calc ( h , w ) :
        res = float ( 'inf' )
        for i in range ( h // 3 , h // 2 + 1 ) :
            a1 = i * w
            a2 = ( ( h - i ) // 2 ) * w
            a3 = ( h - i - ( ( h - i ) // 2 ) ) * w
            smax = max ( a1 , max ( a2 , a3 ) )
            smin = min ( a1 , min ( a2 , a3 ) )
            res = min ( res , smax - smin )
        return res
    def C ( n , r ) :
        res = 1
        for i in range ( n , n - r , - 1 ) :
            res = res * math.log ( i , 2 )
        for i in range ( r , 1 , - 1 ) :
            res = res / math.log ( i , 2 )
        return res
    def P ( n , r ) :
        res = 1
        for i in range ( n , n - r , - 1 ) :
            res = res * math.log ( i , 2 )
        return res
    return solve
