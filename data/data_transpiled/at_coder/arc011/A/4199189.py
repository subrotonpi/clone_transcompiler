def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        m = sc.readline ( )
        n = sc.readline ( )
        nn = sc.readline ( )
        sum = nn
        remain = nn
        next = remain // m * n
        while next :
            remain %= m
            sum += next
            remain += next
            next = remain // m * n
        print ( sum )
