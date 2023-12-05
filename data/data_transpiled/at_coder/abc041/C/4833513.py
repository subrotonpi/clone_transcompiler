def import _seito
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.i = 0
        self.a = 0
    def __call__ ( self , * args ) :
        sc = sys.stdin
        n = sc.read ( )
        array = [ ]
        for i in range ( n ) :
            seito = Seito ( )
            seito.i = i + 1
            seito.a = sc.read ( )
            array.append ( seito )
        sc.close ( )
        array.sort ( key = lambda x : x.a )
        for seito in array :
            print ( seito.i )
    class Seito ( object ) :
        i , a = 0 , 1
