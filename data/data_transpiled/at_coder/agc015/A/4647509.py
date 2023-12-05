def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import path
    from os import urandom
    N , A , B = int ( urandom ( 1 ) ) , int ( urandom ( 1 ) ) , int ( urandom ( 1 ) )
    if B - A < 0 :
        print ( '0' )
        return
    if N == 1 :
        if A == B :
            print ( '1' )
        else :
            print ( '0' )
        return
    min , max = 0 , 0
    for i in range ( N - 1 ) :
        min += A
        max += B
    min += B
    max += A
    print ( max - min + 1 )
