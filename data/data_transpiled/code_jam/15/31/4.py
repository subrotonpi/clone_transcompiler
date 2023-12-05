def round1c ( ) :
    import os
    import sys
    from kattio import Kattio
    io = Kattio ( open ( 'round1c/A-large.in' , 'rb' ) , open ( 'round1c/A-large-0.out' , 'wb' ) )
    cases = io.read ( )
    for i in range ( 1 , cases + 1 ) :
        io.write ( 'Case #%d: ' % i )
        A ( ).solve ( io )
    io.close ( )
    def first_hit ( left , right , hit , w ) :
        if hit == left or hit == right - 1 :
            return w - 1
        return w
    def solve ( io ) :
        rows , cols , w = io.read ( )
        misses = ( rows - 1 ) * ( cols // w )
        a = sys.maxsize
        for offset in range ( w ) :
            cur , left_boundary = misses , 0
            b = 0
            for x in range ( offset , cols , w ) :
                b = max ( b , cur + 1 + first_hit ( left_boundary , cols , x , w ) )
                cur += 1
                left_boundary = x + 1
            a = min ( a , b )
        io.write ( a )
    return solve
