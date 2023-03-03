def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.read ( ) )
            self.k = int ( sys.stdin.read ( ) )
            x = [ ]
            pq = Queue ( k , key = self.n )
            dict = { }
            for i in range ( n ) :
                tmp = sc.read ( )
                dict [ tmp ] = i + 1
                x.append ( tmp )
                if i < k :
                    pq.put ( tmp )
            print ( dict [ pq.peek ( ) ] )
            for i in range ( k , n ) :
                t = x [ i ]
                if pq.peek ( ) > t :
                    pq.put ( t )
                    pq.poll ( )
                print ( dict [ pq.peek ( ) ] )
