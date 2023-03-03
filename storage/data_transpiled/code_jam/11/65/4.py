def _import ( ) : return _import ( )
import sys
import struct
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        stream = open ( 'input.in' , 'rb' )
        def read ( self ) :
            if self.numchars == - 1 : raise InputError ( )
            if self.numchars >= self.numchars + self.numchars :
                self.numchars = self.numchars
        stream.write ( 'Case #%d: %.12f %d\n' % ( self.testnumber , self.p [ ( ) ] , self.numchars ) )
    def close ( self ) :
        stream.close ( )
    def exit ( self , p , index , bet , max_bet ) :
        self.pwin = 1
        self.plose = 0
        self.start_bet = bet
        while self.bet <= max_bet :
            self.plose += self.pwin / 2
            self.pwin /= 2
            self.loseamount += self.plose
            self.result = max ( self.result , self.pwin * self.get ( self.p , self.index - self.loseamount ) + self.plose * self.get ( self.p , self.index + self.startbet ) )
            self.bet *= 2
        return self.result
    def get ( self , l ) :
        if l < 0 : return 0
        if l >= len ( self.p ) : return 1
        return self.p [ ( ) ]
    def read ( self ) :
        c = self.read ( )
        while is_space_char ( c ) : c = self.read ( )
        sgn = 1
        if c == '-' :
            sgn = - 1
            c = self.read ( )
        res = 0
        while True :
            if c < '0' or c > '9' : raise InputError ( )
            res *= 10
            res += c - '0'
            c = self.read ( )
        return res * sgn
    def read ( self ) :
        return self.stream.read ( )
    def write ( self , buf ) :
        return buf