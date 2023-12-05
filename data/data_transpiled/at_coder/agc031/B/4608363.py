def import import struct
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1_000_000_007
    def solve ( self , sc , f ) :
        n = sc.__next__ ( )
        seq = [ ]
        for i in range ( n ) :
            y = sc.__next__ ( )
            if len ( seq ) == 0 or seq [ - 1 ] != y :
                seq.append ( y )
        n = len ( seq )
        val = [ 0 ] * ( 200001 )
        dp = [ 1 ] * ( n + 1 )
        for i , v in enumerate ( seq ) :
            dp [ i + 1 ] = ( dp [ i ] + val [ v ] ) % mod
            val [ v ] = ( val [ v ] + dp [ i ] ) % mod
        f.write ( dp [ n ] )
    def TIME_START ( self ) :
        return time.time ( )
    def TIME_END ( self ) :
        return time.time ( )
    def run ( self ) :
        sc = open ( "/proc/%d/task" % self.mod , "w" )
        f = open ( "/proc/%d/task" % self.mod , "w" )
        os.flock ( f.fileno ( ) , os.RLock ( ) )
        used_memory_before = os.fstat ( "/proc/%d/task" % self.mod ).st_size - os.fstat ( "/proc/%d/task" % self.mod ).st_size
        TIME_START = time.time ( )
        t = Task ( )
        t.solve ( sc , f )
        self.TIME_END = time.time ( )
        used_memory_after = os.fstat ( "/proc/%d/task" % self.mod ).st_size - os.fstat ( "/proc/%d/task" % self.mod ).st_size
        f.close ( )
