def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def __getattr__ ( self , name ) :
        return getattr ( sys.modules [ __name__ ] , name )
    def __getitem__ ( self , key ) :
        return getattr ( sys.modules [ __name__ ] , key )
    def __setitem__ ( self , key , value ) :
        self.value = value
    def __iter__ ( self ) :
        return iter ( self )
    def __iter__ ( self ) :
        return iter ( self )
    def __iter__ ( self ) :
        return iter ( self )
