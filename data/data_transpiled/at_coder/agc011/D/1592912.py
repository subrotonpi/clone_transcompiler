def _ ( * args ) : return args
import sys
import itertools
import string
import itertools
import os
import subprocess
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( '/dev/null' )
        self.N = self.N
        self.K = self.K
        self.s = self.s
        self.dq = [ 1 if self.s [ 0 ] == 'A' else - 1 for self in self.dq ]
        self.cur = 1
        self.res = 0
        self.map = { }
        self.map2 = { }
        self.id = 0
        for i in range ( K ) :
            v = self.dq.pop ( )
            if v * self.cur == 1 :
                self.dq.append ( self.cur * ( - 1 ) )
            else :
                self.cur *= - 1
                self.dq.append ( self.cur )
            if i > 2 * self.N :
                res = self.K - self.i - 1
                data = self.getans ( self.dq , self.cur )
                if data in self.map :
                    ansid = int ( self.res ) % self.id
                    ans = self.map2 [ ansid ]
                    print ( ans )
                    return ans
                else :
                    self.map [ data ] = self.id
                    self.map2 [ self.id ] = data
                    self.id += 1
        self.dq = [ ]
        while not self.dq.empty ( ) :
            self.dq.append ( self.dq.pop ( ) * self.cur == 1 )
        print ( ' '.join ( self.dq ) )
    def getans ( self , dq , self ) :
        self.dq = [ ]
        self.dq.extend ( self.dq )
        while not self.dq.empty ( ) :
            self.dq.append ( self.dq.pop ( ) * self.cur == 1 )
        return self.dq
