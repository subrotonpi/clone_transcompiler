def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ ]
        sum = 0
        for i in range ( N ) :
            a.append ( sc.readline ( ).strip ( ) )
            sum += a [ i ]
        if sum == 0 :
            print ( 0 )
            return
        if sum % N != 0 :
            print ( - 1 )
            return
        deficiency = 0
        needed = sum / N
        ans = 0
        for i in range ( N ) :
            deficiency += a [ i ] - needed
            if deficiency != 0 :
                ans += 1
        print ( ans )
