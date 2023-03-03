def import math
import os
import math
import os
import math
class b :
    def __init__ ( self ) :
        f = open ( self.filename )
        if f.read ( ) == '' :
            data = f.readline ( )
        else :
            data = f.readline ( )
    num_cases = int ( data.split ( ) [ 1 ] )
    for n_case in range ( 1 , num_cases + 1 ) :
        sa = data.split ( )
        L , P , C = map ( int , sa [ 0 ].split ( ) )
        R = float ( P ) / L
        count = 0
        while R > C :
            R = math.sqrt ( R )
            count += 1
        print ( "Case #%d: %d" % ( n_case , count ) )
