def _import ( ) : return sys.stdout.write
import readline
import readline
import readline
import math
import struct
import time
import sys
class Main ( object ) :
    def __init__ ( self , t ) :
        self.st = [ ]
        self.st.append ( t )
        self.st.append ( 0 )
        self.st.append ( 0 )
        self.st.append ( 0 )
        self.st.append ( 0 )
        self.st.append ( 0 )
        self.st.append ( 0 )
        self.st.append ( 0 )
        self.st.append ( 0 )
        self.st.append ( 0 )
        self.st.append ( 0 )
    def __repr__ ( self ) :
        print ( "%r" % self.st.__repr__ ( ) )
    def print_lst ( self , x ) :
        s = [ ]
        for elt in x :
            s.append ( "%r " % elt )
        print ( s )
    def join ( self , x , space = "" ) :
        if not len ( x ) : return ""
        s = [ ]
        first = True
        for elt in x :
            if first : first = False
            else : s.append ( space )
            s.append ( elt )
        return s
    def __next__ ( self ) :
        while not self.st or not self.st :
            line = readline ( self )
            self.st = [ line.strip ( ) for line in line.split ( ) ]
        return self.st
    def __next__ ( self ) :
        return int ( __next__ ( self ) )
    def __next__ ( self ) :
        return long ( __next__ ( self ) )
