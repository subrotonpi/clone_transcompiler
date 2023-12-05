def _ _ main _ _ ( ) : return sys.argv [ 1 ]
import random
import sys
import os
import sys
import os
import string
import string
import string
import random
import string
import string
import random
import string
import random
import string
import sys
import sys
import subprocess
import subprocess
import subprocess
import tempfile
import os
import sys
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import time
import time
def init_FileIO ( large = True ) :
    global _large_attempt0
    global _large_attempt0
    _large_attempt0 = 0
    for cas in range ( 1 , cases + 1 ) :
        R = randint ( 0 , R )
        C = randint ( 0 , C )
        map = [ ]
        for i in range ( R ) :
            map.append ( next ( _large_attempt0 ) )
        can = True
        for i in range ( len ( map ) ) :
            for j in range ( len ( map [ 0 ] ) ) :
                if map [ i ] [ j ] == '#' :
                    if i + 1 < R and j + 1 < C and map [ i + 1 ] [ j ] == '#' and map [ i + 1 ] [ j + 1 ] == '#' :
                        map [ i ] [ j ] = '/'
                        map [ i + 1 ] [ j ] = ' \ \'
                        map [ i + 1 ] [ j + 1 ] = ' \ \'
                        map [ i + 1 ] [ j + 1 ] = '/'
                    else :
                        can = False
        print ( "Case #%d:" % cas )
        if can :
            for c in map :
                print ( string.join ( map [ c ] ) )
        else :
            print ( "Impossible" )
