def import locale
import locale
import sys
import os
import locale
import sys
import locale
import os
import sys
def dfs ( x ) :
    u = [ True ]
    for y in range ( nb ) :
        if not d [ x ] or not p [ y ] and dfs ( y ) :
            p [ y ] = x
            return True
    return False
def run ( ) :
    f = open ( 'C-large.in' , 'r' )
    f = open ( 'C-large.out' , 'w' )
    tn = os.lstat ( f.fileno ( ) ).st_size
    for test in range ( 1 , tn + 1 ) :
        print ( test , file = sys.stderr )
        n = os.lstat ( f.fileno ( ) ).st_size
        a = { }
        b = { }
        d = { }
        for wa , wb in f.split ( '\n' ) :
            if wa in a :
                ia = a [ wa ]
            else :
                ia = len ( a )
                a [ wa ] = ia
            if wb in b :
                ib = b [ wb ]
            else :
                ib = len ( b )
                b [ wb ] = ib
            d [ ia ] [ ib ] = True
        na = len ( a )
        nb = len ( b )
        p = [ - 1 ] * nb
        u = [ False ] * na
        ans = n - na - nb
        for i in range ( na ) :
            u [ i ] = False
            if dfs ( i ) :
                ans += 1
        print ( 'Case #%d: %d' % ( test , ans ) )
    f.close ( )
import sys
import os
import locale
import sys
import os
import subprocess
import tempfile
p = os.listdir ( 'C-large.in' )
os.chdir ( 'C-large.out' )
print ( file = sys.stderr )
print ( file = sys.stderr )
print ( file = sys.stderr )
print ( file = sys.stdout )
print ( file = sys.stderr )
print ( file = sys.stderr )
print ( file = sys.stderr )
