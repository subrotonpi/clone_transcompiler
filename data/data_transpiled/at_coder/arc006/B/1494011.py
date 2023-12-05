def _ _ import _ _ ; SPACETOKEN import SPACETOKEN sys.stdout SPACETOKEN as SPACETOKEN sys.stdout SPACETOKEN as SPACETOKEN sys.stdout SPACETOKEN "" )
import re
import os
import sys
import string
import string
import string
import string
import int
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string
    def getInt ( self ) :
        return int ( self.s )
    def REPS ( self , v ) :
        return string.split ( self.s ) [ 0 ]
    def REPS ( self , l , r ) :
        return string.split ( self.s ) [ 1 ]
    def INS ( self , n ) :
        return REPS ( self , n ) + [ int ( i ) for i in range ( self.n ) ]
    def pair ( self , L , R ) :
        self.l = L
        self.r = R
    def getL ( self ) :
        return l
    def getR ( self ) :
        return r
    def main ( $ ) :
        n , h = getInt ( )
        s = string.split ( "\n" )
        l = REPS ( 1 , n ) [ 0 ]
        for i in range ( h ) :
            inp = s.strip ( ).split ( "[|]" )
            for j in range ( len ( inp ) ) :
                if inp [ j ] == "-" :
                    list.swap ( l [ j ] , j + 1 )
        e = s.strip ( )
        for i in range ( n ) :
            if e [ i * 2 ] == "o" :
                print ( l [ i ] )
