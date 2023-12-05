def _import ( ) : return os.fdopen ( os.dup ( sys.stdin.fileno ( ) ) , 'w' )
import io
import os
import sys
import os.fdopen as fdopen
import io.open
import os.fdopen as fdopen
import io.open
import os.fdopen
import os.fdopen
import io.open
import os.fdopen
import io.open
import os.fdopen
import io.open
import os.fdopen
import io.open
class _LightScanner :
    def __init__ ( self ) :
        self.stdin = None
        self.stdout = None
        self.stdin = fdopen ( os.dup ( sys.stdin.fileno ( ) ) , 'r' )
        self.string = None
        if self.stdin is None or not self.stdin.readline ( ) :
            try :
                self.stdin.readline ( )
            except io.BadStringBufferError :
                raise io.BadStringError ( )
    def _intmath ( self ) :
        return int ( self.string )
class _LightScanner ( io.Scanner ) :
    def __init__ ( self ) :
        self.stdin = None
        self.stdout = fdopen ( os.dup ( sys.stdin.fileno ( ) ) , 'w' )
        self.stdout = fdopen ( os.dup ( sys.stdout.fileno ( ) ) , 'w' )
        self.stdin = fdopen ( self.stdin.fileno ( ) , 'r' )
        self.stdout = fdopen ( self.stdout.fileno ( ) , 'w' )
        self.stdout = fdopen ( self.stdout.fileno ( ) , 'w' )
        self.stdout.write ( '\n' )
        self.stdout.flush ( )
        self.stdout.close ( )
    def _intmath ( self ) :
        return int ( self.string )
