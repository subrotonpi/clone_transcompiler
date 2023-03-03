def _ ( ) : return
import sys
import os
import subprocess
import subprocess
import subprocess
class Solution ( subprocess.Popen ) :
    def __init__ ( self ) :
        self.stdin = subprocess.PIPE
        self.stdout = subprocess.PIPE
        self.stdout = subprocess.PIPE
        self.stk = [ ]
        self.isServer = False
    def main ( self ) :
        if self.isServer :
            self.stdin = subprocess.Popen ( self.stdin , stdout = subprocess.PIPE )
            self.stdout.write ( "YES" if self.isServer else "NO" )
        self.stdout.flush ( )
    def loadLine ( self ) :
        try :
            self.stk = shlex.split ( self.stdin.readline ( ) )
        except ValueError :
            pass
    def readline ( self ) :
        try :
            return self.stdin.readline ( )
        except ValueError :
            pass
    def next_word ( self ) :
        while not self.stk or not self.stk :
            self.load_line ( )
        return self.stk [ 0 ]
    def randint ( self ) :
        while not self.stk or not self.stk :
            self.load_line ( )
        return int ( self.stk [ 0 ] )
    def uniform ( self ) :
        while self.stk or not self.stk :
            self.load_line ( )
        return uniform ( self.stk [ 0 ] )
    def uniform ( self ) :
        while self.stk or not self.stk :
            self.load_line ( )
        return uniform ( self.stk [ 0 ] )
    def uniform ( self ) :
        while self.stk or not self.stk :
            self.load_line ( )
        return uniform ( self.stk [ 0 ] )
    def uniform ( self ) :
        while self.stk or not self.stk :
            self.load_line ( )
        return uniform ( self.stk [ 0 ] )
    def sample ( self ) :
        return sample ( self )
