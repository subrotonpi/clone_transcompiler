def import _gen_list
import collections
import os
import sys
class Main ( object ) :
    def __init__ ( self , v ) :
        self.L = v
        def grundy ( v ) :
            for i in range ( 60 ) :
                if ( ( v >> i ) & 1 ) == 1 : return ( 1 << i )
            return 0
    class Node :
        def __init__ ( self , d ) :
            self.depth = 0
        def add ( self , i ) : self.next.append ( ( self.depth + 1 , i ) )
    def main ( self ) :
        with open ( self.path , 'r' ) as f :
            N = f.readline ( ).strip ( )
    L = Node ( - 1 )
    root = Node ( - 1 )
    trees = { L : 2 }
    for s in _gen_list ( N ) :
        r = root
        first = - 1
        for n in s :
            n = n - '0'
            if r.next [ n ] is None :
                r.add ( n )
                r = r.next [ n ]
                if first < 0 :
                    first = L - r.depth
                    trees [ L - r.depth ] = trees [ L - r.depth ] - 1
                else :
                    if L - r.depth not in trees :
                        trees [ L - r.depth ] = 0
                    trees [ L - r.depth ] = trees [ L - r.depth ] + 1
            else :
                r = r.next [ n ]
    grn = 0
    for n , t in trees.items ( ) :
        if long ( t ) % 2 == 1 :
            grn ^= grundy ( long ( n ) )
    print ( grn == 0 and "Bob" or "Alice" )
