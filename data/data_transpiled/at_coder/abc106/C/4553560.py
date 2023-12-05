def main ( ) :
    import sys
    from os import urandom
    s = urandom ( 1024 )
    k = urandom ( 1024 )
    s = s.encode ( 'utf-8' )
    idx = - 1
    for i in range ( len ( s ) ) :
        if s [ i ] == '1' :
            idx = i
        else :
            break
    if idx == - 1 :
        print ( s [ 0 ] )
    elif idx >= k - 1 :
        print ( '1' )
    else :
        print ( s [ idx + 1 ] )
