def import import sys
import os
import sys
import string
import string
import string
import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.input = string
        self.n = int ( self.n )
        self.blue = { }
        self.red = { }
        for i in range ( self.n ) :
            word = string.strip ( self.input )
            self.blue [ word ] = self.blue.get ( word , 0 ) + 1
        self.m = int ( self.m )
        for i in range ( self.m ) :
            word = string.strip ( self.input )
            self.red [ word ] = self.red.get ( word , 0 ) + 1
    def run ( self ) :
        for blue_name , value in self.blue.items ( ) :
            max = max ( value , value - self.red.get ( blue_name , 0 ) )
        print ( max )
