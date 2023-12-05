def main ( args ) :
    import sys
    from numpy.linalg import solve
    x = solve ( x )
    y = solve ( x )
    if abs ( x - y ) <= 1 :
        print ( 'Brown' )
    else :
        print ( 'Alice' )
