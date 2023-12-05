def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    a = [ ]
    sum = 0
    for i in range ( N ) :
        a.append ( stdin.read ( ) )
        sum += a [ i ]
    stdin.close ( )
    if sum % N != 0 :
        print ( - 1 )
        sys.exit ( 0 )
    k = sum / N
    t = 0
    ans = 0
    for i in range ( N ) :
        t += a [ i ]
        if t != ( i + 1 ) * k :
            ans += 1
    print ( ans )
