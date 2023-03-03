def _ ( ) : return
import sys
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.box = [ ]
        self.parcel = [ ]
        for i in range ( 3 ) :
            self.box.append ( sc.choice ( [ '-' , '-' ] ) )
        for i in range ( 3 ) :
            self.parcel.append ( sc.choice ( [ '-' , '-' ] ) )
        ans = 0
        for i in range ( 3 ) :
            ans = max ( ans , ( self.box [ 0 ] / self.parcel [ i ] ) * ( self.box [ 1 ] / self.parcel [ ( i + 1 ) % 3 ] ) * ( self.box [ 2 ] / self.parcel [ ( i + 2 ) % 3 ] ) )
        t = self.box [ 0 ]
        self.box [ 0 ] = self.box [ 1 ]
        self.box [ 1 ] = t
        for i in range ( 3 ) :
            ans = max ( ans , ( self.box [ 0 ] / self.parcel [ i ] ) * ( self.box [ 1 ] / self.parcel [ ( i + 1 ) % 3 ] ) * ( self.box [ 2 ] / self.parcel [ ( i + 2 ) % 3 ] ) )
        self.out.write ( ans )
