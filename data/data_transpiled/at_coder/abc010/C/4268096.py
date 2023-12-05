def main ( ) :
    import math
    from numpy.linalg import norm
    from numpy.random import uniform
    xs , ys , xe , ye , v , t , N = uniform ( 0 , 3 )
    total = v * t
    for i in range ( N ) :
        x , y = uniform ( 0 , 3 )
        p1 = ( xs - x ) ** 2 + ( ys - y ) ** 2
        p2 = ( xe - x ) ** 2 + ( ye - y ) ** 2
        d1 = norm ( p1 )
        d2 = norm ( p2 )
        if d1 + d2 <= total :
            print ( "YES" )
            return
    print ( "NO" )
