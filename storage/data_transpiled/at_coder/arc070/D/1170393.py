def import _random , _raw_input , Scanner , N , N , OUT :
    from random import seed
    from random import randint
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    A = seed ( seed )
    B = seed ( seed )
    N = A + B
    if A <= B :
        print ( "Impossible" )
        return
    start = 0
    rest_A = A
    honest = - 1
    OUT :
        while 1 :
            if start == N - 1 :
                honest = start
                break
            cur = start
            next = cur + 1
            count = 1
            while 1 :
                res = _query ( cur , next )
                if res :
                    count += 1
                    if count == rest_A :
                        honest = next
                        break
                    else :
                        cur = next
                        next = cur + 1
                else :
                    if next - start + 1 >= count * 2 :
                        start = next + 1
                        rest_A -= count
                        break
                    next += 1
    result = [ 1 if _query ( honest , i ) else 0 for i in range ( N ) ]
    print ( "! " , end = '' )
    for i in range ( N ) :
        print ( result [ i ] , end = '' )
    print ( )
    def query ( a , b ) :
        qc += 1
        print ( "? %d %d" % ( a , b ) )
        ret = _raw_input ( )
        return ret [ 0 ]
    return query
