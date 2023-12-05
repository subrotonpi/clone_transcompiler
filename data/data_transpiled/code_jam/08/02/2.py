def _ ( ) : return int ( x.split ( ':' ) [ 0 ] ) * 60 + int ( x.split ( ':' ) [ 1 ] )
import sys
import traceback
import time
import time
import traceback
import collections
class B ( object ) :
    def __init__ ( self ) :
        self._traceback = traceback.format_exc ( )
    def run ( self ) :
        with open ( self._sys.stdin ) as sc :
            n = len ( sc )
            for t , time , na , nb in [ ( t , time ) for t , ( time , na , nb ) for t , ( time , na , nb ) in [ ( t , time ) for t , time ] for t , time in [ ( t , time ) for t , time ] ] :
                num = [ 0 ] * 2
                es = [ ( to ( i ) , to ( i ) , 0 ) for i in range ( na + nb ) for i in range ( na + nb ) for i in range ( nb ) ]
                sort ( es )
                qs = [ ( 1 << 29 , 0 ) for i in range ( 2 ) ]
                for e in es :
                    if qs [ e.pos ] [ - 1 ] > e.from_time :
                        num [ e.pos ] += 1
                    else :
                        qs [ e.pos ].pop ( )
                    qs [ 1 - e.pos ].append ( e.to_time + time )
                print ( "Case #%d: %d %d" % ( t , num [ 0 ] , num [ 1 ] ) )
    to = time.time ( )
    return int ( time.split ( ':' ) [ 0 ] ) * 60 + int ( time.split ( ':' ) [ 1 ] )
class Entry ( object ) :
    from time import time
    to = time.time ( )
    pos = time.time ( )
    def __init__ ( self ) :
        self.from = to
        self.to = pos
    def debug ( self , * os ) :
        print ( traceback.format_exc ( ) )
