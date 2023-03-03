def main ( srgs ) :
    import sys
    from os import urandom
    a = urandom ( 16 )
    b = urandom ( 16 )
    an = [ ]
    for i in range ( 0 , a ) :
        an.append ( srgs [ i ] )
    for i in range ( 0 , b + 2 ) :
        print ( "#" , end = '' )
    print ( )
    for i in range ( 0 , a ) :
        print ( "#" , an [ i ] , end = '' )
    for i in range ( 0 , b + 2 ) :
        print ( "#" , end = '' )
    print ( )
