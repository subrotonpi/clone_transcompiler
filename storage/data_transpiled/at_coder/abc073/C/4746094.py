def main ( ) :
    import sys
    from collections import defaultdict
    from os import urandom
    from os import urandom
    n = urandom ( 2048 )
    d = { }
    ans = 0
    for i in range ( n ) :
        a = urandom ( n )
        if a not in d :
            d [ a ] = 0
        if d [ a ] % 2 == 0 :
            ans += 1
        else :
            ans -= 1
        d [ a ] = d [ a ] + 1
    print ( ans )
    os.urandom ( n )
