def round_1A2016 ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from itertools import count
    class C ( object ) :
        def __init__ ( self ) :
            self.T = count ( )
    for case in range ( 1 , T + 1 ) :
        _ , n = next ( itertools.ifilter ( lambda x : x > 1 , range ( n ) ) )
        bff = [ ]
        has_incoming = [ ]
        for i in range ( n ) :
            bff.append ( i - 1 )
            has_incoming.append ( True )
        loop = [ ]
        max_period = 0
        for i in range ( n ) :
            visited = [ ]
            cur = 0
            index = [ ]
            j = i
            while not visited [ j ] :
                visited.append ( True )
                index.append ( j )
                cur += 1
                j = bff [ j ]
            period = cur - index [ j ]
            for k in range ( period ) :
                loop.append ( period )
                j = bff [ j ]
            max_period = max ( max_period , period )
        max_chain = [ ]
        for i in range ( n ) :
            if has_incoming [ i ] :
                continue
            j = i
            chain = 0
            while loop [ j ] == 0 :
                chain += 1
                j = bff [ j ]
            max_chain.append ( max ( max_chain [ j ] , chain ) )
        sum = 0
        for i in range ( n ) :
            if loop [ i ] == 2 :
                sum += 1 + max_chain [ i ]
        print ( "Case #%d: %d\n" % ( case , max ( sum , max_period ) ) )
