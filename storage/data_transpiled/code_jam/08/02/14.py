def prob_b ( ) :
    import sys
    from itertools import chain
    def parse_two ( l ) :
        s = l.split ( ' ' ) [ 0 ]
        one = l [ s.index ( ':' ) + 1 : ]
        for i in range ( len ( s ) ) :
            ans = one_case ( l )
            print ( 'Case #%d: %d %d' % ( i + 1 , ans [ 0 ] , ans [ 1 ] ) )
        return [ 60 * h1 + m1 , 60 * h2 + m2 ]
    def one_case ( l ) :
        t = int ( l.split ( ':' ) [ 0 ] )
        l = l.split ( ' ' ) [ 1 ]
        N = parse_two ( l )
        a_a = [ ]
        a_d = [ ]
        b_a = [ ]
        b_d = [ ]
        for sched in parse_two ( l ) :
            a_d.append ( sched [ 0 ] )
            b_a.append ( sched [ 1 ] + t )
        for sched in parse_two ( l ) :
            b_d.append ( sched [ 0 ] )
            a_a.append ( sched [ 1 ] + t )
        a_a.sort ( )
        a_d.sort ( )
        b_a.sort ( )
        b_d.sort ( )
        trains = 0
        max_trains = 0
        a = 0
        d = 0
        while a < N [ 1 ] or d < N [ 0 ] :
            if a == N [ 1 ] or ( d < N [ 0 ] and a_a [ a ] > a_d [ d ] ) :
                d += 1
                trains += 1
                if trains > max_trains :
                    max_trains = trains
            else :
                a += 1
                trains -= 1
        return max_trains
    return [ ]
