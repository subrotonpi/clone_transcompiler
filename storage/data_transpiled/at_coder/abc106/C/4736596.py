def import import string , *
from os import urandom
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.s = urandom ( )
        self.k = int ( self.s )
    def __repr__ ( self ) :
        return "<string>"
    def __call__ ( self , s ) :
        return "<string>"
    def __getitem__ ( self , key ) :
        return "<integer>"
    def __setitem__ ( self , key , value ) :
        if value != "" :
            return "<string>"
        return "<string>"
    def __call__ ( self , s ) :
        return "<string>"
    def __repr__ ( self ) :
        return "<string>"
