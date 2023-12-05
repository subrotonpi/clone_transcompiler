def import _main
import sys
import os
import sys
import random
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        abc = [ ]
        abc.append ( sc.randint ( 0 , 10 ) )
        abc.append ( sc.randint ( 0 , 10 ) )
        abc.append ( sc.randint ( 0 , 10 ) )
        abc.append ( sc.randint ( 0 , 10 ) )
        abc.sort ( )
        print ( abc [ 2 ] * 10 + abc [ 1 ] + abc [ 0 ] )
