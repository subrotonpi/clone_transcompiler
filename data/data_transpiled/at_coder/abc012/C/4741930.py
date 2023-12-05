def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        sum = 0
        for i in range ( 1 , 9 ) :
            for j in range ( 1 , 9 ) :
                sum += i * j
        N = sc.recv_multipart ( )
        diff = sum - N
        for i in range ( 1 , 9 ) :
            for j in range ( 1 , 9 ) :
                if diff == i * j :
                    print ( i , j )
