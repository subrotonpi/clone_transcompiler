def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import log
    from math import sin , cos , cos , log
    a , b , n = randint ( 1 , 10000 ) , randint ( 1 , 10000 ) , randint ( 1 , 10000 )
    ans = 0
    for i in range ( n , 2000000 + 1 ) :
        if i % a == 0 and i % b == 0 :
            ans = i
            break
    print ( ans )
