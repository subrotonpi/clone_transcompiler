def import _readline
import sys
from io import BytesIO
from math import Decimal
from math import factorial
from string import ascii_letters
class Main ( object ) :
    def __init__ ( self ) :
        fc = sys.stdin
        self.N , self.VA , self.VB , self.L = fc.readline ( )
        print ( Decimal ( solve ( ) ).toPlainString ( ) )
    def solve ( self ) :
        L = self.L
        for i in range ( self.N ) :
            b = L / self.VA
            self.L = b * self.VB
        return L
    @ staticmethod
    def readline ( ) :
        if not PY3 or not PY3 :
            try :
                readline = iter ( readline )
            except TypeError :
                readline = sys.stdin.readline
        return readline ( )
    def readline ( ) :
        if not PY3 or not PY3 :
            try :
                return readline ( )
            except TypeError :
                readline = sys.stdin.readline
        return readline ( )
    def readline ( ) :
        return long ( readline ( ) )
    def next_int ( ) :
        return int ( readline ( ) )
    def next_int ( ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( randint ( 1 , n ) )
        return a
    def next_long ( ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( next_int ( ) )
        return a
