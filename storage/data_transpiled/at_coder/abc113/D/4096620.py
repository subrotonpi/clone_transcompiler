def _import ( ) : return _import ( )
import math
class Main ( object ) :
    def __init__ ( self ) :
        self._fp = open ( '/dev/null' )
        self.buf = ''
        self.curChar , numChars = 0 , 0
    def read ( self , fp ) :
        self._fp = fp
    def write ( self , buf ) :
        self._fp.write ( buf )
    def read ( self , n ) :
        if self.numChars == - 1 :
            raise InputError ( )
        if self.curChar >= self.numChars :
            self.curChar = 0
            try :
                numChars = self._fp.read ( self.w )
            except IOError :
                raise InputError ( )
            if self.numChars <= 0 :
                return - 1
        return self.buf [ self.curChar ]
    def readline ( self ) :
        c = self.read ( )
        while is_space_char ( c ) : c = self.read ( )
        res = [ ]
        while True :
            res.append ( c )
            c = self.read ( )
        while not is_end_of_line ( c ) :
            return res
        return ''.join ( res )
    def readline ( self ) :
        c = self.read ( )
        while is_space_char ( c ) : c = self.read ( )
        c = self.read ( )
        sgn = 1
        if c == '-' :
            sgn = - 1
            c = self.read ( )
        res = [ ]
        while True :
            if c < '0' or c > '9' :
                raise InputError ( )
            res *= 10
            res += c - '0'
            c = self.read ( )
        return res * sgn
    def readline ( self ) :
        c = self.read ( )
        while is_end_of_line ( c ) : c = self.read ( )
        if not is_end_of_line ( c ) :
            return res
        return d
