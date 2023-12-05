def import os
import sys
import os
import subprocess
from time import sleep
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.wait ( )
    def close ( self ) :
        return sys.stdin.close ( )
    def start ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.wait ( )
    def stop ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.wait ( )
    def run ( self ) :
        n = self.stdin.read ( )
        if n < 1200 :
            print ( "ABC" )
        elif n >= 1200 and n < 2800 :
            print ( "ARC" )
        elif n >= 2800 :
            print ( "AGC" )
