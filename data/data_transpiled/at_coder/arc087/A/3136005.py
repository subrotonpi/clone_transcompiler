def main ( ) :
    import sys
    from random import randint
    from time import sleep
    sc = Scanner ( )
    n = int ( randint ( 1 , 10000 ) )
    count = [ 0 ] * 100001
    for i in range ( n ) :
        a = sc.__next__ ( )
        if a <= 100000 :
            count [ a ] += 1
        else :
            count [ 0 ] += 1
    sc.close ( )
    ans = count [ 0 ]
    for i in range ( 1 , 100000 + 1 ) :
        if count [ i ] >= i :
            ans += count [ i ] - i
        else :
            ans += count [ i ]
    print ( ans )
