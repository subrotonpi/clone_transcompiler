def _ ( ) : return sys.stdin.read ( )
import time
import random
import sys
rx = 1e100
ry = 1e100
eps = 1e-8
per = [ [ 0 , 1 , 2 ] , [ 0 , 2 , 1 ] , [ 1 , 0 , 2 ] , [ 1 , 2 , 0 ] , [ 2 , 0 , 1 ] , [ 2 , 1 , 0 ] ]
def tr ( p1 , p2 , _x1 , _y1 , _x2 , _y2 ) :
    try :
        sys.stdout.write ( '{}\n'.format ( p1 ) )
    except Exception as E :
        raise E
def solve ( __ ) :
    x1 = [ ]
    y1 = [ ]
    x2 = [ ]
    y2 = [ ]
    for i in range ( 3 ) :
        x1.append ( _x1 [ per [ p1 ] [ i ] ] )
        y1.append ( _y1 [ per [ p1 ] [ i ] ] )
        x2.append ( _x2 [ per [ p2 ] [ i ] ] )
        y2.append ( _y2 [ per [ p2 ] [ i ] ] )
    dx1 = x1 [ 1 ] - x1 [ 0 ]
    dy1 = y1 [ 1 ] - y1 [ 0 ]
    dx2 = x2 [ 1 ] - x2 [ 0 ]
    dy2 = y2 [ 1 ] - y2 [ 0 ]
    d = - dx1 * dx1 - dy1 * dy1
    a = ( - dx2 * dx1 - dy2 * dy1 ) / d
    b = ( dx1 * dy2 - dy1 * dx2 ) / d
    u = a * x1 [ 0 ] + b * y1 [ 0 ] - x2 [ 0 ]
    v = - b * x1 [ 0 ] + a * y1 [ 0 ] - y2 [ 0 ]
    for i in range ( 3 ) :
        if abs ( a * x1 [ i ] + b * y1 [ i ] - u - x2 [ i ] ) > eps :
            return
        if abs ( - b * x1 [ i ] + a * y1 [ i ] - v - y2 [ i ] ) > eps :
            return
    dd = ( a - 1 ) * ( a - 1 ) + b * y2 [ 0 ]
    print ( dd , '{} {}'.format ( a , b