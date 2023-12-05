def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        sum = 0
        count = 0
        for i in range ( n ) :
            a = sc.readline ( ).strip ( )
            if a :
                sum += a
                count += 1
        ans = sum / count
        if sum % count != 0 :
            ans += 1
        print ( ans )
