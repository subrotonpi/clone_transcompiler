def _ import _ , os , sys , imp , readword , readword , verbose , verbose , verbose , filename , _ ) :
    import sys , sys , os
    from os import rename , readword , readword , verbose , filename
    from os import rename , readword , read
    class B ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( self.filename + ".in" , 'r' )
            self.stdout = open ( self.filename + ".out" , 'w' )
            self.INF = 100000000000.
        def solve ( self ) :
            length = int ( readword ( ) )
            n = int ( readword ( ) )
            a = [ int ( i ) for i in range ( n ) ]
            a.sort ( )
            m = a [ n - 1 ]
            list = [ [ ] for i in range ( m + 1 ) ]
            best = [ ]
            best.append ( INF )
            if length % m == 0 :
                sys.stdout.write ( "%d\n" % ( length / m ) )
                return
            best [ m - int ( length % m ) ] = 0
            list [ 0 ].append ( m - int ( length % m ) )
            for i in range ( 0 , m ) :
                j = 0
                while True :
                    if j >= len ( list [ i ] ) : break
                    if best [ list [ i ] [ j ] ] != i :
                        j += 1
                        continue
                    for k in range ( n ) :
                        cost = 1
                        if list [ i ] [ j ] + a [ k ] >= m :
                            cost = 0
                        pos = ( list [ i ] [ j ] + a [ k ] ) % m
                        if best [ pos ] > i + cost :
                            best [ pos ] = i + cost
                            list [ int ( best [ pos ] ) ].append ( pos )
                    j += 1
            if best [ 0 ] == INF :
                sys.stdout.write ( "IMPOSSIBLE\n" )
                return
            sys.stdout.write ( "%d\n" % ( length / m + 1 + best [ 0 ] ) )
    return B
