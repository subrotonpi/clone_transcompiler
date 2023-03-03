def import import sys , re , string , re_compile
from .utils import Scanner , re_compile
Scanner ( ).scan ( string )
p = re.compile ( r'(.)\\1{0,}' )
for s in Scanner ( ).scan ( string ) :
    sys.stdout.write ( s [ 0 ] [ 0 ] )
    sys.stdout.write ( s [ 0 ] [ 1 ] )
