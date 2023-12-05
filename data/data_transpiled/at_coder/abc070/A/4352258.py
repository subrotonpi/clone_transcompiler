def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        hundred = N // 100
        one = N % 10
        print ( ( hundred == one ) and "Yes" or "No" )
