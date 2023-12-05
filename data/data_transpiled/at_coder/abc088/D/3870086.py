def import import string , traceback
import sys
import string
import deque
import struct
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.H , self.W = sys.stdin.read ( ).split ( '\n' )
        self.str = string.split ( ' ' )
    def __init__ ( self , * args ) :
        for line in open ( self.str , 'r' ) :
            self.str = line
    def __init__ ( self , * args ) :
        map = [ ]
        d = [ ]
        for i in range ( self.H ) :
            for j in range ( self.W ) :
                map [ i ].append ( self.str [ j ] )
                d [ i ].append ( - 1 )
        deq = deque ( )
        d.append ( [ 0 , 0 ] )
        dx = [ 0 , 1 , 0 , - 1 ]
        dy = [ 1 , 0 , - 1 , 0 ]
        deq.append ( ( 0 , 0 ) )
        while not deq.empty ( ) :
            now = deq.popleft ( )
            for i in range ( 4 ) :
                next = ( now [ 0 ] + dx [ i ] , now [ 1 ] + dy [ i ] )
                if next [ 0 ] < 0 or next [ 0 ] >= self.H or next [ 1 ] < 0 or next [ 1 ] >= self.W :
                    continue
                if map [ next [ 0 ] ] [ next [ 1 ] ] == '#' :
                    continue
                if d [ next [ 0 ] ] [ next [ 1 ] ] != - 1 :
                    continue
                d [ next [ 0 ] ] [ next [ 1 ] ] = d [ now [ 0 ] ] [ now [ 1 ] ] + 1
                deq.append ( next )
        count = 1
        for i in range ( self.H ) :
            for j in range ( self.W ) :
                if map [ i ] [ j ] == '#' :
                    count += 1
        if d [ self.H - 1 ] [ self.W - 1 ] == - 1 :
            print ( - 1 )
        else :
            print ( count )
    