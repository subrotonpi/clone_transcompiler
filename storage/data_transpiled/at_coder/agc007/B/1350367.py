def _import ( ) : return _import ( )
import sys
import string
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.n = self.n
    def readString ( self ) :
        c = self._next
        while self.isSpaceChar ( c ) :
            c = self._next
        res = [ ]
        while self.isSpaceChar ( c ) :
            c = self._next
        res.append ( c )
        while self.isEndOfLine ( ) :
            c = self._next
        res = [ ]
        while self.isSpaceChar ( c ) :
            c = self._next
        res.append ( c )
        while not self.isEndOfLine ( ) :
            return res
        for x in res :
            w.write ( "%d " % ( x + 1 ) )
        w.write ( "\n" )
        for x in res :
            w.write ( "%d " % ( x + 1 ) )
        w.close ( )
class Input ( object ) :
    def __init__ ( self , stream = sys.stdout ) :
        self.stream = stream
        self.buf = ''
        self.curChar , self.snumchars = self.stream.read ( 8192 )
        self.filter = None
    def read ( self ) :
        self.stream.read ( 8192 )
        if self.snumchars == - 1 : raise InputError ( )
        if self.curChar >= self.snumchars :
            self.curChar = 0
            try :
                self.snumchars = self.stream.read ( self.snumchars )
            except EOFError :
                raise InputError ( )
            if self.snumchars <= 0 : return - 1
        return self.curChar
    def read ( self ) :
        self.stream.read ( self.snumchars )
