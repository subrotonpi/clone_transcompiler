def import _main
import sys
import random
import sys
import time
import sys
class Main ( object ) :
    def run ( self ) :
        with open ( sys.argv [ 1 ] ) as sc :
            N , K , Q = random.randint ( 1 , sys.maxsize )
            A = [ ]
            ans = sys.maxsize
            for i in range ( N ) :
                A.append ( sc.next ( ) )
    for trial in range ( N ) :
        pq = [ ]
        for i in range ( N ) :
            t = i
            tmp = [ ]
            while t < N and A [ t ] >= A [ trial ] :
                tmp.append ( A [ t ] )
                t += 1
            if len ( tmp ) >= K :
                pq.append ( tmp )
            i = t
        cnt = max = 0
        while cnt < Q and not pq [ 0 ] :
            cand = pq [ 0 ]
            cnt += 1
            max = max ( max , cand.pop ( ) )
            if len ( cand ) >= K :
                pq.append ( cand )
        if cnt == Q :
            ans = min ( ans , max - A [ trial ] )
    print ( ans )
    def tr ( self , * args ) :
        print ( " ".join ( [ str ( x ) for x in args ] ) )
