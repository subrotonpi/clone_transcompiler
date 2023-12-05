def round3 ( ) :
    import os
    import sys
    import kattio
    import json
    import json
    import json
    class B ( object ) :
        def __init__ ( self ) :
            self.io = kattio.Kattio ( open ( 'round3/B-large-0.in' , 'rb' ) , open ( 'round3/B-large-0.out' , 'wb' ) )
            cases = self.io.read ( )
            for i in range ( 1 , cases + 1 ) :
                self.io.write ( 'Case #%d: ' % i )
                sys.stderr.write ( str ( i ) )
                B ( ).solve ( self.io )
            self.io.close ( )
    my_power , tower_power = [ ] , [ ]
    def solve ( io ) :
        my_power , tower_power = io.read ( )
        n = io.read ( )
        health = [ ]
        gold = [ ]
        for i in range ( n ) :
            health.append ( io.read ( ) )
            gold.append ( io.read ( ) )
        memo = np.zeros ( ( n , 201 * n + 10 ) , dtype = np.int )
        io.write ( go ( 0 , 1 ) )
    def memo ( ) :
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
        global memo
        memo [ 0 ] = memo [ 0 ]
    return B ( ).solve ( )
