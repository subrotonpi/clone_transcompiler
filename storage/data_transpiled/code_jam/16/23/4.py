def _import ( ) : return _import ( )
import sys
import io
import sys
import os
import sys
class C :
    def __init__ ( self ) :
        sc = io.open ( sys.stdin , 'r' )
        if self.n == 0 : return
        A , B = [ ] , [ ]
        for i in range ( n ) :
            A.append ( sc.next ( ) )
            B.append ( sc.next ( ) )
    def __init__ ( self ) :
        self.seq = [ ]
        self.seq.append ( seq )
    def read ( self ) :
        n = self.seq.pop ( )
        for i in range ( n ) :
            self.seq.append ( i )
    def id ( S ) :
        id = defaultdict ( int )
        for s in S :
            if s not in id :
                id [ s ] = len ( id )
        return id
    def solve ( self ) :
        id_A , id_B = id ( A ) , id ( B )
        s , t = [ ] , [ ]
        vs , us = [ ] , [ ]
        for i in range ( len ( id_A ) ) :
            vs.append ( ( ) )
            s.append ( vs [ i ] , 1 )
        for i in range ( len ( us ) ) :
            us.append ( ( ) )
            us.append ( ( t , 1 ) )
        for i in range ( n ) :
            vs [ id_A [ i ] ].append ( us [ id_B [ i ] ] , 1 )
        flow = dinic ( s , t )
        cover = len ( id_A ) + len ( id_B ) - flow
        print ( n - cover )
    INF = 1 << 29
    def dinic ( self ) :
        flow = 0
        for p in 1 :
            que = Queue ( )
            self.seq.append ( s )
            self.seq.append ( p )
            que.put ( s )
            while not que.empty ( ) :
                v = que.get ( )
                self.seq.append ( v )
                self.seq.append ( v )
        return flow
