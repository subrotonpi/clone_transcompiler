def _import ( ) : return
import os
import sys
import time
import inspect
class Sample ( object ) :
    NAME = "ticket"
    mod = 1000002013
    def __init__ ( self , d , num ) :
        self.d = d
        self.num = num
    def dist ( self , p ) :
        if self.d < p.d : return - 1
        if self.d > p.d : return 1
        return - p.num
    def run ( self ) :
        with open ( self.NAME + ".in" , "w" ) as f :
            f.write ( "%s\n" % self.NAME )
    tests = inspect.getmembers ( Sample , inspect.ismethod )
    for test in range ( 1 , tests + 1 ) :
        n , m = inspect.getmembers ( Sample , inspect.ismethod )
        t = [ ]
        cur = 0
        r = 0
        for o , e , p in t :
            cur += 1
            r += 1
            cur += 1
            r = r + dist ( n , e - o , p )
            if r >= mod :
                r = r - mod
        t.sort ( )
        s = [ ]
        res = 0
        for p in t :
            if p.in_ == 0 :
                s.append ( p )
            else :
                k = p.num
                while k != 0 :
                    ss = s.pop ( )
                    num = min ( ss.num , k )
                    res = res + dist ( n , p.d - ss.d , num )
                    if res >= mod :
                        res = res - mod
                    k -= num
                    if num < ss.num :
                        s.append ( ( ss.d , ss.num - num , ss.in_ ) )
        res = r - res
        if res < 0 :
            res = res + mod
        print ( "Case #%d: %d" % ( test , res ) , file = sys.stderr )
