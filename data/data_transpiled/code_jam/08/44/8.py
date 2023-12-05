def import readline
import sys
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import sys
import locale
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import getpass
import readline
import readline
import readline
import sys
import time
import time
def calc ( ) :
    res = 1
    last_char = readline.getuser ( )
    for i in range ( 1 , len ( readline.split ( ) ) ) :
        if last_char != readline.split ( ) [ - 1 ] :
            res += 1
            last_char = readline.split ( ) [ - 1 ]
    return res
def rec ( dep ) :
    if dep == n :
        result = min ( result , calc ( ) )
        return result
    for i in range ( n ) :
        if not vis [ i ] :
            vis [ i ] = True
            perm [ dep ] = i
            rec ( dep + 1 )
            vis [ i ] = False
def solve ( ) :
    n = iread ( )
    vis = [ False ] * n
    perm = [ ] * n
    s = readword ( )
    result = 100000000
    rec ( 0 )
    stdout.write ( result + "\n" )
def iread ( ) :
    return int ( readword ( ) )
def dread ( ) :
    return float ( readword ( ) )
def lread ( ) :
    return long ( readword ( ) )
def readword ( ) :
    c = readline.getuser ( )
    while c >= '' :
        c = readline.getuser ( )
    if c < 0 : return ''
    yield c
    while c > '' :
        c = readline.getuser ( )
    return ''.join ( [ c for c in solve ( ) ] )
