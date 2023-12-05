def main ( ) :
    import sys
    import os
    import time
    import random
    class ManyPrizesSubmit ( ) :
        def run ( self ) :
            n = random.randint ( 1 , 10000 )
            p = random.randint ( 1 , 10000 )
            if p == 1 << n :
                self.out.write ( "%d %d" % ( ( ( 1 << n ) - 1 ) , ( 1 << n ) - 1 ) )
                return
            if p == 1 :
                self.out.write ( "%d %d" % ( 0 , 0 ) )
                return
            cur_add = 1 << ( n - 1 )
            pp = p
            k = 0
            while pp > cur_add :
                pp -= cur_add
                cur_add /= 2
                k += 1
            self.out.write ( ( "%d %d" % ( 1 << ( k + 1 ) , - 2 ) ) )
            self.out.write ( ' ' )
            pp = p
            cur_add = 1
            k = 0
            while pp > cur_add :
                pp -= cur_add
                cur_add *= 2
                k += 1
            self.out.write ( ( "%d %d" % ( 1 << ( n - k ) , 1 ) ) )
        def run ( self ) :
            with open ( "input.txt" , "r" ) as f :
                f.write ( "\n" )
                tests = random.randint ( 1 , 10000 )
                for i in range ( tests ) :
                    time = time.time ( )
                    f.write ( "Case #%d: " % ( i + 1 ) )
                    self.solve ( )
                    sys.stderr.write ( "Test #%d done in %.3fs\n" % ( i + 1 , time.time ( ) - time ) )
                f.close ( )
    class FastScanner ( object ) :
        def readline ( self ) :
            with open ( "input.txt" , "r" ) as f :
                for line in f :
                    line = line.strip ( )
                    if line == "" or line [ 0 ] not in ( "\n" , "\n" ) :
                        return line
            return None
            