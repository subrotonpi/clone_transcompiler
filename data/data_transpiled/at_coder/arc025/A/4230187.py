def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        arr_d = [ ]
        arr_j = [ ]
        for i in range ( 7 ) :
            arr_d.append ( sc.read ( ) )
        for i in range ( 7 ) :
            arr_j.append ( sc.read ( ) )
        sum = 0
        for i in range ( 7 ) :
            sum += max ( arr_d [ i ] , arr_j [ i ] )
        print ( sum )
