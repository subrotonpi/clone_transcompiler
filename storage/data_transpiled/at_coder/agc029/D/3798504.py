def _ _ main _ _ ( ) : return
import time
import sys
import os
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import integer
import math
import random
import time
import time
def solve ( TC = 0 ) :
    h , w , n = ni ( ) , ni ( ) , ni ( )
    set = [ ]
    for i in range ( w ) :
        set.append ( sorted ( [ i , n ] ) )
    for i in range ( n ) :
        x , y = ni ( ) - 1 , ni ( ) - 1
        set.append ( x )
    if 1 in set :
        pn ( 1 )
        return
    ans = INF
    x , y = 0 , 0
    min = [ - 1 ] * w
    min [ 0 ] = 0
    for i in range ( w - 1 ) :
        if x + 1 in set [ y ] : break
        x += 1
        while x < h and x + 1 not in set [ y + 1 ] and x in set [ y + 1 ] : x += 1
        if x in set [ y + 1 ] : break
        min [ y + 1 ] = x
        y += 1
    for i in range ( w ) :
        if min [ i ] :
            val = set [ i ].ceiling ( min [ i ] )
            ans = min [ ans ] + val
        pn ( ans )
    MOD , IINF , INF , MAX = ( 1e9 + 7 , 1e5 + 5 ) , ( 2e5 + 1 , 1e5 + 1 )
    df = string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( string.atof ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( int ( ( int ( ( ( ( int ( int ( ( ( ( (