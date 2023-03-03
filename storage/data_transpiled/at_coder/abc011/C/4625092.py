def import import sys , out
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = len ( sys.argv )
        NG = [ ]
        for i in range ( 3 ) :
            NG.append ( random.randint ( 0 , 1 ) )
            if NG [ i ] == N :
                out.write ( 'NO' )
                return
        dp = [ - 1 ] * 303
        dp.append ( 100 )
        for i in range ( N - 1 , - 1 , - 1 ) :
            if i in [ NG [ 0 ] , NG [ 1 ] , NG [ 2 ] ] :
                continue
            for j in [ 1 , 2 , 3 ] :
                dp [ i ] = max ( dp [ i + j ] - 1 , dp [ i ] )
        if dp [ 0 ] >= 0 :
            out.write ( 'YES' )
        else :
            out.write ( 'NO' )
