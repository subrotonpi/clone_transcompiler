def _import ( base , cap ) :
    import Queue
    import sys
    import getopt
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
            self.args = args
        def __call__ ( self , * args ) :
            super ( Main , self ).__call__ ( * args )
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
        def mf ( self , * args ) :
            n = len ( self.args )
            flow = [ 0 ] * n
            ret = 0
            s = self.args [ - 2 ]
            t = self.args [ - 1 ]
            while True :
                pre = [ - 1 ] * n
                q = deque ( )
                q.append ( s )
                out :
                while not q.empty ( ) :
                    v = q.popleft ( )
                    for i in range ( n ) :
                        if cap [ v ] [ i ] - flow [ v ] [ i ] <= 0 or pre [ i ] [ i ] != - 1 or i == s :
                            continue
                        pre [ i ] = v
                        if i == t :
                            break
                        q.append ( i )
                if pre [ t ] == - 1 :
                    break
                inc = sum ( [ i for i in range ( t , s ) if i != - 1 ] ) / 3
                for i in range ( t , s ) :
                    inc = min ( inc , cap [ pre [ i ] ] [ i ] - flow [ pre [ i ] ] [ i ] )
                for i in range ( t , s ) :
                    flow [ pre [ i ] ] [ i ] += inc
                    flow [ pre [ i ] ] [ i ] -= inc
                ret += inc
            return ret
    def run ( self ) :
        sc = iter ( self )
        n = sc.count ( )
        a = [ ]
        base = 0
        for i in range ( n ) :
            a.append ( sc.get ( i ) )
            if a [ i ] :
                base += a [ i ]
    return Main ( )
