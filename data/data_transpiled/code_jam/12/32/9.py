def main ( ) :
    import os
    import sys
    import random
    import random
    import sys
    import os
    import random
    import sys
    class R1CB ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( 'B-large.in' , 'r' )
            self.stdout = open ( 'output.out' , 'w' )
            self.t = random.randint ( 1 , 4 )
            for i in range ( self.t ) :
                self.stdout.write ( 'Case #%s: ' % str ( i + 1 ) )
                self.stdout.write ( '\n' )
                d = random.random ( )
                n = random.randint ( 1 , 4 )
                acc = random.randint ( 1 , 4 )
                times = [ random.random ( ) for i in range ( n ) ]
                dist = [ random.random ( ) for i in range ( n ) ]
                for j in range ( acc ) :
                    a = random.random ( )
                    k = 0
                    for q in range ( n ) :
                        t1 = times [ q ]
                        x = dist [ q ]
                        if x > d :
                            t4 = 0
                            d4 = 0
                        else :
                            t4 = times [ q - 1 ]
                            d4 = dist [ q - 1 ]
                        t1 = t4 + ( times [ q ] - t4 ) * ( d - d4 ) / ( dist [ q ] - d4 )
                        q = n
                        x = d
                    k1 = t1 - random.sqrt ( 2 * x / a )
                    if k1 > k :
                        k = k1
                k += random.sqrt ( 2 * d / a )
                self.stdout.write ( str ( k ) )
                self.stdout.write ( '\n' )
                self.stdout.flush ( )
