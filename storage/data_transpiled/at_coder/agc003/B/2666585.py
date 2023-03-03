def import _readline
import readline
import sys
from io import BytesIO
import readline
import readline
import readline
import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = readline
        N = sc.__next__ ( )
        A = sc.__next__ ( )
        print ( solve ( ) )
    def solve ( self ) :
        ans = 0
        for i in range ( N - 1 ) :
            ans += A [ i ] // 2
            if A [ i ] % 2 == 1 and A [ i + 1 ] > 0 :
                A [ i + 1 ] -= 1
                ans += 1
        ans += A [ N - 1 ] // 2
        return ans
    def readline ( self ) :
        if not self._readline or not self._readline :
            try :
                self._readline = readline ( self )
            except IOError :
                raise EOFError
        return self._readline
    def readline ( self ) :
        if not self._readline or not self._readline :
            try :
                return readline ( self )
            except EOFError :
                raise EOFError
        return self._readline
    def readline ( self ) :
        if not self._readline or not self._readline :
            try :
                return readline ( self )
            except EOFError :
                raise EOFError
        return readline ( self )
    def readline ( self ) :
        return str ( self )
    def readline ( self ) :
        return readline ( self )
    def select ( self , result ) :
        a = [ ]
        for i in range ( result ) :
            a.append ( select ( [ result ] , [ ] , 0 ) )
        return a
