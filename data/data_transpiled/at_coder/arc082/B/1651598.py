def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    N = len ( sys.stdin.readlines ( ) )
    count = 0
    a = [ ]
    for i in range ( 1 , N + 1 ) :
        a.append ( sys.stdin.read ( ) )
    for i in range ( 1 , N + 1 ) :
        if i == a [ i ] :
            count += 1
            i += 1
    print ( count )
