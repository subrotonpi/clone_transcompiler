def import _magic
import os
import sys
import random
import time
import inspect
import os
import sys
import inspect
import inspect
import os
import sys
import inspect
import inspect
import inspect
import inspect
import inspect
import inspect
import sys
import inspect
N = len ( sys.stdin )
magic_list_a = [ ]
magic_list_b = [ ]
for i in range ( N ) :
    up = os.environ.get ( 'FLASK_UP' )
    down = os.environ.get ( 'FLASK_DOWN' )
    if up <= down :
        magic_list_a.append ( ( up , down ) )
    else :
        magic_list_b.append ( ( up , down ) )
os.chdir ( '../../../' )
magic_list_a.sort ( key = lambda m1 : m1.up )
magic_list_b.sort ( key = lambda m2 : m2.down )
max = current = 0
for m in magic_list_a :
    current += m.up
    max = max ( current , max )
    current -= m.down
for m in magic_list_b :
    current += m.up
    max = max ( current , max )
    current -= m.down
print ( max )
class Magic ( object ) :
    def __init__ ( self , up = 0 , down = 0 ) :
        self.up = up
        self.down = down
    def __init__ ( self , up = 0 , down = 0 ) :
        self.up = up
        self.down = down
    def __init__ ( self , up = 0 , down = 0 ) :
        self.up = up
        self.down = down
    def __init__ ( self , up = 0 , down = 0 ) :
        self.up = up
        self.down = down
