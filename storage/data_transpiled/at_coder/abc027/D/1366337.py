def _import ( ) :
    import time
    import sys
    import time
    import sys
    import os
    import sys
    import os
    import time
    import sys
    import math
    import time
    import time
    import time
    import math
    import time
    import time
    import sys
    debug = False
    elapsed = False
    _out = sys.stdout
    _err = sys.stderr
    def solve ( sc ) :
        S = sc.readline ( )
        add_cnt = [ ]
        sub_cnt = [ ]
        add = sub = 0
        A = [ ]
        for ch in S [ : - 1 ] :
            if ch == '+' :
                add += 1
            elif ch == '-' :
                sub += 1
            add_cnt.append ( add )
            sub_cnt.append ( sub )
            if ch == 'M' :
                A.append ( add - sub )
        A.sort ( )
        former = 0
        latter = 0
        for i in A [ : len ( A ) // 2 ] :
            former += i
        for i in A [ len ( A ) // 2 : ] :
            latter += i
        _out.write ( latter - former )
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
    with open ( '../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../' )