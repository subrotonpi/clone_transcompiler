def import Amida
import sys
import os
import sys
import sys
class Main ( Amida ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        amida = Amida ( self.Scanner )
        amida.res ( )
class Amida ( sys.stdin ) :
    def __init__ ( self ) :
        self.N , self.M , self.D = sys.stdin.read ( ).split ( '\n' )
        self.f = [ ]
        self.seni = [ ]
        self.used = [ ]
        self.res = [ ]
        self.index = [ ]
    @ property
    def res ( self ) :
        for i in range ( self.N + 1 ) :
            self.f.append ( i )
        for i in range ( self.M ) :
            left = self.f [ A ]
            right = self.f [ A + 1 ]
            self.f [ A ] = right
            self.f [ A + 1 ] = left
        self.res = [ ]
        self.index = [ ]
    def res ( self ) :
        for i in range ( self.N ) :
            next = self.f.pop ( )
            if self.used [ next ] :
                continue
            self.used [ next ] = next
            self.seni.append ( [ next ] )
            self.index.append ( 0 )
            for j in range ( self.N ) :
                next = self.f.pop ( )
                self.used [ next ] = i + 1
                if next == self.i + 1 :
                    break
                self.seni [ self.i + 1 ].append ( next )
                self.index [ next ] = j + 1
        for i in range ( 1 , self.N + 1 ) :
            s = self.D % len ( self.seni [ used [ i ] ] )
            self.res [ self.seni [ used [ i ] ] [ ( s + self.index [ i ] ) % len ( self.seni [ used [ i ] ] ) ] = i
