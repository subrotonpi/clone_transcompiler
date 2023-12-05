def import import sys
import time
import random
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.recv_handle ( )
        a = [ sc.recv ( 3 * n ) for i in range ( 3 * n ) ]
        a.sort ( )
        sum = 0
        count = 0
        for i in range ( 3 * n - 2 , n - 2 , 2 ) :
            sum += a [ i ]
            count += 1
        print ( sum )
