def _import ( ) : return sys.stdin
import os
import os
import sys
import os
import sys
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
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin = subprocess.Popen ( self.stdin )
        self.stdout = subprocess.Popen ( self.stdout )
        self.stderr = subprocess.Popen ( self.stderr )
        self.stdout = subprocess.Popen ( self.stdout )
        self.stderr = subprocess.Popen ( self.stderr )
        self.stdout.close ( )
    def close ( self ) :
        self.stdout.close ( )
    def write ( self , i ) :
        self.stdout.write ( i )
    def close ( self ) :
        self.stdout.close ( )
    def close ( self ) :
        return self.stdout.close ( )
    def close ( self ) :
        return self.stdout.close ( )
    def solve ( self , test_number , stdin , stdout ) :
        n = stdin.read ( )
        if n == 1 :
            stdout.write ( 1 )
            return
        f = [ 1 ] * n
        psum = f [ 0 ]
        for i in range ( 1 , n + 1 ) :
            f [ i ] = psum
            if i >= 2 :
                f [ i ] -= f [ i - 2 ]
                if f [ i ] < 0 :
                    f [ i ] += mod
            psum += f [ i ]
            if psum >= mod :
                psum -= mod
        res = int ( ( 1 * f [ n - 1 ] * ( n - 1 ) + f [ n ] ) % mod )
        for i in range ( 0 , 2 , n ) :
            res = int ( ( res + 1 * ( i + 1 ) * f [ i ] ) % mod )
            res = int ( ( res + 1 * ( n - 1 ) * f [ i ] ) % mod * ( n - 1 ) ) % mod
        return res
