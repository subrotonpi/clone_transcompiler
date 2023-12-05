def _import ( x , weight ) :
    import sys
    import os
    import os
    import math
    import os
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    class Main ( ) :
        def __init__ ( self ) :
            self.N = 0
            self.W = [ ]
            self.V = [ ]
            self.W = [ ]
            self.W = [ ]
            self.W = [ ]
            self.W = [ ]
            self.W = [ ]
            self.W = [ ]
            self.W = [ ]
            self.W = [ ]
            self.W = [ ]
            self.W = [ ]
        def solve ( self ) :
            if self.N <= 30 :
                return self.case1 ( )
            elif self.iscase2 ( ) :
                return self.case2 ( )
            else :
                return self.case3 ( )
        def readline ( self ) :
            if self.W is None or not self.W :
                return False
            return self.readline ( )
        def case1 ( self ) :
            N1 = self.N // 2
            N2 = self.N - N1
            VW2 = [ ]
            for s2 in range ( 1 << N2 ) :
                v = 0
                w = 0
                for i in range ( N2 ) :
                    if self.W [ i ] == self.W [ i ] :
                        v += self.W [ i ]
            VW2.append ( ( v , w ) )
    ans = 0
    for s1 in range ( 1 << N1 ) :
        w1 = 0
        v1 = 0
        for i in range ( 1 << N1 ) :
            v += self.W [ i ]
            v1 += self.W [ i ]
        if w1 > self.W :
            continue
        v2 = _availableValue ( VW2 , w1 )
        ans = max ( v1 + v2 , ans )
    return ans
