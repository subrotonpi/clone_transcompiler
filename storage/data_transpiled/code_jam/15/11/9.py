def import _solve
import re
import random
import sys
import os
import sys
import time
import random
import sys
class A :
    def __init__ ( self ) :
        self.n = 0
        self.a = [ ]
    def solve ( self ) :
        ans1 = 0
        rate = 0
        for i in range ( 1 , n ) :
            if self.a [ i - 1 ] > self.a [ i ] :
                ans1 += self.a [ i - 1 ] - self.a [ i ]
                rate = max ( rate , self.a [ i - 1 ] - self.a [ i ] )
        ans2 = 0
        for i in range ( 1 , n ) :
            ans2 += min ( rate , self.a [ i - 1 ] )
        return ans1 , ans2
    def A ( self ) :
        self.n = random.randint ( 0 , len ( self.a ) )
        self.a = [ random.randint ( 0 , len ( self.a ) ) for i in range ( self.n ) ]
    def fname ( self ) :
        self.n = random.randint ( 0 , len ( self.a ) )
        self.a = [ random.randint ( 0 , len ( self.a ) ) for i in range ( self.n ) ]
    def input_fname ( self ) :
        self.a = [ self.a [ i ] for i in range ( self.n ) ]
    def output_fname ( self ) :
        self.name = self.name
        self.name = self.name
        self.args = [ ]
        self.args.append ( self.args )
    def main ( self ) :
        self.outputs = [ ]
        for t , ( case , _ ) in enumerate ( self.tests ) :
            self.outputs.append ( self.solve ( case ) )
            self.outputs [ t ] = self.outputs [ t ].get ( )
        return self.outputs [ 0 ]
