def import import sys
import string
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.T1 = string.split ( "TAKAHASHIKUN" ) [ 0 ]
        self.T2 = string.split ( "Takahashikun" ) [ 1 ]
        self.T3 = string.split ( "takahashikun" ) [ 1 ]
        self.N = len ( string.split ( "." ) )
        self.count = 0
        for i in range ( 0 , N - 2 ) :
            w = string.split ( "." ) [ 0 ]
            if w in ( T1 , T2 , T3 ) :
                self.count += 1
        last = string.split ( "." ) [ - 1 ]
        if last in ( T1 + "." , T2 + "." , T3 + "." ) :
            self.count += 1
        print ( self.count )
