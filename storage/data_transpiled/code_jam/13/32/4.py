def _gcJ_2013_C2 ( x , y ) :
    import os
    import math
    import os
    import os
    import os
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    class GCJ_2013_C2 ( subprocess ) :
        def solve ( self , x , y ) :
            s = ''
            for i in range ( abs ( x ) ) :
                if i < 0 :
                    s += 'EW'
                else :
                    s += 'WE'
            for i in range ( abs ( y ) ) :
                if i < 0 :
                    s += 'NS'
                else :
                    s += 'SN'
            return s
    fname = 'B_small'
    with open ( fname + '_in.txt' , 'r' ) as infile :
        with open ( fname + '_out.txt' , 'w' ) as outfile :
            outp = outfile.write
            T = len ( infile.readlines ( ) )
            for i in range ( 1 , T + 1 ) :
                x = infile.readlines ( ) [ 0 ]
                y = infile.readlines ( ) [ 0 ]
                outp.write ( 'Case #%d: %s\n' % ( i , solve ( x , y ) ) )
