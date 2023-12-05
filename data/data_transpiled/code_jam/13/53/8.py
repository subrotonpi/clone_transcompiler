def _import ( ) : return False
class C ( ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        N , M , P = sc.next ( )
        from , to = [ ] , [ ]
        while not que.empty ( ) :
            f = que.get ( )
            if f.v.min < f.d : continue
            for e in f.v :
                from , to = [ ] , [ ]
                for j in range ( M ) :
                    if e.to.min > d :
                        from , to = [ ] , [ ]
                for i in range ( M ) :
                    from .append ( i )
        res = [ ]
        for j in range ( N ) :
            res.append ( vs [ j ].min )
        return res
    def dij1 ( i ) :
        for v in vs :
            M = sc.next ( )
            P = sc.next ( )
            from , to = [ ] , [ ]
            for j in range ( M ) :
                from .append ( v )
            for i in range ( M ) :
                to.append ( v )
            for i in range ( M ) :
                from .append ( i )
    def run ( self ) :
        caseN = sc.next ( )
        for i in range ( 1 , P ) :
            path = [ ]
            for i in range ( M ) :
                path.append ( i )
    def debug ( self , * os ) :
        vs = [ ]
        for i in range ( N ) :
            vs.append ( [ ] )
        for i in range ( M ) :
            if not self.visit [ i ] and self.visit [ i ] :
                print ( self.visit [ i ] + 1 )
                return True
        print ( "Looks Good To Me" )
    def check ( self ) :
        min_d , max_d = dij1 ( self )
        can = [ ]
        for j in range ( N ) :
            can.append ( min_d [ j ] <= max_d [ j ] )
        s = to [ self.path [ i ] ]
        if not can [ s ] : return False
