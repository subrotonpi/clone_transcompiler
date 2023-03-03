def _import ( ) :
    import os
    import sys
    import struct
    import random
    import struct
    import sys
    if len ( sys.argv ) != 0 :
        raise ValueError
    for i in range ( len ( sys.argv ) ) :
        sys.argv [ i ] = randint ( 0 , len ( sys.argv ) )
    def read ( n ) :
        for i in range ( n ) :
            sys.argv [ i ] = randint ( 0 , len ( sys.argv [ i ] ) )
    def write ( s , b ) :
        yield s
    def read ( n ) :
        while ( len ( s ) <= n ) :
            sys.argv [ i ] = read ( n )
    used = set ( )
    prev = W [ 0 ]
    used.add ( prev )
    for i in range ( 1 , len ( sys.argv ) ) :
        current = sys.argv [ i ]
        if prev [ - 1 ] != sys.argv [ i ] or current in used :
            print ( 'LOSE' if i % 2 == 0 else 'WIN' )
            return
        used.add ( current )
        prev = current
    print ( 'DRAW' )
is_debug = os.environ.get ( 'DESKTOP' )
def debug ( * o ) :
    if is_debug :
        print ( ' '.join ( o ) , file = sys.stderr )
