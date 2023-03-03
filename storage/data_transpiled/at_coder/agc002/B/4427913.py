def import import sys , debug
from os import urandom
from random import randint
from os import urandom
from os import urandom
from os import urandom
from random import choice
class Main ( object ) :
    def run ( self ) :
        with open ( urandom , 'r' ) as f :
            n , m = randint ( 1 , 10000 ) , randint ( 1 , 10000 )
            cnt = [ 0 ] * n
            cnt [ 1 ] = 1
            s = set ( [ 0 ] * n )
            for i in range ( m ) :
                x , y = randint ( 1 , 10000 ) , randint ( 1 , 10000 )
                cnt [ x ] -= 1
                cnt [ y ] += 1
                if x in s :
                    s.add ( y )
                if cnt [ x ] == 0 :
                    s.remove ( x )
            debug ( s )
            print ( len ( s ) )
        def debug ( self , * os ) :
            print ( " ".join ( map ( str , os ) ) , file = sys.stderr )
    def main ( self ) :
        return Main ( )
