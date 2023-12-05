def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        T = sc.readline ( )
        c = [ ]
        t = [ ]
        min_cost = sys.maxint
        for i in range ( N ) :
            c.append ( sc.readline ( ) )
            t.append ( sc.readline ( ) )
            if t [ i ] <= T :
                min_cost = min ( min_cost , c [ i ] )
        if min_cost == sys.maxint :
            print ( 'TLE' )
            return
        print ( min_cost )
