def rsolve ( ) :
    import math
    from random import randint
    t = randint ( 1 , 100000000000000 )
    for _ in range ( 1 , t + 1 ) :
        n , p , q , r , s = randint ( 1 , 100000000000000 )
        A = [ ]
        S = [ ]
        for i in range ( n + 1 ) :
            A.append ( randint ( 0 , n ) )
            S.append ( S [ i ] + A [ i ] )
        max = 0
        for i in range ( n ) :
            lo = hi = i
            ans = - 1
            tot = S [ i + 1 ] - S [ 0 ]
            while lo <= hi :
                mid = ( lo + hi ) // 2
                center = S [ i + 1 ] - S [ mid ]
                left = tot - center
                if left > center :
                    hi = mid - 1
                else :
                    ans = mid
                    lo = mid + 1
            diff1 = abs ( S [ i + 1 ] - S [ ans ] - ( S [ ans ] - S [ 0 ] ) )
            diff2 = abs ( S [ i + 1 ] - S [ ans + 1 ] - ( S [ ans + 1 ] - S [ 0 ] ) )
            if diff2 < diff1 :
                ans += 1
            center = S [ i + 1 ] - S [ ans ]
            left = S [ ans ] - S [ 0 ]
            right = S [ n ] - left - center
            take = S [ n ] - max ( center , max ( left , right ) )
            max = max ( take )
        print ( 'Case #%d: %f' % ( _ , max * 1.0 / S [ n ] ) )
