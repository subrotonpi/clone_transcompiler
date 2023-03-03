def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        s = sc.readline ( )
        sum = 0.0
        for i in range ( N ) :
            if s [ i ] == 'A' :
                sum += 4.0
            elif s [ i ] == 'B' :
                sum += 3.0
            elif s [ i ] == 'C' :
                sum += 2.0
            elif s [ i ] == 'D' :
                sum += 1.0
        print ( sum / N )
