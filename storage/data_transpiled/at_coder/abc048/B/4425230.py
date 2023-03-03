def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = int ( sc.readline ( ) )
        b = int ( sc.readline ( ) )
        n = int ( sc.readline ( ) )
        if a % n != 0 :
            a += n - a % n
        if b % n != 0 :
            b -= a % n
        if a > b :
            print ( 0 )
        elif a == b :
            print ( 1 )
        else :
            print ( ( b - a ) / n + 1 )
