def _import ( ) : return 0 <= x < m and 0 <= y < n
def main ( args ) :
    with open ( 'A-large.txt' , 'w' ) as sc :
        ntest = sc.randint ( 1 , n )
        print ( ntest )
        for test in range ( 1 , m ) :
            print ( test )
        m = sc.randint ( 1 , n )
        a = [ ]
        for i in range ( m ) :
            a.append ( sc.readline ( ) )
        for i in range ( n ) :
            if a [ i ] == 'x' or a [ i ] == 'w' :
                a [ i ] = 'o'
        st = { }
        for i in range ( m ) :
            if a [ i ] == 'x' or a [ i ] == 'w' :
                a [ i ] = 'o'
        st = { }
        for i in range ( n ) :
            if a [ i ] == 'x' or a [ i ] == 'w' :
                a [ i ] = 'o'
        st.sort ( )
        q = { }
        map = defaultdict ( lambda : [ ] )
        q.append ( st )
        map [ st ] = 0
        res = - 1
        while not q.empty ( ) :
            u = q.pop ( )
            step = map.get ( u )
            if u == en :
                res = step
                break
        mark = [ ]
        for i in range ( m ) :
            r = { }
            r [ i ] = { }
            r [ i ] [ u ] [ y ] = True
            for i in range ( len ( a ) ) :
                r [ i ] = a [ i ] [ u ] [ i ]
            return r
        def is_connected ( ) :
            mark = [ ]
            for i in range ( m ) :
                u = q.pop ( )
                for v in mark :
                    if not mark [ v ] and a [ i ] [ v ] == '.' and not mark [ v ] [ uu ] and a [ i ] [ vv ] == '.' :
                        mark [ v ] = True
                        q.append ( v )
                