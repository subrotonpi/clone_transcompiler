def round1b ( ) :
    import os
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    class A ( object ) :
        def __init__ ( self ) :
            self.io = Kattio ( open ( 'src/round1b/A-large.in' , 'rb' ) , open ( 'src/round1b/A-large.out' , 'wb' ) )
            cases = self.io.read ( )
            for i in range ( 1 , cases + 1 ) :
                self.io.write ( 'Case #%d: ' % i )
                solve ( self.io )
            self.io.close ( )
        def solve ( self , io ) :
            mysize = self.io.read ( )
            n = self.io.read ( )
            size = [ self.io.read ( ) for _ in range ( n ) ]
            size = [ self.size [ i ] for i in size ]
            if mysize == 1 :
                self.io.write ( n )
                return
            best = sum ( 0 )
            for rem in range ( 0 , n + 1 ) :
                cur , added = mysize , 0
                for i in range ( n - rem ) :
                    if cur <= size [ i ] :
                        cur += ( cur - 1 )
                        added += 1
                        i -= 1
                    else :
                        cur += size [ i ]
                best = min ( best , rem + added )
            self.io.write ( best )
    return A ( )
