def import _scanner
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.scanning ( )
        templine = [ i for i in range ( self.N ) ]
        for swapline in self.line :
            temp = templine [ - 1 ]
            templine [ - 1 ] = templine [ - 1 ]
            templine [ - 1 ] = temp
    for i in range ( self.N ) :
        out [ templine [ i ] ] = i
    for i in range ( self.M ) :
        if out [ i ] != ( - 1 , - 1 ) :
            loop = [ ]
            start , next = i , i
            while True :
                rev = next
                loop.append ( next )
                next = out [ next ]
                out [ rev ] = - 1
        else :
            loop.append ( start )
        linegroup.append ( loop )
    for i in range ( len ( linegroup ) ) :
        groupsize = len ( linegroup [ i ] )
        kaisuu = D % groupsize
        for j in range ( groupsize ) :
            out [ linegroup [ i ] [ j ] ] = linegroup [ i ] [ ( j + kaisuu ) % groupsize ]
    for x in out :
        print ( x + 1 )
def scanning ( ) :
    scan = _scanner.scan
    N , M , D = scan.next
    line = [ scan.next ( ) for i in range ( M ) ]
    out = [ scan.next ( ) for i in range ( N ) ]
    scan.close ( )
return Main
