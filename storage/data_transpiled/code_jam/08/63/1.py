def _import ( * os ) : return sys.stderr.write ( deeprepr ( os ) )
import math
import numpy as np
import collections
import math
import numpy.random
import numpy.random
import sys
class C ( object ) :
    def __init__ ( self ) :
        with open ( "/proc/" , "r" ) as sc :
            on = sc.read ( )
            for o in range ( 1 , on + 1 ) :
                print ( "Case #%d: " % o , end = "" )
                n , p , x = sc.read ( )
                crt = [ 0 , p , 1 ]
                for i in range ( 2 , n ) :
                    next = np.zeros ( ( 1 , n ) )
                    d , e = len ( next ) , len ( crt )
                    for j in range ( d ) :
                        for k in range ( 0 , j + 1 ) :
                            up , down = ( j + k ) / 2 , ( j - k ) / 2
                            if up >= e :
                                up = e - 1
                            tmp = p * crt [ up ] + ( 1 - p ) * crt [ down ]
                            if next [ j ] < tmp :
                                next [ j ] = tmp
                    crt = next
                if n == 1 :
                    print ( "%.10f" % crt [ f ( x , n ) ] , end = "" )
                else :
                    j , d , e = f ( x , n )
                    res = 0
                    for k in range ( 0 , j + 1 ) :
                        up , down = ( j + k ) / 2 , ( j - k ) / 2
                        if up >= e :
                            up = e - 1
                        tmp = p * crt [ up ] + ( 1 - p ) * crt [ down ]
                        if res < tmp :
                            res = tmp
                print ( "%.10f" % res , end = "" )
    def debug ( self , * args ) :
        print ( * deeprepr ( args ) , end = "" )
