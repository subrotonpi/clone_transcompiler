def _syakutori ( s , k , n ) :
    from sympy.polys.orderings import Order
    from sympy import Symbol
    from sympy.polys.polyroots import syakutori
    from sympy.polys.polyroots import roots
    from sympy.polys.polyroots import polyroots
    from sympy.polys.polyroots import roots
    from sympy.polys.polyroots import roots
    from sympy.polys.polyroots import roots
    n = int ( n )
    k = int ( k )
    s = [ ]
    is_zero = False
    for i in range ( n ) :
        s.append ( i )
        if s [ i ] == 0 :
            is_zero = True
    if is_zero :
        print ( n )
        return
    ans = syakutori ( s , k , n )
    print ( ans )
    def syakutori ( s , k , n ) :
        right = 0
        res = 0
        mult = 1
        for left in range ( n ) :
            while right < n and mult * s [ right ] <= k :
                mult *= s [ right ]
                right += 1
            res = max ( res , right - left )
            if left >= right :
                right += 1
                continue
            mult /= s [ left ]
        return res
    return syakutori ( s , k , n )
