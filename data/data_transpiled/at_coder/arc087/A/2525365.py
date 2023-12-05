def import import sys , string
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        n = sc.nextInt ( )
        m = { }
        for i in range ( n ) :
            a = sc.nextInt ( )
            m [ a ] = m [ a ] + 1 if a in m else 1
        s = 0
        for k , v in m.items ( ) :
            if k <= v :
                s += v - k
            else :
                s += v
        print ( s )
