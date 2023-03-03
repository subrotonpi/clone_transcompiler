def import _readline
import readline
import sys
from binascii import hexlify
import readline
import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , a = sys.stdin.readline ( ).decode ( 'ascii' )
        self.k = ord ( readline.readline ( ).decode ( 'ascii' ) )
        self.bs = [ ord ( readline.readline ( ).decode ( 'ascii' ) ) for i in range ( n ) ]
        self.solve ( )
    def solve ( self ) :
        visited = [ ]
        b = a
        count = 1
        while True :
            if visited [ a ] > 0 :
                length = count - visited [ a ]
                break
            visited.append ( a )
            count += 1
            a = bs [ a ]
        searchLength = 0
        if k < len ( str ( count ) ) :
            searchLength = k
        else :
            k = k - len ( str ( count ) )
            k , mod = divmod ( k , len ( str ( length ) ) )
            searchLength = mod + visited [ a ]
        for b in range ( searchLength ) :
            b = bs [ b ]
        print ( b + 1 )
class Fastreadline ( ) :
    def __init__ ( self ) :
        self.s = Fastreadline ( )
        self.next = None
    def __next__ ( self ) :
        while not self.next or not self.next :
            try :
                self.next = readline ( ).decode ( 'ascii' )
            except EOFError :
                pass
        return self.next
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        return long ( next ( ) )
    def __next__ ( self ) :
        return float ( next ( ) )
    def readline ( self ) :
        self.next = None
        try :
            readline ( )
        except EOFError :
            pass
        return None
