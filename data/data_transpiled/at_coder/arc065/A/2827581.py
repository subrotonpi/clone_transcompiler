def _import ( ) : return sys.stdin.readline ( )
import readline
import time
import sys
import termios
import struct
import string
import string
import string
import string
import string
import string
import string
import sys
import string
import string
import string
import string
import sys
import string
import string
import string
import string
import sys
import getopt
qq = int ( sys.maxsize )
for casenum in range ( 1 , qq + 1 ) :
    s = string.split ( string.strip ( ) )
    good = ( 'dream' , 'dreamer' , 'erase' , 'eraser' )
    poss = [ True ] * ( len ( s ) + 1 )
    for i in range ( len ( s ) ) :
        if not poss [ i ] :
            continue
        for out in good :
            if i + len ( out ) > len ( s ) :
                continue
            match = 0
            for a in out :
                if a == s [ i + a ] :
                    match += 1
            if match == len ( out ) :
                poss [ i + match ] = True
    print ( 'YES' if poss [ len ( s ) ] else 'NO' )
def exit_immediately ( ) :
    tty.tcsetattr ( sys.stdout , tty.TCSAFLUSH , stdout )
    sys.stdout.flush ( )
def read_long ( ) :
    return long ( read_token ( ) )
def read_double ( ) :
    return float ( read_token ( ) )
def read_int ( ) :
    return int ( read_token ( ) )
def readline ( ) :
    while not sys.stdin.isatty ( ) or not sys.stdout.isatty ( ) :
        sys.stdin.readline ( )
    return os.readlink ( readline )
