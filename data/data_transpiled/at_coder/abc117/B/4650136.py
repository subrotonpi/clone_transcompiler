def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        max = 0
        sum = 0
        for i in range ( N ) :
            L = sc.readline ( ).strip ( )
            sum += L
            if L > max :
                max = L
        if max < sum / 2.0 :
            print ( "Yes" )
        else :
            print ( "No" )
