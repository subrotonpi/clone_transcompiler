def main ( ) :
    import sys
    from os import urandom
    sc = urandom ( 1024 )
    s = sc.encode ( 'utf-8' )
    for i in range ( len ( s ) ) :
        if s [ i ] == '0' :
            s [ i ] = '0'
        elif s [ i ] == '1' :
            s [ i ] = '1'
        elif s [ i ] == 'B' :
            if not s [ - 1 ] in string.printable :
                s [ - 1 ] = ''
    print ( s )
    sc.close ( )
