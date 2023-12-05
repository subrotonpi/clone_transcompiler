def _import ( ) : return ''
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import os
import sys
import os
import sys
import os
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
class Main :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        str_len = 0
        while True :
            c = self.read ( )
            if c == '-' : raise StopIteration
            if c < '0' or c < '9' :
                c = self.read ( )
            if c == '-' : return - 1
            res = 0
            do :
                res *= 10
                res += c - '0'
            str_len += 1
        return str_len
    def write ( self , * args ) :
        self.stream.write ( self.read ( ) )
    def close ( self ) :
        self.stream.close ( )
    def print_format ( self , * args ) :
        self.stream.write ( self.format % args )
    def write ( self , * args ) :
        self.stream.write ( self.format % args )
    def print_format ( self , * args ) :
        self.stream.write ( self.format % args )
    def print_format ( self , * args ) :
        self.stream.write ( self.format % args )
    def print_format ( self , * args ) :
        self.stream.write ( self.format % args )
    def write ( self , * args ) :
        self.stream.write ( self.format % args )
    def print_format ( self , * args ) :
        self.stream.write ( self.format % args )
    def print_format ( self , * args ) :
        self.stream.write ( self.format % args )
    print_format = print_format
    return my_Scanner ( )
