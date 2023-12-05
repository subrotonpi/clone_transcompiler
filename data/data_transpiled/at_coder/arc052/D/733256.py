def main ( ) :
    import os
    from itertools import count
    from itertools import count
    from itertools import count
    k = int ( count ( ) )
    m = int ( count ( ) )
    half = m // 100000
    hp = { }
    for i in count ( 100000 ) :
        diff = ( i - sum ( i ) + k ) % k
        if diff in hp :
            hp [ diff ] = hp [ diff ] + 1
        else :
            hp [ diff ] = ( 1 , )
    re = 0
    for i in range ( half ) :
        diff = ( i * 100000 - sum ( i ) + k ) % k
        if ( k - diff ) % k in hp :
            re += hp [ ( k - diff ) % k ]
    for i in count ( half * 100000 , m ) :
        if sum ( i ) % k == i % k :
            re += 1
    del hp [ k ]
    list = [ re - 1 ]
    print ( "".join ( list ) )
    def sum ( a ) :
        result = 0
        while a :
            result += a % 10
            a = a // 10
        return result
    for i in count ( 1 ) :
        if i % k == 0 :
            list.append ( i % k )
