def import _main
import sys
import os
import sys
import getopt
import getopt
import getopt
import getopt
import getopt
try :
    opts , args = getopt.getopt ( sys.argv [ 1 : ] , 'r' )
except getopt.error as msg :
    print ( msg )
    return
try :
    pos_list = [ ]
    dp = { }
    for o , a in opts :
        W , H , N = getopt.getopt ( o , 'W' )
        for i in range ( N ) :
            pos_list.append ( ( a , a ) )
    print ( get_max_count ( 1 , 1 , W , H ) )
except getopt.error as msg :
    print ( msg )
    return
for sx , sy , ex , ey in opts :
    if sx < 1 or sy < 1 or ey < sy or ex < sx :
        return
    key = '%d.%d.%d.%d' % ( sx , sy , ex , ey )
    if key not in dp :
        maxCount = 0
        count = ( ex - sx ) + ( ey - sy ) + 1
        for pos in pos_list :
            if sx <= pos [ 0 ] <= ex and sy <= pos [ 1 ] <= ey :
                maxCount = max ( maxCount , count + get_max_count ( sx , sy , pos [ 0 ] - 1 , pos [ 1 ] - 1 ) + get_max_count ( pos [ 0 ] + 1 , sy , ex , pos [ 1 ] - 1 ) + get_max_count ( sx , pos [ 1 ] + 1 , pos [ 0 ] - 1 , ey ) + get_max_count ( pos [ 0 ] + 1 , pos [ 1 ] + 1 , ex , ey ) )
        dp [ key ] = maxCount
    return dp [ key ]
