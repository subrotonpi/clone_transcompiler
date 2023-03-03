def _import ( stream ) :
    import sys
    import io
    import os
    import sys
    import os
    import sys
    import os.path
    import sys
    import os.environ [ 'PATH' ]
    import os.environ [ 'PATH' ]
    import os.environ [ 'PATH' ]
    import sys
    import os.path
    import sys
    import os.environ [ 'PATH' ]
    import sys
    class Main ( stream ) :
        def readline ( self ) :
            try :
                rl = stream.readline ( )
                if isinstance ( rl , str ) :
                    rl = rl.decode ( 'utf-8' )
                return next ( rl )
            except StopIteration :
                raise
    class TaskD ( object ) :
        def solve ( self , test_number , stdin , stdout ) :
            n = sys.stdin.readline ( ).split ( ) [ 0 ]
            adj = [ [ ] for _ in range ( n ) ]
            for a , b in zip ( stdin.readline ( ) [ : - 1 ] , stdin.readline ( ) [ : - 1 ] ) :
                adj [ a ].append ( b )
                adj [ b ].append ( a )
            adj_leaves = [ 0 ] * n
            for i in range ( n - 1 ) :
                for j in adj [ i ] :
                    if len ( adj [ j ] ) == 1 :
                        adj_leaves [ i ] += 1
                if adj_leaves [ i ] >= 2 :
                    stdout.write ( 'First' )
                    return
            q = [ ]
            qt = 0
            qh = 0
            dead = [ ]
            leaf = [ ]
            for i in range ( n ) :
                for j in adj [ i ] :
                    if len ( adj [ j ] ) == 1 :
                        q.append ( i )
                        leaf.append ( True )
            deg = [ ]
            for i in range ( n ) :
                deg.append ( i )
            leaves = 0
            while qt < qh :
                v = q [ qt ]
                nv = - 1
                for i in adj [ i ] :
                    if len ( adj [ i ] ) == 1 :
                        q.append ( i )
            return deg
    return TaskD ( )
