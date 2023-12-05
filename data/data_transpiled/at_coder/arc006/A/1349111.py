def import import sys , string , traceback
from os import isatty
import getopt
try :
    opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
except getopt.error :
    return
for o , a in opts :
    str_arr = a.split ( )
    e = [ 0 ] * 10
    for i in range ( 6 ) :
        tmp = int ( str_arr [ i ] )
        e [ tmp ] += 1
    bonus = int ( a )
    str_arr = a.split ( )
    l = [ 0 ] * 10
    for i in range ( 6 ) :
        tmp = int ( str_arr [ i ] )
        l [ tmp ] += 1
    count = 0
    for i in range ( 10 ) :
        if e [ i ] == 1 and l [ i ] == 1 :
            count += 1
    bonusFlag = False
    if l [ bonus ] == 1 :
        bonusFlag = True
    if count == 6 :
        print ( 1 )
    elif count == 5 :
        if bonusFlag :
            print ( 2 )
        else :
            print ( 3 )
    elif count == 4 :
        print ( 4 )
    elif count == 3 :
        print ( 5 )
    else :
        print ( 0 )
