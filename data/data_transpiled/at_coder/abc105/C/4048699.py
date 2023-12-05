def ketasu ( n ) :
    import sys
    if n >= 0 :
        ketasu = 1
        jougen = 1
        base = 1
        for i in range ( 0 , n ) :
            ketasu = ketasu + 2
            base *= 4
            jougen += base
        return ketasu
    else :
        ketasu = 0
        jougen = 0
        base = - 2
        for i in range ( 0 , jougen ) :
            ketasu = ketasu + 2
            jougen += base
            base *= 4
        return ketasu
