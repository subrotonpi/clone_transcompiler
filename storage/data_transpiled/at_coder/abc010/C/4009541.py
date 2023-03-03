def import _main
import sys
import os
import sys
import math
import time
import time
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.txa , tya = sys.stdin.readline ( ).split ( ' ' )
        self.txb , self.tyb , self.txb , self.tyb , self.T , self.V = sys.maxint
        self.n = len ( self.txa )
        ladyhouse = [ ( self.txa , self.tya ) , ( self.txb , self.tyb ) ]
        for i in range ( 1 , self.n + 1 ) :
            ladyhouse.append ( ( self.txa , self.tya ) )
        for i in range ( 1 , self.n + 1 ) :
            dist = self.getD ( ladyhouse [ 0 ] , ladyhouse [ i ] ) + self.getD ( ladyhouse [ i ] , ladyhouse [ n + 1 ] )
            if dist <= V * T :
                self.out.write ( 'YES' )
                exit ( 0 )
        self.out.write ( 'NO' )
    def getD ( self , s , g ) :
        dx = s [ 0 ] - g [ 0 ]
        dy = s [ 1 ] - g [ 1 ]
        return sqrt ( dx ** 2 + dy ** 2 )
