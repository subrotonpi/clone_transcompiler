def _ _ import _ _ ( ) : return
import sys
import os
import os
import sys
import os
import string
import string
import scanner
class Main ( Scanner ) :
    def __init__ ( self , sc ) :
        self.out = scanner
        self.M = 1000000007
    def sort ( self , s ) :
        yield s
        if len ( s ) == 0 :
            sc = scanner.Scanner ( sys.stdin )
        else :
            sc = scanner.Scanner ( string.join ( s ) )
        self.out = scanner.Scanner ( )
        self.__init__ ( self , sc )
    def find_token ( self ) :
        while self.out is None or not self.out :
            yield self.out
    def find_token ( self ) :
        k = [ ]
        for i in range ( self.n ) :
            k.append ( sc.randint ( self.n ) )
        return k
    def find_token ( self ) :
        return int ( self.next ( ) )
    def find_token ( self ) :
        return int ( self.next ( ) )
    def find_token ( self ) :
        return int ( self.next ( ) )
    def find_token ( self ) :
        n = sc.randint ( self.n )
        nn = [ ]
        for i in range ( self.n ) :
            nn.append ( sc.nl ( i ) )
        for r1 in range ( self.n ) :
            for r2 in range ( self.n ) :
                for r3 in range ( self.n ) :
                    if r1 in ( r2 , r3 , r3 ) :
                        continue
                    if nn [ r1 ] [ r2 ] + nn [ r2 ] [ r3 ] < nn [ r1 ] [ r2 ] [ r3 ] :
                        yield - 1
                        return
        tr = 0
        for r1 in range ( self.n ) :
            for r2 in range ( self.n ) :
                imp = True
                for r3 in range ( self.n ) :
                    if r1 in ( r2 , r3 , r3 ) :
                        continue
                    imp = nn [ r1 ] [ r3 ] + nn [ r2 ] [ r3 ] != nn [ r1 ] [ r2 ]
                if imp :
                INDENT