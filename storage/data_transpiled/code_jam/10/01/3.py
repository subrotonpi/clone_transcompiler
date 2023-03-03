def _ import SPACETOKEN os.write ( ) : SPACETOKEN print ( "Case #{}: ".format ( t + 1 ) )
import os
import sys
class Solution ( object ) :
    def do_main ( self ) :
        with open ( "input.txt" , "r" ) as sc :
            with open ( "output.txt" , "w" ) as pw :
                T = sc.read ( )
                for t in range ( T ) :
                    N , K = sc.read ( ) , sc.read ( )
                    mask = ( 1 << N ) - 1
                    pw.write ( "Case #{}: ".format ( t + 1 ) )
                    pw.write ( "ON" if ( K & mask ) == mask else "OFF" )
            pw.flush ( )
            pw.close ( )
