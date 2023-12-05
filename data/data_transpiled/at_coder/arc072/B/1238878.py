def import import os , sys
import os
import math
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        f = open ( os.devnull , 'w' )
        print ( 'Brown' if abs ( sc.read ( ) - sc.read ( ) ) <= 1 else 'Alice' )
        f.flush ( )
        f.close ( )
    def readline ( self ) :
        if not self.readline or not self.readline :
            self.readline = os.popen ( 'readline' , 'r' )
        return self.readline ( )
    def readline ( self ) :
        while not self.readline or not self.readline.strip ( ) :
            self.readline = os.popen ( 'readline' , 'r' )
        return self.readline ( )
    def readline ( self ) :
        return sys.stdin.readline ( )
    def write ( self , s ) :
        x = s.split ( )
        s = [ '0' ]
        res , f = 0 , 1
        dec , neg = 0 , 0
        start = 0
        if self.readline [ 0 ] == '-' :
            neg = True
            start += 1
        for i in range ( start , len ( self.readline ) ) :
            if self.readline [ i ] == '.' :
                res = int ( ''.join ( s [ i : i + 1 ] ) )
                s = [ '0' ]
                dec = True
            else :
                s [ i ] = self.readline ( )
                if dec :
                    f *= 10
            res += int ( ''.join ( s [ i : i + 1 ] ) ) / f
            return res * ( - 1 if neg else 1 )
    def ready ( self ) :
        return self.readline ( )
