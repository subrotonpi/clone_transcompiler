def import _main
import os
import sys
import time
import subprocess
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._main = None
        self._main = ''
        self._main = subprocess.Popen ( [ '/usr/bin/sh' , '-v' ] ).communicate ( ) [ 0 ]
    MOD = 1_000_000_000 + 7
    def run ( self ) :
        sc = subprocess.Popen ( [ '/usr/bin/sh' , '-v' ] ).communicate ( ) [ 0 ]
        a = sc.wait ( )
        b = sc.wait ( )
        ans = 1
        factor = [ ]
        for i in range ( b + 1 , a + 1 ) :
            v = i
            for j in range ( 2 , a * v + 1 ) :
                c = 0
                while v % j == 0 :
                    v //= j
                    c += 1
                if c > 0 :
                    factor.append ( j )
            if v > 1 :
                factor.append ( v )
        factor.sort ( )
        for i in range ( len ( factor ) ) :
            j = i
            while j + 1 < len ( factor ) and factor [ i ] == factor [ j + 1 ] :
                j += 1
            c = 0
            v = factor [ i ]
            for k in range ( b + 1 , a + 1 ) :
                u = k
                while u % v == 0 :
                    u //= v
                    c += 1
            ans = ans * ( c + 1 ) % MOD
            i = j
        print ( ans )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
