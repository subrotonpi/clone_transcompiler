def import import sys
import math
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        n = sc.nextInt ( )
        hen = 1
        min = 20000000
        while not ( hen * hen > n ) :
            hen += 1
        hen -= 1
        while hen != 0 :
            min = min ( ( n - n / hen * hen ) + ( n / hen - hen ) , min )
            hen -= 1
        print ( min )
        sc.close ( )
