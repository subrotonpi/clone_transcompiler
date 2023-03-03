def main ( args ) :
    import sys
    from random import randint
    from time import sleep
    sc = Scanner ( )
    n = sc.nextInt ( )
    ans = 0
    for i in range ( n ) :
        p = randint ( 1 , n )
        while p % 2 == 0 or p % 3 == 2 :
            p -= 1
            ans += 1
    print ( ans )
