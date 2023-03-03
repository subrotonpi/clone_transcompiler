def main ( ) :
    import sys
    from itertools import repeat
    class Main ( object ) :
        def __init__ ( self , S , E ) :
            self.S = S
            self.E = E
    class Main ( object ) :
        def __init__ ( self , S , E ) :
            self.S = S
            self.E = E
    pq = PriorityQueue ( N , EntryComparator ( ) )
    for i in range ( N ) :
        str = sc.next ( )
        se_str = str.split ( '-' )
        se = [ int ( i ) for i in se_str ]
        se = round_se ( se )
        pq.append ( ( se [ 0 ] , se [ 1 ] ) )
    check ( pq )
    def check ( self ) :
        ans = PriorityQueue ( len ( self.pq ) , EntryComparator ( ) )
        entry = pq.get ( )
        s = entry.S
        e = entry.E
        while not pq.empty ( ) :
            entry = pq.get ( )
            next_s = entry.S
            next_e = entry.E
            if e < next_s :
                ans.append ( ( s , e ) )
                s = next_s
                e = next_e
                continue
            if e < next_e :
                e = next_e
        ans.append ( ( s , e ) )
        while not ans.empty ( ) :
            entry = ans.get ( )
            out.write ( '%04d-%04d\n' % ( entry.S , entry.E ) )
    def round_se ( self , se ) :
        se [ 0 ] = se [ 0 ] - ( se [ 0 ] % 5 )
        if se [ 1 ] % 5 :
            se [ 1 ] = ( ( se [ 1 ] // 5 ) + 1 ) * 5
        if ( se [ 1 ] - 60 ) % 100 == 0 :
            se [ 1 ] = ( se [ 1 ] - 60 ) + 100
        return se
