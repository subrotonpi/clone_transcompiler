def _import ( ) : return sys.modules [ __name__ ]
from io import open
from time import sleep
from itertools import chain , repeat
class Syrup ( object ) :
    def __init__ ( self ) :
        self.name = 'syrup'
        self.stream = open ( '%s.in' % self.name , 'w' )
        self.stream.seek ( 0 )
        self.stream.write ( '%d\n' % repeat )
    def run ( self ) :
        try :
            self.stream.seek ( 0 )
            self.stream.write ( '%d\n' % repeat )
        except IOError :
            self.stream.seek ( 0 )
            self.stream.write ( '%s\n' % repeat )
