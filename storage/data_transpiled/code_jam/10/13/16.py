def _import ( ) : return _import ( )
import math
import numpy as np
import numpy as np
import InputError
class TaskC ( object ) :
    def __init__ ( self ) :
        self._in = stream
        self._out = stream
        self._in = stream
        self._in = stream
        self._in = stream
        self._out = stream
        self._in = stream
        self._in = stream
        self._in = stream
        self._in = stream
        self._in = stream
        self._out = stream
        self._in = stream
        self._ignore_empty_lines = True
        self._in = stream
        self._out = stream
        self._ignore_empty_lines = False
        self._in = stream
        self._out = stream
        self._ignore_empty_lines = True
        self._ignore_empty_lines = True
        self._ignore_empty_lines = False
        self._out = stream
        self._ignore_empty_lines = True
    def read_line ( ) :
        c = self.read ( )
        while c.strip ( ).lower ( ) == ' ' or c.strip ( ).lower ( ) == '\t' or c.strip ( ).lower ( ) == '\n' :
            c = self.read ( )
        return c
    def read_char ( ) :
        c = self.read ( )
        while c.strip ( ).lower ( ) == ' ' :
            c = self.read ( )
        return c
    def read_double ( ) :
        c = self.read ( )
        while c.strip ( ).lower ( ) == '-' :
            c = self.read ( )
        sgn = 1
        for i in range ( 3 , 1000000 ) :
            p = np.where ( c == '-' ) [ 0 ] [ 0 ]
        res = 0
        while not self._in and c != '.' :
            if c.find ( '.' ) == 0 or c.find ( '.' ) == 0 :
                if c.find ( '.' ) == 0 :
                    raise InputError
                res *= 10
        return res
    def read ( ) :
        return self._in , self._out , self._ignore_empty_lines
