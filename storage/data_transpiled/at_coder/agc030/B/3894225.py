def _import ( ) : return sys.stdin.read ( 10000 )
import io
import os
import sys
import io
import StringIO
import io
import sys
import struct
class Main ( object ) :
    def __init__ ( self , fh ) :
        self.fh = fh
        self.fh = fh
        self.stdout = io.StringIO ( )
        self.fh = fh
        self.stdout = io.StringIO ( )
        self.stdout = io.StringIO ( )
        self.fh.seek ( 0 )
        self.stdout.seek ( 0 )
        self.stdout.seek ( 0 )
        self.stdout.write ( self.stdout.read ( ) )
    def print_line ( * args ) :
        if self.count == 0 :
            self.cur = self.fh.read ( )
        else :
            self.cur = self.count
    def read_skipspace ( ) :
        while True :
            c = self.read ( )
            if c == '' or c == '\n' or c == '\t' :
                raise InputError ( )
            self.stdout.seek ( 0 )
            self.stdout.write ( self.stdout.read ( ) )
    def read_skipspace ( ) :
        while True :
            c = self.read ( )
            if c == '' :
                return - 1
            else :
                return c
    def read_skipspace ( ) :
        while True :
            c = self.read ( )
            if c == '' :
                return - 1
            else :
                return c
    class TaskB ( object ) :
        def solve ( self , test_number , f , out ) :
            l = self.l
            n = self.n
            a = [ ]
            sa = [ ]
            for i in range ( n ) :
                a.append ( f.read ( ) )
                sa.append ( sa [ i ] + a [ i ] )
            res = l / 2
            for it in range ( 2 ) :
                for i in range ( n ) :
                    if i == n - 1 :
                        res = max ( res , a [ i ] )
                        continue
                    m = ( n - i + 1 ) - sa [ i ]
                    