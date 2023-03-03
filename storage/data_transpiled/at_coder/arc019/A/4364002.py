def import import sys , os , sys , math , out
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( ).__init__ ( self )
        s = self.s
        b = [ 'O' , 'D' , 'I' , 'Z' , 'S' , 'B' ]
        a = [ '0' , '0' , '1' , '2' , '5' , '8' ]
        for i in range ( len ( b ) ) :
            s = re.sub ( b [ i ] , a [ i ] , s )
        out.write ( s )
