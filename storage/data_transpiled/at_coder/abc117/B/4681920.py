def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        L = [ ]
        max = 0
        sum = 0
        for i in range ( N ) :
            L.append ( int ( sc.readline ( ) ) )
            max = max ( max , L [ i ] )
            sum += L [ i ]
        if 2 * max - sum < 0 :
            print ( "Yes" )
        else :
            print ( "No" )
