def import re
import sys
import os
import sys
from numpy.linalg import solve
f = open ( 'C-small-1-attempt2.in' , 'r' )
f = open ( 'solve.txt' , 'w' )
T = int ( f.readline ( ).strip ( ) )
for t in range ( 1 , T + 1 ) :
    s = f.readline ( ).strip ( ).split ( )
    N = int ( s [ 0 ] )
    K = int ( s [ 1 ] )
    arr = [ ]
    U = float ( s [ 0 ] )
    s = f.readline ( ).strip ( ).split ( )
    for i in range ( N ) :
        arr.append ( float ( s [ i ] ) )
    arr = [ float ( s [ i ] ) for i in range ( N ) ]
    pro = 0
    for i in range ( N ) :
        if i != N - 1 :
            if U > ( ( i + 1 ) * ( arr [ i + 1 ] - arr [ i ] ) ) :
                U -= ( ( i + 1 ) * ( arr [ i + 1 ] - arr [ i ] ) )
            else :
                pro = pow ( ( arr [ i ] + ( U / ( i + 1 ) ) ) , i + 1 )
                for j in range ( i + 1 , N ) :
                    pro *= arr [ j ]
                break
        else :
            pro = pow ( ( U / N ) + arr [ i ] , N )
    f.write ( 'Case #%d: ' % t )
    f.write ( '%.6f\n' % pro )
f.close ( )
os.remove ( 'solve.txt' )
return
