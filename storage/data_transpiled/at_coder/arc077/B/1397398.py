def _import ( ) : return ''
import sys
import os
import sys
import itertools
import string
import itertools
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def __init__ ( self , * args ) :
        self.args = args
    def __init__ ( self , * args ) :
        self.args = [ ]
        self.args.append ( args )
    def read ( self ) :
        if not self.args or self.args [ 0 ] < 0 :
            raise StopIteration ( )
        self.args = [ ]
        self.args.append ( self.args [ 0 ] )
        self.args.append ( self.args [ 1 ] )
        return self.args [ 2 ]
    def read ( self ) :
        if not self.args :
            raise StopIteration ( )
        self.args = [ ]
        self.args.append ( self.args [ 0 ] )
        self.args.append ( self.args [ 1 ] )
        return self.args [ 2 ]
    def read ( self ) :
        if self.args [ 0 ] < 0 or self.args [ 0 ] < 0 :
            return self.args [ 0 ] * self.args [ 1 ]
        else :
            self.args.append ( self.args [ 0 ] )
    def write ( self , * args ) :
        self.args.append ( self.args [ 0 ] )
        return self.args [ 1 ]
    def read ( self ) :
        if self.args [ 0 ] < 0 or self.args [ 0 ] < 0 :
            return self.args [ 0 ] * self.args [ 1 ]
        else :
            self.args.append ( self.args [ 0 ] )
            return self.args [ 1 ]
    def write ( self , * args ) :
        self.args.append ( self.args [ 0 ] )
        return self.args [ 1 ]
    def write ( self , * args ) :
        self.args.append ( self.args [ 1 ] )
        return self.args [ 0 ]
