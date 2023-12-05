def import import sys , StringIO , traceback
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.__file = sys.__stdout__
    def run ( self ) :
        with open ( '/proc/self/_run.txt' , 'r' ) as f :
            self.__file = f.read ( )
    def run ( self ) :
        with open ( '/proc/self/_run.txt' , 'r' ) as f :
            self.__file = f.read ( )
    def run ( self ) :
        self.__file = sys.__stdout__
        self.__file = sys.__stdout__
        self.__code = sys.__stdout__
        if self.__file.isatty ( ) and not self.__file.isatty ( ) :
            print ( 'No' )
            return
        else :
            print ( 'Yes' )
    a = [ [ ] for _ in range ( self.__file.tell ( ) ) ]
    for i in range ( 0 , self.__file.tell ( ) , self.__file.tell ( ) ) :
        for j in range ( 0 , self.__file.tell ( ) , self.__file.tell ( ) ) :
            a [ i ] [ j ] = 1_000_000_000 - 1
            if i + self.__file.tell ( ) < self.__file.tell ( ) and j + self.__file.tell ( ) < self.__file.tell ( ) :
                a [ i + self.__file.tell ( ) ] [ j + self.__file.tell ( ) ] = - 1_000_000_000
    for i in range ( self.__file.tell ( ) ) :
        for j in range ( self.__file.tell ( ) ) :
            print ( a [ i ] [ j ] + ( j < self.__file.tell ( ) and j + self.__file.tell ( ) or j + self.__file.tell ( ) ) , end = " " )
