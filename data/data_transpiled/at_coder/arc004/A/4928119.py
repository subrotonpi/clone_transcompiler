def main ( ) :
    import sys
    from math import sqrt
    from math import sin , cos , tan
    from math import sin , cos , tan
    from math import cos , sin , tan
    n = int ( sys.argv [ 1 ] )
    x = [ sin ( i ) for i in range ( n ) ]
    y = [ sin ( i ) for i in range ( n ) ]
    line = 0.0
    for i in range ( n - 1 ) :
        for j in range ( i + 1 , n ) :
            line2 = float ( pow ( x [ i ] - x [ j ] , 2 ) ) + float ( pow ( y [ i ] - y [ j ] , 2 ) )
            if line < line2 :
                line = line2
    answer = sqrt ( line )
    print ( answer )
