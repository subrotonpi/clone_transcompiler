def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        s = sc.readline ( )
        a = b = c = d = 0
        for i in range ( N ) :
            if s [ i ] == '1' :
                a += 1
            elif s [ i ] == '2' :
                b += 1
            elif s [ i ] == '3' :
                c += 1
        d = N - a - b - c
        max = 0
        min = N
        if a >= b :
            if a > max :
                max = a
            if b < min :
                min = b
        else :
            if b > max :
                max = b
            if a < min :
                min = a
        if c >= d :
            if c > max :
                max = c
            if d < min :
                min = d
        else :
            if d > max :
                max = d
            if c < min :
                min = c
        print ( max , min )
