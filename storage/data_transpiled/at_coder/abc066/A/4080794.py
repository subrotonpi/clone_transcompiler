def main ( ) :
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    class Main ( subprocess.Popen ) :
        def communicate ( self ) :
            a = subprocess.Popen ( [ '/usr/bin/python' , '--version' ] ).wait ( )
            b = subprocess.Popen ( [ '/usr/bin/python' , '--version' ] ).wait ( )
            c = subprocess.Popen ( [ '/usr/bin/python' , '--version' ] ).wait ( )
            x = [ a , b , c ]
            x.sort ( )
            print ( x [ 0 ] + x [ 1 ] )
