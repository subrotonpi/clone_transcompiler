def import readline
import sys
from io import StringIO
from random import randint
from time import time as clock
from pybedtools import bedtools
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.as = [ ]
    def readline ( self ) :
        sc = bedtools.FastParser ( )
        self.n = sc.__next__ ( )
        self.as = [ ]
        for i in range ( self.n ) :
            self.as.append ( sc.__next__ ( ) )
        self.solve ( )
    def solve ( self ) :
        x_list = [ ]
        y_list = [ ]
        max_abs = 0
        max_abs_index = - 1
        for i in range ( self.n ) :
            if abs ( i ) > abs ( max_abs ) :
                max_abs = i
                max_abs_index = i
        if max_abs == 0 :
            print ( 0 )
            return
        for i in range ( self.n ) :
            x_list.append ( max_abs_index + 1 )
            y_list.append ( i + 1 )
        if max_abs < 0 :
            for i in range ( self.n - 1 , 0 , - 1 ) :
                x_list.append ( i + 1 )
                y_list.append ( i )
        else :
            for i in range ( self.n - 1 ) :
                x_list.append ( i + 1 )
                y_list.append ( i + 2 )
        print ( len ( x_list ) )
        for i in x_list :
            print ( i , y_list [ i ] )
    class FastParser ( object ) :
        def readline ( self ) :
            while not self.next or not self.next :
                try :
                    self.next = readline ( self )
                except StopIteration :
                    pass
            return
