def import _main
import os
import sys
import os
import subprocess
import subprocess
import sys
class Oppa ( object ) :
    def __init__ ( self ) :
        self.open = os.devnull
    def run ( self ) :
        try :
            self.run1 ( )
        except KeyboardInterrupt :
            pass
    def run1 ( self ) :
        sc = open ( 'bonus.in' , 'r' )
        f = open ( 'bonus.out' , 'w' )
        l = sc.readline ( ).split ( ) [ 0 ]
        d = sc.readline ( ).split ( ) [ 1 ]
        n = sc.readline ( ).split ( ) [ 2 ]
        s = [ sc.readline ( ) for i in range ( d ) ]
        can = [ [ False ] * 256 for i in range ( l ) ]
        for tn in range ( n ) :
            res = 0
            a = sc.readline ( ).split ( )
            t = 0
            for i in range ( l ) :
                if a [ t ].isalpha ( ) :
                    can [ i ] [ a [ t ] ] = True
                    t += 1
                else :
                    t += 1
                    while a [ t ].isalpha ( ) :
                        can [ i ] [ a [ t ] ] = True
                        t += 1
                    t += 1
            for i in range ( d ) :
                j = 0
                while j < l and can [ j ] [ s [ i ] ] :
                    j += 1
                if j == l :
                    res += 1
            t = 0
            for i in range ( l ) :
                if a [ t ].isalpha ( ) :
                    can [ i ] [ a [ t ] ] = False
                    t += 1
                else :
                    t += 1
                    while a [ t ].isalpha ( ) :
                        can [ i ] [ a [ t ] ] = False
                        t += 1
                    t += 1
            f.write ( "Case #%d: %d\n" % ( tn + 1 , res ) )
        f.close ( )
