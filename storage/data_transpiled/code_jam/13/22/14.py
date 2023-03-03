def import _diamonds
import os
import sys
import random
import sys
class Diamonds ( ) :
    def main ( self ) :
        self.a = [ 0 ]
        for j in range ( 1 , len ( self.a ) ) :
            self.a [ 0 ] [ j ] = self.a [ i - 1 ] [ j - 1 ]
            if self.a [ i ] [ j ] > self.generation :
                self.a [ i ] [ j ] = random.randint ( 1 , self.a [ j ] [ j ] )
        self.ansp = self.a [ pos ] [ 1 ]
        self.ansq = self.a [ pos ] [ 1 ]
        if self.ansq >= 0 :
            self.out.write ( '1.' )
            self.ansp = self.ansp - self.ansq
        else :
            self.out.write ( '0.' )
        for i in range ( 12 ) :
            self.ansp = self.ansp * self.ansq
            self.ansq = self.ansp / self.ansq
            self.ansp = self.ansp
        self.out.flush ( )
    def __next__ ( self ) :
        while self.a == None or not self.a [ 0 ] :
            try :
                self.a = [ self.a [ 0 ] [ 0 ] ]
            except :
                self.eof = True
                return '0'
        return self.a [ 0 ]
    def __next__ ( self ) :
        return int ( self.a [ 0 ] [ 0 ] )
    FNAME = 'b'
    def solve ( self ) :
        for test , testn in range ( 1 , self.testn ) :
            print ( 'test {}'.format ( test ) )
            print ( 'Case #{}: '.format ( test , self.test ) , end = '' )
            n = self.a [ 0 ] [ 0 ]
            x = self.a [ 0 ] [ 0 ]
            y = self.a [ 0 ] [ 0 ]
            if abs ( x + y ) % 2 != 0 :
                self.out.write ( '1.0' )
            else :
                self.