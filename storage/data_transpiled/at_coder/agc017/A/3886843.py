def import _main
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ 0 ] * 51
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        p = sc.readline ( ).strip ( )
        a = [ ]
        odd = 0
        even = 0
        for i in range ( n ) :
            a.append ( sc.readline ( ).strip ( ) )
            if a [ i ] % 2 == 0 :
                even += 1
            else :
                odd += 1
        count = 0
        sumo = sume = 0
        if p == 0 :
            for i in range ( 0 , odd + 1 , 2 ) :
                sumo += _combination ( odd , i )
            for i in range ( 0 , even + 1 ) :
                sume += _combination ( even , i )
            count = sumo * sume
            print ( count )
        else :
            for i in range ( 1 , odd + 1 , 2 ) :
                sumo += _combination ( odd , i )
            for i in range ( 0 , even + 1 ) :
                sume += _combination ( even , i )
            count = sumo * sume
            print ( count )
    def combination ( self , n , k ) :
        if n == k or k == 0 :
            return 1
        elif self.dp [ n ] [ k ] != 0 :
            return self.dp [ n ] [ k ]
        return self.dp [ n ] [ k ] = self.combination ( self , n - 1 , k ) + self.combination ( self , n - 1 , k - 1 )
return Main
