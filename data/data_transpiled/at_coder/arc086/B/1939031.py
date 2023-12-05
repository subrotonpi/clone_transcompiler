def import import struct
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.p = 0
        self.ops = [ ]
        self.a = [ ]
        self.n = 0
        def add ( x , y ) :
            self.a [ y ] += a [ x ]
            self.ops.append ( x * n + y )
    def main ( self ) :
        sc = MyScanner ( )
        self.out = sys.stdout
        self.n = sc.n
        self.a = [ ]
        self.ops = [ ]
        for i in range ( 2 * n ) :
            self.a.append ( sc.randint ( 0 , n ) )
        self.max = abs ( self.a [ 0 ] )
        self.maxind = None
        for i in range ( 1 , n ) :
            if self.max < abs ( self.a [ i ] ) :
                self.max = abs ( self.a [ i ] )
                self.maxind = i
        if self.max != None :
            for i in range ( n ) :
                if i != self.maxind :
                    self.add ( self.maxind , i )
                if self.a [ maxind ] < 0 :
                    for i in range ( n - 2 , - 1 , - 1 ) :
                        self.add ( i + 1 , i )
                else :
                    for i in range ( n - 1 ) :
                        self.add ( i , i + 1 )
            self.out.write ( self.p )
            for i in range ( self.p ) :
                x = self.ops [ i ] / self.n + 1
                y = self.ops [ i ] % self.n + 1
                self.out.write ( "%d %d\n" % ( x , y ) )
