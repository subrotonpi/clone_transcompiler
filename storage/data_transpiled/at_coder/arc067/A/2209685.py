def import _raw_input
import sys
import os
import sys
import tokenize
import tokenize
import tokenize
import os
import sys
import os
import sys
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
class Main ( InputReader ) :
    def raw_input ( self ) :
        try :
            tok = tokenize.next ( self.next ( ) )
        except StopIteration :
            raise InputError ( )
        return tok
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        res = [ ]
        for i in range ( self.next ( ) ) :
            res.append ( next ( self.next ( ) ) )
        return res
    def __next__ ( self ) :
        return long ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        return next ( self.next ( ) )
    return __next__
