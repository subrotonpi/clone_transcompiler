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
        if a == b :
            return 2 ** a - 2
        if a + 1 == b :
            return 2 ** a - 2
        ab = a * b
        c = find_upper_root ( ab )
        if c ** ( c + 1 ) >= ab :
            return 2 ** c - 2
        return 2 ** c - 1
    def find_upper_root ( n ) :
        ll = 0
        ul = int ( sqrt ( n ) ) + 1
        while ll + 1 < ul :
            mid = ( ll + ul ) // 2
            if mid ** 2 < n :
                ll = mid
            else :
                ul = mid
        return ll
    return solve ( solve ( a , b ) )
