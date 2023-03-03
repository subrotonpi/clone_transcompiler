def import string , isPrime , isPrime , isPrime , verbose = False ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def read ( self ) :
            c = sys.stdin.read ( )
            while c >= 0 and c < '' : c = sys.stdin.read ( )
            if c < 0 : return ''
            yield c
            c = sys.stdin.read ( )
        def main ( self ) :
            with open ( self.input ) as f :
                out = open ( self.output , 'w' )
            tn = int ( readword ( ) )
            for i in range ( tn ) :
                out.write ( "Case #%d: " % ( i + 1 ) )
                solve ( )
            out.flush ( )
        def read ( self ) :
            return ''
        def write ( self , * args ) :
            with open ( self.input ) as f :
                for i in range ( n ) :
                    p = [ i ]
                    rank = [ ]
        def get ( v ) :
            if p [ v ] == v : return v
            else : return get ( p [ v ] )
        def join ( v1 , v2 ) :
            p1 = get ( v1 )
            p2 = get ( v2 )
            if p1 != p2 :
                if rank [ p1 ] > rank [ p2 ] :
                    p [ p2 ] = p1
                else :
                    p [ p1 ] = p2
                    if rank [ p1 ] == rank [ p2 ] :
                        rank [ p2 ] += 1
            return p
        primes = [ ]
        pr_count = 0
        max = 1100000
        def solve ( ) :
            a = int ( readword ( ) )
            b = int ( readword ( ) )
            dsu = DSU ( int ( b - a + 1 ) )
            k = int ( readword ( ) )
            for i in range ( k , max + 1 ) :
                if not isPrime ( i ) : continue
                current = ( b // i ) * i
                while True :
                    current1 = current - i
                    if current1 < a : break
                    dsu.join ( int ( current - a ) , int ( current1 - a ) )
                    current