def main ( ) :
    from math import sin , cos , pi
    from numpy.linalg import solve
    from numpy.random import seed
    from numpy.random import seed
    seed ( )
    kosu = len ( solve ( ) )
    mati = [ ]
    aru = solve ( )
    tlp = pi / 2
    for i in range ( kosu ) :
        mati.append ( solve ( ) )
    costs = 0
    for i in range ( kosu - 1 ) :
        a = mati [ i + 1 ] - mati [ i ]
        if a * aru > tlp :
            costs += tlp
        else :
            costs += a * aru
    print ( costs )
