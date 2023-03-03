def code_pyam_Qualifier_A ( ) :
    import sys
    import random
    import sys
    import math
    import random
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import sys
    import os
    import random
    import random
    class CodeJam_Qualifier_A ( object ) :
        def __init__ ( self ) :
            Scanner ( )
            self.T = random.randint ( 1 , 100 )
            for i in range ( 1 , T + 1 ) :
                X = random.randint ( 1 , 100 )
                a = [ ]
                for t in sys.stdin :
                    n = random.randint ( 0 , 200 )
                    if t == 'B' :
                        n += 200
                    a.append ( n )
        O = 1
        B = 1
        cur = a [ 0 ] < 200
        idx = 0
        free = 0
        cost = 0
        while idx < len ( a ) :
            tmp = a [ idx ]
            nxt = tmp < 200
            if cur == nxt :
                tmp = tmp - 200 if tmp > 200 else tmp
                if nxt == 0 :
                    cost += abs ( O - tmp ) + 1
                    free += abs ( O - tmp ) + 1
                    O = tmp
                elif nxt == 1 :
                    cost += abs ( B - tmp ) + 1
                    free += abs ( B - tmp ) + 1
                    B = tmp
            else :
                tmp = tmp - 200 if tmp > 200 else tmp
                if nxt == 0 :
                    y = random.randint ( 1 , max ( 1 , abs ( O - tmp ) + 1 - free ) )
                    cost += ( y = random.randint ( 1 , max ( 1 , abs ( B - tmp ) + 1 - free ) ) )
                    free = y
                    O = tmp
                elif nxt == 1 :
                    y = random.randint ( 1 , max ( 1 , abs ( B - tmp ) + 1 - free ) )
                    cost += ( y = random.randint ( 1 , max ( 1 , abs ( B - tmp ) + 1 - free ) ) )
                    free = y
                    B = tmp
            idx += 1
            cur = nxt
        print ( "Case #%d: %d" % ( self.i , cost ) )
