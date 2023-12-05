def _ import SPACETOKEN os.path
import os
import sys
import os
import getopt
import os
import getopt
import os
import os
import stat
import time
import time
import sys
import os
import stat
import os
import stat
import os
import stat
import os
import stat
import os
import stat
import time
MOD = 30031
def main ( ) :
    with open ( os.path.join ( os.path.dirname ( __file__ ) , 'output.txt' ) , 'w' ) as f :
        os.chdir ( os.path.dirname ( __file__ ) )
def mult ( a1 , a2 ) :
    result = [ ]
    for i in range ( num ) :
        for j in range ( num ) :
            sum = 0
            for k in range ( num ) :
                sum += a1 [ i ] [ k ] * a2 [ k ] [ j ]
            result.append ( sum % MOD )
    return result
def st ( a , s ) :
    if s == 1 : return a
    if s & 1 : return st ( mult ( a , a ) , s / 2 )
    else : return st ( mult ( a , s - 1 ) , a )
def run ( ) :
    stdin = open ( os.path.join ( os.path.dirname ( __file__ ) , 'output.txt' ) , 'r' )
    stdout = open ( os.path.join ( os.path.dirname ( __file__ ) , 'output.txt' ) , 'w' )
    dd = stat.st_size
    for d in range ( 1 , dd + 1 ) :
        stdout.write ( 'Case #%d: ' % d )
        n = stat.st_size
        m = stat.st_size
        p = stat.st_size
        map = { }
        num = 0
        pp = 1 << p
        arr = [ ]
        for i in range ( pp ) :
            if stat.st_size == m :
                arr.append ( i )
                map [ i ] = num
                num += 1
        mas = [ ]
        for i in range ( num ) :
            x = arr [ i ]
            if x & 1 :
                mas.append ( x )
        stdout.write ( ' Case SPACETOKEN #%d\n