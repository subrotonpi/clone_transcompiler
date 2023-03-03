def _import ( ) :
    import os
    import sys
    import os
    import itertools
    import itertools
    import os
    import itertools
    import itertools
    import os
    import sys
    import itertools
    def main ( ) :
        global stream
        stream = sys.stdin
        stream = open ( stream , 'w' )
        stream.seek ( 0 )
        stream.read ( )
        stream.seek ( 0 )
        stream.read ( )
        stream.seek ( 0 )
        stream.read ( )
        stream.seek ( 0 )
        stream.read ( )
        stream.close ( )
    def read_tree ( n , stream ) :
        global deg
        deg = [ ]
        for i in range ( n - 1 ) :
            a = [ ]
            deg.append ( [ i ] )
            deg.append ( [ a ] )
            deg.append ( [ i ] )
    def solve ( test_number , stream , stream ) :
        n = next ( stream )
        global ls
        global rs
        ls = [ ]
        rs = [ ]
        for i in range ( n ) :
            a = [ ]
            deg.append ( [ i ] )
        for i in range ( n ) :
            a.append ( [ ] )
        fixed = [ True ] * n
        ls = [ ]
        rs = [ ]
        for v in range ( n ) :
            if not fixed [ v ] :
                continue
            seg = dfs ( v , - 1 , a [ v ] , a [ v ] )
            if seg is None :
                stream.write ( "No" )
                return
            paint ( v , - 1 , a [ v ] )
        stream.write ( "Yes" )
        for i in range ( n ) :
            stream.write ( a [ i ] )
    def dfs ( v , p , l , r ) :
        global ls
        cl = l
        cr = r
        for u in adj [ v ] :
            if u == p :
                continue
            if not fixed [ u ] :
                seg = dfs ( u , v , l - 1 , r + 1 )
            if not seg :
                return None
            cr = min ( l , r )
        return cr
    return solve ( )
