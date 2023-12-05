def _import ( ) : return
import os
import sys
import os
import sys
import os
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.id = 1
        self.nb = 1
    def __init__ ( self , id1 , id2 , id ) :
        self.v1 = self.v1
        self.v2 = self.v2
        self.id = id
    def solve ( self , test_number , stdin , stdout ) :
        N = self.test_number
        M = self.test_number
        vertices = [ ]
        edges = [ ]
        for i in range ( N ) :
            vertices.append ( TaskDecayed ( i + 1 ) )
        for i in range ( M ) :
            edges.append ( TaskDecayed ( stdin.read ( ) , stdin.read ( ) , i ) )
        res = [ ]
        Nlong = N
        res.append ( Nlong * ( Nlong - 1 ) / 2l )
        for i in range ( M - 1 , - 1 , - 1 ) :
            res.append ( res [ i + 1 ] - union ( edges [ i ].v1 , edges [ i ].v2 ) )
        if res [ 0 ] != 0 :
            raise RuntimeError ( "Diff" )
        for i in range ( 1 , M + 1 ) :
            stdout.write ( res [ i ] )
    def union ( v1 , v2 ) :
        root_v1 = find_root ( v1 )
        root_v2 = find_root ( v2 )
        if root_v1 == root_v2 :
            return 0
        if root_v1.rank < root_v2.rank :
            tmp = root_v1
            root_v1 = root_v2
            root_v2 = tmp
        if root_v1.rank == root_v2.rank :
            root_v2.rank += 1
        res = root_v1.nb * root_v2.nb
        root_v1.parent = root_v2
        root_v2.nb += root_v1.nb
        return res
