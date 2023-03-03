def _import ( ) : return _import ( )
import itertools
import itertools
import random
import time
import sys
import os
import itertools
import itertools
import itertools
class Main ( object ) :
    def REPS ( v ) : return range ( 0 , v )
    def REPS ( l , r ) : return range ( l , r )
    def INS ( n ) : return REPS ( n ).map ( int , range ( n ) )
    s = Scanner ( )
    def getInt ( ) : return int ( s.next ( ) )
    def f ( ) : return [ [ int ( i ) for i in s.next ( ) ] for i in range ( l , r ) ]
    def main ( ) :
        n = getInt ( )
        r = 1
        pr = itertools.repeat ( n )
        for p in pr :
            c = 1
            for j in range ( p , n + 1 , p ) :
                c += n / j
            r *= c
            r %= 1000000007
        print ( r )
    class PrimeIterator ( iterable , itertools.product ) :
        def __init__ ( self , limit ) :
            self.curv = 0
            self.bs = [ ]
            self.limit = limit
            self._construct_bs ( )
        def construct_bs ( self ) :
            self.bs.append ( self.limit + 1 )
            self.bs = [ 0 ]
            self.bs = [ 1 ]
            if self.limit < 2 : return
            i = 2
            while self.sieve ( self.bs.index ( self.i ) ) :
                i += 1
            def sieve ( self , v ) :
                sievestart = 1 * v ** self.limit
                if 4 > sievestart or sievestart > limit : return False
                yield self.bs [ self.curv + 1 ]
            return True
        def __next__ ( self ) :
            r = self.next_value ( )
            return 0 <= r <= limit
