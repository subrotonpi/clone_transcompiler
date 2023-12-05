def _import ( ) : return ''
import os
import sys
import os
import os
import sys
import os
import locale
import locale
import time
class Main ( object ) :
    import locale
    import string
    problem = 'C'
    filename = problem + '-large'
    def solve ( self ) :
        n , m = self.iread ( )
        code = [ ]
        for i in range ( n ) :
            code.append ( self.iread ( ) )
        for i in range ( m ) :
            x , y = self.iread ( )
            x -= 1
            y -= 1
            self.mat [ x ] [ y ] = self.mat [ y ] [ x ] = True
    def read ( self ) :
        try :
            locale.setlocale ( locale.LC_ALL , '' )
        except locale.Error :
            pass
        return ''.join ( [ self.dread ( ) , self.dread ( ) ] )
    def write ( self , out ) :
        try :
            out = open ( self.filename + '.in' , 'w' )
            out.write ( out )
            out.flush ( )
        except :
            sys.exit ( 1 )
    def read ( self ) :
        return ''.join ( [ self.dread ( ) , self.dread ( ) ] )
    def write ( self , out ) :
        try :
            out = open ( self.filename + '.out' , 'w' )
            out.flush ( )
        except :
            sys.exit ( 1 )
    def write ( self , out ) :
        ans = None
        INF = 100000
        for start in range ( n ) :
            out.write ( '%s' % self.code [ start ] )
        cities = [ ]
        lst = [ ]
        cc = 1
        cities.append ( start )
        was = [ ]
        was.append ( True )
        while cc < n :
            best_s , best_y , best_code = - 1 , - 1 , INF
            for stack in range ( len ( lst ) - 1 , - 1 , - 1 ) :
                for i in range ( n ) :
                    if not was [ i ] and