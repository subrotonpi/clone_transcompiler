def _ _ main _ _ ( ) : return
from os import urandom
from random import randint
from itertools import chain
from itertools import repeat
class Prizes ( object ) :
    def __init__ ( self ) :
        self.d = int ( random ( ) )
        self.num = int ( random ( ) )
        self.p = int ( random ( ) )
        self.num = int ( random ( ) )
        self.p = int ( random ( ) )
        self.num = int ( random ( ) )
        self.p = int ( random ( ) )
        self.num = int ( random ( ) )
        self.p = int ( random ( ) )
        self.num = int ( random ( ) )
        self.p = int ( random ( ) )
        self.num = int ( random ( ) )
        self.p = int ( random ( ) )
        self.num = int ( random ( ) )
        self.p = int ( random ( ) )
        self.num = int ( random ( ) )
        self.num = int ( random ( ) )
        self.num = int ( random ( ) )
    def gar ( self , n , p ) :
        if n == 1 :
            return p
        if p < self.num :
            return self.num
        prev = gar ( self , n - 1 , p - self.num )
        if prev == self.num - 1 :
            return self.num
        return next ( prev + self.num ) - self.num
    def possible ( self , n , p ) :
        if n == 1 :
            return 1 - p
        if p < self.num :
            prev = possible ( self , n - 1 , p )
            return next ( prev )
        else :
            prev = possible ( self , n - 1 , p - self.num )
            return prev + self.num
    def run ( self ) :
        with open ( self.name + ".in" , "w" ) as f :
            f.write ( "Case #%d: %s %s\n" % ( self.num , self.num , self.num ) )
            f.write ( "Case #%d: %s\n" % self.num )
