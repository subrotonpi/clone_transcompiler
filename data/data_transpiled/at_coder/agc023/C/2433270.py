def _ _ main _ _ ( ) : return sys.stdin.read ( )
import os
import sys
import time
import threading
class Main ( threading.Thread ) :
    def __init__ ( self ) :
        threading.Thread ( None , Main , '' , 16 * 1024 * 1024 ).start ( )
    def run ( self ) :
        main = self._main
        try :
            self.stdin = sys.stdin.read ( )
            self.stdout = open ( self.stdout.fileno ( ) , 'w' )
            main.solve ( )
            self.stdout.close ( )
        except IOError :
            pass
    def readline ( self ) :
        s = [ ]
        if self.stdin.read ( 1 ).isspace ( ) and not self.stdin.read ( 1 ).isspace ( ) :
            s.append ( self.stdin.read ( 1 ) )
        return s
    def readline ( self ) :
        s.append ( self.stdin.readline ( ) )
    def readline ( self ) :
        s = [ ]
        if self.stdin.read ( 1 ).isspace ( ) and not self.stdin.read ( 1 ).isspace ( ) :
            s.append ( self.stdin.readline ( ) )
        return s
    def readline ( self ) :
        s.append ( self.stdin.readline ( ) )
    def readline ( self ) :
        s = [ ]
        if self.stdin.read ( 1 ).isspace ( ) :
            while self.stdin.read ( 1 ).isspace ( ) and not self.stdin.read ( 1 ).isspace ( ) :
                s.append ( self.stdin.readline ( ) )
        return s
    def readline ( self ) :
        s.append ( self.stdin.readline ( ) )
    def readline ( self ) :
        s = [ ]
        if self.stdin.read ( 1 ).isspace ( ) :
            while self.stdin.read ( 1 ).isspace ( ) and self.stdin.read ( 1 ).isspace ( ) :
                s.append ( self.stdin.readline ( ) )
        return s
    def readline ( self ) :
        return self.stdin.readline ( )
