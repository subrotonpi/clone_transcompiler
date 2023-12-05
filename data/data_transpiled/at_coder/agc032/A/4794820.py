def import sc
import string
import sys
import string
import sys
import struct
import time
import math
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.n = sc.__next__ ( )
        self.list = [ ]
        for i in range ( n ) :
            self.list.append ( sc.__next__ ( ) )
    def __next__ ( self ) :
        ans = deque ( )
        c = 1
        while c == 1 and not self.list :
            for i in range ( len ( self ) - 1 , - 1 , - 1 ) :
                if self.list [ i ] == i + 1 :
                    ans.append ( self.list [ i ] )
                    self.list.remove ( i )
                    c = 1
                    break
                else :
                    c = 0
            if self.list :
                self.out.write ( - 1 )
            else :
                while not ans.empty ( ) :
                    self.out.write ( ans.pop ( ) )
        self.out.close ( )
    def write ( self , s ) :
        self.s = s
        self.list = [ ]
        self.list.append ( s )
        self.list.append ( s )
        return self.list
    def read ( self ) :
        return string.split ( self.list ) [ 0 ]
    def write ( self , s ) :
        return string.split ( self.list ) [ 0 ]
