def _ ( ) :
    import sys
    INF = 100000000000000L
    def main ( ) :
        sc = sys.stdin
        n = sc.randint ( 0 , 100000 )
        m = sc.randint ( 0 , 100000 )
        edges = [ ]
        for i in range ( m ) :
            from_i = sc.randint ( 0 , 100000 )
            to_i = sc.randint ( 0 , 100000 )
            cost = - sc.randint ( 0 , 100000 )
            edges.append ( ( from_i , to_i , cost ) )
        d = [ INF ] * 100000
        d = bellman_ford ( d , edges , 1 , n , m )
        if negative_loop ( d , edges , 1 , n , m ) :
            print ( 'inf' )
            return
        print ( - d [ n ] )
    def bellman_ford ( d , es , s , vl , el ) :
        for i in range ( 0 , vl ) :
            d [ i ] = INF
        d [ s ] = 0
        for j in range ( vl ) :
            for i in range ( el ) :
                e = es [ i ]
                if d [ e.from_i ] != INF and d [ e.to_i ] > d [ e.from_i ] + e.cost :
                    d [ e.to_i ] = d [ e.from_i ] + e.cost
        return d
    def negative_loop ( d , es , s , vl , el ) :
        negative = [ False ] * ( vl + 1 )
        for i in range ( vl ) :
            for e in es :
                if d [ e.from_i ] == INF :
                    continue
                if d [ e.to_i ] > d [ e.from_i ] + e.cost :
                    d [ e.to_i ] = d [ e.from_i ] + e.cost
                    negative [ e.to_i ] = True
            if negative [ e.from_i ] :
                negative [ e.to_i ] = True
        return negative [ vl ]
    return main
