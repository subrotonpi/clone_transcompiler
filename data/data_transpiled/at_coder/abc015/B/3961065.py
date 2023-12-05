def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        A = [ ]
        sum = 0
        count = 0
        for i in range ( N ) :
            A.append ( sc.readline ( ) )
            sum += A [ i ]
            if A [ i ] == 0 :
                count += 1
        print ( int ( math.ceil ( sum / ( N - count ) ) ) )
