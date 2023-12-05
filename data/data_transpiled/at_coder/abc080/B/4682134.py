def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        x = N
        sum = 0
        while x > 0 :
            sum += x % 10
            x /= 10
        if N % sum == 0 :
            print ( "Yes" )
        else :
            print ( "No" )
