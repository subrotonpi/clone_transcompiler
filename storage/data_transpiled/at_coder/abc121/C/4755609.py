def import _dicts_map
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._dicts_map = defaultdict ( list )
        self.n = len ( self.n )
        self.m = len ( self.m )
        for a , b in zip ( self.n , self.m ) :
            self.d [ a ] = self.d [ a ] + self.d [ b ] if a in self.d else b
    ans = 0
    for i in self.d :
        if m <= self.d [ i ] :
            ans += i * m
            break
        else :
            m -= self.d [ i ]
            ans += i * self.d [ i ]
    print ( ans )
