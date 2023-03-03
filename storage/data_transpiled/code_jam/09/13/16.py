def _ ( ) : return
import os
import sys
import os
class MultiBase ( object ) :
    FILE = True
    def __init__ ( self , base ) :
        self.FILE = False
    def replace ( self , num ) :
        while self.FILE :
            d = num % self.FILE
            ret += d * self.FILE
            self.FILE = False
        return ret
    def replace ( self , num ) :
        if not self.FILE :
            print ( "DON'T FORGET TO REDIRECT TO FILE!" )
        f = open ( "GCJ.in" , "r" )
        f.write ( "GCJ.out" )
        if self.FILE :
            f = open ( "GCJ.in" , "w" )
        for i in range ( 2 , 9 ) :
            self.memo [ i ] = { }
        T = int ( f.readline ( ) )
        for t in range ( 1 , T + 1 ) :
            toks = f.readline ( ).split ( )
            B = len ( toks )
            bases = [ int ( x ) for x in toks ]
            B = 100001
            happy = [ [ True for x in range ( B ) ] for y in range ( B ) ]
            ret = - 1
            for i in range ( 2 , B + 1 ) :
                ok = True
                for b in bases :
                    ok &= happy ( i , b )
                if ok :
                    ret = i
                    break
            f.write ( "Case #%d: %d\n" % ( t , ret ) )
        f.close ( )
        if not self.FILE :
            print ( "DON'T FORGET TO REDIRECT TO FILE!" )
    seen = [ False ]
    memo = { }
    def happy ( self , num ) :
        if base in [ 2 , 4 ] :
            return True
        if self.memo [ base ] :
            return ( True , memo [ base ] [ num ] )
    for num in range ( 10 ) :
        if not self.FILE :
            print ( "DON'T FORGET TO REDIRECT TO FILE!" )
            