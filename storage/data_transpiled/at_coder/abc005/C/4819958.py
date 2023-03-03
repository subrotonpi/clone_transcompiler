def import import _bisect
import bisect
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
        self.t = sys.maxsize
        self.n = sys.maxsize
        self.a = list ( range ( self.n ) )
        self.m = sys.maxsize
        self.flag = True
        for i in range ( self.m ) :
            b = bisect.bisect ( self.a , b - self.t )
            tmp = bisect.bisect_left ( self.a , b - self.t )
            if tmp >= 0 :
                del a [ tmp ]
            else :
                tmp = ~ tmp
                if tmp == len ( a ) or a [ tmp ] > b :
                    self.flag = False
                    break
                else :
                    del a [ tmp ]
        print ( 'yes' if self.flag else 'no' )
        self.raw_input = sys.stdout
