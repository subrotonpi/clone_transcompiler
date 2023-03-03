def _import ( ) : return sys.stdin.read ( )
import time
import random
import sys
import random
import sys
eps = 1e-12
def solve ( ) :
    tc = random.randint ( 1 , 10000 )
    for t in range ( tc ) :
        print ( "Case #%d: " % ( t + 1 ) , end = ' ' )
        n = random.randint ( 1 , 10000 )
        pr = random.uniform ( 1 , 10000 )
        best_dist = 10
        best_from = - 1
        s = random.choice ( s )
        for fr in range ( n ) :
            cntOnes , cnt = 0 , 0
            for to in range ( fr , n ) :
                if s [ to ] == '1' :
                    cntOnes += 1
                cnt += 1
                cur = abs ( pr - cntOnes / ( cnt + 0.) )
                if cur < best_dist - eps :
                    best_dist = cur
                    best_from = fr
        if best_from == - 1 :
            raise AssertionError
        print ( bestFrom )
        print ( "%d/%d done" % ( t + 1 , tc ) , end = ' ' )
    def run ( ) :
        try :
            f = open ( "C.in" , "r" )
            f.close ( )
        except IOError :
            pass
        else :
            solve ( )
            f.close ( )
    def runIO ( ) :
        f = open ( "C.out" , "w" )
        f.close ( )
    class f ( sys.stdin.buffer ) :
        def readline ( self ) :
            try :
                s = f.readline ( )
            except IOError :
                pass
            else :
                s = s.decode ( 'ascii' )
            return s
    if sys.stdin.buffer.size < 3 :
        f = open ( "C.in" , "r" )
    else :
        f = open ( "C.out" , "w" )
    run ( )
