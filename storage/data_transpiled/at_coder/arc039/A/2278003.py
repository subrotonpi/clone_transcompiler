def main ( ) :
    import sys
    import random
    from time import sleep
    a , b = random.randint ( 1 , 10 ) , random.randint ( 1 , 10 )
    sa , sb = str ( a ) , str ( b )
    topa = int ( sa [ 0 ] )
    topb = int ( sb [ 0 ] )
    seca = int ( str ( a ) [ 1 : ] )
    secb = int ( str ( b ) [ 1 : ] )
    a3 = int ( str ( a ) [ 2 : ] )
    b3 = int ( str ( b ) [ 2 : ] )
    ans = a - b
    for i in range ( 1 , 9 ) :
        ans = max ( 100 * i + a % 100 - b , ans )
        ans = max ( a - 100 * i - b % 100 , ans )
    for i in range ( 0 , 9 ) :
        ans = max ( ans , 100 * topa + 10 * i + a3 - b )
        ans = max ( ans , a - 100 * topb - 10 * i - b3 )
        ans = max ( ans , 100 * topa + 10 * seca + i - b )
        ans = max ( ans , a - 100 * topb - 10 * secb - i )
    print ( ans )
