def import locale , setlocale
import locale
import os
import sys
import locale
import string
import locale
import sys
import random
import sys
class D :
    def __init__ ( self ) :
        Scanner = sys.stdin
        def intline ( self ) :
            return atoi ( self.readline ( ) )
        def solve ( self ) :
            res = 0
            H , W , R = struct.unpack ( '>H' , self.readline )
            D = [ ]
            X = [ ]
            D.append ( [ 1 ] )
            for i in range ( R ) :
                x = random.randint ( 0 , 1 )
                y = random.randint ( 0 , 1 )
                if x < 0 or y < 0 :
                    continue
                if x + 1 >= H or y + 1 >= W :
                    continue
                X [ x , y ] = True
            for x in range ( H ) :
                for y in range ( W ) :
                    if X [ x , y ] :
                        continue
                    px = x - 2
                    py = y - 1
                    if px >= 0 and py >= 0 :
                        D [ x , y ] = ( D [ x , y ] + D [ px , py ] ) % 10007
                    px = x - 1
                    py = y - 2
                    if px >= 0 and py >= 0 :
                        D [ x , y ] = ( D [ x , y ] + D [ px , py ] ) % 10007
            return D [ H - 1 ] [ W - 1 ]
        def solveall ( self ) :
            N = atoi ( self.readline ( ) )
            for i in range ( N ) :
                r = solve ( self )
                print ( "Case #%d: %d\n" % ( i + 1 , r ) )
    D = D ( )
    f = open ( 'D-small-attempt0.in' , 'r' )
    f.close ( )
    locale.setlocale ( locale.LC_ALL , 'en-US' )
    return D
