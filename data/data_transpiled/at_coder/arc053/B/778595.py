def import _readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        pr = _readline.__init__ ( self )
        s = sc.read ( ).decode ( 'utf-8' )
        cnt = [ 0 ] * 26
        for c in s :
            cnt [ c - 'a' ] += 1
        odd = 0
        for e in cnt :
            if e % 2 == 1 :
                odd += 1
        if odd == 0 :
            pr.write ( len ( s ) )
        else :
            pr.write ( max ( 1 , ( len ( s ) - odd ) // 2 // odd * 2 + 1 ) )
        pr.close ( )
        sc.close ( )
    @ property
    def readline ( self ) :
        return sys.stdin.readline ( )
class Scanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def readline ( self ) :
        try :
            if not self.stream or not self.stream.readline ( ) :
                self.stream = [ s for s in self.stream.readline ( ).decode ( 'utf-8' ).split ( ) ]
            return self.stream.readline ( )
        except StopIteration :
            raise Exception ( )
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return long ( readline ( self ) )
    def readline ( self ) :
        return float ( readline ( self ) )
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return long ( readline ( self ) )
    def readline ( self ) :
        return float ( readline ( self ) )
    def readline ( self ) :
        return int ( readline ( self ) )
class Printer ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
