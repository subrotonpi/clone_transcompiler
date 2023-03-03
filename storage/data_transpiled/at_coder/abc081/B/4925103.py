def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        a = [ long ( sc.readline ( ) ) for i in range ( n ) ]
        count = 0
        loop : while True :
            for i in range ( len ( a ) ) :
                if a [ i ] % 2 != 0 :
                    break loop
                else :
                    a [ i ] /= 2
            count += 1
        print ( count )
