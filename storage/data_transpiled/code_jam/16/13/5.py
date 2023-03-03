def _import ( ) : return sys.stdout.readline ( )
import readline
import readline
readline.parse_and_bind ( '' )
readline.parse_and_bind ( '' )
readline.parse_and_bind ( '' )
readline.parse_and_bind ( '' )
readline.parse_and_bind ( '' )
readline.MOD = 1000000007
def print ( x ) :
    print ( '%d' % x )
def print_arr ( x ) :
    s = [ ]
    for i in x :
        s.append ( '%d ' % i )
    print ( s )
def print_arr ( x ) :
    s = [ ]
    for i in x :
        s.append ( '%d' % i )
    print ( ''.join ( s ) )
def join ( x , space = '' ) :
    if not x :
        return ''
    s = [ ]
    first = True
    for elt in x :
        if first :
            first = False
        else :
            s.append ( space )
        s.append ( elt )
    return ''.join ( s )
def readline ( ) :
    while not st or not st :
        line = readline ( )
        st = [ ]
        for start in range ( 1 , N + 1 ) :
            st.append ( '%d' % i )
        return st [ - 1 ]
    return ''.join ( s )
def readline ( ) :
    return readline ( )
global N
N = N + 1
bffs = [ ]
for i in range ( N + 1 ) :
    bffs.append ( readline ( ) )
N = N + 1
best = N + 1
bffs = [ ]
for i in range ( N + 1 ) :
    bffs.append ( readline ( ) )
bffs.append ( bffs [ 0 ] )
bffs.append ( bffs [ 0 ] )
bffs.append ( bffs [ 1 ] )
