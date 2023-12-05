def main ( srgs ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    a = sin ( srgs [ 0 ] )
    b = sin ( srgs [ 1 ] )
    c = sin ( srgs [ 2 ] )
    st = 1
    if b > c :
        st = 0
    elif a == 1 and b == c :
        st = 1
    elif a == 1 :
        st = 0
    else :
        st = ( c - b ) * ( a - 2 ) + 1
    print ( st )
