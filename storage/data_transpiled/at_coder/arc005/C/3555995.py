def import import sys , os , sys , traceback
from os import urandom
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.H , self.W = sys.maxint
    def __init__ ( self ) :
        Scanner ( )
        self.board = [ ]
        self.check_board = [ ]
        self.start = [ ]
        for i , line in enumerate ( sys.stdin ) :
            for j , c in enumerate ( line ) :
                self.board [ i ].append ( c )
                self.check_board.append ( 3 )
                if c == 's' :
                    self.start.append ( i )
                    self.start.append ( j )
                    self.start.append ( 0 )
    self.queue = [ ]
    self.queue.append ( self.start )
    dir = [ - 1 , 0 , 1 , 0 , - 1 ]
    while len ( self.queue ) != 0 :
        q = self.queue.pop ( 0 )
        for k in range ( 4 ) :
            x = self.q [ 0 ] + self.dir [ k + 1 ]
            y = self.q [ 1 ] + self.dir [ k ]
            if x < 0 or x >= self.H :
                continue
            if y < 0 or y >= self.W :
                continue
            if self.board [ x ] [ y ] == 'g' :
                print ( 'YES' )
                return
            if self.board [ x ] [ y ] == '.' and self.check_board [ x ] [ y ] > self.q [ 2 ] :
                p = [ x , y , self.q [ 2 ] ]
                self.queue.append ( p )
                self.check_board [ x ] [ y ] = self.q [ 2 ]
            if self.board [ x ] [ y ] == '#' and self.check_board [ x ] [ y ] > self.q [ 2 ] + 1 :
                qq = self.q [ 2 ] + 1
                p = [ x , y , qq ]
                self.queue.append ( p )
                self.check_board [ x ] [ y ] = self.q [ 2 ]
