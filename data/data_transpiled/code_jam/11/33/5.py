def import _solve
import os
import sys
import random
import sys
import os
import sys
import locale
import locale
import random
eof = False
random.seed ( 125475452 )
def solve ( ) :
    locale.setlocale ( locale.LC_ALL , '' )
    try :
        f = open ( FNAME + '.in' , 'r' )
        out = open ( FNAME + '.out' , 'w' )
        solve ( )
        out.close ( )
    except ( IOError , OSError ) :
        sys.exit ( 566 )
def __next__ ( ) :
    while not next ( ) or not next ( ) :
        try :
            next ( )
        except :
            eof = True
            return '0'
    return next ( )
randint = next ( )
randint = next ( )
uniform = next ( )
uniform = next ( )
randint = next ( )
uniform = next ( )
randint = next ( )
uniform = next ( )
uniform = next ( )
randint = next ( )
uniform = next ( )
uniform = next ( )
randint = next ( )
uniform = next ( )
uniform = next ( )
randint = next ( )
uniform = next ( )
uniform = next ( )
randint = next ( )
FNAME = 'C-small-attempt0'
def solve ( ) :
    T = randint
    for test in range ( 1 , T + 1 ) :
        n , L , R = randint
        f = [ randint ( ) for i in range ( n ) ]
        ans = - 1
        loop :
        for x in range ( L , R + 1 ) :
            for fr in f :
                if x % fr != 0 and fr % x != 0 :
                    continue loop
            ans = x
            break
        out.write ( 'Case #%d: ' % test )
        if ans < 0 :
            out.write ( 'NO' )
        else :
            out.write ( ans )
    return 0
