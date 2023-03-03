def main ( ) :
    import sys
    from math import sin , cos , abs
    reader = Scanner ( )
    A = reader.next ( )
    B = reader.next ( )
    K = reader.next ( )
    for i in range ( A , B + 1 ) :
        if ( abs ( A - i ) < K ) or ( abs ( B - i ) < K ) :
            print ( i )
    reader.close ( )
