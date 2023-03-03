def import import _sys , os , sys , traceback , time , traceback , args , filename , count , verbose , mode , filename , ** kwargs ) :
    import os
    import sys
    import tempfile
    import time
    import random
    import subprocess as subprocess
    import tempfile
    import os
    import subprocess as subprocess
    class B ( object ) :
        FILENAME = 'B-large'
        def solve ( self ) :
            with open ( filename + '.in' , 'r' ) as infile :
                with open ( filename + '.out' , 'w' ) as outfile :
                    self.testn = int ( sys.argv [ 1 ] )
                    for test , L , t , N , C in self.testn :
                        arr = [ ]
                        max = - 1
                        max_prev = - 1
                        for i in range ( C ) :
                            arr.append ( infile.read ( ) )
                            if arr [ i ] > max :
                                if max != - 1 :
                                    max_prev = max
                                max = arr [ i ]
    sum = 0
    currentTime = 0
    g_list = [ ]
    for i in range ( N ) :
        len = 0
        if i < C :
            len = arr [ i ]
        else :
            temp = i % C
            len = arr [ temp ]
        if t < currentTime :
            g_list.append ( - len )
        else :
            if t < ( currentTime + len * 2 ) :
                dif = t - currentTime
                g_list.append ( - ( ( len * 2 ) - dif ) / 2 )
        sum = sum + len
        currentTime = sum * 2
    g_list.sort ( )
    for i in range ( L ) :
        if i < len ( g_list ) :
            L1 = g_list [ i ]
            currentTime = currentTime + L1
    print ( 'Case #%d: %d' % ( test + 1 , currentTime ) )
    os.remove ( filename )
