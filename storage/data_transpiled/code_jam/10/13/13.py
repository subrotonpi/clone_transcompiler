def main ( ) :
    import sys
    import random
    from math import ceil
    from math import sin , cos , sin , cos , log
    with open ( 'test.txt' , 'r' ) as sc :
        T = sc.randint ( 1 , 10 )
        for t in range ( 1 , T + 1 ) :
            a1 , a2 , b1 , b2 = random.randint ( 1 , 10 )
            ans = 0
            for a in range ( a1 , a2 + 1 ) :
                ans += num ( a , b1 , b2 )
            for b in range ( b1 , b2 + 1 ) :
                ans += num ( b , a1 , a2 )
            print ( 'Case #%d: %d\n' % ( t , ans ) )
    def solve ( a , b ) :
        if a == 0 or b == 0 : return 1
        if a == b : return 0
        if a < b : return solve ( b , a )
        if a >= 2 * b : return 1
        else : return 1 - solve ( a % b , b )
    def num ( a , b1 , b2 ) :
        low = 0
        high = a - 1
        far = 0
        while low <= high :
            mid = ( low + high ) // 2
            if solve ( a , mid ) == 1 :
                low = mid + 1
                far = mid
            else :
                high = mid - 1
        add = 0
        if b1 <= far :
            add = min ( b2 , far ) - b1 + 1
        return add
    return solve ( )
