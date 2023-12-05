def import locale
import locale
import readline
import sys
import time
import random
import locale
class a :
    def __init__ ( self ) :
        self.n = randint ( 0 , 3 )
        self.m = randint ( 0 , 3 )
        self.dir = [ ]
        for i in range ( self.n ) :
            s = stdin.readline ( ).strip ( )
            self.add ( s )
        init = len ( self.dir )
        for i in range ( self.m ) :
            s = stdin.readline ( ).strip ( )
            self.add ( s )
        self.out.write ( '%d\n' % len ( self.dir ) )
    def add ( self , s ) :
        tok = s.split ( '/' )
        cur = ''
        for i in tok [ 1 : ] :
            cur += '/' + s
            self.dir.append ( cur )
    def run ( self ) :
        try :
            tc = randint ( 0 , 3 )
            for it in range ( 1 , tc + 1 ) :
                sys.stderr.write ( it )
                sys.stderr.write ( 'Case #%d: ' % it )
                self.solve ( )
        except :
            NOO ( )
        finally :
            sys.stderr.close ( )
    global out
    out = open ( '%s.in' % ( os.path.basename ( sys.argv [ 0 ] ) , ) , 'w' )
    def NOO ( self ) :
        sys.stderr.write ( 'No such file or directory\n' )
        sys.exit ( 1 )
    def randint ( self ) :
        return int ( self.n )
    def long ( self ) :
        return long ( self.n )
    def uniform ( self ) :
        return uniform ( )
    def uniform ( self ) :
        return uniform ( )
