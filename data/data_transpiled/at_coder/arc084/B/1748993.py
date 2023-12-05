def _import ( ) : return sys.stdin.read ( )
import time
import sys
import struct
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__init__ ( None , Main ( ) , '' , os.getpid ( ) )
    def read ( self ) :
        self.__readwrite ( )
    def read ( self ) :
        nl = randint ( 0 , int ( self.__readwrite ( ) ) )
        if self.__readwrite ( ) < '0' or self.__readwrite ( ) > '9' :
            self.__readwrite ( )
        elif self.__readwrite ( ) == - 1 or not self.__readwrite ( ) :
            return - n if self.__readwrite ( ) < '0' else n
        else :
            raise ValueError ( )
    def write ( self , * args ) :
        self.__readwrite ( )
        self.__readwrite ( )
    def solve ( K ) :
        f = [ ]
        f.append ( int ( self.__readwrite ( ) ) / 3 )
        que = deque ( )
        f.append ( 1 )
        f.append ( 10 % K )
        que.append ( 1 )
        que.append ( 10 % K )
        while not que.empty ( ) :
            v = que.popleft ( )
            if f [ 10 * v % K ] > f [ v ] :
                f [ 10 * v % K ] = f [ v ]
                que.append ( 10 * v % K )
            if f [ ( v + 1 ) % K ] > f [ v ] + 1 :
                f [ ( v + 1 ) % K ] = f [ v ] + 1
                que.append ( ( v + 1 ) % K )
        print ( f [ 0 ] )
class Scanner ( object ) :
    def __init__ ( self ) :
        self.__readwrite = sys.stdin.read ( 1024 )
    def read ( self ) :
        self.__readwrite = sys.stdin.read ( 1024 )
    def write ( self , * args ) :
        self.__readwrite = sys.stdout.write
