def _import ( ) : return
import os
import sys
import time
import random
import time
class DEasy ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.c = 0
        self.pal = 0
        self.next = 0
        self.odd = False
        self.savec = 0
    def nextpal ( self ) :
        if self.c + 1 == self.next :
            if self.odd :
                self.odd = False
                self.c = self.savec
            else :
                self.odd = True
                self.next *= 10
                self.c += 1
                self.savec = self.c
        else :
            self.c += 1
        self.pal = self.c * self.next
        self.mul = self.next // 10
        if self.odd :
            self.pal /= 10
            self.mul /= 10
        self.cc = self.c
        if self.odd :
            self.cc /= 10
        while self.cc > 0 :
            self.pal += self.mul * ( self.cc % 10 )
            self.cc /= 10
            self.mul /= 10
    def solve ( self ) :
        with open ( 'D-small-attempt0.in' , 'r' ) as infile :
            with open ( 'D-small-attempt0.out' , 'w' ) as outfile :
                testn = len ( infile )
                for test in range ( testn ) :
                    self.nextpal ( )
    def solve ( self ) :
        with open ( 'D-small-attempt0.out' , 'w' ) as infile :
            with open ( 'D-small-attempt0.out' , 'w' ) as outfile :
                testn = len ( infile )
                for test in range ( testn ) :
                    self.nextpal ( )
    def solve ( self ) :
        self.nextpal ( )
