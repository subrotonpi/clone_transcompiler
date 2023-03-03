def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    from itertools import chain
    try :
        with open ( sys.argv [ 1 ] ) as sc :
            chain ( chain ( [ '' ] , repeat ( '' ) ) , chain ( [ '' ] , repeat ( '' ) ) )
    except IOError :
        print ( 'No input file found' )
        return
    n , s = chain ( [ '' ] , repeat ( '' ) )
    ans = 0
    for i in chain ( range ( n ) , repeat ( '' ) ) :
        start_set = set ( i )
        end_set = set ( range ( n - i ) )
        start_set.difference_update ( end_set )
        ans = max ( ans , len ( start_set ) )
    print ( ans )
