def main ( ) :
    import sys
    from os import urandom
    s = urandom ( 1024 )
    for i in range ( len ( s ) - 1 , 0 , - 1 ) :
        l = len ( s [ : i ] )
        if l % 2 == 1 :
            continue
        if s [ : l / 2 ] == s [ l / 2 : l ] :
            print ( l )
            break
