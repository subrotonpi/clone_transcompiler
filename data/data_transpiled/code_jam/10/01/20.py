def _solve ( file ) :
    import sys
    import os
    class SnapperChain ( object ) :
        def solve ( self , file ) :
            N , K = os.path.split ( file )
            mask = 1 << ( N )
            mask -= 1
            return "ON" if ( K & mask ) == mask else "OFF"
        def solve ( self , file ) :
            with open ( file , "r" ) as f :
                N , = os.path.split ( file )
                f.write ( "\n" )
                for i in range ( 1 , N + 1 ) :
                    print ( "Case #%d: %s" % ( i , solve ( f ) ) )
    return SnapperChain ( )
