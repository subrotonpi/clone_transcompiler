def _import ( ) : return ord ( 'a' )
import sys
import os
import sys
import struct
class Main ( object ) :
    def __init__ ( self ) :
        try :
            with open ( '/dev/urandom' ) as f :
                fs = f.read ( )
        except IOError :
            raise ValueError ( )
    def __next__ ( self ) :
        N = struct.unpack ( '>I' , fs.read ( 1 ) ) [ 0 ]
        a = [ ]
        for i in range ( N ) :
            a.append ( next ( fs ) )
        return next ( a )
    avg = sum / N
    if sum % N == 0 :
        start = 0
        now = cnt = 0
        population = 0
        buildnext = False
        while True :
            if buildnext :
                cnt += 1
            population += a [ now ]
            buildnext = True
            if population % ( now - start + 1 ) == 0 :
                if population / ( now - start + 1 ) == avg :
                    buildnext = False
                    population = 0
                    start = now + 1
            now += 1
        print ( cnt )
    else :
        print ( - 1 )
class FastScanner ( object ) :
    def __init__ ( self , buffer ) :
        self.buffer = buffer
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = len ( buffer )
                except TypeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.buffer [ self.ptr ]
            else :
                return - 1
        def isPrintableChar ( self ) :
            return 33 <= self.ptr <= 126
        def __iter__ ( self ) :
            for i in range ( self.ptr ) :
                yield i
