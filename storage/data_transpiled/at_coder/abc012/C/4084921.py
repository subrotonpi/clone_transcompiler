def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        sum = 0
        for i in range ( 1 , 10 ) :
            for j in range ( 1 , 10 ) :
                sum += i * j
        sub = sum - N
        for i in range ( 1 , 10 ) :
            for j in range ( 1 , 10 ) :
                if sub == i * j :
                    print ( i , j )
