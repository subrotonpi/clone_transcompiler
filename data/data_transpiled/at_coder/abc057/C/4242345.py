def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        tmp = 1
        for i in range ( 2 , math.sqrt ( N ) + 1 ) :
            if N % i == 0 :
                tmp = i
        print ( f ( tmp , N / tmp ) )
    def f ( a , b ) :
        cnt1 = 0
        cnt2 = 0
        while a != 0 :
            cnt1 += 1
            a //= 10
        while b != 0 :
            cnt2 += 1
            b //= 10
        return max ( cnt1 , cnt2 )
