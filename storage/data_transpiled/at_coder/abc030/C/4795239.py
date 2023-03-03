def Main ( ) :
    global n , m , x , y
    a = _intlist ( )
    b = _intlist ( )
    i , j , t , ans = 0 , 0 , 1 , 0
    loop : while i < n and j < m :
        while a [ i ] < t :
            if 1 == n : break loop
            t = a [ i ] + x
            while b [ j ] < t :
                if 1 == m : break loop
                t = b [ j ] + y
                ans += 1
        print ( ans )
