def qr2010 ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import sys
    class SnapperChain ( subprocess ) :
        def solve ( self ) :
            fname = sys.argv [ 1 ]
            obj = subprocess.Popen ( [ "snapperchain" , "--" , fname ] )
            self.solve ( fname )
        def solve ( self ) :
            f = open ( fname )
            f.write ( "{}.out\n".format ( fname ) )
            T = int ( f.readline ( ) )
            for i in range ( T ) :
                data = f.readline ( )
                token = data.split ( )
                N = int ( token [ 0 ] )
                K = int ( token [ 1 ] )
                f.write ( "Case #{}: ".format ( i + 1 ) )
                if K & ( ( ( 1 << N ) - 1 ) ) == ( ( 1 << N ) - 1 ) :
                    f.write ( "ON\n" )
                else :
                    f.write ( "OFF\n" )
                f.write ( "\r\n" )
            f.close ( )
    return SnapperChain ( )
