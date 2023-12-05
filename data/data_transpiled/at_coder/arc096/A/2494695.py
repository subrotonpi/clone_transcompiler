def main ( ) :
    import sys
    import math
    from numpy.core import minimum , maximum , maximum , reduce
    a = min ( a , b , c )
    b = min ( b , c , x )
    x = min ( a , b , x )
    y = min ( a , b , y )
    if ( a + b ) <= c * 2 :
        print ( a * x + b * y )
        return
    num_replace = min ( x , y )
    x1 = x - num_replace
    if x1 < 0 :
        x1 = 0
    y1 = y - num_replace
    if y1 < 0 :
        y1 = 0
    half1 = num_replace * 2
    sum1 = a * x1 + b * y1 + c * half1
    num_replace2 = max ( x , y )
    x2 = x - num_replace2
    if x2 < 0 :
        x2 = 0
    y2 = y - num_replace2
    if y2 < 0 :
        y2 = 0
    half2 = num_replace2 * 2
    sum2 = a * x2 + b * y2 + c * half2
    answer = min ( sum1 , sum2 )
    print ( answer )
