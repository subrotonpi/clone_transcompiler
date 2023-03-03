def _import ( ) :
    import os
    import math
    import os
    import math
    import math
    import math
    import math
    import os
    import os
    import sys
    import time
    modulo = 1000000009
    problemID = __name__.lower ( ) + '_large'
    f = open ( problemID + '.in' , 'w' )
    f.write ( 'Case #' + testNumber + ': ' + str ( result ) + '\n' )
    f.close ( )
    n , c = 0 , 0
    for i in range ( 1 , len ( cnk ) ) :
        cnk [ i ] [ 0 ] = 1
        cnk [ i ] [ i ] = 1
    for j in range ( 1 , n ) :
        tmp = ( cnk [ i ] [ j ] * inv ) % modulo
        num [ j ] = tmp
    for j in range ( 1 , n ) :
        if v != - 1 and parent != 0 :
            bad_colours += 1
        count = 0
        for v in range ( 1 , n ) :
            fact = ( fact * j ) % modulo
            count += 1
        if c - bad_colours < count :
            return 0
        result = cnk [ c - bad_colours ] [ count ]
        for v in range ( 1 , n ) :
            if v == parent :
                continue
            result = result * calc ( v , count , u )
        f.close ( )
    def inverse ( u ) :
        return math.factorial ( u ) % modulo
    def solve_single_test ( testNumber ) :
        f = open ( problemID + '.in' , 'w' )
        n , cc = map ( int , f.readlines ( ) )
        nei = [ ]
        for i in range ( 1 , n ) :
            nei.append ( [ ] )
        for i in range ( 1 , n - 1 ) :
            f.write ( 'Test ' + str ( i ) + ': ' + str ( testNumber ) + '\n' )
    f.close ( )
    return int ( solve ( n ) )
