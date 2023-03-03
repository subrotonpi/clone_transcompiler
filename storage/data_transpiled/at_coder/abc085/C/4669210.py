def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.f = sys.stdin
    def __call__ ( self , * args , ** kwargs ) :
        vals = self.f.readline ( ).split ( )
        num = int ( vals [ 0 ] )
        price = int ( vals [ 1 ] )
        self.f.close ( )
        for sen in range ( 0 , num ) :
            for gosen in range ( 0 , num - sen ) :
                man = num - sen - gosen
                if price == 10000 * man + 5000 * gosen + 1000 * sen :
                    print ( man , gosen , sen )
                    return
        print ( '-1 -1 -1' )
