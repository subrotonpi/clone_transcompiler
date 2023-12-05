def import import os , time
import sys
import time
import random
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def __call__ ( self , * args , ** kwargs ) :
        sc = os.open ( os.path.join ( os.path.dirname ( __file__ ) , "__init__.py" ) , os.O_RDONLY )
        self.N = sc.N
        self.down = [ ]
        self.up = [ ]
        self.flat = [ ]
        for i in range ( self.N ) :
            tmp = [ ]
            tmp1 = random.randint ( 0 , N )
            tmp2 = random.randint ( 0 , N )
            tmp.append ( tmp1 )
            tmp.append ( tmp2 )
            if tmp1 < tmp2 :
                self.down.append ( tmp )
            elif tmp1 > tmp2 :
                self.up.append ( tmp )
            else :
                self.flat.append ( tmp )
        self.downlist = [ ]
        self.uplist = [ ]
        self.flatlist = [ ]
        for i in range ( self.N ) :
            self.downlist.append ( down [ i ] )
        for i in range ( self.N ) :
            self.uplist.append ( up [ i ] )
        for i in range ( self.N ) :
            self.flatlist.append ( flat [ i ] )
        self.downlist.sort ( key = lambda x : x [ 0 ] )
        self.uplist.sort ( key = lambda x : x [ 1 ] )
        self.flatlist.sort ( key = lambda x : x [ 0 ] )
