def _import ( ) : return sys.stdin
import io
import os
import sys
import itertools
import os
import sys
import itertools
import os
import subprocess
import subprocess
import shlex
class InputReader ( subprocess ) :
    def read ( self ) :
        stream = open ( self.stream , 'r' )
        stream = None
    def readline ( self ) :
        stream = subprocess.Popen ( [ ' \t\n\r\f,' ] , stdin = self.stream , stdout = subprocess.PIPE )
        stream = open ( self.stream , 'w' )
        stream.write ( stream.read ( ) )
        stream.close ( )
    def __next__ ( self ) :
        return int ( self.readline ( ) )
    def solve ( self , test_number , stdin , stdout ) :
        n = stdin.readline ( )
        balls = [ ]
        for i in range ( 2 * n ) :
            if stdin.readline ( ) [ 0 ] == 'W' :
                balls.append ( - stdin.readline ( ) )
            else :
                balls.append ( stdin.readline ( ) )
        dp = [ [ 0 ] * ( 2 * n ) for dpp in range ( n + 1 ) ]
        cost = [ [ 0 ] * ( 2 * n ) for dpp in dp ]
        saw = [ [ True ] * ( 2 * n ) for dpp in range ( n + 1 ) ]
        dp [ 0 ] [ 0 ] = 0
        for curr in balls :
            par = 0 if curr < 0 else 1
            curr = abs ( curr ) - 1
            sum = 0
            for j in range ( curr + 1 , n ) :
                if saw [ par ] [ j ] :
                    sum += 1
            cost [ par ] [ curr + 1 ] [ n ] = sum
            for j in range ( n - 1 , - 1 , - 1 ) :
                if saw [ par ^ 1 ] [ j ] :
                    sum += 1
                cost [ par ] [ curr + 1 ] [ j ] = sum
        return dp
