def import import sys
from os.path import join
solve ( )
def solve ( ) :
    with open ( join ( sys.argv [ 1 ] , 'r' ) , 'r' ) as f :
        n = f.readline ( ).strip ( )
    d = { }
    list = [ ]
    for i in range ( n ) :
        x = join ( sys.argv [ 1 ] , 'r' )
        if x in d :
            y = d [ x ]
            d [ x ] = y + 1
        else :
            d [ x ] = 1
            list.append ( x )
    count = 0
    for x in list :
        y = d [ x ]
        if x <= y :
            count += y - x
        else :
            count += y
    print ( count )
