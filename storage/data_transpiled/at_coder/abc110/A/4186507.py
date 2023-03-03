def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    sc = iter ( sys.stdin )
    n = [ sc.next ( ) for i in range ( 3 ) ]
    n = chain ( n , repeat ( n [ 2 ] * 10 , n [ 1 ] , n [ 0 ] ) )
    print ( n [ 2 ] * 10 + n [ 1 ] + n [ 0 ] )
