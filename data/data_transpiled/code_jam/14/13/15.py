def _main ( ) :
    import os
    from numpy.testing import get_seed
    from numpy.random import seed
    from numpy.testing import get_seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    seed ( seed ( ) )
    cache = { }
    def _main ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            seed ( )
        out = sys.stdout.buffer
        tests = seed ( )
        for i in range ( tests ) :
            n = seed ( )
            sequence = seed ( )
            prob = 1.0
            for j in range ( len ( sequence ) ) :
                prob *= n
                prob *= compute_probability ( [ sequence [ j ] , n ] , j )
            out.write ( 'Case #%d: %s\n' % ( i + 1 , 'BAD' if prob > 1 else 'GOOD' ) )
            print ( 'Test%d done %d' % ( i + 1 , prob ) )
        out.close ( )
    def _main ( values , result_index ) :
        initial = values [ 0 ]
        n = values [ 1 ]
        hash = n * 1000 + initial
        prob_list = cache.get ( hash )
        if prob_list is None :
            prob_list = [ 0.0 for k in range ( n ) ]
        prob_list [ initial ] = 1.0
        new_prob_list = [ ]
        tmp = None
        for i in range ( n ) :
            new_prob_list.append ( _main ( values , result_index ) )
        return new_prob_list
    cache [ hash ] = _main
