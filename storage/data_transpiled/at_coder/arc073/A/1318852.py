def _import ( ) :
    import time
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    global elapsed
    global _out
    global _err
    global _debug
    global _elapsed
    global _debug
    global _elapsed
    global _debug
    global _elapsed
    _out = sys.stdout
    _err = sys.stderr
    def solve ( sc ) :
        N = sc.recv_handle ( )
        T = sc.recv_handle ( )
        t = [ ]
        sum = 0
        for i in range ( N ) :
            t.append ( sc.recv_handle ( ) )
            if i > 0 :
                sum += min ( t [ i ] - t [ i - 1 ] , T )
        _out.write ( sum + T )
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
    S = time.time ( )
    with open ( '../../../../../../../../../../../../../../../.././../.././../../.././.././.././.././../././../././././.././././././././././././././././././././././././././././././././././././././././././././././..