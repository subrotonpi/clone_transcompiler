def import import sys , time
import numpy
import numpy
import numpy
import numpy.random
import numpy.fft
import numpy.random
import numpy.random
import numpy.random
t = time.time ( )
for tt in range ( 1 , t + 1 ) :
    n = numpy.random.randint ( 0 , t )
    x = numpy.random.randn ( n )
    y = numpy.random.randn ( n )
    z = numpy.random.randn ( n )
    p = numpy.random.randn ( n )
    a = numpy.zeros ( ( n , 4 ) )
    for i in range ( n ) :
        x = numpy.random.randn ( n )
        y = numpy.random.randn ( n )
        z = numpy.random.randn ( n )
        p = numpy.random.randn ( n )
        a [ i , 0 ] = x [ i ] + y [ i ] + z [ i ]
        a [ i , 1 ] = x [ i ] + y [ i ] - z [ i ]
        a [ i , 2 ] = x [ i ] - y [ i ] + z [ i ]
        a [ i , 3 ] = - x [ i ] + y [ i ] + z [ i ]
    l , r = 0 , 1e20
    for it in range ( 0 , 500 ) :
        m = ( l + r ) / 2
        fl = True
        for j in range ( 4 ) :
            lb , rb = - 1e100 , 1e100
            for i in range ( n ) :
                clb = a [ i , j ] - m * p [ i ]
                crb = a [ i , j ] + m * p [ i ]
                lb = numpy.maximum ( lb , clb )
                rb = numpy.minimum ( rb , crb )
            if lb > rb :
                fl = False
                break
        if fl :
            r = m
        else :
            l = m
        print ( "Case #%d: %d" % ( tt , l ) )
