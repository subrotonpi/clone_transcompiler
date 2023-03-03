def import import sys , string , compile
from time import time
from random import randint
from random import random
from time import time as gmtime
from time import time as time
class C ( object ) :
    def solve ( self ) :
        np = [ False ] * 1000001
        p = [ ]
        pn = 0
        for i in range ( 2 , len ( np ) ) :
            if np [ i ] :
                continue
            p.append ( i )
            for j in range ( 2 * i , len ( np ) , i ) :
                np [ j ] = True
        tn = time ( )
        for test in range ( 1 , tn + 1 ) :
            n = randint ( 1 , p.size + 1 )
            r = ( n > 1 ) and 1 or 0
            for i in range ( 0 , pn ) :
                m = n
                do.send ( "%d %s" % ( test , i ) )
            while ( m < p.size + 1 ) :
                r += 1
                m //= p [ i ]
                r -= 1
            print ( "Case #%d: %s" % ( test , r ) )
    def check ( self , f , msg ) :
        if not f :
            f.seek ( 0 )
            raise ValueError ( "%s is not a valid file" % f.read ( ) )
        return True
    def solve ( self , f , p ) :
        if p :
            return [ ]
        for i in range ( 0 , len ( p ) , 2 ) :
            if f.read ( 1 ) == f.read ( 1 ) :
                return [ ]
        return False
    def solve ( self , f , p ) :
        if p :
            return [ ]
        if f.read ( 1 ) == f.read ( 1 ) :
            return [ ]
        return False
