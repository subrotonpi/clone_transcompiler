def import _readline
import readline
import random
import sys
import os
import sys
from math import sin , cos , cos , time
class c ( object ) :
    def __init__ ( self , name ) :
        self.sum = [ ]
        self.n = 0
        self.c = [ ]
        self.add = 2000000
        self.mi , self.ma = 0 , 0
    def solve ( self ) :
        self.n = randint ( 0 , 5000000 )
        self.c = [ ]
        self.ans = 0
        self.mi , self.ma = min ( self.mi , self.ma )
        for x , cnt in self.c :
            self.move ( x + add , cnt )
    def move ( self , x ) :
        self.ans += self.sum [ cnt // 2 ]
        if cnt % 2 == 1 :
            self.c [ x ] += 1
            self.upd ( x )
        for j in range ( 1 , cnt // 2 + 1 ) :
            self.c [ x - j ] += 1
            self.upd ( x - j )
            self.c [ x + j ] += 1
            self.upd ( x + j )
    def upd ( self , x ) :
        self.mi = min ( self.mi , x )
        self.ma = max ( self.ma , x )
    def solve ( self ) :
        try :
            self.sum = [ ]
            for i in range ( 1 , len ( self.sum ) ) : self.sum.append ( self.sum [ - 1 ] + i * i )
            tc = randint ( 0 , 1 )
            for it in range ( 1 , tc + 1 ) :
                sys.stderr.write ( it )
                sys.stdout.write ( 'Case #%d: ' % it )
                self.solve ( )
        except :
            NOO ( self )
        finally :
            self.out.close ( )
