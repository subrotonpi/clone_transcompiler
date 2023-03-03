def main ( ) :
    import sys
    import time
    r , b , x , y = time.time ( )
    Tmax = r + b + 60
    Tmin = None
    T = 0
    while Tmax - Tmin > 1 :
        T = Tmin + ( Tmax - Tmin ) / 2
        if r >= T and b >= T and ( r - T ) / ( x - 1 ) + ( b - T ) / ( y - 1 ) >= T :
            Tmin = T
        else :
            Tmax = T
    ans = Tmin
    print ( ans )
