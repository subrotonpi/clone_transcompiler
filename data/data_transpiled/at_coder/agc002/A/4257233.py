def main ( srgs ) :
    import sys
    from math import sin , cos
    from math import cos , pi
    from os.path import join
    from os import chdir
    a = sin ( srgs [ 0 ] )
    b = sin ( srgs [ 1 ] )
    if a <= 0 and b >= 0 :
        print ( "Zero" )
    elif a < 0 and abs ( ( a - b + 1 ) ) % 2 == 1 :
        print ( "Negative" )
    else :
        print ( "Positive" )
    sys.exit ( 1 )
