def _import ( ) : pass
import os
import sys
import os
import subprocess
import time
import math
import numpy
import numpy
import os.path
import tempfile
class TaskC ( object ) :
    def __init__ ( self ) :
        self.file = None
        self.file = None
        self.file = None
        self.file = None
        self.stk = None
    def tknize ( self ) :
        try :
            stk = shlex.split ( self.file.readline ( ) )
        except :
            traceback.print_exc ( )
            return False
        return True
    def ni ( self ) :
        while not stk or not stk [ 0 ] :
            tknize ( )
        return int ( stk [ 0 ] )
    def nl ( self ) :
        while not stk or not stk [ 0 ] :
            tknize ( )
        return long ( stk [ 0 ] )
    def nd ( self ) :
        while not stk or not stk [ 0 ] :
            tknize ( )
        return numpy.asscalar ( stk [ 0 ] )
    def main ( self ) :
        os.chdir ( '..' )
    mag = 1000000007
    def run ( self ) :
        with open ( 'a.out' , 'w' ) as f :
            f.seek ( 0 )
            N = self.file.tell ( )
            for ts , n , m , x , y , z in self.file.read ( ) :
                a = [ ni ( i ) for i in range ( m ) ]
                sp = [ x * y for i in range ( n ) ]
                for i in range ( n ) :
                    sp [ i ] = a [ i % m ]
                    a [ i % m ] = ( x * a [ i % m ] + y * ( i + 1 ) ) % z
                sol = [ 1 for i in range ( n ) ]
                for j in range ( n ) :
                    if sp [ i ] > sp [ j ] :
                        sol [ i ] = sp [ j ]
    return run
