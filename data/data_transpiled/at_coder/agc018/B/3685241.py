def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import time
import sys
import random
import string
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.N , self.M = 0 , 0
    def readline ( self ) :
        if not self.N or not self.M :
            try :
                return readline ( )
            except EOFError :
                raise
        return int ( self.N )
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return long ( readline ( self ) )
    def next_array ( self ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( randint ( 0 , M ) )
        return a
    def next_long ( self ) :
        a = [ ]
        for i in range ( self.M ) :
            a.append ( randint ( 0 , M ) )
        return a
    def solve ( self ) :
        ans = int ( self.N )
        removed = [ False ] * M
        favorites = [ ]
        for ppl in range ( self.N ) :
            for i in range ( self.M ) :
                for i in range ( self.M ) :
                    spo = A [ ppl ] [ i ]
                    favorites [ ppl ] [ i ] = i
                favorites [ ppl ] [ M ] = int ( self.M / 2 )
            for time in range ( self.time ) :
                most_favorite = [ ]
                most_favorite.append ( 0 )
                for spo in range ( self.M ) :
                    if removed [ spo ] :
                        continue
                    for ppl in range ( self.N ) :
                        if favorites [ ppl ] [ spo ] < self.M :
                            most_favorite [ ppl ] = spo
            cnt = [ ]
            for ppl in range ( self.M ) :
                cnt.append ( 0 )
            for i in range ( self.M ) :
                if cnt [ i ] > max :
                    max = cnt [ i ]
                    max_spo = 0
                