def import os , sys , stdin , stdout , stderr , stat , size , mask
from itertools import count , repeat
from itertools import chain , repeat
from os import urandom
import random
from os.path import join
from random import choice
from itertools import chain , repeat
from itertools import chain , repeat
n = int ( sys.stdin.readline ( ) )
a = next ( chain ( range ( n ) , repeat ( n ) ) )
b = next ( chain ( range ( n ) , repeat ( n ) ) )
path = [ ]
if sum ( a ^ b ) % 2 :
    print ( "YES" )
else :
    print ( "NO" )
    return
path.insert ( 0 , a )
path.insert ( 0 , b )
f = open ( "/dev/null" , "w" )
for i in chain ( path , repeat ( a , b ) ) :
    f.write ( "%d " % ( i ) )
f.write ( "\n" )
f.flush ( )
def write ( a , b , st , mask ) :
    diff_bit = sum ( mask & ( a ^ b ) )
    mask = mask ^ diff_bit
    size = sum ( size )
    if size == 0 :
        path.append ( a )
        path.append ( b )
    else :
        other_bit = sum ( mask )
        write ( a , a ^ other_bit , st , mask )
        write ( a ^ diff_bit ^ other_bit , b , st + ( 1 << size ) , mask )
