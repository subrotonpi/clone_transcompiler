def SPACETOKEN project SPACETOKEN = SPACETOKEN 'QR2017B' STRNEWLINE SPACETOKEN """
import os
import sys
import math
import os
import time
import sys
import os
import sys
import os
import tempfile
import tempfile
import tempfile
import os
import time
import sys
import os
import tempfile
import tempfile
import tempfile
import os
import sys
import tempfile
import os
import time
import time
start_time = time.time ( )
try :
    f = open ( ' QR2017B.in ' , ' r' )
    out = tempfile.TemporaryFile ( )
    str_num_tests = f.readline ( )
    num_tests = int ( str_num_tests )
    N = [ ]
    for case in f :
        case.strip ( )
        N.append ( long ( case ) )
    for i in range ( num_tests ) :
        result , index = calculate_num ( N [ i ] )
        out.write ( ' Case SPACETOKEN # % d : SPACETOKEN % s \n ' % ( index , result ) )
    out.flush ( )
    out.close ( )
    end_time = time.time ( )
    time_in_sec = ( end_time - start_time )
    print ( ' problem SPACETOKEN solved SPACETOKEN in SPACETOKEN secs : ' , time_in_sec )
