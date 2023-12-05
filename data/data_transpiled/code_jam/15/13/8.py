def import _logging
import _sys
import math
import os
import os
import sys
class logging :
    def __init__ ( self ) :
        self.stdin = open ( os.path.join ( os.path.dirname ( __file__ ) , ".." , "logging.in" ) , "r" )
        self.stdout = open ( os.path.join ( os.path.dirname ( __file__ ) , ".." , "logging.out" ) , "w" )
        self.SUBMIT = True
    def __init__ ( self , x , y ) :
        self.x , self.y = x , y
        self.idx = self.idx
    def __init__ ( self , other ) :
        self.x , self.y = self.x , self.y
        self.idx = self.idx
    def __lt__ ( self , other ) :
        return int ( math.signum ( self.angle - other.angle ) )
    def __repr__ ( self ) :
        return "%s %s" % ( self.x , self.y )
    def cross ( self , p , q , r ) :
        return ( r [ 1 ] - p [ 1 ] ) * ( q [ 0 ] - p [ 0 ] ) - ( q [ 1 ] - p [ 1 ] ) * ( r [ 0 ] - p [ 0 ] )
    def dist ( self , a , b ) :
        return ( a [ 0 ] - b [ 0 ] ) * ( a [ 0 ] - b [ 0 ] ) + ( a [ 1 ] - b [ 1 ] ) * ( a [ 1 ] - b [ 1 ] )
class main2 ( _sys ) :
    N = len ( sys.stdin )
    p = [ ]
    pc = [ ]
    for i in range ( N ) :
        x , y = _sys.stdin.read ( 1 ) , _sys.stdin.read ( 1 )
        pc.append ( Point ( x , y , i ) )
        pc.append ( Point ( x , y , i ) )
    seen = [ ]
    prev = [ ]
    gen = 0
    for i in range ( N ) :
        gen += 1
        for j in range ( 2 * N ) :
            if pc [ j ].idx == i