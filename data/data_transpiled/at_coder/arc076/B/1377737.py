def _import ( * os ) : return os.path.join ( * os )
import math
import os
import os
import collections
class Main ( object ) :
    def mod ( self ) : self.id = 1000000007
    def main ( self , id1 , id2 ) : return self.id [ id1 ]
    def union ( self , p ) :
        i = self.id [ 0 ]
        if i == 0 or not self.id [ i ] :
            self.id [ i ] = j
        else :
            self.id [ i ] += sz [ j ]
    def read ( self ) :
        sc = open ( self.id [ 0 ] , 'r' )
        out = sys.stdout
        n = sc.read ( )
        ans = 0
        px = [ ]
        py = [ ]
        dx = [ ]
        dy = [ ]
        for i in range ( n ) :
            dx.append ( Q ( sc.read ( ) , i ) )
            dy.append ( Q ( sc.read ( ) , i ) )
        sort ( dx )
        sort ( dy )
        que = [ ]
        for i in range ( n - 1 ) :
            que.append ( P ( abs ( dx [ i + 1 ].diff - dx [ i ].diff ) , dx [ i ].id , dx [ i + 1 ].id ) )
            que.append ( P ( abs ( dy [ i + 1 ].diff - dy [ i ].diff ) , dy [ i ].id , dy [ i + 1 ].id ) )
        uf = QuickUnionWeighted ( n )
        for i in range ( 2 ** ( n - 1 ) ) :
            p = que.pop ( )
            if uf.connected ( p.id1 , p.id2 ) : continue
            ans += p.diff
            uf.union ( p.id1 , p.id2 )
            if uf.sz ( p.id1 ) == n : break
        out.write ( ans )
        out.flush ( )
    def db ( * os ) :
        print ( "".join ( os ) , file = sys.stderr )
    def validpos ( x , y , r , c ) :
        return x < r and 0 <= x < c and 0 <= y < c
