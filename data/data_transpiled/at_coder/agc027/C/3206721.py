def _ _ main _ _ ( ) : return sys.stdin
import readline
import sys
import getopt
import termios
import sys
def main ( ) : return sys.stdin
n , m = select.select ( [ 0 ] , [ ] )
s = stdin.read ( n )
for i in range ( n ) : s [ i ] -= 'A'
adj = [ [ ] for i in range ( n ) ]
d = [ [ ] for i in range ( n ) ]
for i in range ( m ) :
    u , v = select.select ( [ 0 ] , [ ] ) [ 0 ]
    adj [ u ].append ( v )
    adj [ v ].append ( u )
    d [ u ] [ v ] += 1
    d [ v ] [ s [ u ] ] += 1
g = [ False ] * n
qu = [ ]
qt = 0
for i in range ( n ) :
    if d [ i ] [ 0 ] <= 0 or d [ i ] [ 1 ] <= 0 :
        g [ i ] = True
        qu.append ( i )
for qh in range ( n ) :
    if qh >= qt :
        print ( "Yes" )
        return
    u = qu [ qh ]
    for v in adj [ u ] :
        if g [ v ] : continue
        del d [ v ] [ s [ u ] ]
        if d [ v ] [ s [ u ] ] <= 0 :
            g [ v ] = True
            qu.append ( v )
            qt += 1
print ( "No" )
class Reader ( termios.TCSANOW ) :
    def readline ( self ) :
        while not g or not qu :
            try :
                s = stdin.readline ( )
            except EOFError :
                pass
        return int ( s [ 0 ] )
