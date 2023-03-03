def import _readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import shlex
class Main ( object ) :
    def __init__ ( self ) :
        sc = readline ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        have = 0
        self.cases = [ i - 1 for i in range ( 0 , N + 1 ) ]
        for i in range ( M ) :
            s = sc.__next__ ( )
            self.swap ( have , s )
            have = s
        self.seiretu = [ ]
        for i in range ( 0 , N + 1 ) :
            if self.cases [ i ] == - 1 :
                pass
            else :
                self.seiretu.append ( i )
        for i in range ( N ) :
            self.pl ( self.seiretu )
    def swap ( self , p , q ) :
        a = self.cases [ p ]
        self.cases [ p ] = self.cases [ q ]
        self.cases [ q ] = a
    class SC ( object ) :
        def readline ( self ) :
            return readline ( self )
        def readline ( self ) :
            if not self.cases or not self.cases [ p ] :
                try :
                    self.cases = [ self.cases [ p ] ]
                except IndexError :
                    raise EOFError
            return self.cases [ p ]
        def readline ( self ) :
            return readline ( self )
        def readline ( self ) :
            return readline
        def readline ( self ) :
            return readline
    def pl ( self ) :
        print ( self )
