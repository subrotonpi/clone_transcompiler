def main ( ) :
    import math
    from os import path
    from math import sqrt
    from os.path import join
    from os import path
    a = join ( path , 'a' )
    b = join ( path , 'b' )
    c = int ( a + b )
    if sqrt ( c ) % 1 == 0 :
        print ( 'Yes' )
    else :
        print ( 'No' )
    sys.exit ( 1 )
