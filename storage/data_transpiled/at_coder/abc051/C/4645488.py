def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    sx , sy , tx , ty = select.select ( [ 0 ] , [ 0 ] , [ 0 ] , [ 0 ] , [ 0 ] )
    for i in range ( tx - sx ) :
        print ( 'R' , end = '' )
    for i in range ( ty - sy ) :
        print ( 'U' , end = '' )
    for i in range ( tx - sx ) :
        print ( 'L' , end = '' )
    for i in range ( ty - sy ) :
        print ( 'D' , end = '' )
    print ( 'D' , end = '' )
    for i in range ( tx - sx + 1 ) :
        print ( 'R' , end = '' )
    for i in range ( ty - sy + 1 ) :
        print ( 'U' , end = '' )
    print ( 'LU' , end = '' )
    for i in range ( tx - sx + 1 ) :
        print ( 'L' , end = '' )
    for i in range ( ty - sy + 1 ) :
        print ( 'D' , end = '' )
    print ( 'R' )
