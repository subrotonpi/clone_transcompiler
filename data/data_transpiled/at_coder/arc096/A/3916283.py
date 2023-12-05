def main ( ) :
    import sys
    from numpy.linalg import solve
    A , B , C , X , Y = solve ( [ x , y ] )
    if ( A + B ) / 2.0 > C and X >= Y and A >= C * 2 :
        print ( C * X * 2 )
    elif ( A + B ) / 2.0 > C and Y > X and B >= C * 2 :
        print ( C * Y * 2 )
    elif ( A + B ) / 2.0 > C and X >= Y :
        print ( C * 2 * Y + A * ( X - Y ) )
    elif ( A + B ) / 2.0 > C and Y > X :
        print ( C * 2 * X + B * ( Y - X ) )
    else :
        print ( A * X + B * Y )
