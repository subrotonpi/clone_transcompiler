def import import sys
import os
import math
import math
import math
import os
import sys
import math
import sys
import math
import sys
import os
import sys
import sys
import os
sys.path.append ( os.path.join ( os.path.dirname ( sys.argv [ 0 ] ) , '..' ) )
f = open ( 'chain.in' , 'r' )
sys.path.append ( os.path.join ( os.path.dirname ( sys.argv [ 0 ] ) , '..' ) )
f.close ( )
sys.path.append ( os.path.join ( os.path.dirname ( sys.argv [ 0 ] ) , '..' ) )
f = open ( 'chain.out' , 'w' )
test = int ( f.readline ( ) )
for i in range ( 1 , test + 1 ) :
    f.write ( 'Case #%d: ' % i )
    line = f.readline ( ).split ( )
    switches = int ( math.pow ( 2 , int ( line [ 0 ] ) ) )
    claps = int ( line [ 1 ] )
    if ( claps + 1 ) % switches == 0 :
        f.write ( 'ON\n' )
    else :
        f.write ( 'OFF\n' )
