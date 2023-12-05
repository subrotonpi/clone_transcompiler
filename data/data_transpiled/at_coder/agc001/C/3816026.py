def import _sys , *
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        self.edge = [ ]
        ab = [ ]
        for i in range ( n ) :
            self.edge.append ( [ ] )
        for a , b in _sys.argv [ 1 : ] :
            self.edge [ a ].append ( b )
            self.edge [ b ].append ( a )
            ab.append ( [ a , b ] )
        self.closed = False
        if k == 1 :
            print ( self.n - 2 )
            return
        ans = sys.maxsize
        if k % 2 == 0 :
            for i in range ( self.n ) :
                ans = min ( ans , _count_del_num ( i , i ) )
        else :
            for i in range ( self.n - 1 ) :
                ans = min ( ans , _count_del_num ( ab [ i ] [ 0 ] , ab [ i ] [ 1 ] ) + _count_del_num ( ab [ i ] [ 1 ] , ab [ i ] [ 0 ] ) - n )
        print ( ans )
    def count_del_num ( root , root2 ) :
        count = self.n
        que = deque ( )
        use = [ ( root , 0 ) ]
        use [ root ] = True
        use [ root2 ] = True
        while que :
            cur = que.popleft ( )
            if cur [ 1 ] > self.k / 2 :
                break
            for i in range ( len ( self.edge [ cur [ 0 ] ] ) ) :
                next = self.edge [ cur [ 0 ] ] [ i ]
                if not use [ next ] :
                    que.append ( ( next , cur [ 1 ] + 1 ) )
                    use [ next ] = True
        self.count -= 1
Note :._ sys.__globals__.append ( Main )
#uses or unsafe operations: with-Xlint details.
