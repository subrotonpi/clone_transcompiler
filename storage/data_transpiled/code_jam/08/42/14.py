def _ import _ , os , sys , stdin , stdout , stderr , code , code , code , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , , , , , _ ) :
    from random import randint
    from os import urandom
    from os import urandom
    import random
    from os import urandom
    from random import random
    from time import clock
    from random import random
    from time import clock
    from random import random
    from time import time as clock
    from random import random
    class Solution ( object ) :
        def solve ( self ) :
            tc = randint ( 0 , count )
            for tt in range ( tc ) :
                n = randint ( 0 , count )
                m = randint ( 0 , count )
                a = randint ( 0 , count )
                out.write ( "Case #%d: " % ( tt + 1 ) )
                found = False
                outer :
                for x1 in range ( 0 , n ) :
                    for x2 in range ( 0 , n ) :
                        for y1 in range ( 0 , m ) :
                            for y2 in range ( 0 , m ) :
                                if abs ( x1 * y2 - x2 * y1 ) == a :
                                    out.write ( "0 0 %d %d %d %d\n" % ( x1 , y1 , x2 , y2 ) )
                                    found = True
                                    break outer
            if not found :
                out.write ( "IMPOSSIBLE\n" )
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        threading.Thread ( target = Solution ( 'b' ) ).start ( )
    global infile , stdout , stderr , code , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count , count ,