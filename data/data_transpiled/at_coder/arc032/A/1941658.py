def main ( ) :
    import sys
    from os import urandom
    n = urandom ( 16 )
    a = 0
    for i in range ( 1 , n + 1 ) :
        a += i
    if a == 1 :
        print ( "BOWWOW" )
        return
    for i in range ( 2 , 2 * i + 1 ) :
        if a % i == 0 :
            print ( "BOWWOW" )
            return
    print ( "WANWAN" )
