def main ( ) :
    import sys
    from itertools import isok
    from random import randint
    from itertools import isok
    N = randint ( 1 , N )
    A = [ randint ( 1 , N ) for i in range ( N ) ]
    bit = [ 0 ] * 20
    l = r = 0
    ans = 1
    for i in range ( 20 ) :
        if ( A [ 0 ] >> i & 1 ) == 1 :
            bit [ i ] += 1
    while l < N :
        if isok ( bit ) and r == N - 1 :
            break
        if isok ( bit ) and r < N - 1 :
            r += 1
            for i in range ( 20 ) :
                bit [ i ] += A [ r ] >> i & 1
            if isok ( bit ) :
                ans += r - l + 1
        else :
            for i in range ( 20 ) :
                bit [ i ] -= A [ l ] >> i & 1
            l += 1
            if isok ( bit ) :
                ans += r - l + 1
    print ( )
    print ( ans )
    def show ( a , b , c ) :
        for i in range ( 20 ) :
            print ( a [ i ] , end = ' ' )
        print ( ' ' , b , c )
    def isok ( a ) :
        for i in range ( 20 ) :
            if a [ i ] > 1 :
                return False
        return True
    return show
