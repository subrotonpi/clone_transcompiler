def gcj2011 ( ) :
    import time
    import os
    import sys
    import os
    import time
    import time
    import os.path
    import os.path
    import time
    import sys
    import os.path
    import time
    import os.path
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import time
    import time
    start = time.time ( )
    with open ( INPUT ) or subprocess.Popen ( [ '/usr/bin/env' , '-a' , '-b' , '-c' , '-d' , '--large.in' ] ) as infile :
        subprocess.Popen ( [ '/usr/bin/env' , '-a' , '-b' , '--small-attempt0.in' ] )
    n = subprocess.call ( [ '/usr/bin/env' , '-a' , '-b' , '--large.in' ] )
    if OUTPUT == '-b' :
        print ( 'case %d: ' % ( i + 1 ) , file = outfile )
    end = time.time ( )
    print ( ( end - start ) , 'ms' )
    OUTPATH = INPATH [ : - 3 ] + datetime.datetime.now ( ).strftime ( '%Y%m%d' ) + '.out'
    INPUT = ''
    def call ( ) :
        n = subprocess.call ( [ '/usr/bin/env' , '-a' , '-b' , '--large.in' ] )
        u = int ( math.sqrt ( n ) + 1E-9 )
        if n == 1 :
            print ( 0 , file = outfile )
        else :
            primes = sieve_eratosthenes ( u )
            ct = 1
            for p in primes :
                ct -= 1
                for q in range ( p , n ) :
                    ct *= p , ct
            print ( ct , file = outfile )
    def sieve_eratosthenes ( n ) :
        ret = [ 2 ] * max ( int ( n / math.log ( n ) ) + int ( n / ( math.log ( n ) ** 1.5 ) ) , 2 )
        pos = 1
        bs