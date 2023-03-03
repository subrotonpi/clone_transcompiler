def import import sys , string , recwarn
from os.path import join
from os import sep
from os import rename
from os import getcwd
from os.path import join
from os import sep
from os import getcwd
from os.path import join
from os import sep
from os import chdir
def solve ( ) :
    c = open ( join ( dirname ( abspath ( __file__ ) ) , 'r' ) ).read ( )
    n = len ( c )
    st = [ ]
    sp = 0
    ans = 0
    for i in range ( len ( c ) ) :
        if sp > 0 and c [ i ] == st [ sp - 1 ] :
            sp -= 1
            ans += 10
        else :
            st.append ( c [ i ] )
    ans += ( sp / 2 ) * 5
    out = join ( dirname ( abspath ( __file__ ) ) , ans )
def run ( ) :
    with open ( join ( dirname ( abspath ( __file__ ) ) , 'a.in' ) , 'w' ) as f :
        with open ( join ( dirname ( abspath ( __file__ ) ) , 'a.out' ) , 'w' ) as f :
            for i in range ( tn ) :
                print ( i , end = '' , file = sys.stderr )
                print ( 'Case #%d: ' % ( i + 1 ) , end = '' , file = sys.stderr )
                solve ( )
        out.close ( )
class A ( ) :
    def run ( ) :
        with open ( join ( dirname ( abspath ( __file__ ) ) , 'r' ) , 'w' ) as f :
            for i in range ( 10 ) :
                f.write ( '%s\n' % i )
