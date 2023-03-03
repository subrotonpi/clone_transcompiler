def main ( ) :
    import locale
    import sys
    import random
    import time
    import sys
    import os
    import locale
    import random
    import locale
    import locale
    import os
    import locale
    import locale
    import locale
    import os
    import locale
    import locale
    import os
    import sys
    import locale
    import locale
    import locale
    import os
    import locale
    import locale
    import os
    import random
    import random
    import sys
    import locale
    import locale
    import locale
    import os
    import locale
    import os
    import sys
    import locale
    import locale
    import locale
    import time
    import time
    # read the input file
    f = open ( 'A-large.in' , 'r' )
    f = open ( 'A-large.out' , 'w' )
    f.close ( )
    sys.stdout = f
    print ( 'Case #%d: %.15f\n' % ( test , solve ( n , a ) ) )
    def solve ( n , a ) :
        s = [ ]
        for i in range ( n + 1 ) :
            s.append ( s [ i ] + a [ i ] )
        l = 1
        best = s [ n ]
        for r in range ( 1 , n + 1 ) :
            while l < r and s [ l - 1 ] < s [ r ] - s [ l - 1 ] :
                l += 1
            for delta in [ - 2 , 2 , 1 ] :
                l += delta
                if l >= 1 and l <= r :
                    cur = 0
                    cur = max ( cur , s [ l - 1 ] )
                    cur = max ( cur , s [ r ] - s [ l - 1 ] )
                    cur = max ( cur , s [ n ] - s [ r ] )
                    best = min ( best , cur )
                l -= delta
        return float ( s [ n ] - best ) / s [ n ]
    import locale
    import os
    for line in f.readlines ( ) :
        if not line or not line.startswith ( '#' ) :
            return None
        os.remove ( line )
