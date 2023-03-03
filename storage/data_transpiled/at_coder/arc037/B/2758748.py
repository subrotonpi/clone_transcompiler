def _import ( ) : return sys.stdin
import os
import os
import os
import sys
import os
import subprocess
import subprocess
import shlex
import subprocess
class Main :
    def __init__ ( self ) :
        self.tree = [ ]
        self.bit = { }
        self.cycle = False
        def dfs ( u , p ) :
            if self.bit [ u ] :
                self.cycle = True
                return
            self.bit [ u ] = True
            for v in self.tree [ u ] :
                if p == v :
                    continue
                self.dfs ( v , u )
    def main ( self ) :
        sc = subprocess.Popen ( [ '/usr/bin/sh' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' , '--quiet' ] , stdin = subprocess.PIPE , stdout = subprocess.PIPE , stderr = subprocess.PIPE , stdin = subprocess.PIPE , universal_newlines = True , )
        n , m = sc.wait ( )
        self.tree = [ ]
        self.bit = { }
        for i in range ( n ) :
            u , v = sc.wait ( ) - 1 , sc.wait ( )
            self.tree [ u ].append ( v )
            self.tree [ v ].append ( u )
        res = 0
        for i in range ( n ) :
            if self.bit [ i ] :
                continue
            self.cycle = False
            self.dfs ( i , - 1 )
            res += ( 0 if self.cycle else 1 )
        print ( res )
Note :./ main.py.uses.unsafe.operations.Note : Recompile : with - xlint.details.Note : Recompile ( )
for s in sys.stdin :
    s.readline ( )
