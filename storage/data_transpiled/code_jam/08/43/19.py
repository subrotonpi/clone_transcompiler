def round2 ( ) :
    import os
    import glob
    import os
    import math
    import os
    import os
    import math
    import os
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import tempfile
    import os
    import random
    import random
    import math
    from math import sin , cos , sin , cos , cos , sin , cos , cos , sin , cos , cos , sin , cos , cos , sin , cos , cos , sin , cos , cos , sin , cos , cos , sin , cos , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , , cos , , sin , , ]
    sc = open ( input , "r" )
    ps = open ( output , "w" )
    tc = int ( sc.read ( ) )
    for test in range ( 1 , tc + 1 ) :
        n = int ( sc.read ( ) )
        x1 , x2 , x3 , p = [ random.randint ( 0 , n ) for i in range ( n ) ]
        smin , smax = 0.000000 , 1000000
        while smax - smin > 1e-8 :
            mid = smax + smin
            mid //= 2
            can = True
            for i in range ( n ) :
                for j in range ( i + 1 , n ) :
                    dist = abs ( x1 [ i ] - x2 [ j ]