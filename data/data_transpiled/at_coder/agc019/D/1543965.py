def _import ( ) : return sys.stdout.write
import io
import os
import os
import itertools
import io
import itertools
import string
import io
import itertools
import string
import itertools
import itertools
import itertools
import string
import io
import os
import os
import sys
import subprocess
import subprocess
import subprocess
import subprocess
def read ( ) :
    if len ( sys.stdin.read ( ) ) == 0 : raise InputError ( )
    if sys.stdin.read ( ) >= 0 :
        bufptr = 0
        try :
            buf = sys.stdin.read ( )
        except IOError :
            raise InputError ( )
        if len ( sys.stdin.read ( ) ) <= 0 : return - 1
    else :
        return ''
class MyScanner ( io.Scanner ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = io
        self.stream = stream
        self.stream = self.stream
        self.stream.close ( )
    def __str__ ( self ) :
        return self.stream.getvalue ( )
    def __iter__ ( self ) :
        return iter ( self.stream.__iter__ ( ) )
    def __next__ ( self ) :
        return self.stream.__next__
    def __iter__ ( self ) :
        return self.stream.__iter__ ( )
    def __next__ ( self ) :
        return self.stream.__next__
class MyScanner ( io.Scanner ) :
    def __init__ ( self , stream ) :
        self.stream = io.StringIO ( )
        self.stream = stream
        self.stream = self.stream
        self.stream = self.stream
        self.stream = self.stream
        self.stream = self.stream
        self.stream.next = self.stream
        self.stream.next = self.stream.__next__
    def __iter__ ( self ) :
        return self.stream.__iter__ ( )
class MyScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = self.stream
        self.stream = self.stream
        self.stream = self.stream
        self.stream = self.stream
        self.stream = self.stream
