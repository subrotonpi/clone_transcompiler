def import import sys , exit , out
import math
import os
import sys
import sys
import math
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( ).__init__ ( self )
        n = sc.nextInt ( )
        n = n * ( n + 1 ) / 2
        t = int ( sqrt ( n ) ) + 1
        for i in range ( 2 , t + 1 ) :
            if n % i == 0 :
                out.write ( "BOWWOW" )
                exit ( 0 )
        if n != 1 :
            out.write ( "WANWAN" )
        else :
            out.write ( "BOWWOW" )
