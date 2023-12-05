def main ( ) :
    import sys
    import os
    import re
    import sys
    import sys
    import os
    import sys
    import sys
    import random
    import time
    import random
    import sys
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import tempfile
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import tempfile
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import tempfile
    from time import time
    import time
    N = int ( os.environ [ 'NUMBER' ] )
    for i in range ( 1 , N + 1 ) :
        tz = subprocess.Popen ( [ 'a' , 'b' , 'c' ] , stdout = subprocess.PIPE , stderr = subprocess.STDOUT ).stdout.read ( ).split ( '\n' )
        m , v = [ int ( tz.pop ( 0 ) ) for tz in tz ]
        g = [ 0 ] * ( m - 1 )
        c = [ 0 ] * ( m - 1 )
        for tz2 in subprocess.Popen ( [ 'a' , 'b' , 'c' ] , stdout = subprocess.PIPE , stderr = subprocess.STDOUT ).stdout.read ( ).split ( '\n' ) :
            g [ tz2 ] = [ int ( tz.pop ( 0 ) ) for tz in tz2 ]
            c [ tz2 ] = [ int ( tz.pop ( 1 ) ) == 1 ]
        inf = 10000000
        tr = [ [ 0 , inf ] * m , [ inf , inf ] ]
        for j in range ( len ( g ) - 1 , - 1 , - 1 ) :
            tr.append ( [ 0 , inf ] )
            for l in range ( 0 , 1 ) :
                for r in range ( 0 , 1 ) :
                    z = tr [ 2 * j + 1 ] [ l ] + tr [ 2 * j + 2 ] [ r ]
                    and , or = l & r , l | r
                    if g [ j ] == 1 :
                        tr [ j ] [ and : or ] = min ( tr [ j ] [ and : or ] , z )
                    else :
                        tr [ j ] [ or :