def main ( ) :
    import sys
    import os
    import sys
    from itertools import count
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    a = [ ]
    oddcount = 0
    for i in chain ( range ( n ) , repeat ( n ) ) :
        a.append ( i )
        if a [ i ] % 2 == 1 :
            oddcount += 1
    if oddcount % 2 == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
