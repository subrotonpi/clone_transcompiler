def _import ( ) : return _import ( )
import os
import sys
import os
import sys
import __builtin__ as ___builtin__
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = ___builtin__
        self.sum = 0
        b = [ ]
        c = [ ]
        for i in range ( 3 ) :
            b.append ( sc.randint ( 0 , 1 ) )
        for i in range ( 3 ) :
            c.append ( sc.randint ( 0 , 1 ) )
        self.sum = max ( self.sum , ( b [ 0 ] / c [ 0 ] ) * ( b [ 1 ] / c [ 1 ] ) * ( b [ 2 ] / c [ 2 ] ) )
        self.sum = max ( self.sum , ( b [ 0 ] / c [ 0 ] ) * ( b [ 1 ] / c [ 2 ] ) * ( b [ 2 ] / c [ 1 ] ) )
        self.sum = max ( self.sum , ( b [ 0 ] / c [ 1 ] ) * ( b [ 1 ] / c [ 2 ] ) * ( b [ 2 ] / c [ 0 ] ) )
        self.sum = max ( self.sum , ( b [ 0 ] / c [ 1 ] ) * ( b [ 1 ] / c [ 0 ] ) * ( b [ 2 ] / c [ 2 ] ) )
        self.sum = max ( self.sum , ( b [ 0 ] / c [ 1 ] ) * ( b [ 1 ] / c [ 1 ] ) * ( b [ 2 ] / c [ 2 ] ) )
        self.sum = max ( self.sum , ( b [ 0 ] / c [ 2 ] ) * ( b [ 1 ] / c [ 0 ] ) * ( b [ 2 ] / c [ 2 ] ) )
        self.sum = max ( self.sum , ( b [ 0 ] / c [ 2 ] ) * ( b [ 1 ] / c [ 0 ] ) )
        self.sum = max ( self.sum , ( b [ 0 ] / c [ 2 ] ) * ( b [ 2 ] / c [ 1 ] ) )
        self.pl ( self.sum )
