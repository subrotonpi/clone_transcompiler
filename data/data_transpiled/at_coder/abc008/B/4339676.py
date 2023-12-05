def import _OrderedDict
import collections
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def main ( self ) :
        n = self.sc.count
        d = { }
        for s in self.sc :
            if s in d :
                d [ s ] = d [ s ] + 1
            else :
                d [ s ] = 1
        ans = ( '' , 0 )
        for ele , count in d.items ( ) :
            if ans.count < count :
                ans = ( ele , count )
        print ( ans.name )
class Pair ( object ) :
    def __init__ ( self ) :
        self.name = self.name
        self.count = self.count
