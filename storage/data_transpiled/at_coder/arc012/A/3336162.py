def import _readline
from sys import stdout
from os import urandom
from io import BytesIO
from time import sleep
from random import choice
class Main ( object ) :
    def __init__ ( self ) :
        self.S = ''
    def readline ( self ) :
        fc = fast.readline ( )
        S = fc.next ( )
        print ( self.solve ( ) )
    def solve ( self ) :
        if S == 'Monday' :
            return 5
        elif S == 'Tuesday' :
            return 4
        elif S == 'Wednesday' :
            return 3
        elif S == 'Thursday' :
            return 2
        elif S == 'Friday' :
            return 1
        else :
            return 0
    @ staticmethod
    def readline ( ) :
        if not isinstance ( readline , bytes ) or not readline.decode ( 'ascii' ) :
            try :
                readline = BytesIO ( stdin.read ( 1 ) )
            except EOFError :
                pass
        return readline ( )
    def readline ( self ) :
        if not isinstance ( readline , bytes ) or not readline.decode ( 'ascii' ) :
            try :
                readline = BytesIO ( stdin.read ( 1 ) )
            except EOFError :
                pass
        return readline ( )
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( __next__ ( self ) )
        return a
    def __next__ ( self ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( __next__ ( self ) )
        return a
