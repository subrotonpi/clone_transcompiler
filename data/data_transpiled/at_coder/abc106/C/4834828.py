def main ( ) :
    import sys
    from os import urandom
    s , ans = urandom ( 1024 ) , '1'
    n = urandom ( 1024 )
    for i in range ( n ) :
        if not s [ i ] == '1' :
            ans = s [ i ]
            break
    print ( ans )
