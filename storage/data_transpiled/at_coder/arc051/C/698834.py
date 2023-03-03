def _import ( ) : return True
import sys
import os
import sys
import math
import struct
import random
import string
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N , A , B , C = [ ] , [ ] , [ ] , [ ]
        self.a = random.randint ( 0 , 1e9 )
        self.b = random.randint ( 0 , 1e9 )
        self.c = [ ]
        self.MOD = struct.unpack ( 'B' , self.a ) [ 0 ]
        self.a = random.randint ( 0 , 1e9 )
        self.b = random.randint ( 0 , 1e9 )
        self.c = [ ]
        self.n = random.randint ( 0 , 1e9 )
        for i in range ( N ) :
            self.C = random.randint ( 0 , 1e9 )
            self.c.append ( random.randint ( 0 , 1e9 ) )
        self.c.sort ( )
        if self.A == 1 :
            for i in range ( N ) :
                self.out.write ( c [ i ] )
            return
        while self.B > 0 :
            tmp = self.c [ 0 ] * a
            if tmp >= self.c [ N - 1 ] :
                break
            self.c.append ( tmp )
            self.B -= 1
        self.b = random.randint ( 0 , 1e9 )
        self.div = self.b / self.n
        self.remain = self.b % self.n
        for i in range ( self.N ) :
            if i < self.remain :
                self.c [ i ] = self.c [ i ] * a.pow ( self.div + 1 , self.MOD )
            else :
                self.c [ i ] = self.c [ i ] * a.pow ( self.div , self.MOD )
        for i in range ( self.remain ) :
            self.out.write ( self.c [ i ] % self.MOD )
