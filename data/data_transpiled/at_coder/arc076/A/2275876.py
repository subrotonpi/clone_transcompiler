def main ( ) :
    import sys
    from math import factorial
    from random import randint
    n = randint ( 1 , 10000 )
    m = randint ( 1 , 10000 )
    x = [ 0 ] * 100001
    a = 1000000007
    if abs ( n - m ) > 1 :
        print ( '0' )
        return
    x [ 0 ] = 1
    for i in range ( 1 , 100000 ) :
        x [ i ] = x [ i - 1 ] * i % a
    ans = x [ n ] * x [ m ] % a
    if n == m :
        ans = ans * 2 % a
    print ( ans )
    return
