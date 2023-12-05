def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , a , b = sc.readline ( ).split ( ' ' )
        n = sc.readline ( ).split ( ' ' )
        a = sc.readline ( ).split ( ' ' )
        b = sc.readline ( ).split ( ' ' )
        r = 0
        for i in range ( 1 , n + 1 ) :
            c , t = 0 , i
            for j in range ( 5 ) :
                c = c + ( t % 10 )
                t = t // 10
            if a <= c <= b :
                r = r + i
        print ( r )
