def _import ( ) : return
import math
import numpy
import os
import os
import sys
class Main ( object ) :
    R , C = math.mp.mpf ( 1e9 ) , math.mp.mpf ( 1e9 )
    X , Y , D , L = math.mp.mpf ( 1e9 ) , math.mp.mpf ( 1e9 ) , math.mp.mpf ( 1e9 )
    def run ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            os.dup2 ( devnull.fileno ( ) , sys.stdout.fileno ( ) )
            R = os.dup2 ( devnull.fileno ( ) , sys.stdout.fileno ( ) )
            C = os.dup2 ( devnull.fileno ( ) , sys.stdout.fileno ( ) )
            X = os.dup2 ( devnull.fileno ( ) , sys.stdout.fileno ( ) )
            Y = os.dup2 ( devnull.fileno ( ) , sys.stdout.fileno ( ) )
            D = os.dup2 ( devnull.fileno ( ) , sys.stdout.fileno ( ) )
            L = os.dup2 ( devnull.fileno ( ) , sys.stdout.fileno ( ) )
            if X * Y == D + L :
                ans = ncr ( X * Y , D )
                ans = ( ans * ( R - X + 1 ) ) % MOD
                ans = ( ans * ( C - Y + 1 ) ) % MOD
                print ( ans )
            else :
                ans = ( ncr ( X * Y , D ) * ncr ( X * Y - D , L ) ) % MOD
                ans = ( ans + MOD - ( ncr ( ( X - 1 ) * Y , D ) * ncr ( ( X - 1 ) * Y - D , L ) * 2 ) % MOD ) % MOD
                ans = ( ans + MOD - ( ncr ( ( X - 2 ) * Y , D ) * ncr ( ( X - 2 ) * Y - D , L ) * 2 ) % MOD ) % MOD
                ans = ( ans + MOD - ( ncr ( ( X - 2 ) * Y , D ) * ncr ( ( X - 1 ) * Y - D , L ) * 2 ) % MOD ) % MOD
