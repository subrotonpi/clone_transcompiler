def import _main
import sys
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.a = [ ]
    def __init__ ( self ) :
        sc = _main ( )
        self.n = sc.n
        self.a = [ ]
        for i in range ( 1 , n + 1 ) :
            self.a.append ( sc.randint ( 0 , 1 ) )
        self.dp = [ ]
        self.dp.append ( abs ( self.a [ 2 ] - self.a [ 1 ] ) )
        self.dp ( 3 )
        print ( self.dp [ n ] )
    def dp ( self , k ) :
        if k > self.n :
            return
        else :
            self.dp [ k ] = min ( abs ( self.a [ k ] - self.a [ k - 2 ] ) + self.dp [ k - 2 ] , abs ( self.a [ k ] - self.a [ k - 1 ] ) + self.dp [ k - 1 ] )
        self.dp [ k + 1 ] = 0
