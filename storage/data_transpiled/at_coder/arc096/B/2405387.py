def _import ( ) :
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class Main ( subprocess ) :
        def __init__ ( self ) :
            subprocess.Popen ( self.cmd )
            self.stdout = subprocess.Popen ( self.cmd )
            self.stdout = subprocess.Popen ( self.cmd )
            self.stderr = subprocess.Popen ( self.cmd )
            self.stdout = subprocess.Popen ( self.cmd )
            self.stderr = subprocess.Popen ( self.cmd )
            self.stdout.close ( )
            self.stderr.close ( )
        def solve ( self , test_number , stdin , stdout ) :
            n = int ( 1e5 ) + 10
            c = stdin.read ( )
            x = [ ]
            y = [ ]
            v = [ ]
            ldp = [ ]
            rdp = [ ]
            for i in range ( 1 , n + 1 ) :
                x.append ( stdin.read ( ) )
                y.append ( c - x [ i ] )
                v.append ( stdin.read ( ) )
            res = 0
            x.append ( 0 )
            x.append ( c )
            ldp.append ( 0 )
            for i in range ( 1 , n + 1 ) :
                ldp.append ( ldp [ i - 1 ] + v [ i ] - ( x [ i ] - x [ i - 1 ] ) )
                res = max ( res , ldp [ i ] )
            y.append ( c )
            y.append ( 0 )
            rdp.append ( 0 )
            for i in range ( n + 1 , n ) :
                rdp.append ( rdp [ i + 1 ] + v [ i ] - ( y [ i ] - y [ i + 1 ] ) )
                res = max ( res , rdp [ i ] )
            lldp = [ ]
            rrdp = [ ]
            for i in range ( 1 , n + 1 ) :
                lldp.append ( lldp [ i ] )
            return res
    return Main
