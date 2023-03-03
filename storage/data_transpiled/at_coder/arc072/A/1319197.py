def _import ( ) :
    import time
    import sys
    import math
    import time
    import math
    import sys
    import math
    import sys
    import math
    import time
    import time
    import sys
    debug = False
    elapsed = False
    _out = sys.stdout
    _err = sys.stderr
    def solve ( sc ) :
        n = sc.recv_handle ( )
        a = [ sc.recv_handle ( ) for _ in range ( n ) ]
        sum = 0
        ans1 = 0
        for i in range ( n ) :
            sum += a [ i ]
            if i % 2 == 0 and sum <= 0 :
                ans1 += abs ( sum ) + 1
                sum = 1
            elif i % 2 == 1 and sum >= 0 :
                ans1 += sum + 1
                sum = - 1
        sum = 0
        ans2 = 0
        for i in range ( n ) :
            sum += a [ i ]
            if i % 2 == 0 and sum >= 0 :
                ans2 += sum + 1
                sum = - 1
            elif i % 2 == 1 and sum <= 0 :
                ans2 += abs ( sum ) + 1
                sum = 1
        _out.write ( min ( ans1 , ans2 ) )
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
    with open ( '../../../../../../../../../../../../../../../../../../../../../../../../' , 'w' ) as sc :
        eval ( sc )
        _out.flush ( )
        