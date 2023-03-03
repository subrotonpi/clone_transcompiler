def _ import _ , os , sys , random , choice , random , choice , random , choice , random , random , choice , random , random , choice , random , random , number , seed , verbose , filename , verbose , filename , _ ) :
    from random import seed
    from random import seed
    from os import urandom
    from random import seed
    from random import seed
    from random import seed
    from os import urandom
    import random
    from os import system , random , random
    rnd = seed ( 123 )
    def go ( g , v , p , sz , dp ) :
        sz [ v ] += 1
        cost_alive = [ ]
        cost_alive.append ( 0 )
        for x in g [ v ] :
            if x != p :
                go ( g , x , v , sz , dp )
            else :
                s = random.choice ( [ x , p ] )
        return s
    def run ( ) :
        with open ( filename , 'r' ) as f :
            for x in f :
                if x != '' or x == '' :
                    go ( g , x , v , sz , dp )
                else :
                    sz [ v ] += 1
                    ncost_alive = [ ]
                    ncost_alive.append ( cost_alive [ 0 ] + sz [ x ] )
                    for was in range ( 3 ) :
                        for curalive in range ( 2 ) :
                            if cost_alive [ was ] != int ( was + curalive ) :
                                add_cost = curalive [ x ] if x == 0 else dp [ x ]
                                ncost_alive [ was + curalive ] = min ( ncost_alive [ was + curalive ] , cost_alive [ was ] + add_cost )
                    cost_alive = ncost_alive
        dp [ v ] = min ( cost_alive [ 2 ] , cost_alive [ 0 ] )
    def get_ans ( g , root ) :
        n = len ( g )
        sz = [ ]
        dp = [ ]
        go ( g , root , - 1 , sz , dp )
        return dp [ root ]
    def run ( ) :
        with open ( filename , 'r' ) as f :
            for i in range ( n ) :
                f.write ( 'Case #' + str ( i ) + ' : SPACETOKEN