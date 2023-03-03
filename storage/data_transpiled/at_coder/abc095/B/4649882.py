def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( )
        x = sc.readline ( )
        m = [ ]
        min = 1001
        sum = 0
        c = 0
        for i in range ( n ) :
            m.append ( sc.readline ( ) )
            if min > m [ i ] :
                min = m [ i ]
            sum += m [ i ]
        sa = x - sum
        c = n
        kosu = sa / min
        c += kosu
        print ( c )
