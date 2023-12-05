def _import ( ) : return
import StringIO
import os
import sys
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
class Main ( object ) :
    def __init__ ( self ) :
        self.input_file = sys.stdin
        self.output_file = sys.stdout
        self.stdin = light_scanner.Scanner ( self.input_file )
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.solver = shlex
        self.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
    def solve ( self , test_number , self , f ) :
        n , x = self.ints
        if x == 1 or x == 2 * n - 1 :
            f.write ( NO )
            return
        f.write ( YES )
        ans = [ ]
        if x == 2 * n - 2 and n > 2 :
            ans.append ( x - 2 )
            ans.append ( x + 1 )
            ans.append ( x )
            ans.append ( x - 1 )
            m = 1
            for i in range ( 2 * n - 1 ) :
                if i == n - 2 :
                    i = n + 2
                    if i >= 2 * n - 1 :
                        break
                if m == x - 2 :
                    m = x + 2
                ans.append ( m )
                m += 1
        else :
            ans.append ( x + 1 )
            ans.append ( x )
            ans.append ( x - 1 )
            if n > 2 :
                ans.append ( x + 2 )
            m = 1
            for i in range ( 2 * n - 1 ) :
                if i == n - 2 :
                    i = n + 2
                    if i >= 2 * n - 1 :
                        break
                if m == x - 1 :
                    m = x + 3
                ans.append ( m )
                m += 1
    class LightScanner ( object ) :
        def __init__ ( self ) :
            self.input_file = input_file
            self.output_file = output_file
            self.stdin = light_scanner.Scanner ( self.input_file )
            self.stdout = light_scanner