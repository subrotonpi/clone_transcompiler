def import os
import sys
import os
import sys
import itertools
import itertools
import os
import sys
import itertools
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.so = sys.stdout
    def __call__ ( self , * args ) :
        n = len ( args )
        m = len ( args )
        g = [ [ ] for _ in range ( n ) ]
        for u , v in itertools.product ( range ( m ) , range ( n ) ) :
            g [ u ] [ v ] = 1
            g [ v ] [ u ] = 1
    visited = [ False ] * n
    count = 0
    for i in range ( n ) :
        if visited [ i ] :
            continue
        deq = deque ( )
        tree = set ( )
        deq.append ( i )
        tree.add ( i )
        has_circle = False
        while not deq.empty ( ) :
            current = deq.pop ( )
            visited [ current ] = True
            for j in range ( n ) :
                if visited [ j ] :
                    continue
                if g [ current ] [ j ] == 1 :
                    if j in tree :
                        has_circle = True
                    deq.append ( j )
                    tree.add ( j )
        if not has_circle :
            count += 1
    print ( count )
