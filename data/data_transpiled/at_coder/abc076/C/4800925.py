def import import string , *
from os.path import join
from os import sep
from os import chdir
from os import environ
from os import chdir
from os import environ
from os import chdir
from os import getcwd
import chdir
try :
    chdir ( environ [ 'HOME' ] )
except :
    print ( "UNRESTORABLE" )
sc = open ( '/etc/passwd' , 'r' )
s = sc.read ( )
t = sc.read ( )
if not s :
    s = ''
else :
    s = ''
list = [ ]
matched = True
for i in range ( len ( s ) - len ( t ) , - 1 , - 1 ) :
    matched = True
    for j in range ( len ( t ) ) :
        if s [ i + j ] != '?' and s [ i + j ] != t [ j ] :
            matched = False
            break
    if matched :
        s = [ ]
        if i != 0 :
            s.append ( s [ : i ] )
        s.append ( t )
        if i != len ( s ) - len ( t ) :
            s.append ( s [ i + len ( t ) : ] )
        list.append ( ''.join ( s ).replace ( '?' , 'a' ) )
if list :
    list.sort ( )
    print ( list [ 0 ] )
else :
    print ( "UNRESTORABLE" )
