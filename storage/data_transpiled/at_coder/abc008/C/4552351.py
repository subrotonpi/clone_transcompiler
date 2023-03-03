def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import urandom
    n = int ( urandom ( 1 ) )
    a = [ sin ( i ) for i in range ( n ) ]
    ans = 0
    for i in range ( n ) :
        count = 0
        for j in range ( n ) :
            if i != j and a [ i ] % a [ j ] == 0 :
                count += 1
        ans += ( float ( count / 2 + 1 ) / ( count + 1 ) if count % 2 == 0 else 1.0 / 2 )
    print ( ans )
