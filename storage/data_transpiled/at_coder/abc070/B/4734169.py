def import import sys
import os
import sys
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = 0
        self.b = 0
        self.c = 0
        self.d = 0
    def readline ( self ) :
        tmp = sys.stdin.readline ( ).split ( 's' )
        a = int ( tmp [ 0 ] )
        b = int ( tmp [ 1 ] )
        self.c = int ( tmp [ 2 ] )
        self.d = int ( tmp [ 3 ] )
    def start ( self ) :
        if self.a < self.c :
            start = self.c
        else :
            start = self.a
        if self.b < self.d :
            end = self.b
        else :
            end = self.d
        result = end - start
        if result < 0 :
            result = 0
        sys.stdout.write ( result )
