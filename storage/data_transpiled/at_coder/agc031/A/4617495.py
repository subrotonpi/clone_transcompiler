def import _readline
import readline
import readline
import sys
import readline
import readline
import time
import sys
import tokenize
import os
import sys
import os
import getopt
import os
MOD = 1000000007
def main ( ) :
    sc = MyScanner ( )
    f = open ( sys.stdout , 'w' )
    N = sc.__next__ ( )
    vals = sc.next ( ).split ( ' ' )
    cant = [ 0 ] * 26
    for i in vals :
        cant [ i - 'a' ] += 1
    ans = 1
    for i in cant :
        ans *= 1 + i
        ans %= MOD
    ans += MOD - 1
    ans %= MOD
    f.write ( ans )
    f.flush ( )
