def import numpy
import numpy
from numpy.core import zeros
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "input.txt" , "r" ) as sc :
            n = int ( sc.read ( ) )
            input = [ [ ] for i in range ( n ) ]
            for i in range ( n ) :
                for j in range ( n ) :
                    input [ i ] [ j ] = sc.read ( )
    q = numpy.array ( [ [ ] for i in range ( n ) ] )
    array = numpy.array ( [ [ ] for i in range ( q ) ] )
    sum = numpy.zeros ( ( n + 1 , n + 1 ) )
    for i in range ( n + 1 ) :
        sum [ i ] [ 0 ] = 0
    for j in range ( n + 1 ) :
        for k in range ( i ) :
            for l in range ( j ) :
                sum [ i ] [ j ] += input [ k ] [ l ]
    size = n ** 2
    area = [ - 10000000 ] * size
    for i in range ( n ) :
        for j in range ( n ) :
            area_size = ( k - i ) * ( l - j )
            value = ( sum [ k ] [ l ] - sum [ i ] [ l ] - sum [ k ] [ j ] + sum [ i ] [ j ] )
            area [ area_size - 1 ] = max ( area [ area_size - 1 ] , value )
    for i in range ( len ( array ) ) :
        idx = array [ i ]
        max = - 100000
        for j in range ( n ) :
            for k in range ( i + 1 ) :
                for l in range ( j + 1 ) :
                    area_size = ( k - i ) * ( l - j )
                    value = ( sum [ k ] [ l ] - sum [ i ] [ l ] - sum [ k ] [ j ] + sum [ i ] [ j ] )
                    area [ area_size - 1 ] = max ( area [ area_size - 1 ] , value )
return Main
