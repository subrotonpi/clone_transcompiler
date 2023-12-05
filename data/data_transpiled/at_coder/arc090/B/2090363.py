def main ( ) :
    import sys
    from itertools import count , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    n = chain ( repeat ( n ) , repeat ( m ) )
    uf = chain ( chain ( n ) , repeat ( n ) )
    ok = True
    for i in chain ( range ( m ) , repeat ( n ) ) :
        ok = ok and uf.union ( chain ( i - 1 , i - 1 , i ) )
    if ok :
        print ( 'Yes' )
    else :
        print ( 'No' )
    class UnionFind ( object ) :
        def __init__ ( self , num ) :
            self.parent = [ ]
            for i in range ( num ) :
                self.parent.append ( i )
            self.rank = [ ]
            self.distance_from_root = [ ]
        def find ( self ) :
            if self.parent [ num ] == num :
                return self.parent [ num ]
            else :
                return self.find ( self.parent [ num ] )
        def distance_from_root ( self ) :
            if self.parent [ num ] == num :
                return 0
            else :
                return self.distance_from_root ( self.parent [ num ] ) + self.distance_from_root [ num ]
        def union ( self , l , r , d ) :
            l_root = find ( l )
            r_root = find ( r )
            if l_root == r_root :
                if self.distance_from_root ( r ) - self.distance_from_root ( l ) == d :
                    return True
                else :
                    return False
            elif self.rank [ l_root ] < self.rank [ r_root ] :
                self.parent [ l_root ] = r_root
                distance_from_root [ l_root ] = - d - self.distance_from_root ( l ) + self.distance_from_root ( r )
            elif self.rank [ l_root ] > self.rank [ r_root ] :
                self.parent [ r_root ] = l_root
                distance_from_root [ r_root ] = d - self.distance_from_root ( r ) + self.distance_from_root ( l )
                rank [ l_root ]