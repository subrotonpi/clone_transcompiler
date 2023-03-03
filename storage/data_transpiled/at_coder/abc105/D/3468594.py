def import import _hash_dict
import collections
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.m = 0
        self.count = 0
        self.dict = { None : 1 }
        a = 0
        for i in range ( self.n ) :
            a += self.n
            num = self.dict.get ( a % m )
            if num :
                self.count += num
                self.dict [ a % m ] = num + 1
            else :
                self.dict [ a % m ] = 1
        print ( self.count )
