def main ( ) :
    import sys
    from math import abs
    from math import pow
    from math import pow
    from math import sin , cos , sin , cos , log
    S = sys.stdin.read ( )
    x = S [ : - 2 ]
    x2 = [ int ( i ) for i in x [ : - 2 ] ]
    answer_x = abs ( 753 - x2 [ 0 ] )
    for k in range ( 1 , len ( S ) - 2 ) :
        if pow ( 753 - x2 [ k ] , 2 ) < abs ( answer_x ) :
            answer_x = pow ( 753 - x2 [ k ] , 2 )
    sys.stdout.write ( answer_x )
    sys.stdout.flush ( )
