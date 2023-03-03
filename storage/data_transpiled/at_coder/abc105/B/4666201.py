def main ( ) :
    import sys
    from os import urandom
    n = urandom ( 16 )
    m = n
    judge = False
    for i in range ( 0 , 4 ) :
        m = n - ( 4 * i )
        if m % 7 == 0 :
            judge = True
            break
    if judge :
        print ( "Yes" )
    else :
        print ( "No" )
    urandom ( 16 )
