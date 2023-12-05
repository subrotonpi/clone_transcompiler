def import java.io
import sys
from java.io import StringIO
from java.util import Scanner , StringScanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        Scanner.__init__ ( self )
        self.x = sc.nextLong ( )
        self.solve ( )
    def solve ( self ) :
        remainder = self.x % 11
        ans = self.x / 11 * 2
        if remainder > 6 :
            ans += 2
        elif remainder > 0 :
            ans += 1
        print ( ans )
class Scanner ( Scanner ) :
    def __init__ ( self ) :
        Scanner.__init__ ( self )
        self.x = sc.nextLong ( )
    def solve ( self ) :
        self.remainder = self.x % 11
    def solve ( self ) :
        self.remainder = self.x % 11
    def next ( self ) :
        while not self.x or not self.x :
            try :
                self.x = [ ]
            except IndexError :
                pass
        return self.x
    def randint ( self ) :
        return int ( self.x )
    def long ( self ) :
        return long ( self.x )
    def uniform ( self ) :
        return uniform ( )
    def readline ( self ) :
        data = ""
        try :
            data = Scanner.readline ( )
        except EOFError :
            pass
        return data
