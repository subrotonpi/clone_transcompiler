def import import string , iterable
from os.path import join
from os import getcwd
from os.path import join
from os import listdir
from os.path import join
from os.path import join
from os.path import isdir
from os import sep
from os import chdir
from itertools import chain
n = len ( iterable )
lst = [ join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) ) ) ) , 'a' ) , 'b' , 'c' ) ]
seen = set ( )
for i in chain ( lst , chain ( ) ) :
    list2 = [ ]
    for item in iterable :
        for k in range ( 3 ) :
            if k == 0 :
                item = item
                list2.append ( item + 'a' )
            elif k == 1 :
                item = item + 'b'
            else :
                item = item + 'c'
    lst.extend ( list2 )
seen.update ( lst )
for string in lst :
    if len ( string ) == n :
        print ( string )
