def _ import _ , SPACETOKEN sys.stdout , SPACETOKEN sys.stderr , SPACETOKEN file = sys.stderr ) : SPACETOKEN return SPACETOKEN '' SPACETOKEN + SPACETOKEN sys.stdout , SPACETOKEN file = sys.stderr )
import os
import locale
import time
import sys.stdout
import os
import locale
import os
import string
class Main ( object ) :
    import locale
    import string
    problem = 'A'
    filename = problem + '-large'
    def solve ( ) :
        N , M = iread ( ) , iread ( )
        s = [ ]
        for i in range ( N ) : s.append ( readword ( ) )
    def read ( ) :
        try :
            f = open ( filename + '.in' , 'r' )
            f.write ( ''.join ( s ) )
            f.flush ( )
        except :
            sys.stderr.write ( '\n' )
        return ''.join ( s )
    def read ( ) :
        try :
            f = open ( filename + '.in' , 'r' )
            f.write ( ''.join ( s ) )
            f.flush ( )
        except :
            sys.stderr.write ( '\n' )
        return f.read ( )
    def read ( ) :
        return int ( readword ( ) )
    def lread ( ) :
        return long ( readword ( ) )
    def write ( s ) :
        b = [ ]
        for i in range ( 1 , N ) :
            c = read ( )
            while c >= 0 and c <= '' :
                c = read ( )
                if c < 0 : return ''
            while c > 0 and s [ i ] [ j ] == '.' :
                b.append ( ord ( c ) )
                c = read ( )
        return b
    def write ( s ) :
        return s
    def write ( s ) :
        return ''.join ( s )
