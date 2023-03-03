def _import ( ) : return sys.stdin.read ( )
import os
import os
import sys
import os
import subprocess
import shlex
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.A , self.B = 0 , 0
        self.a = [ ]
    def p ( self , mid ) :
        extra = 0
        for i in range ( self.N ) :
            left_health = self.a [ i ] - ( mid * self.B )
            if left_health > 0 :
                extra += left_health % ( A - B ) or ( left_health / ( A - B ) ) + 1
        return extra <= mid
    def BinarySearch ( self ) :
        low , high , ans = 0 , int ( 1e9 ) , 0
        while low <= high :
            mid = low + ( ( high - low ) >> 1 )
            if self.p ( mid ) :
                high = mid - 1
                ans = mid
            else :
                low = mid + 1
        return ans
    def main ( self ) :
        sc = MyScanner ( )
        out = sys.stdout.write
        self.N = sc.N
        self.A , self.B = sc.A , sc.B
        self.a = [ ]
        for i in range ( self.N ) :
            self.a.append ( sc.a [ i ] )
        out.write ( BinarySearch ( ) )
        out.flush ( )
        out.close ( )
    class MyScanner ( object ) :
        def __init__ ( self , s ) :
            self.s = s
        def readline ( self ) :
            while not self.s or not self.s :
                self.s = self.s.readline ( )
            return self.s
        def __next__ ( self ) :
            return int ( self.s )
        def __next__ ( self ) :
            return int ( self.s )
        def __next__ ( self ) :
            return int ( self.s )
        def __next__ ( self ) :
            return int ( self.next )
