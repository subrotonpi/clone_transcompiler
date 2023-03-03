def _import ( ) : return int ( next ( sys.stdin ) )
import locale
import sys
import os
import sys
import time
import random
import sys
import random
import sys
import os
import string
import string
import random
import string
import time
import time
import sys
import random
import sys
DIR = r' E : \ isine\ programming \ contests \ gcj \ 11round1B\ \'
problemName = '%s-large'
inf = long ( 1e13 )
fname = '%s%s-large' % ( DIR , problemName )
def run ( ) :
    try :
        nt = randint ( 1 , 10000 )
        cases_loop :
            for it in range ( 1 , nt + 1 ) :
                c = randint ( 1 , 10000 )
                d = randint ( 1 , 10000 ) * 2
                cv = [ ]
                cx = [ ]
                n = 0
                for i in range ( c ) :
                    cx.append ( randint ( 1 , 10000 ) )
                    cv.append ( randint ( 1 , 10000 ) )
                    n += cv [ i ]
                sp = [ ]
                n = 0
                for i in range ( c ) :
                    for j in cv :
                        sp.append ( cx [ n ] )
                        n += cv [ i ]
                lr = - 1
                rr = inf
                while lr + 1 < rr :
                    xr = ( lr + rr ) / 2
                    last = - inf
                    check :
                        for p in sp :
                            b1 = p - xr
                            b2 = p + xr
                            if last + d > b2 :
                                ok = False
                                break check
                            last = max ( b1 , last + d )
                        ok = True
                    if ok :
                        rr = xr
                    else :
                        lr = xr
                out = '%sCase #%d: %.1f%%' % ( it , rr *.5 )
    except :
        traceback.print_exc ( )
    finally :
        os.remove ( fname )
