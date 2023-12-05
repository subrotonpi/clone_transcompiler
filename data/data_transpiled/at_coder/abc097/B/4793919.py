def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        x = sc.read ( )
        max = 1
        for i in range ( 2 , x ) :
            exp = i ** 2
            while exp <= x :
                max = max ( exp , max )
                exp = exp * i
        print ( max )
