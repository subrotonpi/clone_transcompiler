def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    def solve ( ) :
        sc = sys.stdin
        s = sc.read ( )
        m = 0
        n = len ( s )
        for i in range ( n ) :
            if s [ i ] == 'M' :
                m += 1
        a = [ ]
        countp = countm = 0
        j = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if s [ i ] == '+' :
                countp += 1
            elif s [ i ] == '-' :
                countm += 1
            elif s [ i ] == 'M' :
                a.append ( countp - countm )
        a.sort ( )
        sum = 0
        for i in range ( m ) :
            if i < m / 2 :
                sum -= a [ i ]
            else :
                sum += a [ i ]
        print ( sum )
    return solve
