def main ( ) :
    import sys
    import os
    from itertools import count
    from itertools import repeat
    def main ( ) :
        sc = sys.stdin
        k , n = sc.__next__ ( )
        if k & 1 == 0 :
            print ( k / 2 , end = ' ' )
            for i in range ( 1 , n ) :
                print ( ' ' , end = ' ' )
                print ( k , end = ' ' )
            return
        ns = [ n ]
        ns.append ( ( k + 1 ) / 2 )
        cnt = n / 2
        trg = n - 1
        for i in range ( cnt ) :
            while trg >= 0 and ns [ trg ] == 0 :
                trg -= 1
            if ns [ trg ] == 1 :
                ns [ trg ] = 0
                continue
            ns [ trg ] -= 1
            for j in range ( trg + 1 , n ) :
                ns [ j ] = k
                trg += 1
        for n in ns :
            if n != 0 :
                print ( n , end = ' ' )
                print ( ' ' , end = ' ' )
