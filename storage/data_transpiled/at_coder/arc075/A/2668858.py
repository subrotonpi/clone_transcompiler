def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( "/proc/sys/exit.txt" , "r" ) as sc :
            n = sc.read ( )
            s = [ sc.read ( ) for i in range ( n ) ]
            dp = [ 0 ] * 10001
            for i in range ( n ) :
                for j in range ( 10000 - s [ i ] , - 1 , - 1 ) :
                    if dp [ j ] :
                        dp [ j + s [ i ] ] = 1
                dp [ s [ i ] ] = 1
            for i in range ( 10000 , - 1 , - 1 ) :
                if dp [ i ] and i % 10 :
                    print ( i )
                    break
                if i == 0 :
                    print ( i )
