def import _main
import os
import sys
import time
import subprocess
class Main ( object ) :
    def __init__ ( self ) :
        self._main = None
        self._main = sys.argv [ 1 : ]
    def run ( self ) :
        sc = subprocess.Popen ( [ '/usr/bin/sh' , '-c' , '--no-color' ] , stdout = subprocess.PIPE , stderr = subprocess.PIPE )
        n = sc.wait ( )
        a = [ [ False for s in s.split ( '\n' ) ] for s in sc.stdout.read ( ).split ( '\n' ) ]
        for i in range ( n ) :
            a [ i ] [ n - 1 - i ] = s [ i ] == 'o'
        cnt = 0
        for i in range ( n ) :
            for j in range ( n ) :
                if a [ i ] [ j ] :
                    continue
                if not a [ i ] [ j ] :
                    cnt += 1
                    for k in range ( j , n ) :
                        a [ i ] [ k ] = True
                    for k in range ( i + 1 , n and k <= j ) :
                        a [ i + 1 ] [ k ] = True
        print ( cnt )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
