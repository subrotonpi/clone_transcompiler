def import java.io io io
import sys
from java.io import StringIO
import getopt
try :
    sc = java.io.Scanner ( open ( '/proc/meminfo' ) )
    s = sc.nextLine ( )
    bu = s.split ( )
    s = [ ]
    for o in bu [ : - 1 ] :
        if o [ 0 ] == 'L' :
            s.append ( '< ' )
        elif o [ 0 ] == 'R' :
            s.append ( '> ' )
        elif o [ 0 ] == 'A' :
            s.append ( 'A ' )
    if bu [ - 1 ] [ 0 ] == 'L' :
        s.append ( '<' )
    elif bu [ - 1 ] [ 0 ] == 'R' :
        s.append ( '>' )
    elif bu [ - 1 ] [ 0 ] == 'A' :
        s.append ( 'A' )
    print ( ' '.join ( s ) )
    class SC ( object ) :
        def __init__ ( self , s ) :
            self.s = s
        def readline ( self ) :
            if not s or not s :
                try :
                    s.decode ( sys.stdout.encoding or 'surrogateescape' )
                except UnicodeDecodeError :
                    s.decode ( 'utf-8' , 'replace' )
            return s
    sc.nextLine ( )
except java.io.FileNotFoundException :
    print ( 'File not found: %s' % ( sys.argv [ 0 ] , ) )
