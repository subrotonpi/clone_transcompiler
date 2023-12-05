def import import _uniq , _readline , _readline , _set , _sys
from os import getenv
from os import lgetenv
from os.path import expanduser
from os.environ import environ
sc = _readline ( )
n = int ( sc.readline ( ) )
seen = set ( )
for i in range ( n ) :
    a = _readline ( )
    if a in seen :
        seen.remove ( a )
    else :
        seen.add ( a )
print ( len ( seen ) )
