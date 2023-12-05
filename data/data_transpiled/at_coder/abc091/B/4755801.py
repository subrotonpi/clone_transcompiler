def import import os , sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
    def __init__ ( self , n , m , d ) :
        dict = { }
        n = sc.read ( n )
        for i in range ( n ) :
            s = sc.read ( )
            dict [ s ] = dict.get ( s , 0 )
            dict [ s ] = dict.get ( s , 0 ) + 1
        m = sc.read ( m )
        for i in range ( m ) :
            s = sc.read ( )
            dict [ s ] = dict.get ( s , 0 )
            dict [ s ] = dict.get ( s , 0 ) - 1
        self.max = 0
        for k , v in dict.items ( ) :
            self.max = max ( self.max , v )
