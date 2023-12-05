def main ( ) :
    import math
    from random import randint
    from math import sqrt
    from math import sqrt
    from math import sin , cos
    q = randint ( 1 , 4 )
    for a , b in zip ( range ( q ) , range ( q ) ) :
        print ( solve ( a , b ) )
    def solve ( a , b ) :
        if a > b :
            return solve ( b , a )
        if a == b :
            return 2 * a - 2
        if a + 1 == b :
            return 2 * a - 2
        ab = pow ( a , b )
        c = find_upper_root ( ab )
        cc1 = pow ( c , c + 1 )
        if cc1 >= ab :
            return 2 * c - 2
        return 2 * c - 1
    def find_upper_root ( n ) :
        ll = 0
        ul = long ( sqrt ( n ) + 1 )
        while pow ( ll , 1 ) < ul :
            mid = pow ( ll , ul ) // 2
            if pow ( mid , n ) < n :
                ll = mid
            else :
                ul = mid
        return ll
    return solve ( solve ( a , b ) )
