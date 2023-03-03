def import _readline
import sys
import os
import sys
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import getpass
import readline
import readline
import readline
import readline
import readline
import readline
import time
import time
import time
class C :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stderr = sys.stderr
    def readline ( self ) :
        return self.stdin.readline ( )
    def iread ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def lread ( self ) :
        return long ( self.readword ( ) )
    def readword ( self ) :
        c = readline.read ( )
        while c >= readline and c <= readline :
            c = readline.read ( )
        if not c :
            return ''
        bld = [ ]
        while c > readline :
            bld.append ( ord ( c ) )
            c = readline.read ( )
        return bld
    import readline
    target = 'welcome to code jam'
    def solve ( ) :
        s = readline.strip ( )
        ans = [ [ 1 ] ] * len ( s ) + [ 1 ] * len ( target ) + [ 1 ]
        for i in range ( 0 , len ( s ) ) :
            for j in range ( len ( target ) ) :
                if target [ j ] == s [ i ] :
                    ans [ i + 1 ] [ j + 1 ] = ( ans [ i ] [ j ] + ans [ i + 1 ] [ j ] ) % 10000
                ans [ i + 1 ] [ j ] = ( ans [ i ] [ j ] + ans [ i + 1 ] [ j ] ) % 10000
        result = 0
        for i in range ( 0 , len ( s ) ) :
            result = ( result