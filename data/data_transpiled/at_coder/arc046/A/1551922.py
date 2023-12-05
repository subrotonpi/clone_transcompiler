def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    n = len ( chain ( * repeat ( sys.argv [ 1 : ] ) ) )
    for i in range ( 0 , ( n - 1 ) // 9 ) :
        print ( n % 9 , end = ' ' )
    print ( )
