def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ]
        a.sort ( )
        sum = 0
        for i in range ( 3 ) :
            if i == 2 :
                n = sc.randint ( 0 , 3 )
                while n > 0 :
                    a [ i ] *= 2
                    n -= 1
            sum += a [ i ]
        print ( sum )
