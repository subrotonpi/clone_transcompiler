def import import os , errno
from os import urandom
from io import BytesIO
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = BytesIO ( )
        self.stdin.seek ( 0 )
        self.stdin.seek ( 0 )
        a = urandom.read ( 1 )
        self.stdin.seek ( 0 )
        b = urandom.read ( 1 )
        self.stdin.seek ( 0 )
        c = urandom.read ( 1 )
        if b >= c :
            print ( b , c )
        else :
            self.sum = b * 2
            c = c - b
            if a >= c :
                print ( self.sum , c )
            else :
                print ( self.sum , a + 1 )
