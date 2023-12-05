def import import os , glob
import os
import glob
import os
import math
import random
import random
import time
import glob
import os
import sys
path = os.path.expanduser ( '~/D:\\/B-large' )
with open ( path + '.in' ) as f :
    with open ( path + '.out' , 'w' ) as f :
        testcases = glob.glob ( path + '.in' )
        for case in range ( 1 , testcases + 1 ) :
            E , R , n = random.randint ( 1 , 10 )
            v = glob.glob ( path + '.in' )
            res = 0
            energy = E
            for i in range ( n ) :
                cur = energy
                for j in range ( i + 1 , n ) :
                    if v [ j ] > v [ i ] :
                        d = j - i
                        regeneration = d * R
                        y = regeneration - ( E - energy )
                        cur = min ( y , energy )
                        cur = max ( cur , 0 )
                        break
            res += cur * v [ i ]
            energy = min ( energy - cur + R , E )
        print ( 'Case #%d: %f' % ( case , res ) )
        f.flush ( )
