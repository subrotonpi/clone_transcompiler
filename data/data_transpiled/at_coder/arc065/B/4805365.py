def _ _ init _ _ ( ) : return
import sys
import os
import sys
import getopt
import termios
import struct
import time
import sys
class Main ( object ) :
    def __init__ ( self , _ ) :
        sc = sys.stdin
        n , k , l = select.select ( [ 0 , 0 ] )
        road.__init__ ( self , n + 1 )
        rail.__init__ ( self , n + 1 )
        ans = [ ]
        for i in range ( self.n ) :
            a , b = select.select ( [ 0 , 0 ] )
            road.unite ( a , b )
        for i in range ( self.l ) :
            a , b = select.select ( [ 0 , 0 ] )
            rail.unite ( a , b )
        d1 = [ ]
        d2 = [ ]
        d = { }
        for i in range ( 1 , self.n + 1 ) :
            d1.append ( road.find ( i ) )
            d2.append ( rail.find ( i ) )
            p = ( d1 [ i ] , d2 [ i ] )
            if not d [ p ] :
                temp = [ ]
                d [ p ] = temp
            else :
                temp = d [ p ]
                d [ p ] = temp
        for p in d.keys ( ) :
            temp = d [ p ]
            size = len ( temp )
            while not temp.empty ( ) :
                ans.append ( temp.pop ( ) )
        for i in range ( 1 , self.n + 1 ) :
            out.write ( ans [ i ] )
            if i < self.n :
                out.write ( ' ' )
        out.write ( '\n' )
