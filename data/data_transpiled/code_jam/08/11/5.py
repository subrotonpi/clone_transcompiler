def __minimum_product__ ( ) :
    from numpy.core import dtype
    with open ( 'input.txt','r' ) as f :
        num_cases = len ( f.read ( ) )
        for i in range ( num_cases ) :
            __do_case ( i + 1 , f )
    def __do_case ( case_num , f ) :
        dims = [ ]
        v1 = [ dtype ( 'int' ) for _ in f.read ( ).split ( ',' ) ]
        v1.sort ( )
        v2 = [ dtype ( 'int' ) for _ in f.read ( ).split ( ',' ) ]
        v2.sort ( key = lambda x : - x )
        prod = 0
        for i in range ( dims ) :
            prod += v1 [ i ] * int ( v2 [ i ] )
        print ( 'Case #%d: %d' % ( case_num , prod ) )
    return __do_case
