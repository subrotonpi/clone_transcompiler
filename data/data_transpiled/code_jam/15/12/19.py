def _import ( ) : return _import ( )
from os import urandom
from os import system , randrange
from os.environ import dict
from os.environ import dict
from os.environ import dict
from os.environ import dict
from os.name import environ
from os.chdir ( '/' )
from os import chdir
from os.environ import dict
from os.path import expanduser
from os.path import join
from os.path import abspath , join
from os import getcwd
from os.path import expanduser
from os.path import join
from os import sep , saferepr
from os.walk import walk
class Main ( object ) :
    def readline ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        try :
            import re
            regex = r'B-(small|large).*[.]in'
            directory = join ( dirname ( abspath ( expanduser ( '~' ) ) ) , '.' )
            candidates = os.listdir ( directory )
            torun = None
            for candidate in candidates :
                if not torun or os.path.getmtime ( candidate ) > torun :
                    torun = candidate
            fh = open ( torun , 'rb' )
        except OSError :
            raise
        try :
            fh = open ( 'b.out' , 'wb' )
        except IOError :
            fh = sys.stdout
        else :
            fh = join ( dirname ( abspath ( __file__ ) ) , '.' )
    def solve ( self , test_number , stdin , stdout ) :
        b = int ( test_number )
        n = len ( stdin )
        m = stdin.read ( b )
        l = 0
        r = n * 100000
        while r - l > 1 :
            med = l + ( r - l ) / 2
            if check ( med , n ) :
                r = med
            else :
                l = med
        if check ( l , n ) :
            ans = n
        else :
            ans = n
    return Main ( )
