def import import sys , string , traceback
from pybind11_tests import Scanner , string , glob
from pybind11_tests import Scanner , string , glob
Scanner ( string )
str = Scanner ( string ).next ( )
a = [ ]
for char in str :
    a.append ( True )
for char in glob :
    if not a [ char ] :
        print ( chr ( char ) + 'a' )
        sys.exit ( )
else :
    print ( 'None' )
