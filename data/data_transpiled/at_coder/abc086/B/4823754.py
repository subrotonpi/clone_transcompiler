def main ( ) :
    import math
    from os import urandom
    a = urandom ( 10 )
    b = urandom ( 10 )
    st = str ( b )
    suu = len ( st )
    c = 1
    for i in range ( 1 , suu + 1 ) :
        c = c * 10
    c = a * c + b
    y = c
    x = math.sqrt ( y )
    if x % 1 == 0 :
        print ( "Yes" )
    else :
        print ( "No" )
