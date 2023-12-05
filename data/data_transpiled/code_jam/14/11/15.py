def import _main
import os
import sys
import os
import sys
import random
import string
import sys
import os
import sys
import os
import subprocess
import subprocess
import subprocess
import subprocess
import sys
import os
import sys
import subprocess
import subprocess
import subprocess
import sys
import os
import sys
import os
import sys
import os
sys = subprocess
try :
    with open ( 'input.txt' , 'r' ) as f :
        sys.stdout = f
except IOError :
    pass
else :
    sys.stdout = sys.__stdout__
    sys.stderr = sys.__stderr__
tests = int ( sys.argv [ 1 ] )
for i in range ( tests ) :
    n = sys.argv.index ( 'n' )
    l = sys.argv.index ( 'l' )
    devices = [ os.path.split ( p ) [ 0 ] for p in subprocess.Popen ( [ './dev' , '-l' ] , shell = False , stdout = subprocess.PIPE , stderr = subprocess.STDOUT , stdout = subprocess.PIPE , stderr = subprocess.STDOUT , stdout = subprocess.PIPE , stderr = subprocess.STDOUT , ).stdout.read ( ).decode ( 'utf-8' ).split ( '\n' ) [ 0 ]
    sources = [ p for p in devices if p != l ]
    resultSet = set ( [ p for p in devices if p != l ] )
    lowest = 1000
    for p in sources :
        diff = p ^ devices [ 0 ]
        current_set = set ( [ p for p in sources if p != lowest ] )
        if current_set == resultSet :
            lowest = min ( lowest , _main ( p ) )
    subprocess.call ( [ 'case #%d: %s\n' % ( i + 1 , lowest or 1000 ) ] )
os.remove ( 'output.txt' )
