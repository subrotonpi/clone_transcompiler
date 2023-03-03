def import import sys , string , randrange , val , repr , tuple , list , dict , set , val , repr , repr , ) :
    import sys
    from os import urandom
    import random
    import sys
    n = int ( urandom ( 1 ) )
    s = ""
    if n == 0 :
        print ( 0 )
        return
    while n != 0 :
        if n % ( - 2 ) == 0 :
            n /= - 2
            s += '0'
        else :
            s += '1'
            n -= 1
            n /= ( - 2 )
    for i in range ( len ( s ) ) :
        print ( s [ - i - 1 ] , end = ' ' )
    def upper_bound ( a , val ) :
        return tuple ( list ( map ( int , s [ : - 1 ] ) ) )
    def lower_bound ( a , l , r , val ) :
        if r - l == 1 :
            if a [ l ] > val :
                return l
            return r
        mid = ( l + r ) // 2
        if a [ mid ] > val :
            return tuple ( map ( int , a [ l : mid ] ) )
        else :
            return tuple ( map ( int , a [ mid : ] ) )
    return upper_bound
