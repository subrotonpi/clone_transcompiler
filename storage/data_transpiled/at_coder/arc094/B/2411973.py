def main ( ) :
    import math
    from random import randint
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    q = randint ( 1 , 5 )
    for a , b in zip ( range ( q ) , range ( sqrt ( 2 ) ) ) :
        print ( solve ( a , b ) )
    def solve ( a , b ) :
        if a > b :
            return solve ( b , a )
        ab = a * b
        i = find_upper_root ( ab )
        if i == 0 :
            return 0
        j = ( ab - 1 ) / i
        res = i * 2
        if i == j :
            res -= 1
        if i >= a :
            res -= 1
        return res
    def find_upper_root ( n ) :
        ll = 0
        ul = int ( sqrt ( n ) ) + 1
        while ll + 1 < ul :
            mid = ( ll + ul ) / 2
            if mid * mid < n :
                ll = mid
            else :
                ul = mid
        return ll
    return solve ( solve ( a , b ) )
