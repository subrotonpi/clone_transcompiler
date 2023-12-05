def import _readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        readline.__init__ ( self )
        self.readline = readline
    def readline ( self ) :
        sc = readline.readline ( )
        self.x = int ( sc.x )
        self.y = int ( sc.y )
        self.solve ( )
    def solve ( self ) :
        dpX = [ False ] * ( len ( self.x ) + 1 )
        dpY = [ False ] * ( len ( self.y ) + 1 )
        dpY [ 0 ] [ self.x ] = True
        i = 0
        partCount = 0
        fCount = 0
        while i < len ( self.x ) :
            if self.x [ i ] == 'T' or self.y [ i ] == 'T' :
                if i == len ( self.x ) - 1 and self.x [ i ] == 'F' :
                    fCount += 1
                partCount += 1
                if partCount == 1 :
                    dpX [ partCount ] [ self.x + fCount ] = True
                elif partCount % 2 != 0 :
                    for k in range ( len ( self.x [ partCount ] ) ) :
                        if k > fCount :
                            self.x [ partCount ] [ k ] |= self.x [ partCount - 2 ] [ k - fCount ]
                        if k < len ( self.x [ partCount ] ) - fCount :
                            self.x [ partCount ] [ k ] |= self.x [ partCount - 2 ] [ k + fCount ]
            fCount = 0
        elif self.x [ i ] == 'F' :
            fCount += 1
        i += 1
