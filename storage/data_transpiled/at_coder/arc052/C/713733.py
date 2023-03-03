def import _open
import sys
import random
class Main ( object ) :
    class Node ( object ) :
        def __init__ ( self ) :
            self.e = [ ]
            self.c = [ ]
        def __call__ ( self , * args , ** kwargs ) :
            sc = _open ( self.f , * args , ** kwargs )
            self.f = open ( self.f , * args , ** kwargs )
            self.N , self.M = sc.size
            node = [ Node ( ) for i in range ( self.N ) ]
            for c , a , b in zip ( sc.read ( ) , self.c ) :
                node [ a ].e.append ( b )
                node [ a ].c.append ( c )
                node [ b ].e.append ( a )
                node [ b ].c.append ( c )
    ans = [ ]
    ans.append ( long ( 0 ) )
    q = [ PriorityQueue ( ) for _ in range ( self.N ) ]
    q [ 0 ].append ( 0l )
    for i in range ( self.N ) :
        while len ( q [ i ] ) > 0 :
            cur = q [ i ].pop ( )
            cost = cur >> 14
            town = int ( cur & ( ( 1 << 14 ) - 1 ) )
            if ans [ town ] <= cost : continue
            ans [ town ] = cost
            for next in node [ town ].e :
                d = cost + ( 1 if next == 0 else i + 1 )
                t = i + node [ town ].c [ next ]
                if ans [ next ] > d :
                    q [ t ].append ( ( d << 14 ) | next )
    for i in range ( self.N ) :
        print ( ans [ i ] )
