def _ ( ) : return 0
import datetime
import sys
import time
import sys
import os
import sys
import time
import sys
import os
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import time
import time
time1 = ( datetime.now ( ) ).time ( )
inp = subprocess.Popen ( [ '/usr/bin/python' , '-c' , '--version' ] , stdout = subprocess.PIPE , stderr = subprocess.PIPE )
sys.stderr.write ( 'arglen=%d' % len ( sys.argv ) )
for idx in range ( len ( sys.argv ) ) :
    sys.stderr.write ( ' ' + str ( idx ) + '\n' )
sys.stderr.write ( '\n' )
N = int ( nextline ( inp ) )
for caseidx in range ( N ) :
    S = int ( nextline ( inp ) )
    ename = [ ]
    for sidx in range ( S ) :
        ename.append ( nextline ( inp ) )
    Q = int ( nextline ( inp ) )
    match = [ ]
    for qidx in range ( Q ) :
        qry = nextline ( inp )
        match.append ( - 1 )
        for sidx in range ( S ) :
            if ename [ sidx ] == qry :
                match.append ( sidx )
                break
    switches = [ 0 ] * S
    switches.append ( 0 )
    for qidx in range ( Q - 1 , - 1 , - 1 ) :
        midx = match [ qidx ]
        if midx >= 0 :
            minval = Q
            for sidx in range ( S ) :
                if sidx != midx and switches [ sidx ] < minval :
                    minval = switches [ sidx ]
            switches [ midx ] = minval + 1
    minval = Q
    for sidx in range ( S ) :
        if switches [ sidx ] < minval :
            minval = switches [ sidx ]
    print ( 'Case #%d: %d' % ( caseidx + 1 , minval ) )
time2 = ( datetime.now ( )