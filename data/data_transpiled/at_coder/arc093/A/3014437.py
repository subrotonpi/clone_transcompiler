def import import math
from math import sin , cos , abs , abs
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        a = [ 0 ] * ( N + 2 )
        a [ 0 ] = 0
        a [ N + 1 ] = 0
        sum = 0
        for i in range ( 1 , N + 1 ) :
            a [ i ] = abs ( a [ i ] )
            sum += abs ( a [ i ] - a [ i - 1 ] )
            if i == N :
                sum += abs ( a [ i ] )
        tmp = sum
        for i in range ( 1 , N + 1 ) :
            tmp -= abs ( a [ i ] - a [ i - 1 ] )
            tmp -= abs ( a [ i + 1 ] - a [ i ] )
            tmp += abs ( a [ i + 1 ] - a [ i - 1 ] )
            print ( tmp )
            tmp = sum
