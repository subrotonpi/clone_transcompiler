def import import _bisect
import bisect
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.stdin )
        self.a = [ ]
        count = 0
        for i in range ( n ) :
            self.a.append ( random.randint ( 0 , len ( self.a ) ) )
            while self.a [ i ] % 2 == 0 :
                self.a [ i ] /= 2
                count += 1
        print ( count )
    def upper_bound ( self , a , val ) :
        return bisect.bisect_left ( self.a , a , val )
    def lower_bound ( self , a , l , r , val ) :
        if r - l == 1 :
            if self.a [ l ] > val :
                return l
            return r
        mid = ( l + r ) // 2
        if self.a [ mid ] > val :
            return bisect.bisect_left ( self.a , a , l , mid , val )
        else :
            return bisect.bisect_left ( self.a , a , l , mid , val )
