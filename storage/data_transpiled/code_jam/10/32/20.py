def import import _load
import sys
import os
import sys
import os
import sys
import os
import sys
import codecs
try :
    BR = open ( 'B-large.in' , 'r' )
    PW = open ( 'B-large.out' , 'w' )
    T = int ( BR.readline ( ) )
    for I in range ( T ) :
        ST = BR.readline ( ).split ( )
        L , P , C = [ int ( x ) for x in ST ]
        div = P / L
        if P % L > 0 : div += 1
        binary = 0
        F = C
        while F < div :
            F = F * F
            binary += 1
        PW.write ( 'Case #%d: %d\n' % ( I + 1 , binary ) )
    PW.flush ( )
    PW.close ( )
    BR.close ( )
