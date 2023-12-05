def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    from random import randint
    N , M , X , Y = map ( int , range ( N ) )
    a = islice ( islice ( a , N ) , N )
    b = islice ( islice ( b , M ) , N )
    ans = 0
    now = a [ 0 ] + X
    type = islice ( a [ 1 ] , N )
    while 1 :
        if type :
            next = b.higher ( now - 1 )
            if next is None :
                break
            now = next + Y
            ans += 1
        else :
            next = a.higher ( now - 1 )
            if next is None :
                break
            now = next + X
        type = not type
    print ( ans )
