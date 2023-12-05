def _ _ main _ _ ( ) : return True
import sys
import os
import math
import text
import math
import math
import text
import math
import random
class Main ( object ) :
    def __init__ ( self , stream ) :
        if stream and stream [ 0 ] == 'dev_testing' :
            try :
                stream = open ( stream [ 1 ] )
            except IOError :
                stream = sys.stdin
        else :
            stream = sys.stdout
        stream = InputReader ( stream )
        stream.seek ( 0 )
        stream.seek ( 0 )
        stream.read ( 1 )
        stream.seek ( 0 )
        stream.read ( 1 )
        stream.seek ( 0 )
    def has_input ( self ) :
        try :
            stream.seek ( 0 )
            ch = stream.read ( 1 )
        except IOError :
            stream.seek ( 0 )
            return True
        stream.seek ( 0 )
        stream.seek ( 0 )
        return False
    def solve ( self , test_number , stream , stream ) :
        self.n = test_number
        self.t , self.a = [ ] , [ ]
        for i in range ( self.n ) :
            self.t.append ( stream.read ( 1 ) )
            self.a.append ( stream.read ( 1 ) )
        tv , av = 1 , 1
        total = self.tv + av
        for i in range ( self.n ) :
            if tv <= t [ i ] and av > a [ i ] :
                mult = int ( av ) / a [ i ]
                if av % a [ i ] != 0 :
                    mult += 1
                self.av = a [ i ] * mult
                continue
            if tv > t [ i ] and av <= a [ i ] :
                mult = int ( tv ) / t [ i ]
                if tv % t [ i ] != 0 :
                    mult += 1
                self.tv = t [ i ] * mult
                continue
            tv = t [ i ]
            av = a [ i ] * mult
        stream.write ( tv + av )
    gcd ( a , b )
