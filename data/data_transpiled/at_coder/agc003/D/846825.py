def _import ( ) : return sys.stdin
import io
import os
import math
import os
import shlex
import math
import math
import random
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.output_file = sys.stdout
        self.stdin = io.open ( self.rfile )
        self.stdout = io.open ( self.output_file , 'w' )
        self.stdin.close ( )
        self.stdout.close ( )
        self.vals = [ ]
        self.vals.sort ( )
        for i in range ( self.vals.size ) :
            j = i
            self.same = 0
            while self.vals [ j ] == self.vals [ i ] :
                self.same += 1
        self.vals.sort ( )
        self.res += max ( self.same , self.vals [ i ] )
        self.res += min ( self.cubes , self.vals [ i ] )
    def solve ( self , test_number , stream , out ) :
        n = stream.read ( 32768 )
        s = [ ]
        for i in range ( n ) :
            s.append ( stream.read ( 32768 ) )
        max = 1
        for x in s :
            max = max ( x )
        sq3 = round ( pow ( max , 1./ 3 ) , 2 )
        while sq3 ** 2 <= max :
            sq3 += 1
        maxsq2 = round ( sqrt ( max ) , 2 )
        while maxsq2 ** 2 <= max :
            maxsq2 += 1
        pr = [ False ] * int ( sq3 )
        pr.extend ( [ 2 , len ( pr ) , True ] )
        pr_count = 0
        for i in range ( 2 , len ( pr ) ) :
            if pr [ i ] :
                pr_count += 1
                for j in range ( i * 2 , len ( pr ) , i ) :
                    pr [ j ] = False
        if deg == 1 :
            c *= p
            o *= p
            if o > max :
                res += 1
    return res
