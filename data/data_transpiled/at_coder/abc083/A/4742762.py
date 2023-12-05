def main ( ) :
    import sys
    from math import sin , cos , tan
    from os.path import join
    from os import path
    A = join ( path.dirname ( __file__ ) , 'A' )
    B = join ( path.dirname ( __file__ ) , 'B' )
    C = join ( path.dirname ( __file__ ) , 'C' )
    D = join ( path.dirname ( __file__ ) , 'D' )
    L , R = 0 , 0
    L = A + B
    R = C + D
    if L > R :
        print ( 'Left' )
    elif L == R :
        print ( 'Balanced' )
    elif L < R :
        print ( 'Right' )
