def _import ( ) :
    import re
    import sys
    import os
    import sys
    import os
    from itertools import chain , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    from os.path import join , dirname , join
    from os.path import join , dirname , join
    from itertools import chain , repeat
    from itertools import chain , repeat
    from os.path import join , dirname , join
    from os.walk import walk
    from os.path import join , dirname , join
    from os.walk import walk
    from os.path import join , dirname , join
    from os.walk import walk
    from itertools import chain , repeat
    n = chain ( repeat ( n ) for _ in range ( n ) )
    a = [ join ( dirname ( join ( dirname ( dirname ( dirname ( dirname ( dirname ( __file__ ) ) ) ) ) ) , ) , ) for dirname ( dirname ( dirname ( dirname ( dirname ( __file__ ) ) ) ) ) in chain ( repeat ( n ) for dirname ( dirname ( dirname ( dirname ( __file__ ) ) ) ) , repeat ( n ) ) ]
    b = [ join ( dirname ( dirname ( dirname ( __file__ ) ) ) , ) for dirname ( dirname ( dirname ( __file__ ) ) ) in chain ( repeat ( n ) for _ in range ( n ) ) ]
    ans = 0
    for i in range ( n ) :
        a [ i ] = repeat ( a [ i ] )
        b [ i ] = repeat ( b [ i ] )
        for j in range ( i ) :
            if ( a [ i ] > a [ j ] ) ^ ( b [ i ] > b [ j ] ) :
                ans += 1
    print ( ans )
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        if len ( sys.argv ) >= 2 :
            input_filename = sys.argv [ 1 ]
            output_filename = sys.argv [ 2 ]
        f = open ( input_filename , 'r' )
        f.write ( '\n' )
        f.close ( )
        for t in range ( 1 , tests + 1 ) :
            print ( 'Case #%d: ' % t , end = '' , file = sys.stderr )
            chain ( repeat ( t ) , t )
    main ( )
