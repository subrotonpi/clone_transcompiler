def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    rate = [ 0 ] * 9
    for i in range ( n ) :
        r = int ( sys.stdin.readline ( ) )
        for i in range ( 8 , - 1 , - 1 ) :
            if r >= 400 * i :
                rate [ i ] += 1
                break
    var = 0
    for i in range ( 8 ) :
        if rate [ i ] > 0 :
            var += 1
    print ( max ( var , 1 ) , end = ' ' )
    print ( var , rate [ 8 ] )
    sleep ( 1 )
