def _ _ main _ _ ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import readline
import sys
def get_int ( ) : return int ( readline.readline ( ) )
def get_ins ( ) :
    s = readline.readline ( ).split ( )
    r = [ int ( i ) for i in s ]
    return r
def get_costs ( ) :
    if f [ 0 ] > 'Z' : return 0
    if get_costs ( ) : return costs [ )
    comp = find ( )
    a = [ ]
    for i in range ( 2 , len ( comp ) ) :
        if comp [ i ] > 'Z' :
            pass
        else :
            a.append ( cost ( comp [ i ] ) )
    r = 1
    a.sort ( )
    for i in range ( len ( a ) ) :
        t = len ( a ) - i + 1
        r = max ( t , r )
        t = a [ i ] + len ( a ) - i - 1
        r = max ( t , r )
    return r
def docase ( ) :
    M = get_int ( )
    makeme = None
    find = { }
    costs = { }
    for i in range ( M ) :
        f = readline.strip ( ).split ( )
        find [ f [ 0 ] ] = f [ 1 ]
        if not makeme :
            makeme = f [ 0 ]
    return cost ( makeme )
def main ( ) :
    lim = get_int ( )
    for c in range ( 1 , lim + 1 ) :
        r = docase ( )
        print ( "Case #%d: %d" % ( c , r ) )
