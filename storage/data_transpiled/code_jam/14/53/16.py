def _solve ( ) :
    import os
    import sys
    import random
    import sys
    import os
    import sys
    import os.path
    import random
    import sys
    import random
    import string
    import string
    import sys
    class SolC ( ) :
        def main ( self ) :
            try :
                os.chdir ( os.path.dirname ( os.path.abspath ( __file__ ) ) )
            except os.error :
                pass
    ans = [ ]
    for i in range ( len ( p [ n ] ) ) :
        if p [ n ] [ i ] :
            ans = min ( ans , int ( i ) )
    print ( 'CRIME TIME' if ans == [ ] else [ ] )
    for i in range ( 0 , len ( p ) ) :
        if not p [ n ] :
            try :
                p [ n ] = [ i ].split ( ' \n\t/' )
            except ValueError :
                eof = True
                return '0'
    randint = random.randint
    randint = random.randint
    print ( '%d %d' % ( i , n ) , end = ' ' )
    n = randint ( 1 , n )
    act = [ ]
    id = [ ]
    m = 0
    hm = { }
    for i in range ( n ) :
        act.append ( string.ascii_letters )
        t = randint ( 1 , n )
        if t != 0 :
            if t not in hm :
                hm [ t ] = 1
                m += 1
            id.append ( hm [ t ] )
    p = [ [ True ] * n + [ 0 ] ]
    for i in range ( 1 , n + 1 ) :
        if act [ i ] == 'E' :
            if id [ i ] :
                if id [ i ] :
                    if id [ i ] :
                        p [ i ] [ j ] |= p [ i - 1 ] [ j ^ ( 1 << k ) ]
            else :
                p [ i ] [ j ] |= p [ i - 1 ] [ j ^ ( 1 << k ) ]
    return p
