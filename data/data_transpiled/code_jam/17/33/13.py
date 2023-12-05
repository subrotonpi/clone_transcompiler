def kz.abishev.round1c
import os
import sys
import os
import sys
import glob
import glob
import glob
import math
import os
import os
import sys
import subprocess
import tempfile
import tempfile
import time
class C :
    NAME = 'C'
    ATTEMPT = 0
    EPS = 0.000001
    def run ( self ) :
        p = glob.glob ( os.path.join ( os.path.dirname ( __file__ ) , '*' ) )
        assert n == k
        while u >= EPS :
            eq = 0
            while eq < n and abs ( p [ eq ] - p [ 0 ] ) < EPS :
                eq += 1
            next_p = 1 if eq == n else p [ eq ]
            to_add = min ( u / eq , next_p - p [ 0 ] )
            for i in range ( eq ) :
                p [ i ] += to_add
            u -= to_add * eq
        ans = 1
        for i in range ( n ) :
            ans *= p [ i ]
        return ans
    def run ( self , _input , _output ) :
        with open ( _input , 'r' ) as _input :
            with open ( _output , 'w' ) as _output :
                t = input.readline ( )
                input.readline ( )
                for tt in range ( 1 , t + 1 ) :
                    output.write ( 'Case #%d: ' % tt )
                    self.run ( input , _output )
                    output.flush ( )
    def run ( self ) :
        return run ( sys.stdin , sys.stdout )
    def run ( self ) :
        input = open ( os.path.join ( os.path.dirname ( __file__ ) , '*' ) )
        output = open ( os.path.join ( os.path.dirname ( __file__ ) , '*' ) , 'w' )
        try :
            self.run ( input , output )
        finally :
            try :
                output.close ( )
            except IOError :
                pass
