def import import sys
from os.path import getsize
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = randint ( 1 , 10000 )
        a = [ ]
        for i in range ( 1 , n + 1 ) :
            a.append ( randint ( 1 , 10000 ) )
        left = [ max ( left [ i - 1 ] , a [ i ] ) for i in range ( 1 , n + 1 ) ]
        pq = PriorityQueue ( 10 , reverse = True )
        ans = [ ]
        hi = left [ n ]
        cnt = 0
        for i in range ( n , 0 , - 1 ) :
            if a [ i ] <= left [ i - 1 ] :
                pq.append ( a [ i ] )
                continue
            lo = left [ i - 1 ]
            cnt += 1
            ans.append ( cnt * ( hi - lo ) )
            while pq and pq.peek ( ) > lo :
                ans.append ( pq.pop ( ) - lo )
                cnt += 1
            hi = lo
        f = open ( "/dev/null" , "w" )
        for i in range ( 1 , n + 1 ) :
            f.write ( ans [ i ] )
        f.flush ( )
