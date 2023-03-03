def import _main
import os
import sys
import time
class Main ( object ) :
    def __init__ ( self ) :
        self._main = None
        self._main.__init__ ( self )
    MOD = 1_000_000_000 + 7
    def run ( self ) :
        with open ( "/proc/%d/%d" % ( MOD , MOD ) , "r" ) as f :
            n , x = struct.unpack ( ">I" , f.read ( 4 ) )
            w = [ i for i in range ( n ) ]
            count1 = { }
            for s in range ( 1 << ( n // 2 ) ) :
                sum = 0
                for i in range ( ( n // 2 ) ) :
                    if s & ( 1 << i ) :
                        sum += w [ i ]
                if sum in count1 :
                    count1 [ sum ] = count1 [ sum ] + 1
                else :
                    count1 [ sum ] = 1
            count2 = { }
            for s in range ( 1 << ( n - ( n // 2 ) ) ) :
                sum = 0
                for i in range ( ( n - ( n // 2 ) ) ) :
                    if s & ( 1 << i ) :
                        sum += w [ i + n // 2 ]
                if sum in count2 :
                    count2 [ sum ] = count2 [ sum ] + 1
                else :
                    count2 [ sum ] = 1
            ans = 0
            for k , v in count1.items ( ) :
                if x - k in count2 :
                    ans += v * count2 [ x - k ]
            print ( ans )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
