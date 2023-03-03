def _import ( ) : return ''
import os
import sys
import locale
import os
import sys
import locale
import os
import locale
import time
import locale
class Main ( object ) :
    import locale
    import string
    import sys
    import os
    import sys
    import locale
    import os
    import sys
    import locale
    import time
    import locale
    try :
        import readline
    except ImportError :
        pass
    else :
        import readline
    def read ( ) :
        try :
            infile = open ( filename + '.in' , 'r' )
            outfile = open ( filename + '.out' , 'w' )
            outfile.flush ( )
        except :
            sys.exit ( 1 )
    def read ( ) :
        return int ( readword ( ) )
    def dread ( ) :
        return float ( readword ( ) )
    def lread ( ) :
        return long ( readword ( ) )
    def read ( ) :
        b = [ ]
        c = read ( )
        while c >= 0 and c <= ' ' :
            b.append ( c )
            c = read ( )
        return b
    row = [ ]
    col = [ ]
    for i in range ( N ) :
        if a [ 0 ] [ i ] == 1 :
            col1 = i
            col.append ( 1 )
    row.append ( 1 )
    col1 = - 1
    for i in range ( N ) :
        if a [ i ] [ col1 ] == 1 :
            col1 = i
            col.append ( 1 )
    if col1 == - 1 :
        outfile.write ( 'IMPOSSIBLE' )
        return
    for i in range ( N ) :
        if a [ i ] [ col1 ] == 1 :
            row.append ( 1 )
    c = 0
    for i in range ( N ) :
        if row [ i ] == 1 :
            c += 1
        if c != N / 2 :
            outfile.write ( 'IMPOSSIBLE' )
            return
    for i in range ( N ) :
        for j in range ( N ) :
            if ( a [ i ] [ j ] ^ row [ j ] ) != 1