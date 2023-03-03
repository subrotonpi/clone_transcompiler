def import import time , *
from time import sleep
from time import sleep
from time import sleep
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( time ( ) )
    def __getitem__ ( self , key ) :
        return self.n
    def __setitem__ ( self , key , value ) :
        self.n = int ( time ( ) )
    def __getitem__ ( self , key ) :
        return self.n
    def __repr__ ( self ) :
        return '<%s>' % repr ( self.n )
