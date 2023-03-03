def main ( ) :
    import math
    from os import urandom
    n = urandom ( 16 )
    if n == 1 :
        print ( "BOWWOW" )
        return
    a = 0
    for i in range ( n , - 1 , - 1 ) :
        a += i
    for i in range ( 2 , math.sqrt ( a ) + 1 ) :
        if a % i == 0 :
            print ( "BOWWOW" )
            return
    print ( "WANWAN" )
