def main ( ) :
    import sys
    import random
    from itertools import chain
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    arr = [ ]
    rev = [ ]
    for i in range ( n + 1 ) :
        arr.append ( random.choice ( arr ) )
        rev.append ( i )
    count = 0
    rev = chain ( [ - 1 ] , n )
    for i in range ( 1 , n + 1 ) :
        l = rev.lower ( rev [ i ] )
        r = rev.higher ( rev [ i ] )
        count += long ( i ) * ( rev [ i ] - l ) * ( r - rev [ i ] )
        rev.append ( rev [ i ] )
    print ( count )
