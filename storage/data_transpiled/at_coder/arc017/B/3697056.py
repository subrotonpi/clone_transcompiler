def import _readline
import readline
import sys
from io import BytesIO
import readline
import readline
import readline
import readline
import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = readline
        N , K = sc.size
        A = sc.__next__ ( )
        print ( self.solve ( ) )
    def solve ( self ) :
        ans = 0
        c = 1
        for i in range ( 1 , N ) :
            if A [ i ] > A [ i - 1 ] :
                c += 1
            else :
                if c >= K :
                    ans += c - K + 1
                c = 1
        if c >= K :
            ans += c - K + 1
        return ans
    @ property
    def readline ( ) :
        if not readline or not readline :
            try :
                readline = readline.readline
            except AttributeError :
                readline = None
            return readline ( )
        readline.readline = readline
        if not readline or readline.is_readline :
            try :
                readline.parse_and_bind ( "" )
            except :
                readline.parse_and_bind ( "" )
        return readline
    def readline ( ) :
        if not readline or not readline.is_readline :
            try :
                readline.parse_and_bind ( "" )
            except :
                readline.parse_and_bind ( "" )
        return readline
    def readline ( ) :
        if not readline or not readline.is_readline :
            try :
                readline.parse_and_bind ( "" )
            except :
                readline.parse_and_bind ( "" )
        return readline
    def readline ( ) :
        while True :
            try :
                readline.parse_and_bind ( "" )
            except :
                readline.parse_and_bind ( "" )
        return readline
