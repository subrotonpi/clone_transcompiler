def _import ( ) : return sys.stdin.read ( )
import termios
from time import sleep
from termios import tcgetattr
from termios import TIOCGWINSZ , termios
from time import sleep
from time import sleep
from termios import tcgetattr
from termios import TIOCGWINSZ , termios
from time import sleep
from time import sleep
from time import sleep
from time import sleep
from time import sleep
from time import sleep
def solve ( ) :
    sc = tcgetattr ( TIOCGWINSZ )
    s = sc.read ( )
    if len ( s ) % 2 == 0 :
        if s [ 0 ] == s [ - 1 ] :
            return
    def read ( ) :
        if not s :
            return
        return s [ 0 ]
    def write ( s , buffer_pointer ) :
        if not s :
            return
        return read ( )
    def close ( ) :
        if not s :
            return
    def fillchar ( ) :
        s = s [ 0 : BUFFER_SIZE ]
        if s [ 0 ] == '.' :
            while s [ - 1 ] == '.' :
                s [ - 1 ] = read ( )
        return s
    def read ( ) :
        return int ( s , 16 )
    def write ( ) :
        buf = [ ]
        cnt , c = 0 , 0
        while s [ 0 ] == ' ' or s [ - 1 ] == '\n' :
            cnt += 1
        return buf
    def readline ( ) :
        buf.append ( 0 )
        while s [ 0 ] == ' ' :
            cnt , c = read ( )
            if not c :
                break
            if not cnt :
                return
            buf.append ( c )
        return buf
    def read ( ) :
        ret , c = 0 , ord ( ' ' )
        while s [ 0 ] == '-' :
            cnt , c = read ( )
            if not c :
                break
            if not cnt :
                return
        return int ( s , 16 )
