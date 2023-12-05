def import _readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import math
import os
import os
import sys
import os
import sys
import time
import time
curr = ''
dp = [ [ ] ]
dp = [ [ 1 ] ]
dp [ 0 ] [ 0 ] = 1
for till in range ( 1 , tc ) :
    for build in range ( 0 , l ) :
        for cnt in range ( 0 , cnt ) :
            if p < 1e-6 : continue
            ncnt = cnt
            dp [ till + 1 ] [ next [ build ] [ i ] ] += p * dp [ till ] [ cnt ]
    res = 0
    for i in range ( 0 , l ) :
        res += dp [ till + 1 ] [ next [ build ] [ i ] ] * dp [ till + 1 ] [ next [ build ] [ i ] ]
    curr = ''
    for build in range ( 0 , l ) :
        for cnt in range ( 0 , cnt ) :
            if p < 1e-6 : continue
            ncnt = cnt
            dp [ till + 1 ] [ next [ build ] [ i ] ] += p * dp [ till ] [ build ] [ cnt ]
    for build in range ( 0 , l ) :
        for i in range ( 0 , l ) :
            res += dp [ till + 1 ] [ next [ build ] [ i ] ] * dp [ till + 1 ] [ build ] [ i ]
    curr = ''
    for build in range ( 0 , l ) :
        for cnt in range ( 0 , cnt ) :
            if p < 1e-6 : continue
            ncnt = cnt
            dp [ till + 1 ] [ next [ build ] [ i ] ] += dp [ till + 1 ] [ build ] [ cnt ]
    curr += ''
    if not found :
        print ( "Case #%d: 0.0" % ( time ) )
        print ( "Case #%d: " % ( time ) )
        print ( "Case #%d: " % ( max ) )
        print ( "Case #%d: " % ( time ) )
