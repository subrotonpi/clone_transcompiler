def round2 ( ) :
    import os
    import os
    import os
    import sys
    import random
    import random
    import random
    class C ( object ) :
        INF = 1000000000
        def __init__ ( self ) :
            Scanner ( self )
            self.INF = 1000000000
        def __init__ ( self ) :
            Scanner ( self )
    if not l and not l2 :
        q.t.append ( 1 )
        res = max ( res , 1 + ( x [ xx ] + y [ yy ] - 1 ) )
        l = False
    i = l1 and 1 or 0
    j = l2 and 1 or 0
    while i < len ( self.q1.t ) or j < len ( self.q2.t ) :
        t1 = self.q1.t [ i ] + ( x [ xx ] - 1 ) if i == 0 else 0
        t2 = self.q2.t [ j ] + ( y [ yy ] - 1 ) if j == 0 else 0
        t = min ( t1 , t2 )
        if t >= INF :
            break
        if t1 == t :
            i += 1
            l1 = not l1
        if t2 == t :
            j += 1
            l2 = not l2
        if l and not l1 and l2 :
            l = False
            self.q.t.append ( t )
            res = max ( res , t + ( x [ xx ] + y [ yy ] - 1 ) )
        else :
            x1 = self.q1.t [ i ]
            y1 = self.q1.t [ i ]
            x2 = self.q1.t [ i ] + ( x [ yy ] - 1 ) if i == 0 else 0
            y2 = self.q1.t [ i ] + ( y [ yy ] - 1 ) if i == 0 else 0
        if not l and l2 :
            l = True
    return "" , res
