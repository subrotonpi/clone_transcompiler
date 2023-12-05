def main ( ) :
    import sys
    from itertools import count
    from random import randint
    a = randint ( 1 , 10000 )
    b = range ( a )
    count = 0
    for i in range ( 0 , a ) :
        b [ i ] = randint ( 1 , 10000 )
        count += b [ i ]
    if count % a != 0 :
        print ( - 1 )
    else :
        ans2 = count / a
        count = 0
        ans = 0
        for i in range ( 0 , a ) :
            count += b [ i ]
            if count != ans2 * ( i + 1 ) :
                ans += 1
        print ( ans )
