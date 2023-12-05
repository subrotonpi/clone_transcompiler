def googlejam ( ) :
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import sys
    class CrazyRows ( subprocess ) :
        def __init__ ( self ) :
            subprocess.Popen ( self.cmd , shell = True )
            self.stdout = subprocess.Popen ( self.cmd , shell = True )
            self.stdout = subprocess.Popen ( self.cmd , shell = True )
            self.stdout.write ( "C:\A-large.out.txt\n" )
            self.T = int ( self.stdout.readline ( ).strip ( ) )
            for i in range ( self.T ) :
                N = int ( self.stdout.readline ( ).strip ( ) )
                m = [ ]
                l = [ ]
                for line in self.stdout.readlines ( ) :
                    m.append ( line.strip ( ) )
                for j in range ( N ) :
                    k = 0
                    for k in m [ j ] [ : - 1 ] :
                        if k == '1' :
                            break
                    l.append ( k )
            pr.write ( "Case #%d: %s\n" % ( self.i + 1 , self.result ( 0 , l ) ) )
    def get_result ( now , l ) :
        if now == len ( l ) :
            return 0
        for i in range ( now , len ( l ) ) :
            if l [ i ] <= now :
                break
        tr = i - now
        for j in range ( i , now - 1 , - 1 ) :
            temp = l [ j ]
            l [ j ] = l [ j - 1 ]
            l [ j - 1 ] = temp
        return tr + get_result ( now + 1 , l )
