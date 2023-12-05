def _ ( ) :
    import string
    import sys
    from itertools import count
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    ABCD = chain ( iterable ( repeat ( 4 ) ) , repeat ( 4 ) )
    nums = [ chain ( chain ( [ i ] , i ) for i in range ( 4 ) ) for i in range ( 1 , 3 ) ]
    bits = 0
    for i in range ( 1 , 3 ) :
        tmp = nums [ 0 ]
        for j in range ( 3 ) :
            if ( i >> j & 1 ) == 1 :
                tmp += nums [ j + 1 ]
            else :
                tmp -= nums [ j + 1 ]
        if tmp == 7 :
            bits = i
    data = [ ]
    data.append ( ABCD [ 0 ] )
    for j in range ( 3 ) :
        if ( bits >> j & 1 ) == 1 :
            data.append ( "+" )
        else :
            data.append ( "-" )
        data.append ( ABCD [ j + 1 ] )
    data.append ( "=7" )
    out ( "\n".join ( data ) )
